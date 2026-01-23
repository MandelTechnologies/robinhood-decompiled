package rosetta.order;

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
/* compiled from: StateDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002#$B\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020!H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006%"}, m3636d2 = {"Lrosetta/order/StateDto;", "Lcom/robinhood/idl/EnumDto;", "Lrosetta/order/State;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "STATE_UNSPECIFIED", "QUEUED", "NEW", "UNCONFIRMED", "CONFIRMED", "PARTIALLY_FILLED", "FILLED", "REJECTED", "CANCELED", "FAILED", "VOIDED", "PENDING_CANCELED", "PARTIALLY_FILLED_REST_CANCELED", "INACTIVE", "LOCATE_COMPLETED", "STATE_LOCATING", "STATE_LOCATE_FAILED", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public abstract class StateDto implements Dto2<State>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ StateDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<StateDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<StateDto, State>> binaryBase64Serializer$delegate;
    private final String json_value;
    public static final StateDto STATE_UNSPECIFIED = new StateDto("STATE_UNSPECIFIED", 0) { // from class: rosetta.order.StateDto.STATE_UNSPECIFIED
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public State toProto() {
            return State.STATE_UNSPECIFIED;
        }
    };
    public static final StateDto QUEUED = new StateDto("QUEUED", 1) { // from class: rosetta.order.StateDto.QUEUED
        {
            String str = "queued";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public State toProto() {
            return State.QUEUED;
        }
    };
    public static final StateDto NEW = new StateDto("NEW", 2) { // from class: rosetta.order.StateDto.NEW
        {
            String str = "new";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public State toProto() {
            return State.NEW;
        }
    };
    public static final StateDto UNCONFIRMED = new StateDto("UNCONFIRMED", 3) { // from class: rosetta.order.StateDto.UNCONFIRMED
        {
            String str = "unconfirmed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public State toProto() {
            return State.UNCONFIRMED;
        }
    };
    public static final StateDto CONFIRMED = new StateDto("CONFIRMED", 4) { // from class: rosetta.order.StateDto.CONFIRMED
        {
            String str = "confirmed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public State toProto() {
            return State.CONFIRMED;
        }
    };
    public static final StateDto PARTIALLY_FILLED = new StateDto("PARTIALLY_FILLED", 5) { // from class: rosetta.order.StateDto.PARTIALLY_FILLED
        {
            String str = "partially_filled";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public State toProto() {
            return State.PARTIALLY_FILLED;
        }
    };
    public static final StateDto FILLED = new StateDto("FILLED", 6) { // from class: rosetta.order.StateDto.FILLED
        {
            String str = "filled";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public State toProto() {
            return State.FILLED;
        }
    };
    public static final StateDto REJECTED = new StateDto("REJECTED", 7) { // from class: rosetta.order.StateDto.REJECTED
        {
            String str = "rejected";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public State toProto() {
            return State.REJECTED;
        }
    };
    public static final StateDto CANCELED = new StateDto("CANCELED", 8) { // from class: rosetta.order.StateDto.CANCELED
        {
            String str = "canceled";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public State toProto() {
            return State.CANCELED;
        }
    };
    public static final StateDto FAILED = new StateDto("FAILED", 9) { // from class: rosetta.order.StateDto.FAILED
        {
            String str = "failed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public State toProto() {
            return State.FAILED;
        }
    };
    public static final StateDto VOIDED = new StateDto("VOIDED", 10) { // from class: rosetta.order.StateDto.VOIDED
        {
            String str = "voided";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public State toProto() {
            return State.VOIDED;
        }
    };
    public static final StateDto PENDING_CANCELED = new StateDto("PENDING_CANCELED", 11) { // from class: rosetta.order.StateDto.PENDING_CANCELED
        {
            String str = "pending_canceled";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public State toProto() {
            return State.PENDING_CANCELED;
        }
    };
    public static final StateDto PARTIALLY_FILLED_REST_CANCELED = new StateDto("PARTIALLY_FILLED_REST_CANCELED", 12) { // from class: rosetta.order.StateDto.PARTIALLY_FILLED_REST_CANCELED
        {
            String str = "partially_filled_rest_canceled";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public State toProto() {
            return State.PARTIALLY_FILLED_REST_CANCELED;
        }
    };
    public static final StateDto INACTIVE = new StateDto("INACTIVE", 13) { // from class: rosetta.order.StateDto.INACTIVE
        {
            String str = Instrument.STATE_INACTIVE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public State toProto() {
            return State.INACTIVE;
        }
    };
    public static final StateDto LOCATE_COMPLETED = new StateDto("LOCATE_COMPLETED", 14) { // from class: rosetta.order.StateDto.LOCATE_COMPLETED
        {
            String str = "locate_completed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public State toProto() {
            return State.LOCATE_COMPLETED;
        }
    };
    public static final StateDto STATE_LOCATING = new StateDto("STATE_LOCATING", 15) { // from class: rosetta.order.StateDto.STATE_LOCATING
        {
            String str = "locating";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public State toProto() {
            return State.STATE_LOCATING;
        }
    };
    public static final StateDto STATE_LOCATE_FAILED = new StateDto("STATE_LOCATE_FAILED", 16) { // from class: rosetta.order.StateDto.STATE_LOCATE_FAILED
        {
            String str = "locate_failed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public State toProto() {
            return State.STATE_LOCATE_FAILED;
        }
    };

    private static final /* synthetic */ StateDto[] $values() {
        return new StateDto[]{STATE_UNSPECIFIED, QUEUED, NEW, UNCONFIRMED, CONFIRMED, PARTIALLY_FILLED, FILLED, REJECTED, CANCELED, FAILED, VOIDED, PENDING_CANCELED, PARTIALLY_FILLED_REST_CANCELED, INACTIVE, LOCATE_COMPLETED, STATE_LOCATING, STATE_LOCATE_FAILED};
    }

    public /* synthetic */ StateDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    public static EnumEntries<StateDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private StateDto(String str, int i, String str2) {
        this.json_value = str2;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    static {
        StateDto[] stateDtoArr$values = $values();
        $VALUES = stateDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(stateDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rosetta.order.StateDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StateDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: StateDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrosetta/order/StateDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrosetta/order/StateDto;", "Lrosetta/order/State;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrosetta/order/StateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<StateDto, State> {

        /* compiled from: StateDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[State.values().length];
                try {
                    iArr[State.STATE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[State.QUEUED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[State.NEW.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[State.UNCONFIRMED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[State.CONFIRMED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[State.PARTIALLY_FILLED.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[State.FILLED.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[State.REJECTED.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[State.CANCELED.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[State.FAILED.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[State.VOIDED.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[State.PENDING_CANCELED.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[State.PARTIALLY_FILLED_REST_CANCELED.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[State.INACTIVE.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[State.LOCATE_COMPLETED.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[State.STATE_LOCATING.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[State.STATE_LOCATE_FAILED.ordinal()] = 17;
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

        public final KSerializer<StateDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StateDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StateDto> getBinaryBase64Serializer() {
            return (KSerializer) StateDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<State> getProtoAdapter() {
            return State.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StateDto getZeroValue() {
            return StateDto.STATE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StateDto fromProto(State proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return StateDto.STATE_UNSPECIFIED;
                case 2:
                    return StateDto.QUEUED;
                case 3:
                    return StateDto.NEW;
                case 4:
                    return StateDto.UNCONFIRMED;
                case 5:
                    return StateDto.CONFIRMED;
                case 6:
                    return StateDto.PARTIALLY_FILLED;
                case 7:
                    return StateDto.FILLED;
                case 8:
                    return StateDto.REJECTED;
                case 9:
                    return StateDto.CANCELED;
                case 10:
                    return StateDto.FAILED;
                case 11:
                    return StateDto.VOIDED;
                case 12:
                    return StateDto.PENDING_CANCELED;
                case 13:
                    return StateDto.PARTIALLY_FILLED_REST_CANCELED;
                case 14:
                    return StateDto.INACTIVE;
                case 15:
                    return StateDto.LOCATE_COMPLETED;
                case 16:
                    return StateDto.STATE_LOCATING;
                case 17:
                    return StateDto.STATE_LOCATE_FAILED;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: StateDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrosetta/order/StateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrosetta/order/StateDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Serializer implements KSerializer<StateDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<StateDto, State> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.order.State", StateDto.getEntries(), StateDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public StateDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (StateDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, StateDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static StateDto valueOf(String str) {
        return (StateDto) Enum.valueOf(StateDto.class, str);
    }

    public static StateDto[] values() {
        return (StateDto[]) $VALUES.clone();
    }
}
