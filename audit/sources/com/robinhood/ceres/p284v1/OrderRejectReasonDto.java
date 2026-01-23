package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
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
/* compiled from: OrderRejectReasonDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u001c\u001dB\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/ceres/v1/OrderRejectReasonDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/ceres/v1/OrderRejectReason;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ORDER_REJECT_REASON_INSUFFICIENT_ACCOUNT_VALUE", "ORDER_REJECT_REASON_INSUFFICIENT_BUYING_POWER", "ORDER_REJECT_REASON_MARGIN_MIN_EQUITY", "ORDER_REJECT_REASON_UNKNOWN_CHECK_FUTURES_ORDER_EXCEPTION", "ORDER_REJECT_REASON_INSTANT_ABUSE", "ORDER_REJECT_REASON_INVALID_ARGUMENT", "ORDER_REJECT_REASON_RESOURCE_EXHAUSTED", "ORDER_REJECT_REASON_UNKNOWN_PLACE_ORDER_EXCEPTION", "ORDER_REJECT_REASON_INVALID_PRICE", "ORDER_REJECT_REASON_RATE_LIMITED", "ORDER_REJECT_REASON_NO_ROUTABLE_VENUE", "ORDER_REJECT_REASON_UNSPECIFIED", "ORDER_REJECT_REASON_VENUE_ERROR", "ORDER_REJECT_REASON_INVALID_TIME_WINDOW", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public abstract class OrderRejectReasonDto implements Dto2<OrderRejectReason>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OrderRejectReasonDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<OrderRejectReasonDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<OrderRejectReasonDto, OrderRejectReason>> binaryBase64Serializer$delegate;
    public static final OrderRejectReasonDto ORDER_REJECT_REASON_INSUFFICIENT_ACCOUNT_VALUE = new OrderRejectReasonDto("ORDER_REJECT_REASON_INSUFFICIENT_ACCOUNT_VALUE", 0) { // from class: com.robinhood.ceres.v1.OrderRejectReasonDto.ORDER_REJECT_REASON_INSUFFICIENT_ACCOUNT_VALUE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderRejectReason toProto() {
            return OrderRejectReason.ORDER_REJECT_REASON_INSUFFICIENT_ACCOUNT_VALUE;
        }
    };
    public static final OrderRejectReasonDto ORDER_REJECT_REASON_INSUFFICIENT_BUYING_POWER = new OrderRejectReasonDto("ORDER_REJECT_REASON_INSUFFICIENT_BUYING_POWER", 1) { // from class: com.robinhood.ceres.v1.OrderRejectReasonDto.ORDER_REJECT_REASON_INSUFFICIENT_BUYING_POWER
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderRejectReason toProto() {
            return OrderRejectReason.ORDER_REJECT_REASON_INSUFFICIENT_BUYING_POWER;
        }
    };
    public static final OrderRejectReasonDto ORDER_REJECT_REASON_MARGIN_MIN_EQUITY = new OrderRejectReasonDto("ORDER_REJECT_REASON_MARGIN_MIN_EQUITY", 2) { // from class: com.robinhood.ceres.v1.OrderRejectReasonDto.ORDER_REJECT_REASON_MARGIN_MIN_EQUITY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderRejectReason toProto() {
            return OrderRejectReason.ORDER_REJECT_REASON_MARGIN_MIN_EQUITY;
        }
    };
    public static final OrderRejectReasonDto ORDER_REJECT_REASON_UNKNOWN_CHECK_FUTURES_ORDER_EXCEPTION = new OrderRejectReasonDto("ORDER_REJECT_REASON_UNKNOWN_CHECK_FUTURES_ORDER_EXCEPTION", 3) { // from class: com.robinhood.ceres.v1.OrderRejectReasonDto.ORDER_REJECT_REASON_UNKNOWN_CHECK_FUTURES_ORDER_EXCEPTION
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderRejectReason toProto() {
            return OrderRejectReason.ORDER_REJECT_REASON_UNKNOWN_CHECK_FUTURES_ORDER_EXCEPTION;
        }
    };
    public static final OrderRejectReasonDto ORDER_REJECT_REASON_INSTANT_ABUSE = new OrderRejectReasonDto("ORDER_REJECT_REASON_INSTANT_ABUSE", 4) { // from class: com.robinhood.ceres.v1.OrderRejectReasonDto.ORDER_REJECT_REASON_INSTANT_ABUSE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderRejectReason toProto() {
            return OrderRejectReason.ORDER_REJECT_REASON_INSTANT_ABUSE;
        }
    };
    public static final OrderRejectReasonDto ORDER_REJECT_REASON_INVALID_ARGUMENT = new OrderRejectReasonDto("ORDER_REJECT_REASON_INVALID_ARGUMENT", 5) { // from class: com.robinhood.ceres.v1.OrderRejectReasonDto.ORDER_REJECT_REASON_INVALID_ARGUMENT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderRejectReason toProto() {
            return OrderRejectReason.ORDER_REJECT_REASON_INVALID_ARGUMENT;
        }
    };
    public static final OrderRejectReasonDto ORDER_REJECT_REASON_RESOURCE_EXHAUSTED = new OrderRejectReasonDto("ORDER_REJECT_REASON_RESOURCE_EXHAUSTED", 6) { // from class: com.robinhood.ceres.v1.OrderRejectReasonDto.ORDER_REJECT_REASON_RESOURCE_EXHAUSTED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderRejectReason toProto() {
            return OrderRejectReason.ORDER_REJECT_REASON_RESOURCE_EXHAUSTED;
        }
    };
    public static final OrderRejectReasonDto ORDER_REJECT_REASON_UNKNOWN_PLACE_ORDER_EXCEPTION = new OrderRejectReasonDto("ORDER_REJECT_REASON_UNKNOWN_PLACE_ORDER_EXCEPTION", 7) { // from class: com.robinhood.ceres.v1.OrderRejectReasonDto.ORDER_REJECT_REASON_UNKNOWN_PLACE_ORDER_EXCEPTION
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderRejectReason toProto() {
            return OrderRejectReason.ORDER_REJECT_REASON_UNKNOWN_PLACE_ORDER_EXCEPTION;
        }
    };
    public static final OrderRejectReasonDto ORDER_REJECT_REASON_INVALID_PRICE = new OrderRejectReasonDto("ORDER_REJECT_REASON_INVALID_PRICE", 8) { // from class: com.robinhood.ceres.v1.OrderRejectReasonDto.ORDER_REJECT_REASON_INVALID_PRICE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderRejectReason toProto() {
            return OrderRejectReason.ORDER_REJECT_REASON_INVALID_PRICE;
        }
    };
    public static final OrderRejectReasonDto ORDER_REJECT_REASON_RATE_LIMITED = new OrderRejectReasonDto("ORDER_REJECT_REASON_RATE_LIMITED", 9) { // from class: com.robinhood.ceres.v1.OrderRejectReasonDto.ORDER_REJECT_REASON_RATE_LIMITED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderRejectReason toProto() {
            return OrderRejectReason.ORDER_REJECT_REASON_RATE_LIMITED;
        }
    };
    public static final OrderRejectReasonDto ORDER_REJECT_REASON_NO_ROUTABLE_VENUE = new OrderRejectReasonDto("ORDER_REJECT_REASON_NO_ROUTABLE_VENUE", 10) { // from class: com.robinhood.ceres.v1.OrderRejectReasonDto.ORDER_REJECT_REASON_NO_ROUTABLE_VENUE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderRejectReason toProto() {
            return OrderRejectReason.ORDER_REJECT_REASON_NO_ROUTABLE_VENUE;
        }
    };
    public static final OrderRejectReasonDto ORDER_REJECT_REASON_UNSPECIFIED = new OrderRejectReasonDto("ORDER_REJECT_REASON_UNSPECIFIED", 11) { // from class: com.robinhood.ceres.v1.OrderRejectReasonDto.ORDER_REJECT_REASON_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderRejectReason toProto() {
            return OrderRejectReason.ORDER_REJECT_REASON_UNSPECIFIED;
        }
    };
    public static final OrderRejectReasonDto ORDER_REJECT_REASON_VENUE_ERROR = new OrderRejectReasonDto("ORDER_REJECT_REASON_VENUE_ERROR", 12) { // from class: com.robinhood.ceres.v1.OrderRejectReasonDto.ORDER_REJECT_REASON_VENUE_ERROR
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderRejectReason toProto() {
            return OrderRejectReason.ORDER_REJECT_REASON_VENUE_ERROR;
        }
    };
    public static final OrderRejectReasonDto ORDER_REJECT_REASON_INVALID_TIME_WINDOW = new OrderRejectReasonDto("ORDER_REJECT_REASON_INVALID_TIME_WINDOW", 13) { // from class: com.robinhood.ceres.v1.OrderRejectReasonDto.ORDER_REJECT_REASON_INVALID_TIME_WINDOW
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderRejectReason toProto() {
            return OrderRejectReason.ORDER_REJECT_REASON_INVALID_TIME_WINDOW;
        }
    };

    private static final /* synthetic */ OrderRejectReasonDto[] $values() {
        return new OrderRejectReasonDto[]{ORDER_REJECT_REASON_INSUFFICIENT_ACCOUNT_VALUE, ORDER_REJECT_REASON_INSUFFICIENT_BUYING_POWER, ORDER_REJECT_REASON_MARGIN_MIN_EQUITY, ORDER_REJECT_REASON_UNKNOWN_CHECK_FUTURES_ORDER_EXCEPTION, ORDER_REJECT_REASON_INSTANT_ABUSE, ORDER_REJECT_REASON_INVALID_ARGUMENT, ORDER_REJECT_REASON_RESOURCE_EXHAUSTED, ORDER_REJECT_REASON_UNKNOWN_PLACE_ORDER_EXCEPTION, ORDER_REJECT_REASON_INVALID_PRICE, ORDER_REJECT_REASON_RATE_LIMITED, ORDER_REJECT_REASON_NO_ROUTABLE_VENUE, ORDER_REJECT_REASON_UNSPECIFIED, ORDER_REJECT_REASON_VENUE_ERROR, ORDER_REJECT_REASON_INVALID_TIME_WINDOW};
    }

    public /* synthetic */ OrderRejectReasonDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<OrderRejectReasonDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private OrderRejectReasonDto(String str, int i) {
    }

    static {
        OrderRejectReasonDto[] orderRejectReasonDtoArr$values = $values();
        $VALUES = orderRejectReasonDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(orderRejectReasonDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.OrderRejectReasonDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderRejectReasonDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: OrderRejectReasonDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/OrderRejectReasonDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/ceres/v1/OrderRejectReasonDto;", "Lcom/robinhood/ceres/v1/OrderRejectReason;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/OrderRejectReasonDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<OrderRejectReasonDto, OrderRejectReason> {

        /* compiled from: OrderRejectReasonDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[OrderRejectReason.values().length];
                try {
                    iArr[OrderRejectReason.ORDER_REJECT_REASON_INSUFFICIENT_ACCOUNT_VALUE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OrderRejectReason.ORDER_REJECT_REASON_INSUFFICIENT_BUYING_POWER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[OrderRejectReason.ORDER_REJECT_REASON_MARGIN_MIN_EQUITY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[OrderRejectReason.ORDER_REJECT_REASON_UNKNOWN_CHECK_FUTURES_ORDER_EXCEPTION.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[OrderRejectReason.ORDER_REJECT_REASON_INSTANT_ABUSE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[OrderRejectReason.ORDER_REJECT_REASON_INVALID_ARGUMENT.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[OrderRejectReason.ORDER_REJECT_REASON_RESOURCE_EXHAUSTED.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[OrderRejectReason.ORDER_REJECT_REASON_UNKNOWN_PLACE_ORDER_EXCEPTION.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[OrderRejectReason.ORDER_REJECT_REASON_INVALID_PRICE.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[OrderRejectReason.ORDER_REJECT_REASON_RATE_LIMITED.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[OrderRejectReason.ORDER_REJECT_REASON_NO_ROUTABLE_VENUE.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[OrderRejectReason.ORDER_REJECT_REASON_UNSPECIFIED.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[OrderRejectReason.ORDER_REJECT_REASON_VENUE_ERROR.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[OrderRejectReason.ORDER_REJECT_REASON_INVALID_TIME_WINDOW.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OrderRejectReasonDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OrderRejectReasonDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OrderRejectReasonDto> getBinaryBase64Serializer() {
            return (KSerializer) OrderRejectReasonDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<OrderRejectReason> getProtoAdapter() {
            return OrderRejectReason.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OrderRejectReasonDto getZeroValue() {
            return OrderRejectReasonDto.ORDER_REJECT_REASON_INSUFFICIENT_ACCOUNT_VALUE;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OrderRejectReasonDto fromProto(OrderRejectReason proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return OrderRejectReasonDto.ORDER_REJECT_REASON_INSUFFICIENT_ACCOUNT_VALUE;
                case 2:
                    return OrderRejectReasonDto.ORDER_REJECT_REASON_INSUFFICIENT_BUYING_POWER;
                case 3:
                    return OrderRejectReasonDto.ORDER_REJECT_REASON_MARGIN_MIN_EQUITY;
                case 4:
                    return OrderRejectReasonDto.ORDER_REJECT_REASON_UNKNOWN_CHECK_FUTURES_ORDER_EXCEPTION;
                case 5:
                    return OrderRejectReasonDto.ORDER_REJECT_REASON_INSTANT_ABUSE;
                case 6:
                    return OrderRejectReasonDto.ORDER_REJECT_REASON_INVALID_ARGUMENT;
                case 7:
                    return OrderRejectReasonDto.ORDER_REJECT_REASON_RESOURCE_EXHAUSTED;
                case 8:
                    return OrderRejectReasonDto.ORDER_REJECT_REASON_UNKNOWN_PLACE_ORDER_EXCEPTION;
                case 9:
                    return OrderRejectReasonDto.ORDER_REJECT_REASON_INVALID_PRICE;
                case 10:
                    return OrderRejectReasonDto.ORDER_REJECT_REASON_RATE_LIMITED;
                case 11:
                    return OrderRejectReasonDto.ORDER_REJECT_REASON_NO_ROUTABLE_VENUE;
                case 12:
                    return OrderRejectReasonDto.ORDER_REJECT_REASON_UNSPECIFIED;
                case 13:
                    return OrderRejectReasonDto.ORDER_REJECT_REASON_VENUE_ERROR;
                case 14:
                    return OrderRejectReasonDto.ORDER_REJECT_REASON_INVALID_TIME_WINDOW;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: OrderRejectReasonDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/ceres/v1/OrderRejectReasonDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/OrderRejectReasonDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<OrderRejectReasonDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<OrderRejectReasonDto, OrderRejectReason> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/ceres.entity.OrderRejectReason", OrderRejectReasonDto.getEntries(), OrderRejectReasonDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public OrderRejectReasonDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (OrderRejectReasonDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, OrderRejectReasonDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static OrderRejectReasonDto valueOf(String str) {
        return (OrderRejectReasonDto) Enum.valueOf(OrderRejectReasonDto.class, str);
    }

    public static OrderRejectReasonDto[] values() {
        return (OrderRejectReasonDto[]) $VALUES.clone();
    }
}
