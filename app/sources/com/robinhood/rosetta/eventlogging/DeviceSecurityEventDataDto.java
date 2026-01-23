package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.DoubleAsNumberSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.rosetta.eventlogging.BooleanDto;
import com.robinhood.rosetta.eventlogging.DeviceSecurityConfigDto;
import com.robinhood.rosetta.eventlogging.DeviceSecurityEventData;
import com.robinhood.rosetta.eventlogging.DeviceSecurityEventDataDto;
import com.robinhood.rosetta.eventlogging.DeviceSecurityTimeoutDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
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

/* compiled from: DeviceSecurityEventDataDto.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005-./01B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B=\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0006\u0010\u0012J:\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011J\b\u0010\u001e\u001a\u00020\u0002H\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010%\u001a\u00020&H\u0016J\u0018\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020&H\u0016J\b\u0010,\u001a\u00020&H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u00062"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventData;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto$Surrogate;)V", "security_config", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityConfigDto;", "security_used", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto$SecurityTypeDto;", "account_age", "", "unlock_success", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "security_timeout", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityTimeoutDto;", "(Lcom/robinhood/rosetta/eventlogging/DeviceSecurityConfigDto;Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto$SecurityTypeDto;DLcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/DeviceSecurityTimeoutDto;)V", "getSecurity_config", "()Lcom/robinhood/rosetta/eventlogging/DeviceSecurityConfigDto;", "getSecurity_used", "()Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto$SecurityTypeDto;", "getAccount_age", "()D", "getUnlock_success", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "getSecurity_timeout", "()Lcom/robinhood/rosetta/eventlogging/DeviceSecurityTimeoutDto;", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "SecurityTypeDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class DeviceSecurityEventDataDto implements Dto3<DeviceSecurityEventData>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<DeviceSecurityEventDataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<DeviceSecurityEventDataDto, DeviceSecurityEventData>> binaryBase64Serializer$delegate;
    private static final DeviceSecurityEventDataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ DeviceSecurityEventDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private DeviceSecurityEventDataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final DeviceSecurityConfigDto getSecurity_config() {
        return this.surrogate.getSecurity_config();
    }

    public final SecurityTypeDto getSecurity_used() {
        return this.surrogate.getSecurity_used();
    }

    public final double getAccount_age() {
        return this.surrogate.getAccount_age();
    }

    public final BooleanDto getUnlock_success() {
        return this.surrogate.getUnlock_success();
    }

    public final DeviceSecurityTimeoutDto getSecurity_timeout() {
        return this.surrogate.getSecurity_timeout();
    }

    public /* synthetic */ DeviceSecurityEventDataDto(DeviceSecurityConfigDto deviceSecurityConfigDto, SecurityTypeDto securityTypeDto, double d, BooleanDto booleanDto, DeviceSecurityTimeoutDto deviceSecurityTimeoutDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : deviceSecurityConfigDto, (i & 2) != 0 ? SecurityTypeDto.INSTANCE.getZeroValue() : securityTypeDto, (i & 4) != 0 ? 0.0d : d, (i & 8) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto, (i & 16) != 0 ? DeviceSecurityTimeoutDto.INSTANCE.getZeroValue() : deviceSecurityTimeoutDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeviceSecurityEventDataDto(DeviceSecurityConfigDto deviceSecurityConfigDto, SecurityTypeDto security_used, double d, BooleanDto unlock_success, DeviceSecurityTimeoutDto security_timeout) {
        this(new Surrogate(deviceSecurityConfigDto, security_used, d, unlock_success, security_timeout));
        Intrinsics.checkNotNullParameter(security_used, "security_used");
        Intrinsics.checkNotNullParameter(unlock_success, "unlock_success");
        Intrinsics.checkNotNullParameter(security_timeout, "security_timeout");
    }

    public static /* synthetic */ DeviceSecurityEventDataDto copy$default(DeviceSecurityEventDataDto deviceSecurityEventDataDto, DeviceSecurityConfigDto deviceSecurityConfigDto, SecurityTypeDto securityTypeDto, double d, BooleanDto booleanDto, DeviceSecurityTimeoutDto deviceSecurityTimeoutDto, int i, Object obj) {
        if ((i & 1) != 0) {
            deviceSecurityConfigDto = deviceSecurityEventDataDto.surrogate.getSecurity_config();
        }
        if ((i & 2) != 0) {
            securityTypeDto = deviceSecurityEventDataDto.surrogate.getSecurity_used();
        }
        if ((i & 4) != 0) {
            d = deviceSecurityEventDataDto.surrogate.getAccount_age();
        }
        if ((i & 8) != 0) {
            booleanDto = deviceSecurityEventDataDto.surrogate.getUnlock_success();
        }
        if ((i & 16) != 0) {
            deviceSecurityTimeoutDto = deviceSecurityEventDataDto.surrogate.getSecurity_timeout();
        }
        double d2 = d;
        return deviceSecurityEventDataDto.copy(deviceSecurityConfigDto, securityTypeDto, d2, booleanDto, deviceSecurityTimeoutDto);
    }

    public final DeviceSecurityEventDataDto copy(DeviceSecurityConfigDto security_config, SecurityTypeDto security_used, double account_age, BooleanDto unlock_success, DeviceSecurityTimeoutDto security_timeout) {
        Intrinsics.checkNotNullParameter(security_used, "security_used");
        Intrinsics.checkNotNullParameter(unlock_success, "unlock_success");
        Intrinsics.checkNotNullParameter(security_timeout, "security_timeout");
        return new DeviceSecurityEventDataDto(new Surrogate(security_config, security_used, account_age, unlock_success, security_timeout));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public DeviceSecurityEventData toProto() {
        DeviceSecurityConfigDto security_config = this.surrogate.getSecurity_config();
        return new DeviceSecurityEventData(security_config != null ? security_config.toProto() : null, (DeviceSecurityEventData.SecurityType) this.surrogate.getSecurity_used().toProto(), this.surrogate.getAccount_age(), (Boolean) this.surrogate.getUnlock_success().toProto(), (DeviceSecurityTimeout) this.surrogate.getSecurity_timeout().toProto(), null, 32, null);
    }

    public String toString() {
        return "[DeviceSecurityEventDataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof DeviceSecurityEventDataDto) && Intrinsics.areEqual(((DeviceSecurityEventDataDto) other).surrogate, this.surrogate);
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
    /* compiled from: DeviceSecurityEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 ;2\u00020\u0001:\u0002:;BJ\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010BK\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u000f\u0010\u0015J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\u0018\u0010(\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003J\t\u0010)\u001a\u00020\fHÆ\u0003J\t\u0010*\u001a\u00020\u000eHÆ\u0003JL\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0017\b\u0002\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0012HÖ\u0001J\t\u00100\u001a\u000201HÖ\u0001J%\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000208H\u0001¢\u0006\u0002\b9R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u001cR+\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\"R\u001c\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u0017\u001a\u0004\b$\u0010%¨\u0006<"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto$Surrogate;", "", "security_config", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityConfigDto;", "security_used", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto$SecurityTypeDto;", "account_age", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "unlock_success", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "security_timeout", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityTimeoutDto;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/DeviceSecurityConfigDto;Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto$SecurityTypeDto;DLcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/DeviceSecurityTimeoutDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/DeviceSecurityConfigDto;Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto$SecurityTypeDto;DLcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/DeviceSecurityTimeoutDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getSecurity_config$annotations", "()V", "getSecurity_config", "()Lcom/robinhood/rosetta/eventlogging/DeviceSecurityConfigDto;", "getSecurity_used$annotations", "getSecurity_used", "()Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto$SecurityTypeDto;", "getAccount_age$annotations", "getAccount_age", "()D", "getUnlock_success$annotations", "getUnlock_success", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "getSecurity_timeout$annotations", "getSecurity_timeout", "()Lcom/robinhood/rosetta/eventlogging/DeviceSecurityTimeoutDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final double account_age;
        private final DeviceSecurityConfigDto security_config;
        private final DeviceSecurityTimeoutDto security_timeout;
        private final SecurityTypeDto security_used;
        private final BooleanDto unlock_success;

        public Surrogate() {
            this((DeviceSecurityConfigDto) null, (SecurityTypeDto) null, 0.0d, (BooleanDto) null, (DeviceSecurityTimeoutDto) null, 31, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, DeviceSecurityConfigDto deviceSecurityConfigDto, SecurityTypeDto securityTypeDto, double d, BooleanDto booleanDto, DeviceSecurityTimeoutDto deviceSecurityTimeoutDto, int i, Object obj) {
            if ((i & 1) != 0) {
                deviceSecurityConfigDto = surrogate.security_config;
            }
            if ((i & 2) != 0) {
                securityTypeDto = surrogate.security_used;
            }
            if ((i & 4) != 0) {
                d = surrogate.account_age;
            }
            if ((i & 8) != 0) {
                booleanDto = surrogate.unlock_success;
            }
            if ((i & 16) != 0) {
                deviceSecurityTimeoutDto = surrogate.security_timeout;
            }
            double d2 = d;
            return surrogate.copy(deviceSecurityConfigDto, securityTypeDto, d2, booleanDto, deviceSecurityTimeoutDto);
        }

        @SerialName("accountAge")
        @JsonAnnotations2(names = {"account_age"})
        public static /* synthetic */ void getAccount_age$annotations() {
        }

        @SerialName("securityConfig")
        @JsonAnnotations2(names = {"security_config"})
        public static /* synthetic */ void getSecurity_config$annotations() {
        }

        @SerialName("securityTimeout")
        @JsonAnnotations2(names = {"security_timeout"})
        public static /* synthetic */ void getSecurity_timeout$annotations() {
        }

        @SerialName("securityUsed")
        @JsonAnnotations2(names = {"security_used"})
        public static /* synthetic */ void getSecurity_used$annotations() {
        }

        @SerialName("unlockSuccess")
        @JsonAnnotations2(names = {"unlock_success"})
        public static /* synthetic */ void getUnlock_success$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final DeviceSecurityConfigDto getSecurity_config() {
            return this.security_config;
        }

        /* renamed from: component2, reason: from getter */
        public final SecurityTypeDto getSecurity_used() {
            return this.security_used;
        }

        /* renamed from: component3, reason: from getter */
        public final double getAccount_age() {
            return this.account_age;
        }

        /* renamed from: component4, reason: from getter */
        public final BooleanDto getUnlock_success() {
            return this.unlock_success;
        }

        /* renamed from: component5, reason: from getter */
        public final DeviceSecurityTimeoutDto getSecurity_timeout() {
            return this.security_timeout;
        }

        public final Surrogate copy(DeviceSecurityConfigDto security_config, SecurityTypeDto security_used, double account_age, BooleanDto unlock_success, DeviceSecurityTimeoutDto security_timeout) {
            Intrinsics.checkNotNullParameter(security_used, "security_used");
            Intrinsics.checkNotNullParameter(unlock_success, "unlock_success");
            Intrinsics.checkNotNullParameter(security_timeout, "security_timeout");
            return new Surrogate(security_config, security_used, account_age, unlock_success, security_timeout);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.security_config, surrogate.security_config) && this.security_used == surrogate.security_used && Double.compare(this.account_age, surrogate.account_age) == 0 && this.unlock_success == surrogate.unlock_success && this.security_timeout == surrogate.security_timeout;
        }

        public int hashCode() {
            DeviceSecurityConfigDto deviceSecurityConfigDto = this.security_config;
            return ((((((((deviceSecurityConfigDto == null ? 0 : deviceSecurityConfigDto.hashCode()) * 31) + this.security_used.hashCode()) * 31) + Double.hashCode(this.account_age)) * 31) + this.unlock_success.hashCode()) * 31) + this.security_timeout.hashCode();
        }

        public String toString() {
            return "Surrogate(security_config=" + this.security_config + ", security_used=" + this.security_used + ", account_age=" + this.account_age + ", unlock_success=" + this.unlock_success + ", security_timeout=" + this.security_timeout + ")";
        }

        /* compiled from: DeviceSecurityEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return DeviceSecurityEventDataDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, DeviceSecurityConfigDto deviceSecurityConfigDto, SecurityTypeDto securityTypeDto, double d, BooleanDto booleanDto, DeviceSecurityTimeoutDto deviceSecurityTimeoutDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.security_config = (i & 1) == 0 ? null : deviceSecurityConfigDto;
            if ((i & 2) == 0) {
                this.security_used = SecurityTypeDto.INSTANCE.getZeroValue();
            } else {
                this.security_used = securityTypeDto;
            }
            if ((i & 4) == 0) {
                this.account_age = 0.0d;
            } else {
                this.account_age = d;
            }
            if ((i & 8) == 0) {
                this.unlock_success = BooleanDto.INSTANCE.getZeroValue();
            } else {
                this.unlock_success = booleanDto;
            }
            if ((i & 16) == 0) {
                this.security_timeout = DeviceSecurityTimeoutDto.INSTANCE.getZeroValue();
            } else {
                this.security_timeout = deviceSecurityTimeoutDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            DeviceSecurityConfigDto deviceSecurityConfigDto = self.security_config;
            if (deviceSecurityConfigDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, DeviceSecurityConfigDto.Serializer.INSTANCE, deviceSecurityConfigDto);
            }
            if (self.security_used != SecurityTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, SecurityTypeDto.Serializer.INSTANCE, self.security_used);
            }
            if (Double.compare(self.account_age, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 2, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.account_age));
            }
            if (self.unlock_success != BooleanDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, BooleanDto.Serializer.INSTANCE, self.unlock_success);
            }
            if (self.security_timeout != DeviceSecurityTimeoutDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, DeviceSecurityTimeoutDto.Serializer.INSTANCE, self.security_timeout);
            }
        }

        public Surrogate(DeviceSecurityConfigDto deviceSecurityConfigDto, SecurityTypeDto security_used, double d, BooleanDto unlock_success, DeviceSecurityTimeoutDto security_timeout) {
            Intrinsics.checkNotNullParameter(security_used, "security_used");
            Intrinsics.checkNotNullParameter(unlock_success, "unlock_success");
            Intrinsics.checkNotNullParameter(security_timeout, "security_timeout");
            this.security_config = deviceSecurityConfigDto;
            this.security_used = security_used;
            this.account_age = d;
            this.unlock_success = unlock_success;
            this.security_timeout = security_timeout;
        }

        public final DeviceSecurityConfigDto getSecurity_config() {
            return this.security_config;
        }

        public final SecurityTypeDto getSecurity_used() {
            return this.security_used;
        }

        public /* synthetic */ Surrogate(DeviceSecurityConfigDto deviceSecurityConfigDto, SecurityTypeDto securityTypeDto, double d, BooleanDto booleanDto, DeviceSecurityTimeoutDto deviceSecurityTimeoutDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : deviceSecurityConfigDto, (i & 2) != 0 ? SecurityTypeDto.INSTANCE.getZeroValue() : securityTypeDto, (i & 4) != 0 ? 0.0d : d, (i & 8) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto, (i & 16) != 0 ? DeviceSecurityTimeoutDto.INSTANCE.getZeroValue() : deviceSecurityTimeoutDto);
        }

        public final double getAccount_age() {
            return this.account_age;
        }

        public final BooleanDto getUnlock_success() {
            return this.unlock_success;
        }

        public final DeviceSecurityTimeoutDto getSecurity_timeout() {
            return this.security_timeout;
        }
    }

    /* compiled from: DeviceSecurityEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto;", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<DeviceSecurityEventDataDto, DeviceSecurityEventData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DeviceSecurityEventDataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DeviceSecurityEventDataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DeviceSecurityEventDataDto> getBinaryBase64Serializer() {
            return (KSerializer) DeviceSecurityEventDataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<DeviceSecurityEventData> getProtoAdapter() {
            return DeviceSecurityEventData.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DeviceSecurityEventDataDto getZeroValue() {
            return DeviceSecurityEventDataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DeviceSecurityEventDataDto fromProto(DeviceSecurityEventData proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            DeviceSecurityConfig security_config = proto.getSecurity_config();
            return new DeviceSecurityEventDataDto(new Surrogate(security_config != null ? DeviceSecurityConfigDto.INSTANCE.fromProto(security_config) : null, SecurityTypeDto.INSTANCE.fromProto(proto.getSecurity_used()), proto.getAccount_age(), BooleanDto.INSTANCE.fromProto(proto.getUnlock_success()), DeviceSecurityTimeoutDto.INSTANCE.fromProto(proto.getSecurity_timeout())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.DeviceSecurityEventDataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceSecurityEventDataDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new DeviceSecurityEventDataDto(null, null, 0.0d, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DeviceSecurityEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0017\u0018B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto$SecurityTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventData$SecurityType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "SECURITY_TYPE_UNSPECIFIED", "NONE", "ROBINHOOD_PIN", "DEVICE_PIN", "TOUCH_ID", "FACE_ID", "BIOMETRIC", "FINGERPRINT", "DEVICE_PASSWORD", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class SecurityTypeDto implements Dto2<DeviceSecurityEventData.SecurityType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SecurityTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<SecurityTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<SecurityTypeDto, DeviceSecurityEventData.SecurityType>> binaryBase64Serializer$delegate;
        public static final SecurityTypeDto SECURITY_TYPE_UNSPECIFIED = new SECURITY_TYPE_UNSPECIFIED("SECURITY_TYPE_UNSPECIFIED", 0);
        public static final SecurityTypeDto NONE = new NONE("NONE", 1);
        public static final SecurityTypeDto ROBINHOOD_PIN = new ROBINHOOD_PIN("ROBINHOOD_PIN", 2);
        public static final SecurityTypeDto DEVICE_PIN = new DEVICE_PIN("DEVICE_PIN", 3);
        public static final SecurityTypeDto TOUCH_ID = new TOUCH_ID("TOUCH_ID", 4);
        public static final SecurityTypeDto FACE_ID = new FACE_ID("FACE_ID", 5);
        public static final SecurityTypeDto BIOMETRIC = new BIOMETRIC("BIOMETRIC", 6);
        public static final SecurityTypeDto FINGERPRINT = new FINGERPRINT("FINGERPRINT", 7);
        public static final SecurityTypeDto DEVICE_PASSWORD = new DEVICE_PASSWORD("DEVICE_PASSWORD", 8);

        private static final /* synthetic */ SecurityTypeDto[] $values() {
            return new SecurityTypeDto[]{SECURITY_TYPE_UNSPECIFIED, NONE, ROBINHOOD_PIN, DEVICE_PIN, TOUCH_ID, FACE_ID, BIOMETRIC, FINGERPRINT, DEVICE_PASSWORD};
        }

        public /* synthetic */ SecurityTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<SecurityTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: DeviceSecurityEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto.SecurityTypeDto.SECURITY_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto$SecurityTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventData$SecurityType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SECURITY_TYPE_UNSPECIFIED extends SecurityTypeDto {
            SECURITY_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DeviceSecurityEventData.SecurityType toProto() {
                return DeviceSecurityEventData.SecurityType.SECURITY_TYPE_UNSPECIFIED;
            }
        }

        private SecurityTypeDto(String str, int i) {
        }

        static {
            SecurityTypeDto[] securityTypeDtoArr$values = $values();
            $VALUES = securityTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(securityTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.DeviceSecurityEventDataDto$SecurityTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DeviceSecurityEventDataDto.SecurityTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: DeviceSecurityEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto.SecurityTypeDto.NONE", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto$SecurityTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventData$SecurityType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NONE extends SecurityTypeDto {
            NONE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DeviceSecurityEventData.SecurityType toProto() {
                return DeviceSecurityEventData.SecurityType.NONE;
            }
        }

        /* compiled from: DeviceSecurityEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto.SecurityTypeDto.ROBINHOOD_PIN", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto$SecurityTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventData$SecurityType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ROBINHOOD_PIN extends SecurityTypeDto {
            ROBINHOOD_PIN(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DeviceSecurityEventData.SecurityType toProto() {
                return DeviceSecurityEventData.SecurityType.ROBINHOOD_PIN;
            }
        }

        /* compiled from: DeviceSecurityEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto.SecurityTypeDto.DEVICE_PIN", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto$SecurityTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventData$SecurityType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DEVICE_PIN extends SecurityTypeDto {
            DEVICE_PIN(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DeviceSecurityEventData.SecurityType toProto() {
                return DeviceSecurityEventData.SecurityType.DEVICE_PIN;
            }
        }

        /* compiled from: DeviceSecurityEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto.SecurityTypeDto.TOUCH_ID", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto$SecurityTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventData$SecurityType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TOUCH_ID extends SecurityTypeDto {
            TOUCH_ID(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DeviceSecurityEventData.SecurityType toProto() {
                return DeviceSecurityEventData.SecurityType.TOUCH_ID;
            }
        }

        /* compiled from: DeviceSecurityEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto.SecurityTypeDto.FACE_ID", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto$SecurityTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventData$SecurityType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FACE_ID extends SecurityTypeDto {
            FACE_ID(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DeviceSecurityEventData.SecurityType toProto() {
                return DeviceSecurityEventData.SecurityType.FACE_ID;
            }
        }

        /* compiled from: DeviceSecurityEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto.SecurityTypeDto.BIOMETRIC", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto$SecurityTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventData$SecurityType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BIOMETRIC extends SecurityTypeDto {
            BIOMETRIC(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DeviceSecurityEventData.SecurityType toProto() {
                return DeviceSecurityEventData.SecurityType.BIOMETRIC;
            }
        }

        /* compiled from: DeviceSecurityEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto.SecurityTypeDto.FINGERPRINT", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto$SecurityTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventData$SecurityType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FINGERPRINT extends SecurityTypeDto {
            FINGERPRINT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DeviceSecurityEventData.SecurityType toProto() {
                return DeviceSecurityEventData.SecurityType.FINGERPRINT;
            }
        }

        /* compiled from: DeviceSecurityEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto.SecurityTypeDto.DEVICE_PASSWORD", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto$SecurityTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventData$SecurityType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DEVICE_PASSWORD extends SecurityTypeDto {
            DEVICE_PASSWORD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DeviceSecurityEventData.SecurityType toProto() {
                return DeviceSecurityEventData.SecurityType.DEVICE_PASSWORD;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: DeviceSecurityEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto$SecurityTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto$SecurityTypeDto;", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventData$SecurityType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto$SecurityTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<SecurityTypeDto, DeviceSecurityEventData.SecurityType> {

            /* compiled from: DeviceSecurityEventDataDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[DeviceSecurityEventData.SecurityType.values().length];
                    try {
                        iArr[DeviceSecurityEventData.SecurityType.SECURITY_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[DeviceSecurityEventData.SecurityType.NONE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[DeviceSecurityEventData.SecurityType.ROBINHOOD_PIN.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[DeviceSecurityEventData.SecurityType.DEVICE_PIN.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[DeviceSecurityEventData.SecurityType.TOUCH_ID.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[DeviceSecurityEventData.SecurityType.FACE_ID.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[DeviceSecurityEventData.SecurityType.BIOMETRIC.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[DeviceSecurityEventData.SecurityType.FINGERPRINT.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[DeviceSecurityEventData.SecurityType.DEVICE_PASSWORD.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<SecurityTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<SecurityTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<SecurityTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) SecurityTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<DeviceSecurityEventData.SecurityType> getProtoAdapter() {
                return DeviceSecurityEventData.SecurityType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public SecurityTypeDto getZeroValue() {
                return SecurityTypeDto.SECURITY_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public SecurityTypeDto fromProto(DeviceSecurityEventData.SecurityType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return SecurityTypeDto.SECURITY_TYPE_UNSPECIFIED;
                    case 2:
                        return SecurityTypeDto.NONE;
                    case 3:
                        return SecurityTypeDto.ROBINHOOD_PIN;
                    case 4:
                        return SecurityTypeDto.DEVICE_PIN;
                    case 5:
                        return SecurityTypeDto.TOUCH_ID;
                    case 6:
                        return SecurityTypeDto.FACE_ID;
                    case 7:
                        return SecurityTypeDto.BIOMETRIC;
                    case 8:
                        return SecurityTypeDto.FINGERPRINT;
                    case 9:
                        return SecurityTypeDto.DEVICE_PASSWORD;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: DeviceSecurityEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto$SecurityTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto$SecurityTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<SecurityTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<SecurityTypeDto, DeviceSecurityEventData.SecurityType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.DeviceSecurityEventData.SecurityType", SecurityTypeDto.getEntries(), SecurityTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public SecurityTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (SecurityTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, SecurityTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static SecurityTypeDto valueOf(String str) {
            return (SecurityTypeDto) Enum.valueOf(SecurityTypeDto.class, str);
        }

        public static SecurityTypeDto[] values() {
            return (SecurityTypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: DeviceSecurityEventDataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<DeviceSecurityEventDataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.DeviceSecurityEventData", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, DeviceSecurityEventDataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public DeviceSecurityEventDataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new DeviceSecurityEventDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: DeviceSecurityEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.DeviceSecurityEventDataDto";
        }
    }
}
