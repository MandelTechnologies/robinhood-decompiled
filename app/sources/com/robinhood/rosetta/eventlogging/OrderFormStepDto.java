package com.robinhood.rosetta.eventlogging;

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
/* compiled from: OrderFormStepDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u001f B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006!"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OrderFormStepDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/OrderFormStep;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ORDER_FORM_STEP_UNSPECIFIED", "REVIEW", "SUBMIT", "INITIAL_LOAD", "EDIT_VALUES", "EDIT_ORDER", "CANCEL_ORDER", "CONFIRM_OPTION_LEG_SELECTION", "SUBMIT_SUCCESS", "REPLACE_ORDER", "ORDER_CHECK", "ORDER_CHECK_ACTION", "ORDER_STATE_CHANGE", "UNMOUNT", "ABORT_ORDER_CHECKS", "ORDER_EXECUTED", "SUBMIT_FAILURE", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public abstract class OrderFormStepDto implements Dto2<OrderFormStep>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OrderFormStepDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<OrderFormStepDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<OrderFormStepDto, OrderFormStep>> binaryBase64Serializer$delegate;
    public static final OrderFormStepDto ORDER_FORM_STEP_UNSPECIFIED = new OrderFormStepDto("ORDER_FORM_STEP_UNSPECIFIED", 0) { // from class: com.robinhood.rosetta.eventlogging.OrderFormStepDto.ORDER_FORM_STEP_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderFormStep toProto() {
            return OrderFormStep.ORDER_FORM_STEP_UNSPECIFIED;
        }
    };
    public static final OrderFormStepDto REVIEW = new OrderFormStepDto("REVIEW", 1) { // from class: com.robinhood.rosetta.eventlogging.OrderFormStepDto.REVIEW
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderFormStep toProto() {
            return OrderFormStep.REVIEW;
        }
    };
    public static final OrderFormStepDto SUBMIT = new OrderFormStepDto("SUBMIT", 2) { // from class: com.robinhood.rosetta.eventlogging.OrderFormStepDto.SUBMIT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderFormStep toProto() {
            return OrderFormStep.SUBMIT;
        }
    };
    public static final OrderFormStepDto INITIAL_LOAD = new OrderFormStepDto("INITIAL_LOAD", 3) { // from class: com.robinhood.rosetta.eventlogging.OrderFormStepDto.INITIAL_LOAD
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderFormStep toProto() {
            return OrderFormStep.INITIAL_LOAD;
        }
    };
    public static final OrderFormStepDto EDIT_VALUES = new OrderFormStepDto("EDIT_VALUES", 4) { // from class: com.robinhood.rosetta.eventlogging.OrderFormStepDto.EDIT_VALUES
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderFormStep toProto() {
            return OrderFormStep.EDIT_VALUES;
        }
    };
    public static final OrderFormStepDto EDIT_ORDER = new OrderFormStepDto("EDIT_ORDER", 5) { // from class: com.robinhood.rosetta.eventlogging.OrderFormStepDto.EDIT_ORDER
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderFormStep toProto() {
            return OrderFormStep.EDIT_ORDER;
        }
    };
    public static final OrderFormStepDto CANCEL_ORDER = new OrderFormStepDto("CANCEL_ORDER", 6) { // from class: com.robinhood.rosetta.eventlogging.OrderFormStepDto.CANCEL_ORDER
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderFormStep toProto() {
            return OrderFormStep.CANCEL_ORDER;
        }
    };
    public static final OrderFormStepDto CONFIRM_OPTION_LEG_SELECTION = new OrderFormStepDto("CONFIRM_OPTION_LEG_SELECTION", 7) { // from class: com.robinhood.rosetta.eventlogging.OrderFormStepDto.CONFIRM_OPTION_LEG_SELECTION
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderFormStep toProto() {
            return OrderFormStep.CONFIRM_OPTION_LEG_SELECTION;
        }
    };
    public static final OrderFormStepDto SUBMIT_SUCCESS = new OrderFormStepDto("SUBMIT_SUCCESS", 8) { // from class: com.robinhood.rosetta.eventlogging.OrderFormStepDto.SUBMIT_SUCCESS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderFormStep toProto() {
            return OrderFormStep.SUBMIT_SUCCESS;
        }
    };
    public static final OrderFormStepDto REPLACE_ORDER = new OrderFormStepDto("REPLACE_ORDER", 9) { // from class: com.robinhood.rosetta.eventlogging.OrderFormStepDto.REPLACE_ORDER
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderFormStep toProto() {
            return OrderFormStep.REPLACE_ORDER;
        }
    };
    public static final OrderFormStepDto ORDER_CHECK = new OrderFormStepDto("ORDER_CHECK", 10) { // from class: com.robinhood.rosetta.eventlogging.OrderFormStepDto.ORDER_CHECK
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderFormStep toProto() {
            return OrderFormStep.ORDER_CHECK;
        }
    };
    public static final OrderFormStepDto ORDER_CHECK_ACTION = new OrderFormStepDto("ORDER_CHECK_ACTION", 11) { // from class: com.robinhood.rosetta.eventlogging.OrderFormStepDto.ORDER_CHECK_ACTION
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderFormStep toProto() {
            return OrderFormStep.ORDER_CHECK_ACTION;
        }
    };
    public static final OrderFormStepDto ORDER_STATE_CHANGE = new OrderFormStepDto("ORDER_STATE_CHANGE", 12) { // from class: com.robinhood.rosetta.eventlogging.OrderFormStepDto.ORDER_STATE_CHANGE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderFormStep toProto() {
            return OrderFormStep.ORDER_STATE_CHANGE;
        }
    };
    public static final OrderFormStepDto UNMOUNT = new OrderFormStepDto("UNMOUNT", 13) { // from class: com.robinhood.rosetta.eventlogging.OrderFormStepDto.UNMOUNT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderFormStep toProto() {
            return OrderFormStep.UNMOUNT;
        }
    };
    public static final OrderFormStepDto ABORT_ORDER_CHECKS = new OrderFormStepDto("ABORT_ORDER_CHECKS", 14) { // from class: com.robinhood.rosetta.eventlogging.OrderFormStepDto.ABORT_ORDER_CHECKS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderFormStep toProto() {
            return OrderFormStep.ABORT_ORDER_CHECKS;
        }
    };
    public static final OrderFormStepDto ORDER_EXECUTED = new OrderFormStepDto("ORDER_EXECUTED", 15) { // from class: com.robinhood.rosetta.eventlogging.OrderFormStepDto.ORDER_EXECUTED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderFormStep toProto() {
            return OrderFormStep.ORDER_EXECUTED;
        }
    };
    public static final OrderFormStepDto SUBMIT_FAILURE = new OrderFormStepDto("SUBMIT_FAILURE", 16) { // from class: com.robinhood.rosetta.eventlogging.OrderFormStepDto.SUBMIT_FAILURE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderFormStep toProto() {
            return OrderFormStep.SUBMIT_FAILURE;
        }
    };

    private static final /* synthetic */ OrderFormStepDto[] $values() {
        return new OrderFormStepDto[]{ORDER_FORM_STEP_UNSPECIFIED, REVIEW, SUBMIT, INITIAL_LOAD, EDIT_VALUES, EDIT_ORDER, CANCEL_ORDER, CONFIRM_OPTION_LEG_SELECTION, SUBMIT_SUCCESS, REPLACE_ORDER, ORDER_CHECK, ORDER_CHECK_ACTION, ORDER_STATE_CHANGE, UNMOUNT, ABORT_ORDER_CHECKS, ORDER_EXECUTED, SUBMIT_FAILURE};
    }

    public /* synthetic */ OrderFormStepDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<OrderFormStepDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private OrderFormStepDto(String str, int i) {
    }

    static {
        OrderFormStepDto[] orderFormStepDtoArr$values = $values();
        $VALUES = orderFormStepDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(orderFormStepDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.OrderFormStepDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderFormStepDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: OrderFormStepDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OrderFormStepDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/OrderFormStepDto;", "Lcom/robinhood/rosetta/eventlogging/OrderFormStep;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/OrderFormStepDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<OrderFormStepDto, OrderFormStep> {

        /* compiled from: OrderFormStepDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[OrderFormStep.values().length];
                try {
                    iArr[OrderFormStep.ORDER_FORM_STEP_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OrderFormStep.REVIEW.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[OrderFormStep.SUBMIT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[OrderFormStep.INITIAL_LOAD.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[OrderFormStep.EDIT_VALUES.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[OrderFormStep.EDIT_ORDER.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[OrderFormStep.CANCEL_ORDER.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[OrderFormStep.CONFIRM_OPTION_LEG_SELECTION.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[OrderFormStep.SUBMIT_SUCCESS.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[OrderFormStep.REPLACE_ORDER.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[OrderFormStep.ORDER_CHECK.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[OrderFormStep.ORDER_CHECK_ACTION.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[OrderFormStep.ORDER_STATE_CHANGE.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[OrderFormStep.UNMOUNT.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[OrderFormStep.ABORT_ORDER_CHECKS.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[OrderFormStep.ORDER_EXECUTED.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[OrderFormStep.SUBMIT_FAILURE.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OrderFormStepDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OrderFormStepDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OrderFormStepDto> getBinaryBase64Serializer() {
            return (KSerializer) OrderFormStepDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<OrderFormStep> getProtoAdapter() {
            return OrderFormStep.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OrderFormStepDto getZeroValue() {
            return OrderFormStepDto.ORDER_FORM_STEP_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OrderFormStepDto fromProto(OrderFormStep proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return OrderFormStepDto.ORDER_FORM_STEP_UNSPECIFIED;
                case 2:
                    return OrderFormStepDto.REVIEW;
                case 3:
                    return OrderFormStepDto.SUBMIT;
                case 4:
                    return OrderFormStepDto.INITIAL_LOAD;
                case 5:
                    return OrderFormStepDto.EDIT_VALUES;
                case 6:
                    return OrderFormStepDto.EDIT_ORDER;
                case 7:
                    return OrderFormStepDto.CANCEL_ORDER;
                case 8:
                    return OrderFormStepDto.CONFIRM_OPTION_LEG_SELECTION;
                case 9:
                    return OrderFormStepDto.SUBMIT_SUCCESS;
                case 10:
                    return OrderFormStepDto.REPLACE_ORDER;
                case 11:
                    return OrderFormStepDto.ORDER_CHECK;
                case 12:
                    return OrderFormStepDto.ORDER_CHECK_ACTION;
                case 13:
                    return OrderFormStepDto.ORDER_STATE_CHANGE;
                case 14:
                    return OrderFormStepDto.UNMOUNT;
                case 15:
                    return OrderFormStepDto.ABORT_ORDER_CHECKS;
                case 16:
                    return OrderFormStepDto.ORDER_EXECUTED;
                case 17:
                    return OrderFormStepDto.SUBMIT_FAILURE;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: OrderFormStepDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OrderFormStepDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/OrderFormStepDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<OrderFormStepDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<OrderFormStepDto, OrderFormStep> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.OrderFormStep", OrderFormStepDto.getEntries(), OrderFormStepDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public OrderFormStepDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (OrderFormStepDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, OrderFormStepDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static OrderFormStepDto valueOf(String str) {
        return (OrderFormStepDto) Enum.valueOf(OrderFormStepDto.class, str);
    }

    public static OrderFormStepDto[] values() {
        return (OrderFormStepDto[]) $VALUES.clone();
    }
}
