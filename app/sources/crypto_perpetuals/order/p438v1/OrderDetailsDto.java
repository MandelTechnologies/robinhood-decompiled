package crypto_perpetuals.order.p438v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import crypto_perpetuals.order.p438v1.LimitOrderDetailsDto;
import crypto_perpetuals.order.p438v1.MarketOrderDetailsDto;
import crypto_perpetuals.order.p438v1.StopLossOrderDetailsDto;
import crypto_perpetuals.order.p438v1.TakeProfitOrderDetailsDto;
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
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: OrderDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005#\"$%&B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006'"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/OrderDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcrypto_perpetuals/order/v1/OrderDetails;", "Landroid/os/Parcelable;", "Lcrypto_perpetuals/order/v1/OrderDetailsDto$Surrogate;", "surrogate", "<init>", "(Lcrypto_perpetuals/order/v1/OrderDetailsDto$Surrogate;)V", "Lcrypto_perpetuals/order/v1/OrderDetailsDto$DetailsDto;", ErrorBundle.DETAIL_ENTRY, "(Lcrypto_perpetuals/order/v1/OrderDetailsDto$DetailsDto;)V", "toProto", "()Lcrypto_perpetuals/order/v1/OrderDetails;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcrypto_perpetuals/order/v1/OrderDetailsDto$Surrogate;", "getDetails", "()Lcrypto_perpetuals/order/v1/OrderDetailsDto$DetailsDto;", "Companion", "Surrogate", "DetailsDto", "Serializer", "MultibindingModule", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
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

    public final DetailsDto getDetails() {
        if (this.surrogate.getMarket_order_details() != null) {
            return new DetailsDto.MarketOrderDetails(this.surrogate.getMarket_order_details());
        }
        if (this.surrogate.getLimit_order_details() != null) {
            return new DetailsDto.LimitOrderDetails(this.surrogate.getLimit_order_details());
        }
        if (this.surrogate.getStop_loss_order_details() != null) {
            return new DetailsDto.StopLossOrderDetails(this.surrogate.getStop_loss_order_details());
        }
        if (this.surrogate.getTake_profit_order_details() != null) {
            return new DetailsDto.TakeProfitOrderDetails(this.surrogate.getTake_profit_order_details());
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OrderDetailsDto(DetailsDto detailsDto) {
        DetailsDto.MarketOrderDetails marketOrderDetails = detailsDto instanceof DetailsDto.MarketOrderDetails ? (DetailsDto.MarketOrderDetails) detailsDto : null;
        MarketOrderDetailsDto value = marketOrderDetails != null ? marketOrderDetails.getValue() : null;
        DetailsDto.LimitOrderDetails limitOrderDetails = detailsDto instanceof DetailsDto.LimitOrderDetails ? (DetailsDto.LimitOrderDetails) detailsDto : null;
        LimitOrderDetailsDto value2 = limitOrderDetails != null ? limitOrderDetails.getValue() : null;
        DetailsDto.StopLossOrderDetails stopLossOrderDetails = detailsDto instanceof DetailsDto.StopLossOrderDetails ? (DetailsDto.StopLossOrderDetails) detailsDto : null;
        StopLossOrderDetailsDto value3 = stopLossOrderDetails != null ? stopLossOrderDetails.getValue() : null;
        DetailsDto.TakeProfitOrderDetails takeProfitOrderDetails = detailsDto instanceof DetailsDto.TakeProfitOrderDetails ? (DetailsDto.TakeProfitOrderDetails) detailsDto : null;
        this(new Surrogate(value, value2, value3, takeProfitOrderDetails != null ? takeProfitOrderDetails.getValue() : null));
    }

    public /* synthetic */ OrderDetailsDto(DetailsDto detailsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : detailsDto);
    }

    @Override // com.robinhood.idl.Dto
    public OrderDetails toProto() {
        MarketOrderDetailsDto market_order_details = this.surrogate.getMarket_order_details();
        MarketOrderDetails proto = market_order_details != null ? market_order_details.toProto() : null;
        LimitOrderDetailsDto limit_order_details = this.surrogate.getLimit_order_details();
        LimitOrderDetails proto2 = limit_order_details != null ? limit_order_details.toProto() : null;
        StopLossOrderDetailsDto stop_loss_order_details = this.surrogate.getStop_loss_order_details();
        StopLossOrderDetails proto3 = stop_loss_order_details != null ? stop_loss_order_details.toProto() : null;
        TakeProfitOrderDetailsDto take_profit_order_details = this.surrogate.getTake_profit_order_details();
        return new OrderDetails(proto, proto2, proto3, take_profit_order_details != null ? take_profit_order_details.toProto() : null, null, 16, null);
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
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0083\b\u0018\u0000 42\u00020\u0001:\u000254B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010(\u0012\u0004\b+\u0010'\u001a\u0004\b)\u0010*R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010,\u0012\u0004\b/\u0010'\u001a\u0004\b-\u0010.R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00100\u0012\u0004\b3\u0010'\u001a\u0004\b1\u00102¨\u00066"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/OrderDetailsDto$Surrogate;", "", "Lcrypto_perpetuals/order/v1/MarketOrderDetailsDto;", "market_order_details", "Lcrypto_perpetuals/order/v1/LimitOrderDetailsDto;", "limit_order_details", "Lcrypto_perpetuals/order/v1/StopLossOrderDetailsDto;", "stop_loss_order_details", "Lcrypto_perpetuals/order/v1/TakeProfitOrderDetailsDto;", "take_profit_order_details", "<init>", "(Lcrypto_perpetuals/order/v1/MarketOrderDetailsDto;Lcrypto_perpetuals/order/v1/LimitOrderDetailsDto;Lcrypto_perpetuals/order/v1/StopLossOrderDetailsDto;Lcrypto_perpetuals/order/v1/TakeProfitOrderDetailsDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcrypto_perpetuals/order/v1/MarketOrderDetailsDto;Lcrypto_perpetuals/order/v1/LimitOrderDetailsDto;Lcrypto_perpetuals/order/v1/StopLossOrderDetailsDto;Lcrypto_perpetuals/order/v1/TakeProfitOrderDetailsDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_perpetuals_order_v1_externalRelease", "(Lcrypto_perpetuals/order/v1/OrderDetailsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcrypto_perpetuals/order/v1/MarketOrderDetailsDto;", "getMarket_order_details", "()Lcrypto_perpetuals/order/v1/MarketOrderDetailsDto;", "getMarket_order_details$annotations", "()V", "Lcrypto_perpetuals/order/v1/LimitOrderDetailsDto;", "getLimit_order_details", "()Lcrypto_perpetuals/order/v1/LimitOrderDetailsDto;", "getLimit_order_details$annotations", "Lcrypto_perpetuals/order/v1/StopLossOrderDetailsDto;", "getStop_loss_order_details", "()Lcrypto_perpetuals/order/v1/StopLossOrderDetailsDto;", "getStop_loss_order_details$annotations", "Lcrypto_perpetuals/order/v1/TakeProfitOrderDetailsDto;", "getTake_profit_order_details", "()Lcrypto_perpetuals/order/v1/TakeProfitOrderDetailsDto;", "getTake_profit_order_details$annotations", "Companion", "$serializer", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final LimitOrderDetailsDto limit_order_details;
        private final MarketOrderDetailsDto market_order_details;
        private final StopLossOrderDetailsDto stop_loss_order_details;
        private final TakeProfitOrderDetailsDto take_profit_order_details;

        public Surrogate() {
            this((MarketOrderDetailsDto) null, (LimitOrderDetailsDto) null, (StopLossOrderDetailsDto) null, (TakeProfitOrderDetailsDto) null, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.market_order_details, surrogate.market_order_details) && Intrinsics.areEqual(this.limit_order_details, surrogate.limit_order_details) && Intrinsics.areEqual(this.stop_loss_order_details, surrogate.stop_loss_order_details) && Intrinsics.areEqual(this.take_profit_order_details, surrogate.take_profit_order_details);
        }

        public int hashCode() {
            MarketOrderDetailsDto marketOrderDetailsDto = this.market_order_details;
            int iHashCode = (marketOrderDetailsDto == null ? 0 : marketOrderDetailsDto.hashCode()) * 31;
            LimitOrderDetailsDto limitOrderDetailsDto = this.limit_order_details;
            int iHashCode2 = (iHashCode + (limitOrderDetailsDto == null ? 0 : limitOrderDetailsDto.hashCode())) * 31;
            StopLossOrderDetailsDto stopLossOrderDetailsDto = this.stop_loss_order_details;
            int iHashCode3 = (iHashCode2 + (stopLossOrderDetailsDto == null ? 0 : stopLossOrderDetailsDto.hashCode())) * 31;
            TakeProfitOrderDetailsDto takeProfitOrderDetailsDto = this.take_profit_order_details;
            return iHashCode3 + (takeProfitOrderDetailsDto != null ? takeProfitOrderDetailsDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(market_order_details=" + this.market_order_details + ", limit_order_details=" + this.limit_order_details + ", stop_loss_order_details=" + this.stop_loss_order_details + ", take_profit_order_details=" + this.take_profit_order_details + ")";
        }

        /* compiled from: OrderDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/OrderDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcrypto_perpetuals/order/v1/OrderDetailsDto$Surrogate;", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return OrderDetailsDto4.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, MarketOrderDetailsDto marketOrderDetailsDto, LimitOrderDetailsDto limitOrderDetailsDto, StopLossOrderDetailsDto stopLossOrderDetailsDto, TakeProfitOrderDetailsDto takeProfitOrderDetailsDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.market_order_details = null;
            } else {
                this.market_order_details = marketOrderDetailsDto;
            }
            if ((i & 2) == 0) {
                this.limit_order_details = null;
            } else {
                this.limit_order_details = limitOrderDetailsDto;
            }
            if ((i & 4) == 0) {
                this.stop_loss_order_details = null;
            } else {
                this.stop_loss_order_details = stopLossOrderDetailsDto;
            }
            if ((i & 8) == 0) {
                this.take_profit_order_details = null;
            } else {
                this.take_profit_order_details = takeProfitOrderDetailsDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$crypto_perpetuals_order_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            MarketOrderDetailsDto marketOrderDetailsDto = self.market_order_details;
            if (marketOrderDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, MarketOrderDetailsDto.Serializer.INSTANCE, marketOrderDetailsDto);
            }
            LimitOrderDetailsDto limitOrderDetailsDto = self.limit_order_details;
            if (limitOrderDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, LimitOrderDetailsDto.Serializer.INSTANCE, limitOrderDetailsDto);
            }
            StopLossOrderDetailsDto stopLossOrderDetailsDto = self.stop_loss_order_details;
            if (stopLossOrderDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, StopLossOrderDetailsDto.Serializer.INSTANCE, stopLossOrderDetailsDto);
            }
            TakeProfitOrderDetailsDto takeProfitOrderDetailsDto = self.take_profit_order_details;
            if (takeProfitOrderDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, TakeProfitOrderDetailsDto.Serializer.INSTANCE, takeProfitOrderDetailsDto);
            }
        }

        public Surrogate(MarketOrderDetailsDto marketOrderDetailsDto, LimitOrderDetailsDto limitOrderDetailsDto, StopLossOrderDetailsDto stopLossOrderDetailsDto, TakeProfitOrderDetailsDto takeProfitOrderDetailsDto) {
            this.market_order_details = marketOrderDetailsDto;
            this.limit_order_details = limitOrderDetailsDto;
            this.stop_loss_order_details = stopLossOrderDetailsDto;
            this.take_profit_order_details = takeProfitOrderDetailsDto;
        }

        public /* synthetic */ Surrogate(MarketOrderDetailsDto marketOrderDetailsDto, LimitOrderDetailsDto limitOrderDetailsDto, StopLossOrderDetailsDto stopLossOrderDetailsDto, TakeProfitOrderDetailsDto takeProfitOrderDetailsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : marketOrderDetailsDto, (i & 2) != 0 ? null : limitOrderDetailsDto, (i & 4) != 0 ? null : stopLossOrderDetailsDto, (i & 8) != 0 ? null : takeProfitOrderDetailsDto);
        }

        public final MarketOrderDetailsDto getMarket_order_details() {
            return this.market_order_details;
        }

        public final LimitOrderDetailsDto getLimit_order_details() {
            return this.limit_order_details;
        }

        public final StopLossOrderDetailsDto getStop_loss_order_details() {
            return this.stop_loss_order_details;
        }

        public final TakeProfitOrderDetailsDto getTake_profit_order_details() {
            return this.take_profit_order_details;
        }
    }

    /* compiled from: OrderDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/OrderDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcrypto_perpetuals/order/v1/OrderDetailsDto;", "Lcrypto_perpetuals/order/v1/OrderDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcrypto_perpetuals/order/v1/OrderDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
            MarketOrderDetails market_order_details = proto.getMarket_order_details();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MarketOrderDetailsDto marketOrderDetailsDtoFromProto = market_order_details != null ? MarketOrderDetailsDto.INSTANCE.fromProto(market_order_details) : null;
            LimitOrderDetails limit_order_details = proto.getLimit_order_details();
            LimitOrderDetailsDto limitOrderDetailsDtoFromProto = limit_order_details != null ? LimitOrderDetailsDto.INSTANCE.fromProto(limit_order_details) : null;
            StopLossOrderDetails stop_loss_order_details = proto.getStop_loss_order_details();
            StopLossOrderDetailsDto stopLossOrderDetailsDtoFromProto = stop_loss_order_details != null ? StopLossOrderDetailsDto.INSTANCE.fromProto(stop_loss_order_details) : null;
            TakeProfitOrderDetails take_profit_order_details = proto.getTake_profit_order_details();
            return new OrderDetailsDto(new Surrogate(marketOrderDetailsDtoFromProto, limitOrderDetailsDtoFromProto, stopLossOrderDetailsDtoFromProto, take_profit_order_details != null ? TakeProfitOrderDetailsDto.INSTANCE.fromProto(take_profit_order_details) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: crypto_perpetuals.order.v1.OrderDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderDetailsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new OrderDetailsDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: OrderDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \b2\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/OrderDetailsDto$DetailsDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "MarketOrderDetails", "LimitOrderDetails", "StopLossOrderDetails", "TakeProfitOrderDetails", "Companion", "Lcrypto_perpetuals/order/v1/OrderDetailsDto$DetailsDto$LimitOrderDetails;", "Lcrypto_perpetuals/order/v1/OrderDetailsDto$DetailsDto$MarketOrderDetails;", "Lcrypto_perpetuals/order/v1/OrderDetailsDto$DetailsDto$StopLossOrderDetails;", "Lcrypto_perpetuals/order/v1/OrderDetailsDto$DetailsDto$TakeProfitOrderDetails;", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class DetailsDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ DetailsDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private DetailsDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: OrderDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/OrderDetailsDto$DetailsDto$MarketOrderDetails;", "Lcrypto_perpetuals/order/v1/OrderDetailsDto$DetailsDto;", "Lcrypto_perpetuals/order/v1/MarketOrderDetailsDto;", "value", "<init>", "(Lcrypto_perpetuals/order/v1/MarketOrderDetailsDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcrypto_perpetuals/order/v1/MarketOrderDetailsDto;", "getValue", "()Lcrypto_perpetuals/order/v1/MarketOrderDetailsDto;", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class MarketOrderDetails extends DetailsDto {
            private final MarketOrderDetailsDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof MarketOrderDetails) && Intrinsics.areEqual(this.value, ((MarketOrderDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "MarketOrderDetails(value=" + this.value + ")";
            }

            public final MarketOrderDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MarketOrderDetails(MarketOrderDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OrderDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/OrderDetailsDto$DetailsDto$LimitOrderDetails;", "Lcrypto_perpetuals/order/v1/OrderDetailsDto$DetailsDto;", "Lcrypto_perpetuals/order/v1/LimitOrderDetailsDto;", "value", "<init>", "(Lcrypto_perpetuals/order/v1/LimitOrderDetailsDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcrypto_perpetuals/order/v1/LimitOrderDetailsDto;", "getValue", "()Lcrypto_perpetuals/order/v1/LimitOrderDetailsDto;", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class LimitOrderDetails extends DetailsDto {
            private final LimitOrderDetailsDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof LimitOrderDetails) && Intrinsics.areEqual(this.value, ((LimitOrderDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "LimitOrderDetails(value=" + this.value + ")";
            }

            public final LimitOrderDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LimitOrderDetails(LimitOrderDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OrderDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/OrderDetailsDto$DetailsDto$StopLossOrderDetails;", "Lcrypto_perpetuals/order/v1/OrderDetailsDto$DetailsDto;", "Lcrypto_perpetuals/order/v1/StopLossOrderDetailsDto;", "value", "<init>", "(Lcrypto_perpetuals/order/v1/StopLossOrderDetailsDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcrypto_perpetuals/order/v1/StopLossOrderDetailsDto;", "getValue", "()Lcrypto_perpetuals/order/v1/StopLossOrderDetailsDto;", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class StopLossOrderDetails extends DetailsDto {
            private final StopLossOrderDetailsDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof StopLossOrderDetails) && Intrinsics.areEqual(this.value, ((StopLossOrderDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "StopLossOrderDetails(value=" + this.value + ")";
            }

            public final StopLossOrderDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StopLossOrderDetails(StopLossOrderDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OrderDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/OrderDetailsDto$DetailsDto$TakeProfitOrderDetails;", "Lcrypto_perpetuals/order/v1/OrderDetailsDto$DetailsDto;", "Lcrypto_perpetuals/order/v1/TakeProfitOrderDetailsDto;", "value", "<init>", "(Lcrypto_perpetuals/order/v1/TakeProfitOrderDetailsDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcrypto_perpetuals/order/v1/TakeProfitOrderDetailsDto;", "getValue", "()Lcrypto_perpetuals/order/v1/TakeProfitOrderDetailsDto;", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TakeProfitOrderDetails extends DetailsDto {
            private final TakeProfitOrderDetailsDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TakeProfitOrderDetails) && Intrinsics.areEqual(this.value, ((TakeProfitOrderDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "TakeProfitOrderDetails(value=" + this.value + ")";
            }

            public final TakeProfitOrderDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TakeProfitOrderDetails(TakeProfitOrderDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OrderDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/OrderDetailsDto$DetailsDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lcrypto_perpetuals/order/v1/OrderDetailsDto$DetailsDto;", "Lcrypto_perpetuals/order/v1/OrderDetails;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes18.dex */
        public static final class Companion implements Dto4.Creator<DetailsDto, OrderDetails> {
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
            public ProtoAdapter<OrderDetails> getProtoAdapter() {
                return OrderDetails.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DetailsDto fromProto(OrderDetails proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getMarket_order_details() != null) {
                    return new MarketOrderDetails(MarketOrderDetailsDto.INSTANCE.fromProto(proto.getMarket_order_details()));
                }
                if (proto.getLimit_order_details() != null) {
                    return new LimitOrderDetails(LimitOrderDetailsDto.INSTANCE.fromProto(proto.getLimit_order_details()));
                }
                if (proto.getStop_loss_order_details() != null) {
                    return new StopLossOrderDetails(StopLossOrderDetailsDto.INSTANCE.fromProto(proto.getStop_loss_order_details()));
                }
                if (proto.getTake_profit_order_details() != null) {
                    return new TakeProfitOrderDetails(TakeProfitOrderDetailsDto.INSTANCE.fromProto(proto.getTake_profit_order_details()));
                }
                return null;
            }
        }
    }

    /* compiled from: OrderDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/OrderDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcrypto_perpetuals/order/v1/OrderDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcrypto_perpetuals/order/v1/OrderDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<OrderDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/crypto_perpetuals.order.v1.OrderDetails", kSerializerSerializer.getDescriptor());
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
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/OrderDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "crypto_perpetuals.order.v1.OrderDetailsDto";
        }
    }
}
