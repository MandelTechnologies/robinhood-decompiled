package black_widow.contracts.mobile_app_chart.proto.p024v1;

import android.os.Parcel;
import android.os.Parcelable;
import black_widow.contracts.mobile_app_chart.proto.p024v1.EquitiesBuyAllOrderPayloadDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.EquitiesLimitOrderPayloadDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.EquitiesSellAllOrderPayloadDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.EquitiesStopMarketOrderPayloadDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.models.card.p311db.Card;
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

/* compiled from: OrderPayloadDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005#\"$%&B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006'"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderPayloadDto;", "Lcom/robinhood/idl/MessageDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderPayload;", "Landroid/os/Parcelable;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderPayloadDto$Surrogate;", "surrogate", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderPayloadDto$Surrogate;)V", "Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderPayloadDto$OrderDto;", Card.Icon.ORDER, "(Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderPayloadDto$OrderDto;)V", "toProto", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderPayload;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderPayloadDto$Surrogate;", "getOrder", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderPayloadDto$OrderDto;", "Companion", "Surrogate", "OrderDto", "Serializer", "MultibindingModule", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class OrderPayloadDto implements Dto3<OrderPayload>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<OrderPayloadDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<OrderPayloadDto, OrderPayload>> binaryBase64Serializer$delegate;
    private static final OrderPayloadDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ OrderPayloadDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private OrderPayloadDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final OrderDto getOrder() {
        if (this.surrogate.getEquities_limit_order() != null) {
            return new OrderDto.EquitiesLimitOrder(this.surrogate.getEquities_limit_order());
        }
        if (this.surrogate.getEquities_stop_market_order() != null) {
            return new OrderDto.EquitiesStopMarketOrder(this.surrogate.getEquities_stop_market_order());
        }
        if (this.surrogate.getEquities_sell_all_order() != null) {
            return new OrderDto.EquitiesSellAllOrder(this.surrogate.getEquities_sell_all_order());
        }
        if (this.surrogate.getEquities_buy_all_order() != null) {
            return new OrderDto.EquitiesBuyAllOrder(this.surrogate.getEquities_buy_all_order());
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OrderPayloadDto(OrderDto orderDto) {
        OrderDto.EquitiesLimitOrder equitiesLimitOrder = orderDto instanceof OrderDto.EquitiesLimitOrder ? (OrderDto.EquitiesLimitOrder) orderDto : null;
        EquitiesLimitOrderPayloadDto value = equitiesLimitOrder != null ? equitiesLimitOrder.getValue() : null;
        OrderDto.EquitiesStopMarketOrder equitiesStopMarketOrder = orderDto instanceof OrderDto.EquitiesStopMarketOrder ? (OrderDto.EquitiesStopMarketOrder) orderDto : null;
        EquitiesStopMarketOrderPayloadDto value2 = equitiesStopMarketOrder != null ? equitiesStopMarketOrder.getValue() : null;
        OrderDto.EquitiesSellAllOrder equitiesSellAllOrder = orderDto instanceof OrderDto.EquitiesSellAllOrder ? (OrderDto.EquitiesSellAllOrder) orderDto : null;
        EquitiesSellAllOrderPayloadDto value3 = equitiesSellAllOrder != null ? equitiesSellAllOrder.getValue() : null;
        OrderDto.EquitiesBuyAllOrder equitiesBuyAllOrder = orderDto instanceof OrderDto.EquitiesBuyAllOrder ? (OrderDto.EquitiesBuyAllOrder) orderDto : null;
        this(new Surrogate(value, value2, value3, equitiesBuyAllOrder != null ? equitiesBuyAllOrder.getValue() : null));
    }

    public /* synthetic */ OrderPayloadDto(OrderDto orderDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : orderDto);
    }

    @Override // com.robinhood.idl.Dto
    public OrderPayload toProto() {
        EquitiesLimitOrderPayloadDto equities_limit_order = this.surrogate.getEquities_limit_order();
        EquitiesLimitOrderPayload proto = equities_limit_order != null ? equities_limit_order.toProto() : null;
        EquitiesStopMarketOrderPayloadDto equities_stop_market_order = this.surrogate.getEquities_stop_market_order();
        EquitiesStopMarketOrderPayload proto2 = equities_stop_market_order != null ? equities_stop_market_order.toProto() : null;
        EquitiesSellAllOrderPayloadDto equities_sell_all_order = this.surrogate.getEquities_sell_all_order();
        EquitiesSellAllOrderPayload proto3 = equities_sell_all_order != null ? equities_sell_all_order.toProto() : null;
        EquitiesBuyAllOrderPayloadDto equities_buy_all_order = this.surrogate.getEquities_buy_all_order();
        return new OrderPayload(proto, proto2, proto3, equities_buy_all_order != null ? equities_buy_all_order.toProto() : null, null, 16, null);
    }

    public String toString() {
        return "[OrderPayloadDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof OrderPayloadDto) && Intrinsics.areEqual(((OrderPayloadDto) other).surrogate, this.surrogate);
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
    /* compiled from: OrderPayloadDto.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0083\b\u0018\u0000 42\u00020\u0001:\u000254B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010(\u0012\u0004\b+\u0010'\u001a\u0004\b)\u0010*R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010,\u0012\u0004\b/\u0010'\u001a\u0004\b-\u0010.R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00100\u0012\u0004\b3\u0010'\u001a\u0004\b1\u00102¨\u00066"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderPayloadDto$Surrogate;", "", "Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesLimitOrderPayloadDto;", "equities_limit_order", "Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesStopMarketOrderPayloadDto;", "equities_stop_market_order", "Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesSellAllOrderPayloadDto;", "equities_sell_all_order", "Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesBuyAllOrderPayloadDto;", "equities_buy_all_order", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesLimitOrderPayloadDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesStopMarketOrderPayloadDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesSellAllOrderPayloadDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesBuyAllOrderPayloadDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesLimitOrderPayloadDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesStopMarketOrderPayloadDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesSellAllOrderPayloadDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesBuyAllOrderPayloadDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$black_widow_mobile_chart_externalRelease", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderPayloadDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesLimitOrderPayloadDto;", "getEquities_limit_order", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesLimitOrderPayloadDto;", "getEquities_limit_order$annotations", "()V", "Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesStopMarketOrderPayloadDto;", "getEquities_stop_market_order", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesStopMarketOrderPayloadDto;", "getEquities_stop_market_order$annotations", "Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesSellAllOrderPayloadDto;", "getEquities_sell_all_order", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesSellAllOrderPayloadDto;", "getEquities_sell_all_order$annotations", "Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesBuyAllOrderPayloadDto;", "getEquities_buy_all_order", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesBuyAllOrderPayloadDto;", "getEquities_buy_all_order$annotations", "Companion", "$serializer", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final EquitiesBuyAllOrderPayloadDto equities_buy_all_order;
        private final EquitiesLimitOrderPayloadDto equities_limit_order;
        private final EquitiesSellAllOrderPayloadDto equities_sell_all_order;
        private final EquitiesStopMarketOrderPayloadDto equities_stop_market_order;

        public Surrogate() {
            this((EquitiesLimitOrderPayloadDto) null, (EquitiesStopMarketOrderPayloadDto) null, (EquitiesSellAllOrderPayloadDto) null, (EquitiesBuyAllOrderPayloadDto) null, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.equities_limit_order, surrogate.equities_limit_order) && Intrinsics.areEqual(this.equities_stop_market_order, surrogate.equities_stop_market_order) && Intrinsics.areEqual(this.equities_sell_all_order, surrogate.equities_sell_all_order) && Intrinsics.areEqual(this.equities_buy_all_order, surrogate.equities_buy_all_order);
        }

        public int hashCode() {
            EquitiesLimitOrderPayloadDto equitiesLimitOrderPayloadDto = this.equities_limit_order;
            int iHashCode = (equitiesLimitOrderPayloadDto == null ? 0 : equitiesLimitOrderPayloadDto.hashCode()) * 31;
            EquitiesStopMarketOrderPayloadDto equitiesStopMarketOrderPayloadDto = this.equities_stop_market_order;
            int iHashCode2 = (iHashCode + (equitiesStopMarketOrderPayloadDto == null ? 0 : equitiesStopMarketOrderPayloadDto.hashCode())) * 31;
            EquitiesSellAllOrderPayloadDto equitiesSellAllOrderPayloadDto = this.equities_sell_all_order;
            int iHashCode3 = (iHashCode2 + (equitiesSellAllOrderPayloadDto == null ? 0 : equitiesSellAllOrderPayloadDto.hashCode())) * 31;
            EquitiesBuyAllOrderPayloadDto equitiesBuyAllOrderPayloadDto = this.equities_buy_all_order;
            return iHashCode3 + (equitiesBuyAllOrderPayloadDto != null ? equitiesBuyAllOrderPayloadDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(equities_limit_order=" + this.equities_limit_order + ", equities_stop_market_order=" + this.equities_stop_market_order + ", equities_sell_all_order=" + this.equities_sell_all_order + ", equities_buy_all_order=" + this.equities_buy_all_order + ")";
        }

        /* compiled from: OrderPayloadDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderPayloadDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderPayloadDto$Surrogate;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return OrderPayloadDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, EquitiesLimitOrderPayloadDto equitiesLimitOrderPayloadDto, EquitiesStopMarketOrderPayloadDto equitiesStopMarketOrderPayloadDto, EquitiesSellAllOrderPayloadDto equitiesSellAllOrderPayloadDto, EquitiesBuyAllOrderPayloadDto equitiesBuyAllOrderPayloadDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.equities_limit_order = null;
            } else {
                this.equities_limit_order = equitiesLimitOrderPayloadDto;
            }
            if ((i & 2) == 0) {
                this.equities_stop_market_order = null;
            } else {
                this.equities_stop_market_order = equitiesStopMarketOrderPayloadDto;
            }
            if ((i & 4) == 0) {
                this.equities_sell_all_order = null;
            } else {
                this.equities_sell_all_order = equitiesSellAllOrderPayloadDto;
            }
            if ((i & 8) == 0) {
                this.equities_buy_all_order = null;
            } else {
                this.equities_buy_all_order = equitiesBuyAllOrderPayloadDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$black_widow_mobile_chart_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            EquitiesLimitOrderPayloadDto equitiesLimitOrderPayloadDto = self.equities_limit_order;
            if (equitiesLimitOrderPayloadDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, EquitiesLimitOrderPayloadDto.Serializer.INSTANCE, equitiesLimitOrderPayloadDto);
            }
            EquitiesStopMarketOrderPayloadDto equitiesStopMarketOrderPayloadDto = self.equities_stop_market_order;
            if (equitiesStopMarketOrderPayloadDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, EquitiesStopMarketOrderPayloadDto.Serializer.INSTANCE, equitiesStopMarketOrderPayloadDto);
            }
            EquitiesSellAllOrderPayloadDto equitiesSellAllOrderPayloadDto = self.equities_sell_all_order;
            if (equitiesSellAllOrderPayloadDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, EquitiesSellAllOrderPayloadDto.Serializer.INSTANCE, equitiesSellAllOrderPayloadDto);
            }
            EquitiesBuyAllOrderPayloadDto equitiesBuyAllOrderPayloadDto = self.equities_buy_all_order;
            if (equitiesBuyAllOrderPayloadDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, EquitiesBuyAllOrderPayloadDto.Serializer.INSTANCE, equitiesBuyAllOrderPayloadDto);
            }
        }

        public Surrogate(EquitiesLimitOrderPayloadDto equitiesLimitOrderPayloadDto, EquitiesStopMarketOrderPayloadDto equitiesStopMarketOrderPayloadDto, EquitiesSellAllOrderPayloadDto equitiesSellAllOrderPayloadDto, EquitiesBuyAllOrderPayloadDto equitiesBuyAllOrderPayloadDto) {
            this.equities_limit_order = equitiesLimitOrderPayloadDto;
            this.equities_stop_market_order = equitiesStopMarketOrderPayloadDto;
            this.equities_sell_all_order = equitiesSellAllOrderPayloadDto;
            this.equities_buy_all_order = equitiesBuyAllOrderPayloadDto;
        }

        public /* synthetic */ Surrogate(EquitiesLimitOrderPayloadDto equitiesLimitOrderPayloadDto, EquitiesStopMarketOrderPayloadDto equitiesStopMarketOrderPayloadDto, EquitiesSellAllOrderPayloadDto equitiesSellAllOrderPayloadDto, EquitiesBuyAllOrderPayloadDto equitiesBuyAllOrderPayloadDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : equitiesLimitOrderPayloadDto, (i & 2) != 0 ? null : equitiesStopMarketOrderPayloadDto, (i & 4) != 0 ? null : equitiesSellAllOrderPayloadDto, (i & 8) != 0 ? null : equitiesBuyAllOrderPayloadDto);
        }

        public final EquitiesLimitOrderPayloadDto getEquities_limit_order() {
            return this.equities_limit_order;
        }

        public final EquitiesStopMarketOrderPayloadDto getEquities_stop_market_order() {
            return this.equities_stop_market_order;
        }

        public final EquitiesSellAllOrderPayloadDto getEquities_sell_all_order() {
            return this.equities_sell_all_order;
        }

        public final EquitiesBuyAllOrderPayloadDto getEquities_buy_all_order() {
            return this.equities_buy_all_order;
        }
    }

    /* compiled from: OrderPayloadDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderPayloadDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderPayloadDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderPayload;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderPayloadDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<OrderPayloadDto, OrderPayload> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OrderPayloadDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OrderPayloadDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OrderPayloadDto> getBinaryBase64Serializer() {
            return (KSerializer) OrderPayloadDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<OrderPayload> getProtoAdapter() {
            return OrderPayload.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OrderPayloadDto getZeroValue() {
            return OrderPayloadDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OrderPayloadDto fromProto(OrderPayload proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            EquitiesLimitOrderPayload equities_limit_order = proto.getEquities_limit_order();
            DefaultConstructorMarker defaultConstructorMarker = null;
            EquitiesLimitOrderPayloadDto equitiesLimitOrderPayloadDtoFromProto = equities_limit_order != null ? EquitiesLimitOrderPayloadDto.INSTANCE.fromProto(equities_limit_order) : null;
            EquitiesStopMarketOrderPayload equities_stop_market_order = proto.getEquities_stop_market_order();
            EquitiesStopMarketOrderPayloadDto equitiesStopMarketOrderPayloadDtoFromProto = equities_stop_market_order != null ? EquitiesStopMarketOrderPayloadDto.INSTANCE.fromProto(equities_stop_market_order) : null;
            EquitiesSellAllOrderPayload equities_sell_all_order = proto.getEquities_sell_all_order();
            EquitiesSellAllOrderPayloadDto equitiesSellAllOrderPayloadDtoFromProto = equities_sell_all_order != null ? EquitiesSellAllOrderPayloadDto.INSTANCE.fromProto(equities_sell_all_order) : null;
            EquitiesBuyAllOrderPayload equities_buy_all_order = proto.getEquities_buy_all_order();
            return new OrderPayloadDto(new Surrogate(equitiesLimitOrderPayloadDtoFromProto, equitiesStopMarketOrderPayloadDtoFromProto, equitiesSellAllOrderPayloadDtoFromProto, equities_buy_all_order != null ? EquitiesBuyAllOrderPayloadDto.INSTANCE.fromProto(equities_buy_all_order) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: black_widow.contracts.mobile_app_chart.proto.v1.OrderPayloadDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderPayloadDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new OrderPayloadDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: OrderPayloadDto.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \b2\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderPayloadDto$OrderDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "EquitiesLimitOrder", "EquitiesStopMarketOrder", "EquitiesSellAllOrder", "EquitiesBuyAllOrder", "Companion", "Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderPayloadDto$OrderDto$EquitiesBuyAllOrder;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderPayloadDto$OrderDto$EquitiesLimitOrder;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderPayloadDto$OrderDto$EquitiesSellAllOrder;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderPayloadDto$OrderDto$EquitiesStopMarketOrder;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class OrderDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ OrderDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private OrderDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: OrderPayloadDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderPayloadDto$OrderDto$EquitiesLimitOrder;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderPayloadDto$OrderDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesLimitOrderPayloadDto;", "value", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesLimitOrderPayloadDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesLimitOrderPayloadDto;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesLimitOrderPayloadDto;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class EquitiesLimitOrder extends OrderDto {
            private final EquitiesLimitOrderPayloadDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof EquitiesLimitOrder) && Intrinsics.areEqual(this.value, ((EquitiesLimitOrder) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "EquitiesLimitOrder(value=" + this.value + ")";
            }

            public final EquitiesLimitOrderPayloadDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EquitiesLimitOrder(EquitiesLimitOrderPayloadDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OrderPayloadDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderPayloadDto$OrderDto$EquitiesStopMarketOrder;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderPayloadDto$OrderDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesStopMarketOrderPayloadDto;", "value", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesStopMarketOrderPayloadDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesStopMarketOrderPayloadDto;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesStopMarketOrderPayloadDto;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class EquitiesStopMarketOrder extends OrderDto {
            private final EquitiesStopMarketOrderPayloadDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof EquitiesStopMarketOrder) && Intrinsics.areEqual(this.value, ((EquitiesStopMarketOrder) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "EquitiesStopMarketOrder(value=" + this.value + ")";
            }

            public final EquitiesStopMarketOrderPayloadDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EquitiesStopMarketOrder(EquitiesStopMarketOrderPayloadDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OrderPayloadDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderPayloadDto$OrderDto$EquitiesSellAllOrder;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderPayloadDto$OrderDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesSellAllOrderPayloadDto;", "value", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesSellAllOrderPayloadDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesSellAllOrderPayloadDto;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesSellAllOrderPayloadDto;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class EquitiesSellAllOrder extends OrderDto {
            private final EquitiesSellAllOrderPayloadDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof EquitiesSellAllOrder) && Intrinsics.areEqual(this.value, ((EquitiesSellAllOrder) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "EquitiesSellAllOrder(value=" + this.value + ")";
            }

            public final EquitiesSellAllOrderPayloadDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EquitiesSellAllOrder(EquitiesSellAllOrderPayloadDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OrderPayloadDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderPayloadDto$OrderDto$EquitiesBuyAllOrder;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderPayloadDto$OrderDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesBuyAllOrderPayloadDto;", "value", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesBuyAllOrderPayloadDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesBuyAllOrderPayloadDto;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesBuyAllOrderPayloadDto;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class EquitiesBuyAllOrder extends OrderDto {
            private final EquitiesBuyAllOrderPayloadDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof EquitiesBuyAllOrder) && Intrinsics.areEqual(this.value, ((EquitiesBuyAllOrder) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "EquitiesBuyAllOrder(value=" + this.value + ")";
            }

            public final EquitiesBuyAllOrderPayloadDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EquitiesBuyAllOrder(EquitiesBuyAllOrderPayloadDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OrderPayloadDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderPayloadDto$OrderDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderPayloadDto$OrderDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderPayload;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<OrderDto, OrderPayload> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.idl.Dto.Creator
            public Void getZeroValue() {
                return Dto4.Creator.DefaultImpls.getZeroValue(this);
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<OrderPayload> getProtoAdapter() {
                return OrderPayload.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OrderDto fromProto(OrderPayload proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getEquities_limit_order() != null) {
                    return new EquitiesLimitOrder(EquitiesLimitOrderPayloadDto.INSTANCE.fromProto(proto.getEquities_limit_order()));
                }
                if (proto.getEquities_stop_market_order() != null) {
                    return new EquitiesStopMarketOrder(EquitiesStopMarketOrderPayloadDto.INSTANCE.fromProto(proto.getEquities_stop_market_order()));
                }
                if (proto.getEquities_sell_all_order() != null) {
                    return new EquitiesSellAllOrder(EquitiesSellAllOrderPayloadDto.INSTANCE.fromProto(proto.getEquities_sell_all_order()));
                }
                if (proto.getEquities_buy_all_order() != null) {
                    return new EquitiesBuyAllOrder(EquitiesBuyAllOrderPayloadDto.INSTANCE.fromProto(proto.getEquities_buy_all_order()));
                }
                return null;
            }
        }
    }

    /* compiled from: OrderPayloadDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderPayloadDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderPayloadDto;", "<init>", "()V", "surrogateSerializer", "Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderPayloadDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<OrderPayloadDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/black_widow.contracts.mobile_app_chart.proto.v1.OrderPayload", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, OrderPayloadDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public OrderPayloadDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new OrderPayloadDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: OrderPayloadDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderPayloadDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "black_widow.contracts.mobile_app_chart.proto.v1.OrderPayloadDto";
        }
    }
}
