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
/* compiled from: DeviceSecurityTimeoutDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0016\u0017B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceSecurityTimeoutDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityTimeout;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "SECURITY_TIMEOUT_UNSPECIFIED", "IMMEDIATELY", "FIVE_SECONDS", "ONE_MINUTE", "FIVE_MINUTES", "FIFTEEN_MINUTES", "ONE_HOUR", "FOUR_HOURS", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public abstract class DeviceSecurityTimeoutDto implements Dto2<DeviceSecurityTimeout>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DeviceSecurityTimeoutDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<DeviceSecurityTimeoutDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<DeviceSecurityTimeoutDto, DeviceSecurityTimeout>> binaryBase64Serializer$delegate;
    public static final DeviceSecurityTimeoutDto SECURITY_TIMEOUT_UNSPECIFIED = new DeviceSecurityTimeoutDto("SECURITY_TIMEOUT_UNSPECIFIED", 0) { // from class: com.robinhood.rosetta.eventlogging.DeviceSecurityTimeoutDto.SECURITY_TIMEOUT_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public DeviceSecurityTimeout toProto() {
            return DeviceSecurityTimeout.SECURITY_TIMEOUT_UNSPECIFIED;
        }
    };
    public static final DeviceSecurityTimeoutDto IMMEDIATELY = new DeviceSecurityTimeoutDto("IMMEDIATELY", 1) { // from class: com.robinhood.rosetta.eventlogging.DeviceSecurityTimeoutDto.IMMEDIATELY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public DeviceSecurityTimeout toProto() {
            return DeviceSecurityTimeout.IMMEDIATELY;
        }
    };
    public static final DeviceSecurityTimeoutDto FIVE_SECONDS = new DeviceSecurityTimeoutDto("FIVE_SECONDS", 2) { // from class: com.robinhood.rosetta.eventlogging.DeviceSecurityTimeoutDto.FIVE_SECONDS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public DeviceSecurityTimeout toProto() {
            return DeviceSecurityTimeout.FIVE_SECONDS;
        }
    };
    public static final DeviceSecurityTimeoutDto ONE_MINUTE = new DeviceSecurityTimeoutDto("ONE_MINUTE", 3) { // from class: com.robinhood.rosetta.eventlogging.DeviceSecurityTimeoutDto.ONE_MINUTE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public DeviceSecurityTimeout toProto() {
            return DeviceSecurityTimeout.ONE_MINUTE;
        }
    };
    public static final DeviceSecurityTimeoutDto FIVE_MINUTES = new DeviceSecurityTimeoutDto("FIVE_MINUTES", 4) { // from class: com.robinhood.rosetta.eventlogging.DeviceSecurityTimeoutDto.FIVE_MINUTES
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public DeviceSecurityTimeout toProto() {
            return DeviceSecurityTimeout.FIVE_MINUTES;
        }
    };
    public static final DeviceSecurityTimeoutDto FIFTEEN_MINUTES = new DeviceSecurityTimeoutDto("FIFTEEN_MINUTES", 5) { // from class: com.robinhood.rosetta.eventlogging.DeviceSecurityTimeoutDto.FIFTEEN_MINUTES
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public DeviceSecurityTimeout toProto() {
            return DeviceSecurityTimeout.FIFTEEN_MINUTES;
        }
    };
    public static final DeviceSecurityTimeoutDto ONE_HOUR = new DeviceSecurityTimeoutDto("ONE_HOUR", 6) { // from class: com.robinhood.rosetta.eventlogging.DeviceSecurityTimeoutDto.ONE_HOUR
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public DeviceSecurityTimeout toProto() {
            return DeviceSecurityTimeout.ONE_HOUR;
        }
    };
    public static final DeviceSecurityTimeoutDto FOUR_HOURS = new DeviceSecurityTimeoutDto("FOUR_HOURS", 7) { // from class: com.robinhood.rosetta.eventlogging.DeviceSecurityTimeoutDto.FOUR_HOURS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public DeviceSecurityTimeout toProto() {
            return DeviceSecurityTimeout.FOUR_HOURS;
        }
    };

    private static final /* synthetic */ DeviceSecurityTimeoutDto[] $values() {
        return new DeviceSecurityTimeoutDto[]{SECURITY_TIMEOUT_UNSPECIFIED, IMMEDIATELY, FIVE_SECONDS, ONE_MINUTE, FIVE_MINUTES, FIFTEEN_MINUTES, ONE_HOUR, FOUR_HOURS};
    }

    public /* synthetic */ DeviceSecurityTimeoutDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<DeviceSecurityTimeoutDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private DeviceSecurityTimeoutDto(String str, int i) {
    }

    static {
        DeviceSecurityTimeoutDto[] deviceSecurityTimeoutDtoArr$values = $values();
        $VALUES = deviceSecurityTimeoutDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(deviceSecurityTimeoutDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.DeviceSecurityTimeoutDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceSecurityTimeoutDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: DeviceSecurityTimeoutDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceSecurityTimeoutDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityTimeoutDto;", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityTimeout;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/DeviceSecurityTimeoutDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<DeviceSecurityTimeoutDto, DeviceSecurityTimeout> {

        /* compiled from: DeviceSecurityTimeoutDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DeviceSecurityTimeout.values().length];
                try {
                    iArr[DeviceSecurityTimeout.SECURITY_TIMEOUT_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DeviceSecurityTimeout.IMMEDIATELY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[DeviceSecurityTimeout.FIVE_SECONDS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[DeviceSecurityTimeout.ONE_MINUTE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[DeviceSecurityTimeout.FIVE_MINUTES.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[DeviceSecurityTimeout.FIFTEEN_MINUTES.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[DeviceSecurityTimeout.ONE_HOUR.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[DeviceSecurityTimeout.FOUR_HOURS.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DeviceSecurityTimeoutDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DeviceSecurityTimeoutDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DeviceSecurityTimeoutDto> getBinaryBase64Serializer() {
            return (KSerializer) DeviceSecurityTimeoutDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<DeviceSecurityTimeout> getProtoAdapter() {
            return DeviceSecurityTimeout.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DeviceSecurityTimeoutDto getZeroValue() {
            return DeviceSecurityTimeoutDto.SECURITY_TIMEOUT_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DeviceSecurityTimeoutDto fromProto(DeviceSecurityTimeout proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return DeviceSecurityTimeoutDto.SECURITY_TIMEOUT_UNSPECIFIED;
                case 2:
                    return DeviceSecurityTimeoutDto.IMMEDIATELY;
                case 3:
                    return DeviceSecurityTimeoutDto.FIVE_SECONDS;
                case 4:
                    return DeviceSecurityTimeoutDto.ONE_MINUTE;
                case 5:
                    return DeviceSecurityTimeoutDto.FIVE_MINUTES;
                case 6:
                    return DeviceSecurityTimeoutDto.FIFTEEN_MINUTES;
                case 7:
                    return DeviceSecurityTimeoutDto.ONE_HOUR;
                case 8:
                    return DeviceSecurityTimeoutDto.FOUR_HOURS;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: DeviceSecurityTimeoutDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceSecurityTimeoutDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityTimeoutDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<DeviceSecurityTimeoutDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<DeviceSecurityTimeoutDto, DeviceSecurityTimeout> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.DeviceSecurityTimeout", DeviceSecurityTimeoutDto.getEntries(), DeviceSecurityTimeoutDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public DeviceSecurityTimeoutDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (DeviceSecurityTimeoutDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, DeviceSecurityTimeoutDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static DeviceSecurityTimeoutDto valueOf(String str) {
        return (DeviceSecurityTimeoutDto) Enum.valueOf(DeviceSecurityTimeoutDto.class, str);
    }

    public static DeviceSecurityTimeoutDto[] values() {
        return (DeviceSecurityTimeoutDto[]) $VALUES.clone();
    }
}
