package rosetta.nummus.order;

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
/* compiled from: TimeInForceDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0018\u0019B\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u001a"}, m3636d2 = {"Lrosetta/nummus/order/TimeInForceDto;", "Lcom/robinhood/idl/EnumDto;", "Lrosetta/nummus/order/TimeInForce;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "TIME_IN_FORCE__UNSPECIFIED", "TIME_IN_FORCE_GTC", "TIME_IN_FORCE_IOC", "TIME_IN_FORCE_GFD", "TIME_IN_FORCE_GFW", "TIME_IN_FORCE_GFM", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.nummus.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public abstract class TimeInForceDto implements Dto2<TimeInForce>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TimeInForceDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<TimeInForceDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TimeInForceDto, TimeInForce>> binaryBase64Serializer$delegate;
    private final String json_value;
    public static final TimeInForceDto TIME_IN_FORCE__UNSPECIFIED = new TimeInForceDto("TIME_IN_FORCE__UNSPECIFIED", 0) { // from class: rosetta.nummus.order.TimeInForceDto.TIME_IN_FORCE__UNSPECIFIED
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TimeInForce toProto() {
            return TimeInForce.TIME_IN_FORCE__UNSPECIFIED;
        }
    };
    public static final TimeInForceDto TIME_IN_FORCE_GTC = new TimeInForceDto("TIME_IN_FORCE_GTC", 1) { // from class: rosetta.nummus.order.TimeInForceDto.TIME_IN_FORCE_GTC
        {
            String str = "gtc";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TimeInForce toProto() {
            return TimeInForce.TIME_IN_FORCE_GTC;
        }
    };
    public static final TimeInForceDto TIME_IN_FORCE_IOC = new TimeInForceDto("TIME_IN_FORCE_IOC", 2) { // from class: rosetta.nummus.order.TimeInForceDto.TIME_IN_FORCE_IOC
        {
            String str = "ioc";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TimeInForce toProto() {
            return TimeInForce.TIME_IN_FORCE_IOC;
        }
    };
    public static final TimeInForceDto TIME_IN_FORCE_GFD = new TimeInForceDto("TIME_IN_FORCE_GFD", 3) { // from class: rosetta.nummus.order.TimeInForceDto.TIME_IN_FORCE_GFD
        {
            String str = "gfd";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TimeInForce toProto() {
            return TimeInForce.TIME_IN_FORCE_GFD;
        }
    };
    public static final TimeInForceDto TIME_IN_FORCE_GFW = new TimeInForceDto("TIME_IN_FORCE_GFW", 4) { // from class: rosetta.nummus.order.TimeInForceDto.TIME_IN_FORCE_GFW
        {
            String str = "gfw";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TimeInForce toProto() {
            return TimeInForce.TIME_IN_FORCE_GFW;
        }
    };
    public static final TimeInForceDto TIME_IN_FORCE_GFM = new TimeInForceDto("TIME_IN_FORCE_GFM", 5) { // from class: rosetta.nummus.order.TimeInForceDto.TIME_IN_FORCE_GFM
        {
            String str = "gfm";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TimeInForce toProto() {
            return TimeInForce.TIME_IN_FORCE_GFM;
        }
    };

    private static final /* synthetic */ TimeInForceDto[] $values() {
        return new TimeInForceDto[]{TIME_IN_FORCE__UNSPECIFIED, TIME_IN_FORCE_GTC, TIME_IN_FORCE_IOC, TIME_IN_FORCE_GFD, TIME_IN_FORCE_GFW, TIME_IN_FORCE_GFM};
    }

    public /* synthetic */ TimeInForceDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    public static EnumEntries<TimeInForceDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TimeInForceDto(String str, int i, String str2) {
        this.json_value = str2;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    static {
        TimeInForceDto[] timeInForceDtoArr$values = $values();
        $VALUES = timeInForceDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(timeInForceDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rosetta.nummus.order.TimeInForceDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TimeInForceDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: TimeInForceDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrosetta/nummus/order/TimeInForceDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrosetta/nummus/order/TimeInForceDto;", "Lrosetta/nummus/order/TimeInForce;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrosetta/nummus/order/TimeInForceDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.nummus.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<TimeInForceDto, TimeInForce> {

        /* compiled from: TimeInForceDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TimeInForce.values().length];
                try {
                    iArr[TimeInForce.TIME_IN_FORCE__UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TimeInForce.TIME_IN_FORCE_GTC.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[TimeInForce.TIME_IN_FORCE_IOC.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[TimeInForce.TIME_IN_FORCE_GFD.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[TimeInForce.TIME_IN_FORCE_GFW.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[TimeInForce.TIME_IN_FORCE_GFM.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TimeInForceDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TimeInForceDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TimeInForceDto> getBinaryBase64Serializer() {
            return (KSerializer) TimeInForceDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TimeInForce> getProtoAdapter() {
            return TimeInForce.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TimeInForceDto getZeroValue() {
            return TimeInForceDto.TIME_IN_FORCE__UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TimeInForceDto fromProto(TimeInForce proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return TimeInForceDto.TIME_IN_FORCE__UNSPECIFIED;
                case 2:
                    return TimeInForceDto.TIME_IN_FORCE_GTC;
                case 3:
                    return TimeInForceDto.TIME_IN_FORCE_IOC;
                case 4:
                    return TimeInForceDto.TIME_IN_FORCE_GFD;
                case 5:
                    return TimeInForceDto.TIME_IN_FORCE_GFW;
                case 6:
                    return TimeInForceDto.TIME_IN_FORCE_GFM;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TimeInForceDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrosetta/nummus/order/TimeInForceDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrosetta/nummus/order/TimeInForceDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.nummus.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Serializer implements KSerializer<TimeInForceDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<TimeInForceDto, TimeInForce> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.nummus.order.TimeInForce", TimeInForceDto.getEntries(), TimeInForceDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public TimeInForceDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (TimeInForceDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TimeInForceDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static TimeInForceDto valueOf(String str) {
        return (TimeInForceDto) Enum.valueOf(TimeInForceDto.class, str);
    }

    public static TimeInForceDto[] values() {
        return (TimeInForceDto[]) $VALUES.clone();
    }
}
