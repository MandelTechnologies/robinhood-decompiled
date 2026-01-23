package crypto_portkey.service.p443v1;

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
/* compiled from: MigrationEligibilityStatusDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0017\u0018B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0019"}, m3636d2 = {"Lcrypto_portkey/service/v1/MigrationEligibilityStatusDto;", "Lcom/robinhood/idl/EnumDto;", "Lcrypto_portkey/service/v1/MigrationEligibilityStatus;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "MIGRATION_ELIGIBILITY_STATUS_UNSPECIFIED", "MIGRATION_ELIGIBILITY_STATUS_ELIGIBLE", "MIGRATION_ELIGIBILITY_STATUS_PENDING_VERIFICATION", "MIGRATION_ELIGIBILITY_STATUS_ALREADY_MIGRATING", "MIGRATION_ELIGIBILITY_STATUS_MIGRATION_COMPLETED", "MIGRATION_ELIGIBILITY_STATUS_VERIFICATION_FAILED", "MIGRATION_ELIGIBILITY_STATUS_NOT_ELIGIBLE", "MIGRATION_ELIGIBILITY_STATUS_PARTNER_NOT_SUPPORTED", "MIGRATION_ELIGIBILITY_STATUS_INTERNAL_ERROR", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes18.dex */
public abstract class MigrationEligibilityStatusDto implements Dto2<MigrationEligibilityStatus>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MigrationEligibilityStatusDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<MigrationEligibilityStatusDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<MigrationEligibilityStatusDto, MigrationEligibilityStatus>> binaryBase64Serializer$delegate;
    public static final MigrationEligibilityStatusDto MIGRATION_ELIGIBILITY_STATUS_UNSPECIFIED = new MigrationEligibilityStatusDto("MIGRATION_ELIGIBILITY_STATUS_UNSPECIFIED", 0) { // from class: crypto_portkey.service.v1.MigrationEligibilityStatusDto.MIGRATION_ELIGIBILITY_STATUS_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MigrationEligibilityStatus toProto() {
            return MigrationEligibilityStatus.MIGRATION_ELIGIBILITY_STATUS_UNSPECIFIED;
        }
    };
    public static final MigrationEligibilityStatusDto MIGRATION_ELIGIBILITY_STATUS_ELIGIBLE = new MigrationEligibilityStatusDto("MIGRATION_ELIGIBILITY_STATUS_ELIGIBLE", 1) { // from class: crypto_portkey.service.v1.MigrationEligibilityStatusDto.MIGRATION_ELIGIBILITY_STATUS_ELIGIBLE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MigrationEligibilityStatus toProto() {
            return MigrationEligibilityStatus.MIGRATION_ELIGIBILITY_STATUS_ELIGIBLE;
        }
    };
    public static final MigrationEligibilityStatusDto MIGRATION_ELIGIBILITY_STATUS_PENDING_VERIFICATION = new MigrationEligibilityStatusDto("MIGRATION_ELIGIBILITY_STATUS_PENDING_VERIFICATION", 2) { // from class: crypto_portkey.service.v1.MigrationEligibilityStatusDto.MIGRATION_ELIGIBILITY_STATUS_PENDING_VERIFICATION
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MigrationEligibilityStatus toProto() {
            return MigrationEligibilityStatus.MIGRATION_ELIGIBILITY_STATUS_PENDING_VERIFICATION;
        }
    };
    public static final MigrationEligibilityStatusDto MIGRATION_ELIGIBILITY_STATUS_ALREADY_MIGRATING = new MigrationEligibilityStatusDto("MIGRATION_ELIGIBILITY_STATUS_ALREADY_MIGRATING", 3) { // from class: crypto_portkey.service.v1.MigrationEligibilityStatusDto.MIGRATION_ELIGIBILITY_STATUS_ALREADY_MIGRATING
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MigrationEligibilityStatus toProto() {
            return MigrationEligibilityStatus.MIGRATION_ELIGIBILITY_STATUS_ALREADY_MIGRATING;
        }
    };
    public static final MigrationEligibilityStatusDto MIGRATION_ELIGIBILITY_STATUS_MIGRATION_COMPLETED = new MigrationEligibilityStatusDto("MIGRATION_ELIGIBILITY_STATUS_MIGRATION_COMPLETED", 4) { // from class: crypto_portkey.service.v1.MigrationEligibilityStatusDto.MIGRATION_ELIGIBILITY_STATUS_MIGRATION_COMPLETED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MigrationEligibilityStatus toProto() {
            return MigrationEligibilityStatus.MIGRATION_ELIGIBILITY_STATUS_MIGRATION_COMPLETED;
        }
    };
    public static final MigrationEligibilityStatusDto MIGRATION_ELIGIBILITY_STATUS_VERIFICATION_FAILED = new MigrationEligibilityStatusDto("MIGRATION_ELIGIBILITY_STATUS_VERIFICATION_FAILED", 5) { // from class: crypto_portkey.service.v1.MigrationEligibilityStatusDto.MIGRATION_ELIGIBILITY_STATUS_VERIFICATION_FAILED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MigrationEligibilityStatus toProto() {
            return MigrationEligibilityStatus.MIGRATION_ELIGIBILITY_STATUS_VERIFICATION_FAILED;
        }
    };
    public static final MigrationEligibilityStatusDto MIGRATION_ELIGIBILITY_STATUS_NOT_ELIGIBLE = new MigrationEligibilityStatusDto("MIGRATION_ELIGIBILITY_STATUS_NOT_ELIGIBLE", 6) { // from class: crypto_portkey.service.v1.MigrationEligibilityStatusDto.MIGRATION_ELIGIBILITY_STATUS_NOT_ELIGIBLE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MigrationEligibilityStatus toProto() {
            return MigrationEligibilityStatus.MIGRATION_ELIGIBILITY_STATUS_NOT_ELIGIBLE;
        }
    };
    public static final MigrationEligibilityStatusDto MIGRATION_ELIGIBILITY_STATUS_PARTNER_NOT_SUPPORTED = new MigrationEligibilityStatusDto("MIGRATION_ELIGIBILITY_STATUS_PARTNER_NOT_SUPPORTED", 7) { // from class: crypto_portkey.service.v1.MigrationEligibilityStatusDto.MIGRATION_ELIGIBILITY_STATUS_PARTNER_NOT_SUPPORTED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MigrationEligibilityStatus toProto() {
            return MigrationEligibilityStatus.MIGRATION_ELIGIBILITY_STATUS_PARTNER_NOT_SUPPORTED;
        }
    };
    public static final MigrationEligibilityStatusDto MIGRATION_ELIGIBILITY_STATUS_INTERNAL_ERROR = new MigrationEligibilityStatusDto("MIGRATION_ELIGIBILITY_STATUS_INTERNAL_ERROR", 8) { // from class: crypto_portkey.service.v1.MigrationEligibilityStatusDto.MIGRATION_ELIGIBILITY_STATUS_INTERNAL_ERROR
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MigrationEligibilityStatus toProto() {
            return MigrationEligibilityStatus.MIGRATION_ELIGIBILITY_STATUS_INTERNAL_ERROR;
        }
    };

    private static final /* synthetic */ MigrationEligibilityStatusDto[] $values() {
        return new MigrationEligibilityStatusDto[]{MIGRATION_ELIGIBILITY_STATUS_UNSPECIFIED, MIGRATION_ELIGIBILITY_STATUS_ELIGIBLE, MIGRATION_ELIGIBILITY_STATUS_PENDING_VERIFICATION, MIGRATION_ELIGIBILITY_STATUS_ALREADY_MIGRATING, MIGRATION_ELIGIBILITY_STATUS_MIGRATION_COMPLETED, MIGRATION_ELIGIBILITY_STATUS_VERIFICATION_FAILED, MIGRATION_ELIGIBILITY_STATUS_NOT_ELIGIBLE, MIGRATION_ELIGIBILITY_STATUS_PARTNER_NOT_SUPPORTED, MIGRATION_ELIGIBILITY_STATUS_INTERNAL_ERROR};
    }

    public /* synthetic */ MigrationEligibilityStatusDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<MigrationEligibilityStatusDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private MigrationEligibilityStatusDto(String str, int i) {
    }

    static {
        MigrationEligibilityStatusDto[] migrationEligibilityStatusDtoArr$values = $values();
        $VALUES = migrationEligibilityStatusDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(migrationEligibilityStatusDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: crypto_portkey.service.v1.MigrationEligibilityStatusDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MigrationEligibilityStatusDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: MigrationEligibilityStatusDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcrypto_portkey/service/v1/MigrationEligibilityStatusDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcrypto_portkey/service/v1/MigrationEligibilityStatusDto;", "Lcrypto_portkey/service/v1/MigrationEligibilityStatus;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcrypto_portkey/service/v1/MigrationEligibilityStatusDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<MigrationEligibilityStatusDto, MigrationEligibilityStatus> {

        /* compiled from: MigrationEligibilityStatusDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MigrationEligibilityStatus.values().length];
                try {
                    iArr[MigrationEligibilityStatus.MIGRATION_ELIGIBILITY_STATUS_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MigrationEligibilityStatus.MIGRATION_ELIGIBILITY_STATUS_ELIGIBLE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[MigrationEligibilityStatus.MIGRATION_ELIGIBILITY_STATUS_PENDING_VERIFICATION.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[MigrationEligibilityStatus.MIGRATION_ELIGIBILITY_STATUS_ALREADY_MIGRATING.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[MigrationEligibilityStatus.MIGRATION_ELIGIBILITY_STATUS_MIGRATION_COMPLETED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[MigrationEligibilityStatus.MIGRATION_ELIGIBILITY_STATUS_VERIFICATION_FAILED.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[MigrationEligibilityStatus.MIGRATION_ELIGIBILITY_STATUS_NOT_ELIGIBLE.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[MigrationEligibilityStatus.MIGRATION_ELIGIBILITY_STATUS_PARTNER_NOT_SUPPORTED.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[MigrationEligibilityStatus.MIGRATION_ELIGIBILITY_STATUS_INTERNAL_ERROR.ordinal()] = 9;
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

        public final KSerializer<MigrationEligibilityStatusDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MigrationEligibilityStatusDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MigrationEligibilityStatusDto> getBinaryBase64Serializer() {
            return (KSerializer) MigrationEligibilityStatusDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<MigrationEligibilityStatus> getProtoAdapter() {
            return MigrationEligibilityStatus.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MigrationEligibilityStatusDto getZeroValue() {
            return MigrationEligibilityStatusDto.MIGRATION_ELIGIBILITY_STATUS_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MigrationEligibilityStatusDto fromProto(MigrationEligibilityStatus proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return MigrationEligibilityStatusDto.MIGRATION_ELIGIBILITY_STATUS_UNSPECIFIED;
                case 2:
                    return MigrationEligibilityStatusDto.MIGRATION_ELIGIBILITY_STATUS_ELIGIBLE;
                case 3:
                    return MigrationEligibilityStatusDto.MIGRATION_ELIGIBILITY_STATUS_PENDING_VERIFICATION;
                case 4:
                    return MigrationEligibilityStatusDto.MIGRATION_ELIGIBILITY_STATUS_ALREADY_MIGRATING;
                case 5:
                    return MigrationEligibilityStatusDto.MIGRATION_ELIGIBILITY_STATUS_MIGRATION_COMPLETED;
                case 6:
                    return MigrationEligibilityStatusDto.MIGRATION_ELIGIBILITY_STATUS_VERIFICATION_FAILED;
                case 7:
                    return MigrationEligibilityStatusDto.MIGRATION_ELIGIBILITY_STATUS_NOT_ELIGIBLE;
                case 8:
                    return MigrationEligibilityStatusDto.MIGRATION_ELIGIBILITY_STATUS_PARTNER_NOT_SUPPORTED;
                case 9:
                    return MigrationEligibilityStatusDto.MIGRATION_ELIGIBILITY_STATUS_INTERNAL_ERROR;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: MigrationEligibilityStatusDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcrypto_portkey/service/v1/MigrationEligibilityStatusDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcrypto_portkey/service/v1/MigrationEligibilityStatusDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<MigrationEligibilityStatusDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<MigrationEligibilityStatusDto, MigrationEligibilityStatus> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/crypto_portkey.service.v1.MigrationEligibilityStatus", MigrationEligibilityStatusDto.getEntries(), MigrationEligibilityStatusDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public MigrationEligibilityStatusDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (MigrationEligibilityStatusDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, MigrationEligibilityStatusDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static MigrationEligibilityStatusDto valueOf(String str) {
        return (MigrationEligibilityStatusDto) Enum.valueOf(MigrationEligibilityStatusDto.class, str);
    }

    public static MigrationEligibilityStatusDto[] values() {
        return (MigrationEligibilityStatusDto[]) $VALUES.clone();
    }
}
