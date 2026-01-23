package rosetta.mainst;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.models.p320db.Instrument;
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
/* compiled from: OrderStateDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002!\"B\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006#"}, m3636d2 = {"Lrosetta/mainst/OrderStateDto;", "Lcom/robinhood/idl/EnumDto;", "Lrosetta/mainst/OrderState;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "ORDER_STATE_UNSPECIFIED", "QUEUED", "UNCONFIRMED", "CONFIRMED", "PARTIALLY_FILLED", "FILLED", "REJECTED", "CANCELLED", "FAILED", "PENDING_CANCELLED", "VOIDED", "PARTIALLY_FILLED_REST_CANCELLED", "INACTIVE", "NEW", "LOCATE_COMPLETED", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public abstract class OrderStateDto implements Dto2<OrderState>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OrderStateDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<OrderStateDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<OrderStateDto, OrderState>> binaryBase64Serializer$delegate;
    private final String json_value;
    public static final OrderStateDto ORDER_STATE_UNSPECIFIED = new OrderStateDto("ORDER_STATE_UNSPECIFIED", 0) { // from class: rosetta.mainst.OrderStateDto.ORDER_STATE_UNSPECIFIED
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderState toProto() {
            return OrderState.ORDER_STATE_UNSPECIFIED;
        }
    };
    public static final OrderStateDto QUEUED = new OrderStateDto("QUEUED", 1) { // from class: rosetta.mainst.OrderStateDto.QUEUED
        {
            String str = "queued";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderState toProto() {
            return OrderState.QUEUED;
        }
    };
    public static final OrderStateDto UNCONFIRMED = new OrderStateDto("UNCONFIRMED", 2) { // from class: rosetta.mainst.OrderStateDto.UNCONFIRMED
        {
            String str = "unconfirmed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderState toProto() {
            return OrderState.UNCONFIRMED;
        }
    };
    public static final OrderStateDto CONFIRMED = new OrderStateDto("CONFIRMED", 3) { // from class: rosetta.mainst.OrderStateDto.CONFIRMED
        {
            String str = "confirmed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderState toProto() {
            return OrderState.CONFIRMED;
        }
    };
    public static final OrderStateDto PARTIALLY_FILLED = new OrderStateDto("PARTIALLY_FILLED", 4) { // from class: rosetta.mainst.OrderStateDto.PARTIALLY_FILLED
        {
            String str = "partially_filled";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderState toProto() {
            return OrderState.PARTIALLY_FILLED;
        }
    };
    public static final OrderStateDto FILLED = new OrderStateDto("FILLED", 5) { // from class: rosetta.mainst.OrderStateDto.FILLED
        {
            String str = "filled";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderState toProto() {
            return OrderState.FILLED;
        }
    };
    public static final OrderStateDto REJECTED = new OrderStateDto("REJECTED", 6) { // from class: rosetta.mainst.OrderStateDto.REJECTED
        {
            String str = "rejected";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderState toProto() {
            return OrderState.REJECTED;
        }
    };
    public static final OrderStateDto CANCELLED = new OrderStateDto("CANCELLED", 7) { // from class: rosetta.mainst.OrderStateDto.CANCELLED
        {
            String str = "cancelled";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderState toProto() {
            return OrderState.CANCELLED;
        }
    };
    public static final OrderStateDto FAILED = new OrderStateDto("FAILED", 8) { // from class: rosetta.mainst.OrderStateDto.FAILED
        {
            String str = "failed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderState toProto() {
            return OrderState.FAILED;
        }
    };
    public static final OrderStateDto PENDING_CANCELLED = new OrderStateDto("PENDING_CANCELLED", 9) { // from class: rosetta.mainst.OrderStateDto.PENDING_CANCELLED
        {
            String str = "pending_cancelled";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderState toProto() {
            return OrderState.PENDING_CANCELLED;
        }
    };
    public static final OrderStateDto VOIDED = new OrderStateDto("VOIDED", 10) { // from class: rosetta.mainst.OrderStateDto.VOIDED
        {
            String str = "voided";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderState toProto() {
            return OrderState.VOIDED;
        }
    };
    public static final OrderStateDto PARTIALLY_FILLED_REST_CANCELLED = new OrderStateDto("PARTIALLY_FILLED_REST_CANCELLED", 11) { // from class: rosetta.mainst.OrderStateDto.PARTIALLY_FILLED_REST_CANCELLED
        {
            String str = "partially_filled_rest_cancelled";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderState toProto() {
            return OrderState.PARTIALLY_FILLED_REST_CANCELLED;
        }
    };
    public static final OrderStateDto INACTIVE = new OrderStateDto("INACTIVE", 12) { // from class: rosetta.mainst.OrderStateDto.INACTIVE
        {
            String str = Instrument.STATE_INACTIVE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderState toProto() {
            return OrderState.INACTIVE;
        }
    };
    public static final OrderStateDto NEW = new OrderStateDto("NEW", 13) { // from class: rosetta.mainst.OrderStateDto.NEW
        {
            String str = "new";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderState toProto() {
            return OrderState.NEW;
        }
    };
    public static final OrderStateDto LOCATE_COMPLETED = new OrderStateDto("LOCATE_COMPLETED", 14) { // from class: rosetta.mainst.OrderStateDto.LOCATE_COMPLETED
        {
            String str = "locate_completed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderState toProto() {
            return OrderState.LOCATE_COMPLETED;
        }
    };

    private static final /* synthetic */ OrderStateDto[] $values() {
        return new OrderStateDto[]{ORDER_STATE_UNSPECIFIED, QUEUED, UNCONFIRMED, CONFIRMED, PARTIALLY_FILLED, FILLED, REJECTED, CANCELLED, FAILED, PENDING_CANCELLED, VOIDED, PARTIALLY_FILLED_REST_CANCELLED, INACTIVE, NEW, LOCATE_COMPLETED};
    }

    public /* synthetic */ OrderStateDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    public static EnumEntries<OrderStateDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private OrderStateDto(String str, int i, String str2) {
        this.json_value = str2;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    static {
        OrderStateDto[] orderStateDtoArr$values = $values();
        $VALUES = orderStateDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(orderStateDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rosetta.mainst.OrderStateDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderStateDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: OrderStateDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrosetta/mainst/OrderStateDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrosetta/mainst/OrderStateDto;", "Lrosetta/mainst/OrderState;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrosetta/mainst/OrderStateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<OrderStateDto, OrderState> {

        /* compiled from: OrderStateDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[OrderState.values().length];
                try {
                    iArr[OrderState.ORDER_STATE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OrderState.QUEUED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[OrderState.UNCONFIRMED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[OrderState.CONFIRMED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[OrderState.PARTIALLY_FILLED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[OrderState.FILLED.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[OrderState.REJECTED.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[OrderState.CANCELLED.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[OrderState.FAILED.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[OrderState.PENDING_CANCELLED.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[OrderState.VOIDED.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[OrderState.PARTIALLY_FILLED_REST_CANCELLED.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[OrderState.INACTIVE.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[OrderState.NEW.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[OrderState.LOCATE_COMPLETED.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OrderStateDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OrderStateDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OrderStateDto> getBinaryBase64Serializer() {
            return (KSerializer) OrderStateDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<OrderState> getProtoAdapter() {
            return OrderState.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OrderStateDto getZeroValue() {
            return OrderStateDto.ORDER_STATE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OrderStateDto fromProto(OrderState proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return OrderStateDto.ORDER_STATE_UNSPECIFIED;
                case 2:
                    return OrderStateDto.QUEUED;
                case 3:
                    return OrderStateDto.UNCONFIRMED;
                case 4:
                    return OrderStateDto.CONFIRMED;
                case 5:
                    return OrderStateDto.PARTIALLY_FILLED;
                case 6:
                    return OrderStateDto.FILLED;
                case 7:
                    return OrderStateDto.REJECTED;
                case 8:
                    return OrderStateDto.CANCELLED;
                case 9:
                    return OrderStateDto.FAILED;
                case 10:
                    return OrderStateDto.PENDING_CANCELLED;
                case 11:
                    return OrderStateDto.VOIDED;
                case 12:
                    return OrderStateDto.PARTIALLY_FILLED_REST_CANCELLED;
                case 13:
                    return OrderStateDto.INACTIVE;
                case 14:
                    return OrderStateDto.NEW;
                case 15:
                    return OrderStateDto.LOCATE_COMPLETED;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: OrderStateDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrosetta/mainst/OrderStateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrosetta/mainst/OrderStateDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<OrderStateDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<OrderStateDto, OrderState> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.mainst.OrderState", OrderStateDto.getEntries(), OrderStateDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public OrderStateDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (OrderStateDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, OrderStateDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static OrderStateDto valueOf(String str) {
        return (OrderStateDto) Enum.valueOf(OrderStateDto.class, str);
    }

    public static OrderStateDto[] values() {
        return (OrderStateDto[]) $VALUES.clone();
    }
}
