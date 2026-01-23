package options_product.service;

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
/* compiled from: OptionsStatusDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u001b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002&'B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020$H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e¨\u0006("}, m3636d2 = {"Loptions_product/service/OptionsStatusDto;", "Lcom/robinhood/idl/EnumDto;", "Loptions_product/service/OptionsStatus;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "OPTIONS_STATUS_UNSPECIFIED", "LEVEL_0", "LEVEL_2", "LEVEL_3", "ACTION_NEEDED", "PENDING", "L2_ACTION_NEEDED", "L2_PENDING", "JA_L0_INCOMPLETE", "JA_L0_PENDING_COOWNER", "JA_L0_PENDING_COOWNER_MR", "JA_L0_PENDING", "JA_L0_MR_REQUIRED", "JA_L0_MR_SCHEDULED", "JA_L2_PENDING_COOWNER", "JA_L2_PENDING_COOWNER_MR", "JA_L2_PENDING", "JA_L2_MR_REQUIRED", "JA_L2_MR_SCHEDULED", "NOT_AVAILABLE", "JA_L0", "CUSTODIAL_UNAVAILABLE", "PENDING_APPOINTMENT_SCHEDULED", "L2_PENDING_APPOINTMENT_SCHEDULED", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
public abstract class OptionsStatusDto implements Dto2<OptionsStatus>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionsStatusDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<OptionsStatusDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<OptionsStatusDto, OptionsStatus>> binaryBase64Serializer$delegate;
    public static final OptionsStatusDto OPTIONS_STATUS_UNSPECIFIED = new OptionsStatusDto("OPTIONS_STATUS_UNSPECIFIED", 0) { // from class: options_product.service.OptionsStatusDto.OPTIONS_STATUS_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OptionsStatus toProto() {
            return OptionsStatus.OPTIONS_STATUS_UNSPECIFIED;
        }
    };
    public static final OptionsStatusDto LEVEL_0 = new OptionsStatusDto("LEVEL_0", 1) { // from class: options_product.service.OptionsStatusDto.LEVEL_0
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OptionsStatus toProto() {
            return OptionsStatus.LEVEL_0;
        }
    };
    public static final OptionsStatusDto LEVEL_2 = new OptionsStatusDto("LEVEL_2", 2) { // from class: options_product.service.OptionsStatusDto.LEVEL_2
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OptionsStatus toProto() {
            return OptionsStatus.LEVEL_2;
        }
    };
    public static final OptionsStatusDto LEVEL_3 = new OptionsStatusDto("LEVEL_3", 3) { // from class: options_product.service.OptionsStatusDto.LEVEL_3
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OptionsStatus toProto() {
            return OptionsStatus.LEVEL_3;
        }
    };
    public static final OptionsStatusDto ACTION_NEEDED = new OptionsStatusDto("ACTION_NEEDED", 4) { // from class: options_product.service.OptionsStatusDto.ACTION_NEEDED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OptionsStatus toProto() {
            return OptionsStatus.ACTION_NEEDED;
        }
    };
    public static final OptionsStatusDto PENDING = new OptionsStatusDto("PENDING", 5) { // from class: options_product.service.OptionsStatusDto.PENDING
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OptionsStatus toProto() {
            return OptionsStatus.PENDING;
        }
    };
    public static final OptionsStatusDto L2_ACTION_NEEDED = new OptionsStatusDto("L2_ACTION_NEEDED", 6) { // from class: options_product.service.OptionsStatusDto.L2_ACTION_NEEDED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OptionsStatus toProto() {
            return OptionsStatus.L2_ACTION_NEEDED;
        }
    };
    public static final OptionsStatusDto L2_PENDING = new OptionsStatusDto("L2_PENDING", 7) { // from class: options_product.service.OptionsStatusDto.L2_PENDING
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OptionsStatus toProto() {
            return OptionsStatus.L2_PENDING;
        }
    };
    public static final OptionsStatusDto JA_L0_INCOMPLETE = new OptionsStatusDto("JA_L0_INCOMPLETE", 8) { // from class: options_product.service.OptionsStatusDto.JA_L0_INCOMPLETE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OptionsStatus toProto() {
            return OptionsStatus.JA_L0_INCOMPLETE;
        }
    };
    public static final OptionsStatusDto JA_L0_PENDING_COOWNER = new OptionsStatusDto("JA_L0_PENDING_COOWNER", 9) { // from class: options_product.service.OptionsStatusDto.JA_L0_PENDING_COOWNER
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OptionsStatus toProto() {
            return OptionsStatus.JA_L0_PENDING_COOWNER;
        }
    };
    public static final OptionsStatusDto JA_L0_PENDING_COOWNER_MR = new OptionsStatusDto("JA_L0_PENDING_COOWNER_MR", 10) { // from class: options_product.service.OptionsStatusDto.JA_L0_PENDING_COOWNER_MR
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OptionsStatus toProto() {
            return OptionsStatus.JA_L0_PENDING_COOWNER_MR;
        }
    };
    public static final OptionsStatusDto JA_L0_PENDING = new OptionsStatusDto("JA_L0_PENDING", 11) { // from class: options_product.service.OptionsStatusDto.JA_L0_PENDING
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OptionsStatus toProto() {
            return OptionsStatus.JA_L0_PENDING;
        }
    };
    public static final OptionsStatusDto JA_L0_MR_REQUIRED = new OptionsStatusDto("JA_L0_MR_REQUIRED", 12) { // from class: options_product.service.OptionsStatusDto.JA_L0_MR_REQUIRED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OptionsStatus toProto() {
            return OptionsStatus.JA_L0_MR_REQUIRED;
        }
    };
    public static final OptionsStatusDto JA_L0_MR_SCHEDULED = new OptionsStatusDto("JA_L0_MR_SCHEDULED", 13) { // from class: options_product.service.OptionsStatusDto.JA_L0_MR_SCHEDULED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OptionsStatus toProto() {
            return OptionsStatus.JA_L0_MR_SCHEDULED;
        }
    };
    public static final OptionsStatusDto JA_L2_PENDING_COOWNER = new OptionsStatusDto("JA_L2_PENDING_COOWNER", 14) { // from class: options_product.service.OptionsStatusDto.JA_L2_PENDING_COOWNER
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OptionsStatus toProto() {
            return OptionsStatus.JA_L2_PENDING_COOWNER;
        }
    };
    public static final OptionsStatusDto JA_L2_PENDING_COOWNER_MR = new OptionsStatusDto("JA_L2_PENDING_COOWNER_MR", 15) { // from class: options_product.service.OptionsStatusDto.JA_L2_PENDING_COOWNER_MR
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OptionsStatus toProto() {
            return OptionsStatus.JA_L2_PENDING_COOWNER_MR;
        }
    };
    public static final OptionsStatusDto JA_L2_PENDING = new OptionsStatusDto("JA_L2_PENDING", 16) { // from class: options_product.service.OptionsStatusDto.JA_L2_PENDING
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OptionsStatus toProto() {
            return OptionsStatus.JA_L2_PENDING;
        }
    };
    public static final OptionsStatusDto JA_L2_MR_REQUIRED = new OptionsStatusDto("JA_L2_MR_REQUIRED", 17) { // from class: options_product.service.OptionsStatusDto.JA_L2_MR_REQUIRED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OptionsStatus toProto() {
            return OptionsStatus.JA_L2_MR_REQUIRED;
        }
    };
    public static final OptionsStatusDto JA_L2_MR_SCHEDULED = new OptionsStatusDto("JA_L2_MR_SCHEDULED", 18) { // from class: options_product.service.OptionsStatusDto.JA_L2_MR_SCHEDULED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OptionsStatus toProto() {
            return OptionsStatus.JA_L2_MR_SCHEDULED;
        }
    };
    public static final OptionsStatusDto NOT_AVAILABLE = new OptionsStatusDto("NOT_AVAILABLE", 19) { // from class: options_product.service.OptionsStatusDto.NOT_AVAILABLE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OptionsStatus toProto() {
            return OptionsStatus.NOT_AVAILABLE;
        }
    };
    public static final OptionsStatusDto JA_L0 = new OptionsStatusDto("JA_L0", 20) { // from class: options_product.service.OptionsStatusDto.JA_L0
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OptionsStatus toProto() {
            return OptionsStatus.JA_L0;
        }
    };
    public static final OptionsStatusDto CUSTODIAL_UNAVAILABLE = new OptionsStatusDto("CUSTODIAL_UNAVAILABLE", 21) { // from class: options_product.service.OptionsStatusDto.CUSTODIAL_UNAVAILABLE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OptionsStatus toProto() {
            return OptionsStatus.CUSTODIAL_UNAVAILABLE;
        }
    };
    public static final OptionsStatusDto PENDING_APPOINTMENT_SCHEDULED = new OptionsStatusDto("PENDING_APPOINTMENT_SCHEDULED", 22) { // from class: options_product.service.OptionsStatusDto.PENDING_APPOINTMENT_SCHEDULED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OptionsStatus toProto() {
            return OptionsStatus.PENDING_APPOINTMENT_SCHEDULED;
        }
    };
    public static final OptionsStatusDto L2_PENDING_APPOINTMENT_SCHEDULED = new OptionsStatusDto("L2_PENDING_APPOINTMENT_SCHEDULED", 23) { // from class: options_product.service.OptionsStatusDto.L2_PENDING_APPOINTMENT_SCHEDULED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OptionsStatus toProto() {
            return OptionsStatus.L2_PENDING_APPOINTMENT_SCHEDULED;
        }
    };

    private static final /* synthetic */ OptionsStatusDto[] $values() {
        return new OptionsStatusDto[]{OPTIONS_STATUS_UNSPECIFIED, LEVEL_0, LEVEL_2, LEVEL_3, ACTION_NEEDED, PENDING, L2_ACTION_NEEDED, L2_PENDING, JA_L0_INCOMPLETE, JA_L0_PENDING_COOWNER, JA_L0_PENDING_COOWNER_MR, JA_L0_PENDING, JA_L0_MR_REQUIRED, JA_L0_MR_SCHEDULED, JA_L2_PENDING_COOWNER, JA_L2_PENDING_COOWNER_MR, JA_L2_PENDING, JA_L2_MR_REQUIRED, JA_L2_MR_SCHEDULED, NOT_AVAILABLE, JA_L0, CUSTODIAL_UNAVAILABLE, PENDING_APPOINTMENT_SCHEDULED, L2_PENDING_APPOINTMENT_SCHEDULED};
    }

    public /* synthetic */ OptionsStatusDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<OptionsStatusDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private OptionsStatusDto(String str, int i) {
    }

    static {
        OptionsStatusDto[] optionsStatusDtoArr$values = $values();
        $VALUES = optionsStatusDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionsStatusDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: options_product.service.OptionsStatusDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionsStatusDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: OptionsStatusDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Loptions_product/service/OptionsStatusDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Loptions_product/service/OptionsStatusDto;", "Loptions_product/service/OptionsStatus;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Loptions_product/service/OptionsStatusDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<OptionsStatusDto, OptionsStatus> {

        /* compiled from: OptionsStatusDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[OptionsStatus.values().length];
                try {
                    iArr[OptionsStatus.OPTIONS_STATUS_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OptionsStatus.LEVEL_0.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[OptionsStatus.LEVEL_2.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[OptionsStatus.LEVEL_3.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[OptionsStatus.ACTION_NEEDED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[OptionsStatus.PENDING.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[OptionsStatus.L2_ACTION_NEEDED.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[OptionsStatus.L2_PENDING.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[OptionsStatus.JA_L0_INCOMPLETE.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[OptionsStatus.JA_L0_PENDING_COOWNER.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[OptionsStatus.JA_L0_PENDING_COOWNER_MR.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[OptionsStatus.JA_L0_PENDING.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[OptionsStatus.JA_L0_MR_REQUIRED.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[OptionsStatus.JA_L0_MR_SCHEDULED.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[OptionsStatus.JA_L2_PENDING_COOWNER.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[OptionsStatus.JA_L2_PENDING_COOWNER_MR.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[OptionsStatus.JA_L2_PENDING.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[OptionsStatus.JA_L2_MR_REQUIRED.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[OptionsStatus.JA_L2_MR_SCHEDULED.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[OptionsStatus.NOT_AVAILABLE.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[OptionsStatus.JA_L0.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[OptionsStatus.CUSTODIAL_UNAVAILABLE.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[OptionsStatus.PENDING_APPOINTMENT_SCHEDULED.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[OptionsStatus.L2_PENDING_APPOINTMENT_SCHEDULED.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OptionsStatusDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OptionsStatusDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OptionsStatusDto> getBinaryBase64Serializer() {
            return (KSerializer) OptionsStatusDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<OptionsStatus> getProtoAdapter() {
            return OptionsStatus.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OptionsStatusDto getZeroValue() {
            return OptionsStatusDto.OPTIONS_STATUS_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OptionsStatusDto fromProto(OptionsStatus proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return OptionsStatusDto.OPTIONS_STATUS_UNSPECIFIED;
                case 2:
                    return OptionsStatusDto.LEVEL_0;
                case 3:
                    return OptionsStatusDto.LEVEL_2;
                case 4:
                    return OptionsStatusDto.LEVEL_3;
                case 5:
                    return OptionsStatusDto.ACTION_NEEDED;
                case 6:
                    return OptionsStatusDto.PENDING;
                case 7:
                    return OptionsStatusDto.L2_ACTION_NEEDED;
                case 8:
                    return OptionsStatusDto.L2_PENDING;
                case 9:
                    return OptionsStatusDto.JA_L0_INCOMPLETE;
                case 10:
                    return OptionsStatusDto.JA_L0_PENDING_COOWNER;
                case 11:
                    return OptionsStatusDto.JA_L0_PENDING_COOWNER_MR;
                case 12:
                    return OptionsStatusDto.JA_L0_PENDING;
                case 13:
                    return OptionsStatusDto.JA_L0_MR_REQUIRED;
                case 14:
                    return OptionsStatusDto.JA_L0_MR_SCHEDULED;
                case 15:
                    return OptionsStatusDto.JA_L2_PENDING_COOWNER;
                case 16:
                    return OptionsStatusDto.JA_L2_PENDING_COOWNER_MR;
                case 17:
                    return OptionsStatusDto.JA_L2_PENDING;
                case 18:
                    return OptionsStatusDto.JA_L2_MR_REQUIRED;
                case 19:
                    return OptionsStatusDto.JA_L2_MR_SCHEDULED;
                case 20:
                    return OptionsStatusDto.NOT_AVAILABLE;
                case 21:
                    return OptionsStatusDto.JA_L0;
                case 22:
                    return OptionsStatusDto.CUSTODIAL_UNAVAILABLE;
                case 23:
                    return OptionsStatusDto.PENDING_APPOINTMENT_SCHEDULED;
                case 24:
                    return OptionsStatusDto.L2_PENDING_APPOINTMENT_SCHEDULED;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: OptionsStatusDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Loptions_product/service/OptionsStatusDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Loptions_product/service/OptionsStatusDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<OptionsStatusDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<OptionsStatusDto, OptionsStatus> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/options_product.service.OptionsStatus", OptionsStatusDto.getEntries(), OptionsStatusDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public OptionsStatusDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (OptionsStatusDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, OptionsStatusDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static OptionsStatusDto valueOf(String str) {
        return (OptionsStatusDto) Enum.valueOf(OptionsStatusDto.class, str);
    }

    public static OptionsStatusDto[] values() {
        return (OptionsStatusDto[]) $VALUES.clone();
    }
}
