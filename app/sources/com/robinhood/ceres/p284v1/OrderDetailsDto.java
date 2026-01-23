package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.ceres.p284v1.OrderDetailsDto;
import com.robinhood.ceres.p284v1.OrderLegDetailsDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;
import p479j$.time.Instant;
import rosetta.mainst.OrderState;
import rosetta.mainst.OrderStateDto;
import rosetta.mainst.OrderType;
import rosetta.mainst.OrderTypeDto;

/* compiled from: OrderDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001b\b\u0007\u0018\u0000 F2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004GFHIB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B©\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b\u0006\u0010\u001dJ\u00ad\u0001\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$H\u0096\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u00100\u001a\u00020/2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020)H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020)H\u0016¢\u0006\u0004\b2\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00103R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b6\u00105R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0019\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0019\u0010\u0010\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8F¢\u0006\u0006\u001a\u0004\b;\u0010:R\u0019\u0010\u0011\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8F¢\u0006\u0006\u001a\u0004\b<\u0010:R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b=\u00105R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bB\u00105R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\bC\u0010#R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8F¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006J"}, m3636d2 = {"Lcom/robinhood/ceres/v1/OrderDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/ceres/v1/OrderDetails;", "Landroid/os/Parcelable;", "Lcom/robinhood/ceres/v1/OrderDetailsDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/ceres/v1/OrderDetailsDto$Surrogate;)V", "Lcom/robinhood/idl/IdlDecimal;", "order_quantity", "pending_quantity", "Lrosetta/mainst/OrderStateDto;", "order_state", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "updated_at", "canceled_at", "filled_quantity", "Lcom/robinhood/rosetta/common/MoneyDto;", "filled_notional", "Lrosetta/mainst/OrderTypeDto;", "order_type", "limit_price", "", "account_id", "", "Lcom/robinhood/ceres/v1/OrderLegDetailsDto;", "order_leg_details", "(Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lrosetta/mainst/OrderStateDto;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Lrosetta/mainst/OrderTypeDto;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/util/List;)V", "copy", "(Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lrosetta/mainst/OrderStateDto;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Lrosetta/mainst/OrderTypeDto;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/util/List;)Lcom/robinhood/ceres/v1/OrderDetailsDto;", "toProto", "()Lcom/robinhood/ceres/v1/OrderDetails;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/ceres/v1/OrderDetailsDto$Surrogate;", "getOrder_quantity", "()Lcom/robinhood/idl/IdlDecimal;", "getPending_quantity", "getOrder_state", "()Lrosetta/mainst/OrderStateDto;", "getCreated_at", "()Lj$/time/Instant;", "getUpdated_at", "getCanceled_at", "getFilled_quantity", "getFilled_notional", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getOrder_type", "()Lrosetta/mainst/OrderTypeDto;", "getLimit_price", "getAccount_id", "getOrder_leg_details", "()Ljava/util/List;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class OrderDetailsDto implements Dto3<OrderDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<OrderDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<OrderDetailsDto, OrderDetails>> binaryBase64Serializer$delegate;
    private static final OrderDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ OrderDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private OrderDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final IdlDecimal getOrder_quantity() {
        return this.surrogate.getOrder_quantity();
    }

    public final IdlDecimal getPending_quantity() {
        return this.surrogate.getPending_quantity();
    }

    public final OrderStateDto getOrder_state() {
        return this.surrogate.getOrder_state();
    }

    public final Instant getCreated_at() {
        return this.surrogate.getCreated_at();
    }

    public final Instant getUpdated_at() {
        return this.surrogate.getUpdated_at();
    }

    public final Instant getCanceled_at() {
        return this.surrogate.getCanceled_at();
    }

    public final IdlDecimal getFilled_quantity() {
        return this.surrogate.getFilled_quantity();
    }

    public final MoneyDto getFilled_notional() {
        return this.surrogate.getFilled_notional();
    }

    public final OrderTypeDto getOrder_type() {
        return this.surrogate.getOrder_type();
    }

    public final IdlDecimal getLimit_price() {
        return this.surrogate.getLimit_price();
    }

    public final String getAccount_id() {
        return this.surrogate.getAccount_id();
    }

    public final List<OrderLegDetailsDto> getOrder_leg_details() {
        return this.surrogate.getOrder_leg_details();
    }

    public /* synthetic */ OrderDetailsDto(IdlDecimal idlDecimal, IdlDecimal idlDecimal2, OrderStateDto orderStateDto, Instant instant, Instant instant2, Instant instant3, IdlDecimal idlDecimal3, MoneyDto moneyDto, OrderTypeDto orderTypeDto, IdlDecimal idlDecimal4, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal, (i & 2) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 4) != 0 ? OrderStateDto.INSTANCE.getZeroValue() : orderStateDto, (i & 8) != 0 ? null : instant, (i & 16) != 0 ? null : instant2, (i & 32) != 0 ? null : instant3, (i & 64) != 0 ? null : idlDecimal3, (i & 128) != 0 ? null : moneyDto, (i & 256) != 0 ? null : orderTypeDto, (i & 512) != 0 ? null : idlDecimal4, (i & 1024) != 0 ? null : str, (i & 2048) != 0 ? CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrderDetailsDto(IdlDecimal order_quantity, IdlDecimal pending_quantity, OrderStateDto order_state, Instant instant, Instant instant2, Instant instant3, IdlDecimal idlDecimal, MoneyDto moneyDto, OrderTypeDto orderTypeDto, IdlDecimal idlDecimal2, String str, List<OrderLegDetailsDto> order_leg_details) {
        this(new Surrogate(order_quantity, pending_quantity, order_state, instant, instant2, instant3, idlDecimal, moneyDto, orderTypeDto, idlDecimal2, str, order_leg_details));
        Intrinsics.checkNotNullParameter(order_quantity, "order_quantity");
        Intrinsics.checkNotNullParameter(pending_quantity, "pending_quantity");
        Intrinsics.checkNotNullParameter(order_state, "order_state");
        Intrinsics.checkNotNullParameter(order_leg_details, "order_leg_details");
    }

    public static /* synthetic */ OrderDetailsDto copy$default(OrderDetailsDto orderDetailsDto, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, OrderStateDto orderStateDto, Instant instant, Instant instant2, Instant instant3, IdlDecimal idlDecimal3, MoneyDto moneyDto, OrderTypeDto orderTypeDto, IdlDecimal idlDecimal4, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            idlDecimal = orderDetailsDto.surrogate.getOrder_quantity();
        }
        if ((i & 2) != 0) {
            idlDecimal2 = orderDetailsDto.surrogate.getPending_quantity();
        }
        if ((i & 4) != 0) {
            orderStateDto = orderDetailsDto.surrogate.getOrder_state();
        }
        if ((i & 8) != 0) {
            instant = orderDetailsDto.surrogate.getCreated_at();
        }
        if ((i & 16) != 0) {
            instant2 = orderDetailsDto.surrogate.getUpdated_at();
        }
        if ((i & 32) != 0) {
            instant3 = orderDetailsDto.surrogate.getCanceled_at();
        }
        if ((i & 64) != 0) {
            idlDecimal3 = orderDetailsDto.surrogate.getFilled_quantity();
        }
        if ((i & 128) != 0) {
            moneyDto = orderDetailsDto.surrogate.getFilled_notional();
        }
        if ((i & 256) != 0) {
            orderTypeDto = orderDetailsDto.surrogate.getOrder_type();
        }
        if ((i & 512) != 0) {
            idlDecimal4 = orderDetailsDto.surrogate.getLimit_price();
        }
        if ((i & 1024) != 0) {
            str = orderDetailsDto.surrogate.getAccount_id();
        }
        if ((i & 2048) != 0) {
            list = orderDetailsDto.surrogate.getOrder_leg_details();
        }
        String str2 = str;
        List list2 = list;
        OrderTypeDto orderTypeDto2 = orderTypeDto;
        IdlDecimal idlDecimal5 = idlDecimal4;
        IdlDecimal idlDecimal6 = idlDecimal3;
        MoneyDto moneyDto2 = moneyDto;
        Instant instant4 = instant2;
        Instant instant5 = instant3;
        return orderDetailsDto.copy(idlDecimal, idlDecimal2, orderStateDto, instant, instant4, instant5, idlDecimal6, moneyDto2, orderTypeDto2, idlDecimal5, str2, list2);
    }

    public final OrderDetailsDto copy(IdlDecimal order_quantity, IdlDecimal pending_quantity, OrderStateDto order_state, Instant created_at, Instant updated_at, Instant canceled_at, IdlDecimal filled_quantity, MoneyDto filled_notional, OrderTypeDto order_type, IdlDecimal limit_price, String account_id, List<OrderLegDetailsDto> order_leg_details) {
        Intrinsics.checkNotNullParameter(order_quantity, "order_quantity");
        Intrinsics.checkNotNullParameter(pending_quantity, "pending_quantity");
        Intrinsics.checkNotNullParameter(order_state, "order_state");
        Intrinsics.checkNotNullParameter(order_leg_details, "order_leg_details");
        return new OrderDetailsDto(new Surrogate(order_quantity, pending_quantity, order_state, created_at, updated_at, canceled_at, filled_quantity, filled_notional, order_type, limit_price, account_id, order_leg_details));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public OrderDetails toProto() {
        String stringValue = this.surrogate.getOrder_quantity().getStringValue();
        String stringValue2 = this.surrogate.getPending_quantity().getStringValue();
        OrderState orderState = (OrderState) this.surrogate.getOrder_state().toProto();
        Instant created_at = this.surrogate.getCreated_at();
        Instant updated_at = this.surrogate.getUpdated_at();
        Instant canceled_at = this.surrogate.getCanceled_at();
        IdlDecimal filled_quantity = this.surrogate.getFilled_quantity();
        String stringValue3 = filled_quantity != null ? filled_quantity.getStringValue() : null;
        MoneyDto filled_notional = this.surrogate.getFilled_notional();
        Money proto = filled_notional != null ? filled_notional.toProto() : null;
        OrderTypeDto order_type = this.surrogate.getOrder_type();
        OrderType orderType = order_type != null ? (OrderType) order_type.toProto() : null;
        IdlDecimal limit_price = this.surrogate.getLimit_price();
        String stringValue4 = limit_price != null ? limit_price.getStringValue() : null;
        String account_id = this.surrogate.getAccount_id();
        List<OrderLegDetailsDto> order_leg_details = this.surrogate.getOrder_leg_details();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(order_leg_details, 10));
        Iterator<T> it = order_leg_details.iterator();
        while (it.hasNext()) {
            arrayList.add(((OrderLegDetailsDto) it.next()).toProto());
        }
        return new OrderDetails(stringValue, stringValue2, orderState, created_at, updated_at, canceled_at, stringValue3, proto, orderType, stringValue4, account_id, arrayList, null, 4096, null);
    }

    public String toString() {
        return "[OrderDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof OrderDetailsDto) && Intrinsics.areEqual(((OrderDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: OrderDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b%\b\u0083\b\u0018\u0000 g2\u00020\u0001:\u0002hgB½\u0002\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012.\b\u0002\u0010\r\u001a(\u0018\u00010\nj\u0013\u0018\u0001`\u000b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\f\u0012.\b\u0002\u0010\u000e\u001a(\u0018\u00010\nj\u0013\u0018\u0001`\u000b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\f\u0012.\b\u0002\u0010\u000f\u001a(\u0018\u00010\nj\u0013\u0018\u0001`\u000b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\f\u0012\u0019\b\u0002\u0010\u0010\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0019\b\u0002\u0010\u0015\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0004\b\u001b\u0010\u001cB\u0099\u0001\b\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001b\u0010!J'\u0010*\u001a\u00020'2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0001¢\u0006\u0004\b(\u0010)J\u001f\u0010+\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005HÆ\u0003¢\u0006\u0004\b+\u0010,J\u001f\u0010-\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005HÆ\u0003¢\u0006\u0004\b-\u0010,J\u0010\u0010.\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b.\u0010/J6\u00100\u001a(\u0018\u00010\nj\u0013\u0018\u0001`\u000b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\fHÆ\u0003¢\u0006\u0004\b0\u00101J6\u00102\u001a(\u0018\u00010\nj\u0013\u0018\u0001`\u000b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\fHÆ\u0003¢\u0006\u0004\b2\u00101J6\u00103\u001a(\u0018\u00010\nj\u0013\u0018\u0001`\u000b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\fHÆ\u0003¢\u0006\u0004\b3\u00101J!\u00104\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005HÆ\u0003¢\u0006\u0004\b4\u0010,J\u0012\u00105\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b7\u00108J!\u00109\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005HÆ\u0003¢\u0006\u0004\b9\u0010,J\u0012\u0010:\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0016\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018HÆ\u0003¢\u0006\u0004\b<\u0010=JÆ\u0002\u0010>\u001a\u00020\u00002\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00052\u0017\b\u0002\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00052\b\b\u0002\u0010\t\u001a\u00020\b2.\b\u0002\u0010\r\u001a(\u0018\u00010\nj\u0013\u0018\u0001`\u000b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\f2.\b\u0002\u0010\u000e\u001a(\u0018\u00010\nj\u0013\u0018\u0001`\u000b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\f2.\b\u0002\u0010\u000f\u001a(\u0018\u00010\nj\u0013\u0018\u0001`\u000b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\f2\u0019\b\u0002\u0010\u0010\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0019\b\u0002\u0010\u0015\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018HÆ\u0001¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b@\u0010;J\u0010\u0010A\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\bA\u0010BJ\u001a\u0010E\u001a\u00020D2\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bE\u0010FR/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010G\u0012\u0004\bI\u0010J\u001a\u0004\bH\u0010,R/\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010G\u0012\u0004\bL\u0010J\u001a\u0004\bK\u0010,R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010M\u0012\u0004\bO\u0010J\u001a\u0004\bN\u0010/RF\u0010\r\u001a(\u0018\u00010\nj\u0013\u0018\u0001`\u000b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010P\u0012\u0004\bR\u0010J\u001a\u0004\bQ\u00101RF\u0010\u000e\u001a(\u0018\u00010\nj\u0013\u0018\u0001`\u000b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010P\u0012\u0004\bT\u0010J\u001a\u0004\bS\u00101RF\u0010\u000f\u001a(\u0018\u00010\nj\u0013\u0018\u0001`\u000b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010P\u0012\u0004\bV\u0010J\u001a\u0004\bU\u00101R1\u0010\u0010\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010G\u0012\u0004\bX\u0010J\u001a\u0004\bW\u0010,R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010Y\u0012\u0004\b[\u0010J\u001a\u0004\bZ\u00106R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\\\u0012\u0004\b^\u0010J\u001a\u0004\b]\u00108R1\u0010\u0015\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010G\u0012\u0004\b`\u0010J\u001a\u0004\b_\u0010,R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010a\u0012\u0004\bc\u0010J\u001a\u0004\bb\u0010;R&\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010d\u0012\u0004\bf\u0010J\u001a\u0004\be\u0010=¨\u0006i"}, m3636d2 = {"Lcom/robinhood/ceres/v1/OrderDetailsDto$Surrogate;", "", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "order_quantity", "pending_quantity", "Lrosetta/mainst/OrderStateDto;", "order_state", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "created_at", "updated_at", "canceled_at", "filled_quantity", "Lcom/robinhood/rosetta/common/MoneyDto;", "filled_notional", "Lrosetta/mainst/OrderTypeDto;", "order_type", "limit_price", "", "account_id", "", "Lcom/robinhood/ceres/v1/OrderLegDetailsDto;", "order_leg_details", "<init>", "(Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lrosetta/mainst/OrderStateDto;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Lrosetta/mainst/OrderTypeDto;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lrosetta/mainst/OrderStateDto;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Lrosetta/mainst/OrderTypeDto;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$ceres_v1_externalRelease", "(Lcom/robinhood/ceres/v1/OrderDetailsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/robinhood/idl/IdlDecimal;", "component2", "component3", "()Lrosetta/mainst/OrderStateDto;", "component4", "()Lj$/time/Instant;", "component5", "component6", "component7", "component8", "()Lcom/robinhood/rosetta/common/MoneyDto;", "component9", "()Lrosetta/mainst/OrderTypeDto;", "component10", "component11", "()Ljava/lang/String;", "component12", "()Ljava/util/List;", "copy", "(Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lrosetta/mainst/OrderStateDto;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Lrosetta/mainst/OrderTypeDto;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/util/List;)Lcom/robinhood/ceres/v1/OrderDetailsDto$Surrogate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/idl/IdlDecimal;", "getOrder_quantity", "getOrder_quantity$annotations", "()V", "getPending_quantity", "getPending_quantity$annotations", "Lrosetta/mainst/OrderStateDto;", "getOrder_state", "getOrder_state$annotations", "Lj$/time/Instant;", "getCreated_at", "getCreated_at$annotations", "getUpdated_at", "getUpdated_at$annotations", "getCanceled_at", "getCanceled_at$annotations", "getFilled_quantity", "getFilled_quantity$annotations", "Lcom/robinhood/rosetta/common/MoneyDto;", "getFilled_notional", "getFilled_notional$annotations", "Lrosetta/mainst/OrderTypeDto;", "getOrder_type", "getOrder_type$annotations", "getLimit_price", "getLimit_price$annotations", "Ljava/lang/String;", "getAccount_id", "getAccount_id$annotations", "Ljava/util/List;", "getOrder_leg_details", "getOrder_leg_details$annotations", "Companion", "$serializer", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final String account_id;
        private final Instant canceled_at;
        private final Instant created_at;
        private final MoneyDto filled_notional;
        private final IdlDecimal filled_quantity;
        private final IdlDecimal limit_price;
        private final List<OrderLegDetailsDto> order_leg_details;
        private final IdlDecimal order_quantity;
        private final OrderStateDto order_state;
        private final OrderTypeDto order_type;
        private final IdlDecimal pending_quantity;
        private final Instant updated_at;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.ceres.v1.OrderDetailsDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderDetailsDto.Surrogate._childSerializers$_anonymous_();
            }
        })};

        public Surrogate() {
            this((IdlDecimal) null, (IdlDecimal) null, (OrderStateDto) null, (Instant) null, (Instant) null, (Instant) null, (IdlDecimal) null, (MoneyDto) null, (OrderTypeDto) null, (IdlDecimal) null, (String) null, (List) null, 4095, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(OrderLegDetailsDto.Serializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, OrderStateDto orderStateDto, Instant instant, Instant instant2, Instant instant3, IdlDecimal idlDecimal3, MoneyDto moneyDto, OrderTypeDto orderTypeDto, IdlDecimal idlDecimal4, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                idlDecimal = surrogate.order_quantity;
            }
            if ((i & 2) != 0) {
                idlDecimal2 = surrogate.pending_quantity;
            }
            if ((i & 4) != 0) {
                orderStateDto = surrogate.order_state;
            }
            if ((i & 8) != 0) {
                instant = surrogate.created_at;
            }
            if ((i & 16) != 0) {
                instant2 = surrogate.updated_at;
            }
            if ((i & 32) != 0) {
                instant3 = surrogate.canceled_at;
            }
            if ((i & 64) != 0) {
                idlDecimal3 = surrogate.filled_quantity;
            }
            if ((i & 128) != 0) {
                moneyDto = surrogate.filled_notional;
            }
            if ((i & 256) != 0) {
                orderTypeDto = surrogate.order_type;
            }
            if ((i & 512) != 0) {
                idlDecimal4 = surrogate.limit_price;
            }
            if ((i & 1024) != 0) {
                str = surrogate.account_id;
            }
            if ((i & 2048) != 0) {
                list = surrogate.order_leg_details;
            }
            String str2 = str;
            List list2 = list;
            OrderTypeDto orderTypeDto2 = orderTypeDto;
            IdlDecimal idlDecimal5 = idlDecimal4;
            IdlDecimal idlDecimal6 = idlDecimal3;
            MoneyDto moneyDto2 = moneyDto;
            Instant instant4 = instant2;
            Instant instant5 = instant3;
            return surrogate.copy(idlDecimal, idlDecimal2, orderStateDto, instant, instant4, instant5, idlDecimal6, moneyDto2, orderTypeDto2, idlDecimal5, str2, list2);
        }

        @SerialName("accountId")
        @JsonAnnotations2(names = {"account_id"})
        public static /* synthetic */ void getAccount_id$annotations() {
        }

        @SerialName("canceledAt")
        @JsonAnnotations2(names = {"canceled_at"})
        public static /* synthetic */ void getCanceled_at$annotations() {
        }

        @SerialName("createdAt")
        @JsonAnnotations2(names = {"created_at"})
        public static /* synthetic */ void getCreated_at$annotations() {
        }

        @SerialName("filledNotional")
        @JsonAnnotations2(names = {"filled_notional"})
        public static /* synthetic */ void getFilled_notional$annotations() {
        }

        @SerialName("filledQuantity")
        @JsonAnnotations2(names = {"filled_quantity"})
        public static /* synthetic */ void getFilled_quantity$annotations() {
        }

        @SerialName("limitPrice")
        @JsonAnnotations2(names = {"limit_price"})
        public static /* synthetic */ void getLimit_price$annotations() {
        }

        @SerialName("orderLegDetails")
        @JsonAnnotations2(names = {"order_leg_details"})
        public static /* synthetic */ void getOrder_leg_details$annotations() {
        }

        @SerialName("orderQuantity")
        @JsonAnnotations2(names = {"order_quantity"})
        public static /* synthetic */ void getOrder_quantity$annotations() {
        }

        @SerialName("orderState")
        @JsonAnnotations2(names = {"order_state"})
        public static /* synthetic */ void getOrder_state$annotations() {
        }

        @SerialName("orderType")
        @JsonAnnotations2(names = {"order_type"})
        public static /* synthetic */ void getOrder_type$annotations() {
        }

        @SerialName("pendingQuantity")
        @JsonAnnotations2(names = {"pending_quantity"})
        public static /* synthetic */ void getPending_quantity$annotations() {
        }

        @SerialName("updatedAt")
        @JsonAnnotations2(names = {"updated_at"})
        public static /* synthetic */ void getUpdated_at$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final IdlDecimal getOrder_quantity() {
            return this.order_quantity;
        }

        /* renamed from: component10, reason: from getter */
        public final IdlDecimal getLimit_price() {
            return this.limit_price;
        }

        /* renamed from: component11, reason: from getter */
        public final String getAccount_id() {
            return this.account_id;
        }

        public final List<OrderLegDetailsDto> component12() {
            return this.order_leg_details;
        }

        /* renamed from: component2, reason: from getter */
        public final IdlDecimal getPending_quantity() {
            return this.pending_quantity;
        }

        /* renamed from: component3, reason: from getter */
        public final OrderStateDto getOrder_state() {
            return this.order_state;
        }

        /* renamed from: component4, reason: from getter */
        public final Instant getCreated_at() {
            return this.created_at;
        }

        /* renamed from: component5, reason: from getter */
        public final Instant getUpdated_at() {
            return this.updated_at;
        }

        /* renamed from: component6, reason: from getter */
        public final Instant getCanceled_at() {
            return this.canceled_at;
        }

        /* renamed from: component7, reason: from getter */
        public final IdlDecimal getFilled_quantity() {
            return this.filled_quantity;
        }

        /* renamed from: component8, reason: from getter */
        public final MoneyDto getFilled_notional() {
            return this.filled_notional;
        }

        /* renamed from: component9, reason: from getter */
        public final OrderTypeDto getOrder_type() {
            return this.order_type;
        }

        public final Surrogate copy(IdlDecimal order_quantity, IdlDecimal pending_quantity, OrderStateDto order_state, Instant created_at, Instant updated_at, Instant canceled_at, IdlDecimal filled_quantity, MoneyDto filled_notional, OrderTypeDto order_type, IdlDecimal limit_price, String account_id, List<OrderLegDetailsDto> order_leg_details) {
            Intrinsics.checkNotNullParameter(order_quantity, "order_quantity");
            Intrinsics.checkNotNullParameter(pending_quantity, "pending_quantity");
            Intrinsics.checkNotNullParameter(order_state, "order_state");
            Intrinsics.checkNotNullParameter(order_leg_details, "order_leg_details");
            return new Surrogate(order_quantity, pending_quantity, order_state, created_at, updated_at, canceled_at, filled_quantity, filled_notional, order_type, limit_price, account_id, order_leg_details);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.order_quantity, surrogate.order_quantity) && Intrinsics.areEqual(this.pending_quantity, surrogate.pending_quantity) && this.order_state == surrogate.order_state && Intrinsics.areEqual(this.created_at, surrogate.created_at) && Intrinsics.areEqual(this.updated_at, surrogate.updated_at) && Intrinsics.areEqual(this.canceled_at, surrogate.canceled_at) && Intrinsics.areEqual(this.filled_quantity, surrogate.filled_quantity) && Intrinsics.areEqual(this.filled_notional, surrogate.filled_notional) && this.order_type == surrogate.order_type && Intrinsics.areEqual(this.limit_price, surrogate.limit_price) && Intrinsics.areEqual(this.account_id, surrogate.account_id) && Intrinsics.areEqual(this.order_leg_details, surrogate.order_leg_details);
        }

        public int hashCode() {
            int iHashCode = ((((this.order_quantity.hashCode() * 31) + this.pending_quantity.hashCode()) * 31) + this.order_state.hashCode()) * 31;
            Instant instant = this.created_at;
            int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            Instant instant2 = this.updated_at;
            int iHashCode3 = (iHashCode2 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
            Instant instant3 = this.canceled_at;
            int iHashCode4 = (iHashCode3 + (instant3 == null ? 0 : instant3.hashCode())) * 31;
            IdlDecimal idlDecimal = this.filled_quantity;
            int iHashCode5 = (iHashCode4 + (idlDecimal == null ? 0 : idlDecimal.hashCode())) * 31;
            MoneyDto moneyDto = this.filled_notional;
            int iHashCode6 = (iHashCode5 + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31;
            OrderTypeDto orderTypeDto = this.order_type;
            int iHashCode7 = (iHashCode6 + (orderTypeDto == null ? 0 : orderTypeDto.hashCode())) * 31;
            IdlDecimal idlDecimal2 = this.limit_price;
            int iHashCode8 = (iHashCode7 + (idlDecimal2 == null ? 0 : idlDecimal2.hashCode())) * 31;
            String str = this.account_id;
            return ((iHashCode8 + (str != null ? str.hashCode() : 0)) * 31) + this.order_leg_details.hashCode();
        }

        public String toString() {
            return "Surrogate(order_quantity=" + this.order_quantity + ", pending_quantity=" + this.pending_quantity + ", order_state=" + this.order_state + ", created_at=" + this.created_at + ", updated_at=" + this.updated_at + ", canceled_at=" + this.canceled_at + ", filled_quantity=" + this.filled_quantity + ", filled_notional=" + this.filled_notional + ", order_type=" + this.order_type + ", limit_price=" + this.limit_price + ", account_id=" + this.account_id + ", order_leg_details=" + this.order_leg_details + ")";
        }

        /* compiled from: OrderDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/ceres/v1/OrderDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/OrderDetailsDto$Surrogate;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return OrderDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, OrderStateDto orderStateDto, Instant instant, Instant instant2, Instant instant3, IdlDecimal idlDecimal3, MoneyDto moneyDto, OrderTypeDto orderTypeDto, IdlDecimal idlDecimal4, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
            this.order_quantity = (i & 1) == 0 ? new IdlDecimal("") : idlDecimal;
            if ((i & 2) == 0) {
                this.pending_quantity = new IdlDecimal("");
            } else {
                this.pending_quantity = idlDecimal2;
            }
            if ((i & 4) == 0) {
                this.order_state = OrderStateDto.INSTANCE.getZeroValue();
            } else {
                this.order_state = orderStateDto;
            }
            if ((i & 8) == 0) {
                this.created_at = null;
            } else {
                this.created_at = instant;
            }
            if ((i & 16) == 0) {
                this.updated_at = null;
            } else {
                this.updated_at = instant2;
            }
            if ((i & 32) == 0) {
                this.canceled_at = null;
            } else {
                this.canceled_at = instant3;
            }
            if ((i & 64) == 0) {
                this.filled_quantity = null;
            } else {
                this.filled_quantity = idlDecimal3;
            }
            if ((i & 128) == 0) {
                this.filled_notional = null;
            } else {
                this.filled_notional = moneyDto;
            }
            if ((i & 256) == 0) {
                this.order_type = null;
            } else {
                this.order_type = orderTypeDto;
            }
            if ((i & 512) == 0) {
                this.limit_price = null;
            } else {
                this.limit_price = idlDecimal4;
            }
            if ((i & 1024) == 0) {
                this.account_id = null;
            } else {
                this.account_id = str;
            }
            if ((i & 2048) == 0) {
                this.order_leg_details = CollectionsKt.emptyList();
            } else {
                this.order_leg_details = list;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$ceres_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.order_quantity, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 0, IdlDecimalSerializer.INSTANCE, self.order_quantity);
            }
            if (!Intrinsics.areEqual(self.pending_quantity, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 1, IdlDecimalSerializer.INSTANCE, self.pending_quantity);
            }
            if (self.order_state != OrderStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, OrderStateDto.Serializer.INSTANCE, self.order_state);
            }
            Instant instant = self.created_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, WireInstantSerializer.INSTANCE, instant);
            }
            Instant instant2 = self.updated_at;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, WireInstantSerializer.INSTANCE, instant2);
            }
            Instant instant3 = self.canceled_at;
            if (instant3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, WireInstantSerializer.INSTANCE, instant3);
            }
            IdlDecimal idlDecimal = self.filled_quantity;
            if (idlDecimal != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, IdlDecimalSerializer.INSTANCE, idlDecimal);
            }
            MoneyDto moneyDto = self.filled_notional;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            OrderTypeDto orderTypeDto = self.order_type;
            if (orderTypeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, OrderTypeDto.Serializer.INSTANCE, orderTypeDto);
            }
            IdlDecimal idlDecimal2 = self.limit_price;
            if (idlDecimal2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, IdlDecimalSerializer.INSTANCE, idlDecimal2);
            }
            String str = self.account_id;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, StringSerializer.INSTANCE, str);
            }
            if (Intrinsics.areEqual(self.order_leg_details, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 11, lazyArr[11].getValue(), self.order_leg_details);
        }

        public Surrogate(IdlDecimal order_quantity, IdlDecimal pending_quantity, OrderStateDto order_state, Instant instant, Instant instant2, Instant instant3, IdlDecimal idlDecimal, MoneyDto moneyDto, OrderTypeDto orderTypeDto, IdlDecimal idlDecimal2, String str, List<OrderLegDetailsDto> order_leg_details) {
            Intrinsics.checkNotNullParameter(order_quantity, "order_quantity");
            Intrinsics.checkNotNullParameter(pending_quantity, "pending_quantity");
            Intrinsics.checkNotNullParameter(order_state, "order_state");
            Intrinsics.checkNotNullParameter(order_leg_details, "order_leg_details");
            this.order_quantity = order_quantity;
            this.pending_quantity = pending_quantity;
            this.order_state = order_state;
            this.created_at = instant;
            this.updated_at = instant2;
            this.canceled_at = instant3;
            this.filled_quantity = idlDecimal;
            this.filled_notional = moneyDto;
            this.order_type = orderTypeDto;
            this.limit_price = idlDecimal2;
            this.account_id = str;
            this.order_leg_details = order_leg_details;
        }

        public /* synthetic */ Surrogate(IdlDecimal idlDecimal, IdlDecimal idlDecimal2, OrderStateDto orderStateDto, Instant instant, Instant instant2, Instant instant3, IdlDecimal idlDecimal3, MoneyDto moneyDto, OrderTypeDto orderTypeDto, IdlDecimal idlDecimal4, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal, (i & 2) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 4) != 0 ? OrderStateDto.INSTANCE.getZeroValue() : orderStateDto, (i & 8) != 0 ? null : instant, (i & 16) != 0 ? null : instant2, (i & 32) != 0 ? null : instant3, (i & 64) != 0 ? null : idlDecimal3, (i & 128) != 0 ? null : moneyDto, (i & 256) != 0 ? null : orderTypeDto, (i & 512) != 0 ? null : idlDecimal4, (i & 1024) != 0 ? null : str, (i & 2048) != 0 ? CollectionsKt.emptyList() : list);
        }

        public final IdlDecimal getOrder_quantity() {
            return this.order_quantity;
        }

        public final IdlDecimal getPending_quantity() {
            return this.pending_quantity;
        }

        public final OrderStateDto getOrder_state() {
            return this.order_state;
        }

        public final Instant getCreated_at() {
            return this.created_at;
        }

        public final Instant getUpdated_at() {
            return this.updated_at;
        }

        public final Instant getCanceled_at() {
            return this.canceled_at;
        }

        public final IdlDecimal getFilled_quantity() {
            return this.filled_quantity;
        }

        public final MoneyDto getFilled_notional() {
            return this.filled_notional;
        }

        public final OrderTypeDto getOrder_type() {
            return this.order_type;
        }

        public final IdlDecimal getLimit_price() {
            return this.limit_price;
        }

        public final String getAccount_id() {
            return this.account_id;
        }

        public final List<OrderLegDetailsDto> getOrder_leg_details() {
            return this.order_leg_details;
        }
    }

    /* compiled from: OrderDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/OrderDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/ceres/v1/OrderDetailsDto;", "Lcom/robinhood/ceres/v1/OrderDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/OrderDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<OrderDetailsDto, OrderDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OrderDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OrderDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OrderDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) OrderDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<OrderDetails> getProtoAdapter() {
            return OrderDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OrderDetailsDto getZeroValue() {
            return OrderDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OrderDetailsDto fromProto(OrderDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            IdlDecimal idlDecimal = new IdlDecimal(proto.getOrder_quantity());
            IdlDecimal idlDecimal2 = new IdlDecimal(proto.getPending_quantity());
            OrderStateDto orderStateDtoFromProto = OrderStateDto.INSTANCE.fromProto(proto.getOrder_state());
            Instant created_at = proto.getCreated_at();
            Instant updated_at = proto.getUpdated_at();
            Instant canceled_at = proto.getCanceled_at();
            String filled_quantity = proto.getFilled_quantity();
            DefaultConstructorMarker defaultConstructorMarker = null;
            IdlDecimal idlDecimal3 = filled_quantity != null ? new IdlDecimal(filled_quantity) : null;
            Money filled_notional = proto.getFilled_notional();
            MoneyDto moneyDtoFromProto = filled_notional != null ? MoneyDto.INSTANCE.fromProto(filled_notional) : null;
            OrderType order_type = proto.getOrder_type();
            OrderTypeDto orderTypeDtoFromProto = order_type != null ? OrderTypeDto.INSTANCE.fromProto(order_type) : null;
            String limit_price = proto.getLimit_price();
            IdlDecimal idlDecimal4 = limit_price != null ? new IdlDecimal(limit_price) : null;
            String account_id = proto.getAccount_id();
            List<OrderLegDetails> order_leg_details = proto.getOrder_leg_details();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(order_leg_details, 10));
            Iterator<T> it = order_leg_details.iterator();
            while (it.hasNext()) {
                arrayList.add(OrderLegDetailsDto.INSTANCE.fromProto((OrderLegDetails) it.next()));
            }
            return new OrderDetailsDto(new Surrogate(idlDecimal, idlDecimal2, orderStateDtoFromProto, created_at, updated_at, canceled_at, idlDecimal3, moneyDtoFromProto, orderTypeDtoFromProto, idlDecimal4, account_id, arrayList), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.OrderDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderDetailsDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new OrderDetailsDto(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: OrderDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/OrderDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/OrderDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/ceres/v1/OrderDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<OrderDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ceres.service.OrderDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, OrderDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public OrderDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new OrderDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: OrderDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/ceres/v1/OrderDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "com.robinhood.ceres.v1.OrderDetailsDto";
        }
    }
}
