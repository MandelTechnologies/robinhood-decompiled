package cashier_protos.payment_intents.p047v1;

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
/* compiled from: StateDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u001c\u001dB\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u001e"}, m3636d2 = {"Lcashier_protos/payment_intents/v1/StateDto;", "Lcom/robinhood/idl/EnumDto;", "Lcashier_protos/payment_intents/v1/State;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "STATE_UNSPECIFIED", "STATE_NEW", "STATE_SCHEDULED", "STATE_PENDING", "STATE_FAILED", "STATE_CANCELED", "STATE_REVERSED", "STATE_COMPLETED", "STATE_PAUSED", "STATE_PENDING_REVERSE", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "cashier_protos.payment_intents.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes.dex */
public abstract class StateDto implements Dto2<State>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ StateDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<StateDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<StateDto, State>> binaryBase64Serializer$delegate;
    private final String json_value;
    public static final StateDto STATE_UNSPECIFIED = new StateDto("STATE_UNSPECIFIED", 0) { // from class: cashier_protos.payment_intents.v1.StateDto.STATE_UNSPECIFIED
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public State toProto() {
            return State.STATE_UNSPECIFIED;
        }
    };
    public static final StateDto STATE_NEW = new StateDto("STATE_NEW", 1) { // from class: cashier_protos.payment_intents.v1.StateDto.STATE_NEW
        {
            String str = "new";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public State toProto() {
            return State.STATE_NEW;
        }
    };
    public static final StateDto STATE_SCHEDULED = new StateDto("STATE_SCHEDULED", 2) { // from class: cashier_protos.payment_intents.v1.StateDto.STATE_SCHEDULED
        {
            String str = "scheduled";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public State toProto() {
            return State.STATE_SCHEDULED;
        }
    };
    public static final StateDto STATE_PENDING = new StateDto("STATE_PENDING", 3) { // from class: cashier_protos.payment_intents.v1.StateDto.STATE_PENDING
        {
            String str = "pending";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public State toProto() {
            return State.STATE_PENDING;
        }
    };
    public static final StateDto STATE_FAILED = new StateDto("STATE_FAILED", 4) { // from class: cashier_protos.payment_intents.v1.StateDto.STATE_FAILED
        {
            String str = "failed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public State toProto() {
            return State.STATE_FAILED;
        }
    };
    public static final StateDto STATE_CANCELED = new StateDto("STATE_CANCELED", 5) { // from class: cashier_protos.payment_intents.v1.StateDto.STATE_CANCELED
        {
            String str = "canceled";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public State toProto() {
            return State.STATE_CANCELED;
        }
    };
    public static final StateDto STATE_REVERSED = new StateDto("STATE_REVERSED", 6) { // from class: cashier_protos.payment_intents.v1.StateDto.STATE_REVERSED
        {
            String str = "reversed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public State toProto() {
            return State.STATE_REVERSED;
        }
    };
    public static final StateDto STATE_COMPLETED = new StateDto("STATE_COMPLETED", 7) { // from class: cashier_protos.payment_intents.v1.StateDto.STATE_COMPLETED
        {
            String str = "completed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public State toProto() {
            return State.STATE_COMPLETED;
        }
    };
    public static final StateDto STATE_PAUSED = new StateDto("STATE_PAUSED", 8) { // from class: cashier_protos.payment_intents.v1.StateDto.STATE_PAUSED
        {
            String str = "paused";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public State toProto() {
            return State.STATE_PAUSED;
        }
    };
    public static final StateDto STATE_PENDING_REVERSE = new StateDto("STATE_PENDING_REVERSE", 9) { // from class: cashier_protos.payment_intents.v1.StateDto.STATE_PENDING_REVERSE
        {
            String str = "pending_reverse";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public State toProto() {
            return State.STATE_PENDING_REVERSE;
        }
    };

    private static final /* synthetic */ StateDto[] $values() {
        return new StateDto[]{STATE_UNSPECIFIED, STATE_NEW, STATE_SCHEDULED, STATE_PENDING, STATE_FAILED, STATE_CANCELED, STATE_REVERSED, STATE_COMPLETED, STATE_PAUSED, STATE_PENDING_REVERSE};
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
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: cashier_protos.payment_intents.v1.StateDto$$ExternalSyntheticLambda0
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
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcashier_protos/payment_intents/v1/StateDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcashier_protos/payment_intents/v1/StateDto;", "Lcashier_protos/payment_intents/v1/State;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcashier_protos/payment_intents/v1/StateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "cashier_protos.payment_intents.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<StateDto, State> {

        /* compiled from: StateDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes16.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[State.values().length];
                try {
                    iArr[State.STATE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[State.STATE_NEW.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[State.STATE_SCHEDULED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[State.STATE_PENDING.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[State.STATE_FAILED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[State.STATE_CANCELED.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[State.STATE_REVERSED.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[State.STATE_COMPLETED.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[State.STATE_PAUSED.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[State.STATE_PENDING_REVERSE.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
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
                    return StateDto.STATE_NEW;
                case 3:
                    return StateDto.STATE_SCHEDULED;
                case 4:
                    return StateDto.STATE_PENDING;
                case 5:
                    return StateDto.STATE_FAILED;
                case 6:
                    return StateDto.STATE_CANCELED;
                case 7:
                    return StateDto.STATE_REVERSED;
                case 8:
                    return StateDto.STATE_COMPLETED;
                case 9:
                    return StateDto.STATE_PAUSED;
                case 10:
                    return StateDto.STATE_PENDING_REVERSE;
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
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcashier_protos/payment_intents/v1/StateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcashier_protos/payment_intents/v1/StateDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "cashier_protos.payment_intents.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes16.dex */
    public static final class Serializer implements KSerializer<StateDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<StateDto, State> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/cashier_protos.payment_intents.v1.State", StateDto.getEntries(), StateDto.INSTANCE.getZeroValue());

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
