package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.eventlogging.BooleanDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: DeviceSecurityConfigDto.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004'()*B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BE\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u000fJB\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\tJ\b\u0010\u0018\u001a\u00020\u0002H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020 H\u0016J\b\u0010&\u001a\u00020 H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0011¨\u0006+"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceSecurityConfigDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityConfig;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityConfigDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/DeviceSecurityConfigDto$Surrogate;)V", "has_robinhood_pin", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "has_device_pin", "has_touch_id", "has_face_id", "has_biometric", "has_fingerprint", "(Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;)V", "getHas_robinhood_pin", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "getHas_device_pin", "getHas_touch_id", "getHas_face_id", "getHas_biometric", "getHas_fingerprint", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class DeviceSecurityConfigDto implements Dto3<DeviceSecurityConfig>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<DeviceSecurityConfigDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<DeviceSecurityConfigDto, DeviceSecurityConfig>> binaryBase64Serializer$delegate;
    private static final DeviceSecurityConfigDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ DeviceSecurityConfigDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private DeviceSecurityConfigDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final BooleanDto getHas_robinhood_pin() {
        return this.surrogate.getHas_robinhood_pin();
    }

    public final BooleanDto getHas_device_pin() {
        return this.surrogate.getHas_device_pin();
    }

    public final BooleanDto getHas_touch_id() {
        return this.surrogate.getHas_touch_id();
    }

    public final BooleanDto getHas_face_id() {
        return this.surrogate.getHas_face_id();
    }

    public final BooleanDto getHas_biometric() {
        return this.surrogate.getHas_biometric();
    }

    public final BooleanDto getHas_fingerprint() {
        return this.surrogate.getHas_fingerprint();
    }

    public /* synthetic */ DeviceSecurityConfigDto(BooleanDto booleanDto, BooleanDto booleanDto2, BooleanDto booleanDto3, BooleanDto booleanDto4, BooleanDto booleanDto5, BooleanDto booleanDto6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto, (i & 2) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto2, (i & 4) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto3, (i & 8) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto4, (i & 16) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto5, (i & 32) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto6);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeviceSecurityConfigDto(BooleanDto has_robinhood_pin, BooleanDto has_device_pin, BooleanDto has_touch_id, BooleanDto has_face_id, BooleanDto has_biometric, BooleanDto has_fingerprint) {
        this(new Surrogate(has_robinhood_pin, has_device_pin, has_touch_id, has_face_id, has_biometric, has_fingerprint));
        Intrinsics.checkNotNullParameter(has_robinhood_pin, "has_robinhood_pin");
        Intrinsics.checkNotNullParameter(has_device_pin, "has_device_pin");
        Intrinsics.checkNotNullParameter(has_touch_id, "has_touch_id");
        Intrinsics.checkNotNullParameter(has_face_id, "has_face_id");
        Intrinsics.checkNotNullParameter(has_biometric, "has_biometric");
        Intrinsics.checkNotNullParameter(has_fingerprint, "has_fingerprint");
    }

    public static /* synthetic */ DeviceSecurityConfigDto copy$default(DeviceSecurityConfigDto deviceSecurityConfigDto, BooleanDto booleanDto, BooleanDto booleanDto2, BooleanDto booleanDto3, BooleanDto booleanDto4, BooleanDto booleanDto5, BooleanDto booleanDto6, int i, Object obj) {
        if ((i & 1) != 0) {
            booleanDto = deviceSecurityConfigDto.surrogate.getHas_robinhood_pin();
        }
        if ((i & 2) != 0) {
            booleanDto2 = deviceSecurityConfigDto.surrogate.getHas_device_pin();
        }
        if ((i & 4) != 0) {
            booleanDto3 = deviceSecurityConfigDto.surrogate.getHas_touch_id();
        }
        if ((i & 8) != 0) {
            booleanDto4 = deviceSecurityConfigDto.surrogate.getHas_face_id();
        }
        if ((i & 16) != 0) {
            booleanDto5 = deviceSecurityConfigDto.surrogate.getHas_biometric();
        }
        if ((i & 32) != 0) {
            booleanDto6 = deviceSecurityConfigDto.surrogate.getHas_fingerprint();
        }
        BooleanDto booleanDto7 = booleanDto5;
        BooleanDto booleanDto8 = booleanDto6;
        return deviceSecurityConfigDto.copy(booleanDto, booleanDto2, booleanDto3, booleanDto4, booleanDto7, booleanDto8);
    }

    public final DeviceSecurityConfigDto copy(BooleanDto has_robinhood_pin, BooleanDto has_device_pin, BooleanDto has_touch_id, BooleanDto has_face_id, BooleanDto has_biometric, BooleanDto has_fingerprint) {
        Intrinsics.checkNotNullParameter(has_robinhood_pin, "has_robinhood_pin");
        Intrinsics.checkNotNullParameter(has_device_pin, "has_device_pin");
        Intrinsics.checkNotNullParameter(has_touch_id, "has_touch_id");
        Intrinsics.checkNotNullParameter(has_face_id, "has_face_id");
        Intrinsics.checkNotNullParameter(has_biometric, "has_biometric");
        Intrinsics.checkNotNullParameter(has_fingerprint, "has_fingerprint");
        return new DeviceSecurityConfigDto(new Surrogate(has_robinhood_pin, has_device_pin, has_touch_id, has_face_id, has_biometric, has_fingerprint));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public DeviceSecurityConfig toProto() {
        return new DeviceSecurityConfig((Boolean) this.surrogate.getHas_robinhood_pin().toProto(), (Boolean) this.surrogate.getHas_device_pin().toProto(), (Boolean) this.surrogate.getHas_touch_id().toProto(), (Boolean) this.surrogate.getHas_face_id().toProto(), (Boolean) this.surrogate.getHas_biometric().toProto(), (Boolean) this.surrogate.getHas_fingerprint().toProto(), null, 64, null);
    }

    public String toString() {
        return "[DeviceSecurityConfigDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof DeviceSecurityConfigDto) && Intrinsics.areEqual(((DeviceSecurityConfigDto) other).surrogate, this.surrogate);
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
    /* compiled from: DeviceSecurityConfigDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 42\u00020\u0001:\u000234BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nBW\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003JE\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\fHÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001J%\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0001¢\u0006\u0002\b2R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013R\u001c\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001d\u0010\u0013¨\u00065"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceSecurityConfigDto$Surrogate;", "", "has_robinhood_pin", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "has_device_pin", "has_touch_id", "has_face_id", "has_biometric", "has_fingerprint", "<init>", "(Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getHas_robinhood_pin$annotations", "()V", "getHas_robinhood_pin", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "getHas_device_pin$annotations", "getHas_device_pin", "getHas_touch_id$annotations", "getHas_touch_id", "getHas_face_id$annotations", "getHas_face_id", "getHas_biometric$annotations", "getHas_biometric", "getHas_fingerprint$annotations", "getHas_fingerprint", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final BooleanDto has_biometric;
        private final BooleanDto has_device_pin;
        private final BooleanDto has_face_id;
        private final BooleanDto has_fingerprint;
        private final BooleanDto has_robinhood_pin;
        private final BooleanDto has_touch_id;

        public Surrogate() {
            this((BooleanDto) null, (BooleanDto) null, (BooleanDto) null, (BooleanDto) null, (BooleanDto) null, (BooleanDto) null, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, BooleanDto booleanDto, BooleanDto booleanDto2, BooleanDto booleanDto3, BooleanDto booleanDto4, BooleanDto booleanDto5, BooleanDto booleanDto6, int i, Object obj) {
            if ((i & 1) != 0) {
                booleanDto = surrogate.has_robinhood_pin;
            }
            if ((i & 2) != 0) {
                booleanDto2 = surrogate.has_device_pin;
            }
            if ((i & 4) != 0) {
                booleanDto3 = surrogate.has_touch_id;
            }
            if ((i & 8) != 0) {
                booleanDto4 = surrogate.has_face_id;
            }
            if ((i & 16) != 0) {
                booleanDto5 = surrogate.has_biometric;
            }
            if ((i & 32) != 0) {
                booleanDto6 = surrogate.has_fingerprint;
            }
            BooleanDto booleanDto7 = booleanDto5;
            BooleanDto booleanDto8 = booleanDto6;
            return surrogate.copy(booleanDto, booleanDto2, booleanDto3, booleanDto4, booleanDto7, booleanDto8);
        }

        @SerialName("hasBiometric")
        @JsonAnnotations2(names = {"has_biometric"})
        public static /* synthetic */ void getHas_biometric$annotations() {
        }

        @SerialName("hasDevicePin")
        @JsonAnnotations2(names = {"has_device_pin"})
        public static /* synthetic */ void getHas_device_pin$annotations() {
        }

        @SerialName("hasFaceId")
        @JsonAnnotations2(names = {"has_face_id"})
        public static /* synthetic */ void getHas_face_id$annotations() {
        }

        @SerialName("hasFingerprint")
        @JsonAnnotations2(names = {"has_fingerprint"})
        public static /* synthetic */ void getHas_fingerprint$annotations() {
        }

        @SerialName("hasRobinhoodPin")
        @JsonAnnotations2(names = {"has_robinhood_pin"})
        public static /* synthetic */ void getHas_robinhood_pin$annotations() {
        }

        @SerialName("hasTouchId")
        @JsonAnnotations2(names = {"has_touch_id"})
        public static /* synthetic */ void getHas_touch_id$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final BooleanDto getHas_robinhood_pin() {
            return this.has_robinhood_pin;
        }

        /* renamed from: component2, reason: from getter */
        public final BooleanDto getHas_device_pin() {
            return this.has_device_pin;
        }

        /* renamed from: component3, reason: from getter */
        public final BooleanDto getHas_touch_id() {
            return this.has_touch_id;
        }

        /* renamed from: component4, reason: from getter */
        public final BooleanDto getHas_face_id() {
            return this.has_face_id;
        }

        /* renamed from: component5, reason: from getter */
        public final BooleanDto getHas_biometric() {
            return this.has_biometric;
        }

        /* renamed from: component6, reason: from getter */
        public final BooleanDto getHas_fingerprint() {
            return this.has_fingerprint;
        }

        public final Surrogate copy(BooleanDto has_robinhood_pin, BooleanDto has_device_pin, BooleanDto has_touch_id, BooleanDto has_face_id, BooleanDto has_biometric, BooleanDto has_fingerprint) {
            Intrinsics.checkNotNullParameter(has_robinhood_pin, "has_robinhood_pin");
            Intrinsics.checkNotNullParameter(has_device_pin, "has_device_pin");
            Intrinsics.checkNotNullParameter(has_touch_id, "has_touch_id");
            Intrinsics.checkNotNullParameter(has_face_id, "has_face_id");
            Intrinsics.checkNotNullParameter(has_biometric, "has_biometric");
            Intrinsics.checkNotNullParameter(has_fingerprint, "has_fingerprint");
            return new Surrogate(has_robinhood_pin, has_device_pin, has_touch_id, has_face_id, has_biometric, has_fingerprint);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.has_robinhood_pin == surrogate.has_robinhood_pin && this.has_device_pin == surrogate.has_device_pin && this.has_touch_id == surrogate.has_touch_id && this.has_face_id == surrogate.has_face_id && this.has_biometric == surrogate.has_biometric && this.has_fingerprint == surrogate.has_fingerprint;
        }

        public int hashCode() {
            return (((((((((this.has_robinhood_pin.hashCode() * 31) + this.has_device_pin.hashCode()) * 31) + this.has_touch_id.hashCode()) * 31) + this.has_face_id.hashCode()) * 31) + this.has_biometric.hashCode()) * 31) + this.has_fingerprint.hashCode();
        }

        public String toString() {
            return "Surrogate(has_robinhood_pin=" + this.has_robinhood_pin + ", has_device_pin=" + this.has_device_pin + ", has_touch_id=" + this.has_touch_id + ", has_face_id=" + this.has_face_id + ", has_biometric=" + this.has_biometric + ", has_fingerprint=" + this.has_fingerprint + ")";
        }

        /* compiled from: DeviceSecurityConfigDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceSecurityConfigDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityConfigDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return DeviceSecurityConfigDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, BooleanDto booleanDto, BooleanDto booleanDto2, BooleanDto booleanDto3, BooleanDto booleanDto4, BooleanDto booleanDto5, BooleanDto booleanDto6, SerializationConstructorMarker serializationConstructorMarker) {
            this.has_robinhood_pin = (i & 1) == 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto;
            if ((i & 2) == 0) {
                this.has_device_pin = BooleanDto.INSTANCE.getZeroValue();
            } else {
                this.has_device_pin = booleanDto2;
            }
            if ((i & 4) == 0) {
                this.has_touch_id = BooleanDto.INSTANCE.getZeroValue();
            } else {
                this.has_touch_id = booleanDto3;
            }
            if ((i & 8) == 0) {
                this.has_face_id = BooleanDto.INSTANCE.getZeroValue();
            } else {
                this.has_face_id = booleanDto4;
            }
            if ((i & 16) == 0) {
                this.has_biometric = BooleanDto.INSTANCE.getZeroValue();
            } else {
                this.has_biometric = booleanDto5;
            }
            if ((i & 32) == 0) {
                this.has_fingerprint = BooleanDto.INSTANCE.getZeroValue();
            } else {
                this.has_fingerprint = booleanDto6;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            BooleanDto booleanDto = self.has_robinhood_pin;
            BooleanDto.Companion companion = BooleanDto.INSTANCE;
            if (booleanDto != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, BooleanDto.Serializer.INSTANCE, self.has_robinhood_pin);
            }
            if (self.has_device_pin != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, BooleanDto.Serializer.INSTANCE, self.has_device_pin);
            }
            if (self.has_touch_id != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, BooleanDto.Serializer.INSTANCE, self.has_touch_id);
            }
            if (self.has_face_id != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, BooleanDto.Serializer.INSTANCE, self.has_face_id);
            }
            if (self.has_biometric != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, BooleanDto.Serializer.INSTANCE, self.has_biometric);
            }
            if (self.has_fingerprint != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, BooleanDto.Serializer.INSTANCE, self.has_fingerprint);
            }
        }

        public Surrogate(BooleanDto has_robinhood_pin, BooleanDto has_device_pin, BooleanDto has_touch_id, BooleanDto has_face_id, BooleanDto has_biometric, BooleanDto has_fingerprint) {
            Intrinsics.checkNotNullParameter(has_robinhood_pin, "has_robinhood_pin");
            Intrinsics.checkNotNullParameter(has_device_pin, "has_device_pin");
            Intrinsics.checkNotNullParameter(has_touch_id, "has_touch_id");
            Intrinsics.checkNotNullParameter(has_face_id, "has_face_id");
            Intrinsics.checkNotNullParameter(has_biometric, "has_biometric");
            Intrinsics.checkNotNullParameter(has_fingerprint, "has_fingerprint");
            this.has_robinhood_pin = has_robinhood_pin;
            this.has_device_pin = has_device_pin;
            this.has_touch_id = has_touch_id;
            this.has_face_id = has_face_id;
            this.has_biometric = has_biometric;
            this.has_fingerprint = has_fingerprint;
        }

        public final BooleanDto getHas_robinhood_pin() {
            return this.has_robinhood_pin;
        }

        public /* synthetic */ Surrogate(BooleanDto booleanDto, BooleanDto booleanDto2, BooleanDto booleanDto3, BooleanDto booleanDto4, BooleanDto booleanDto5, BooleanDto booleanDto6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto, (i & 2) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto2, (i & 4) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto3, (i & 8) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto4, (i & 16) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto5, (i & 32) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto6);
        }

        public final BooleanDto getHas_device_pin() {
            return this.has_device_pin;
        }

        public final BooleanDto getHas_touch_id() {
            return this.has_touch_id;
        }

        public final BooleanDto getHas_face_id() {
            return this.has_face_id;
        }

        public final BooleanDto getHas_biometric() {
            return this.has_biometric;
        }

        public final BooleanDto getHas_fingerprint() {
            return this.has_fingerprint;
        }
    }

    /* compiled from: DeviceSecurityConfigDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceSecurityConfigDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityConfigDto;", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityConfig;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/DeviceSecurityConfigDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<DeviceSecurityConfigDto, DeviceSecurityConfig> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DeviceSecurityConfigDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DeviceSecurityConfigDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DeviceSecurityConfigDto> getBinaryBase64Serializer() {
            return (KSerializer) DeviceSecurityConfigDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<DeviceSecurityConfig> getProtoAdapter() {
            return DeviceSecurityConfig.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DeviceSecurityConfigDto getZeroValue() {
            return DeviceSecurityConfigDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DeviceSecurityConfigDto fromProto(DeviceSecurityConfig proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            BooleanDto.Companion companion = BooleanDto.INSTANCE;
            return new DeviceSecurityConfigDto(new Surrogate(companion.fromProto(proto.getHas_robinhood_pin()), companion.fromProto(proto.getHas_device_pin()), companion.fromProto(proto.getHas_touch_id()), companion.fromProto(proto.getHas_face_id()), companion.fromProto(proto.getHas_biometric()), companion.fromProto(proto.getHas_fingerprint())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.DeviceSecurityConfigDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceSecurityConfigDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new DeviceSecurityConfigDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: DeviceSecurityConfigDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceSecurityConfigDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityConfigDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityConfigDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<DeviceSecurityConfigDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.DeviceSecurityConfig", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, DeviceSecurityConfigDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public DeviceSecurityConfigDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new DeviceSecurityConfigDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: DeviceSecurityConfigDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceSecurityConfigDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.DeviceSecurityConfigDto";
        }
    }
}
