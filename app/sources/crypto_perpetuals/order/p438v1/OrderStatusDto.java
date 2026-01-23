package crypto_perpetuals.order.p438v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.models.api.MarginCall;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OrderStatusDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u001e\u001fB\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006 "}, m3636d2 = {"Lcrypto_perpetuals/order/v1/OrderStatusDto;", "Lcom/robinhood/idl/EnumDto;", "Lcrypto_perpetuals/order/v1/OrderStatus;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "ORDER_STATUS_UNSPECIFIED", "NEW", "PENDING", "PARTIALLY_FILLED", "FILLED", "CANCELLED", "REJECTED", "EXPIRED", "FAILED", "UNCONFIRMED", "CONFIRMED", "PENDING_CANCEL", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public abstract class OrderStatusDto implements Dto2<OrderStatus>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OrderStatusDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<OrderStatusDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<OrderStatusDto, OrderStatus>> binaryBase64Serializer$delegate;
    private final String json_value;
    public static final OrderStatusDto ORDER_STATUS_UNSPECIFIED = new OrderStatusDto("ORDER_STATUS_UNSPECIFIED", 0) { // from class: crypto_perpetuals.order.v1.OrderStatusDto.ORDER_STATUS_UNSPECIFIED
        {
            String str = "unspecified";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderStatus toProto() {
            return OrderStatus.ORDER_STATUS_UNSPECIFIED;
        }
    };
    public static final OrderStatusDto NEW = new OrderStatusDto("NEW", 1) { // from class: crypto_perpetuals.order.v1.OrderStatusDto.NEW
        {
            String str = "new";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderStatus toProto() {
            return OrderStatus.NEW;
        }
    };
    public static final OrderStatusDto PENDING = new OrderStatusDto("PENDING", 2) { // from class: crypto_perpetuals.order.v1.OrderStatusDto.PENDING
        {
            String str = "pending";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderStatus toProto() {
            return OrderStatus.PENDING;
        }
    };
    public static final OrderStatusDto PARTIALLY_FILLED = new OrderStatusDto("PARTIALLY_FILLED", 3) { // from class: crypto_perpetuals.order.v1.OrderStatusDto.PARTIALLY_FILLED
        {
            String str = "partially_filled";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderStatus toProto() {
            return OrderStatus.PARTIALLY_FILLED;
        }
    };
    public static final OrderStatusDto FILLED = new OrderStatusDto("FILLED", 4) { // from class: crypto_perpetuals.order.v1.OrderStatusDto.FILLED
        {
            String str = "filled";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderStatus toProto() {
            return OrderStatus.FILLED;
        }
    };
    public static final OrderStatusDto CANCELLED = new OrderStatusDto("CANCELLED", 5) { // from class: crypto_perpetuals.order.v1.OrderStatusDto.CANCELLED
        {
            String str = "cancelled";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderStatus toProto() {
            return OrderStatus.CANCELLED;
        }
    };
    public static final OrderStatusDto REJECTED = new OrderStatusDto("REJECTED", 6) { // from class: crypto_perpetuals.order.v1.OrderStatusDto.REJECTED
        {
            String str = "rejected";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderStatus toProto() {
            return OrderStatus.REJECTED;
        }
    };
    public static final OrderStatusDto EXPIRED = new OrderStatusDto("EXPIRED", 7) { // from class: crypto_perpetuals.order.v1.OrderStatusDto.EXPIRED
        {
            String str = MarginCall.STATE_EXPIRED;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderStatus toProto() {
            return OrderStatus.EXPIRED;
        }
    };
    public static final OrderStatusDto FAILED = new OrderStatusDto("FAILED", 8) { // from class: crypto_perpetuals.order.v1.OrderStatusDto.FAILED
        {
            String str = "failed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderStatus toProto() {
            return OrderStatus.FAILED;
        }
    };
    public static final OrderStatusDto UNCONFIRMED = new OrderStatusDto("UNCONFIRMED", 9) { // from class: crypto_perpetuals.order.v1.OrderStatusDto.UNCONFIRMED
        {
            String str = "unconfirmed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderStatus toProto() {
            return OrderStatus.UNCONFIRMED;
        }
    };
    public static final OrderStatusDto CONFIRMED = new OrderStatusDto("CONFIRMED", 10) { // from class: crypto_perpetuals.order.v1.OrderStatusDto.CONFIRMED
        {
            String str = "confirmed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderStatus toProto() {
            return OrderStatus.CONFIRMED;
        }
    };
    public static final OrderStatusDto PENDING_CANCEL = new OrderStatusDto("PENDING_CANCEL", 11) { // from class: crypto_perpetuals.order.v1.OrderStatusDto.PENDING_CANCEL
        {
            String str = "pending_cancel";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderStatus toProto() {
            return OrderStatus.PENDING_CANCEL;
        }
    };

    private static final /* synthetic */ OrderStatusDto[] $values() {
        return new OrderStatusDto[]{ORDER_STATUS_UNSPECIFIED, NEW, PENDING, PARTIALLY_FILLED, FILLED, CANCELLED, REJECTED, EXPIRED, FAILED, UNCONFIRMED, CONFIRMED, PENDING_CANCEL};
    }

    public /* synthetic */ OrderStatusDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    public static EnumEntries<OrderStatusDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private OrderStatusDto(String str, int i, String str2) {
        this.json_value = str2;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    static {
        OrderStatusDto[] orderStatusDtoArr$values = $values();
        $VALUES = orderStatusDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(orderStatusDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: crypto_perpetuals.order.v1.OrderStatusDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderStatusDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: OrderStatusDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/OrderStatusDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcrypto_perpetuals/order/v1/OrderStatusDto;", "Lcrypto_perpetuals/order/v1/OrderStatus;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcrypto_perpetuals/order/v1/OrderStatusDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<OrderStatusDto, OrderStatus> {

        /* compiled from: OrderStatusDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes18.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[OrderStatus.values().length];
                try {
                    iArr[OrderStatus.ORDER_STATUS_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OrderStatus.NEW.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[OrderStatus.PENDING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[OrderStatus.PARTIALLY_FILLED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[OrderStatus.FILLED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[OrderStatus.CANCELLED.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[OrderStatus.REJECTED.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[OrderStatus.EXPIRED.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[OrderStatus.FAILED.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[OrderStatus.UNCONFIRMED.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[OrderStatus.CONFIRMED.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[OrderStatus.PENDING_CANCEL.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OrderStatusDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OrderStatusDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OrderStatusDto> getBinaryBase64Serializer() {
            return (KSerializer) OrderStatusDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<OrderStatus> getProtoAdapter() {
            return OrderStatus.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OrderStatusDto getZeroValue() {
            return OrderStatusDto.ORDER_STATUS_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OrderStatusDto fromProto(OrderStatus proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return OrderStatusDto.ORDER_STATUS_UNSPECIFIED;
                case 2:
                    return OrderStatusDto.NEW;
                case 3:
                    return OrderStatusDto.PENDING;
                case 4:
                    return OrderStatusDto.PARTIALLY_FILLED;
                case 5:
                    return OrderStatusDto.FILLED;
                case 6:
                    return OrderStatusDto.CANCELLED;
                case 7:
                    return OrderStatusDto.REJECTED;
                case 8:
                    return OrderStatusDto.EXPIRED;
                case 9:
                    return OrderStatusDto.FAILED;
                case 10:
                    return OrderStatusDto.UNCONFIRMED;
                case 11:
                    return OrderStatusDto.CONFIRMED;
                case 12:
                    return OrderStatusDto.PENDING_CANCEL;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: OrderStatusDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/OrderStatusDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcrypto_perpetuals/order/v1/OrderStatusDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<OrderStatusDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<OrderStatusDto, OrderStatus> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/crypto_perpetuals.order.v1.OrderStatus", OrderStatusDto.getEntries(), OrderStatusDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public OrderStatusDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (OrderStatusDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, OrderStatusDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static OrderStatusDto valueOf(String str) {
        return (OrderStatusDto) Enum.valueOf(OrderStatusDto.class, str);
    }

    public static OrderStatusDto[] values() {
        return (OrderStatusDto[]) $VALUES.clone();
    }
}
