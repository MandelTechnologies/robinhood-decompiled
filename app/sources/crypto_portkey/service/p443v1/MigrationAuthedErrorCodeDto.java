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
/* compiled from: MigrationAuthedErrorCodeDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u001a\u001bB\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u001c"}, m3636d2 = {"Lcrypto_portkey/service/v1/MigrationAuthedErrorCodeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcrypto_portkey/service/v1/MigrationAuthedErrorCode;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "MIGRATION_AUTHED_ERROR_CODE_UNSPECIFIED", "MIGRATION_AUTHED_ERROR_CODE_MIGRATION_NOT_FOUND", "MIGRATION_AUTHED_ERROR_CODE_INVALID_MIGRATION_STATE", "MIGRATION_AUTHED_ERROR_CODE_PARTNER_API_ERROR", "MIGRATION_AUTHED_ERROR_CODE_NUMMUS_ERROR", "MIGRATION_AUTHED_ERROR_CODE_FSM_ERROR", "MIGRATION_AUTHED_ERROR_CODE_MISSING_DATA", "MIGRATION_AUTHED_ERROR_CODE_INVALID_REQUEST", "MIGRATION_AUTHED_ERROR_CODE_INTERNAL_ERROR", "MIGRATION_AUTHED_ERROR_CODE_RETRYABLE", "MIGRATION_AUTHED_ERROR_CODE_NON_RETRYABLE", "MIGRATION_AUTHED_ERROR_CODE_NON_RETRYABLE_CONTACT_SUPPORT", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes18.dex */
public abstract class MigrationAuthedErrorCodeDto implements Dto2<MigrationAuthedErrorCode>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MigrationAuthedErrorCodeDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<MigrationAuthedErrorCodeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<MigrationAuthedErrorCodeDto, MigrationAuthedErrorCode>> binaryBase64Serializer$delegate;
    public static final MigrationAuthedErrorCodeDto MIGRATION_AUTHED_ERROR_CODE_UNSPECIFIED = new MigrationAuthedErrorCodeDto("MIGRATION_AUTHED_ERROR_CODE_UNSPECIFIED", 0) { // from class: crypto_portkey.service.v1.MigrationAuthedErrorCodeDto.MIGRATION_AUTHED_ERROR_CODE_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MigrationAuthedErrorCode toProto() {
            return MigrationAuthedErrorCode.MIGRATION_AUTHED_ERROR_CODE_UNSPECIFIED;
        }
    };
    public static final MigrationAuthedErrorCodeDto MIGRATION_AUTHED_ERROR_CODE_MIGRATION_NOT_FOUND = new MigrationAuthedErrorCodeDto("MIGRATION_AUTHED_ERROR_CODE_MIGRATION_NOT_FOUND", 1) { // from class: crypto_portkey.service.v1.MigrationAuthedErrorCodeDto.MIGRATION_AUTHED_ERROR_CODE_MIGRATION_NOT_FOUND
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MigrationAuthedErrorCode toProto() {
            return MigrationAuthedErrorCode.MIGRATION_AUTHED_ERROR_CODE_MIGRATION_NOT_FOUND;
        }
    };
    public static final MigrationAuthedErrorCodeDto MIGRATION_AUTHED_ERROR_CODE_INVALID_MIGRATION_STATE = new MigrationAuthedErrorCodeDto("MIGRATION_AUTHED_ERROR_CODE_INVALID_MIGRATION_STATE", 2) { // from class: crypto_portkey.service.v1.MigrationAuthedErrorCodeDto.MIGRATION_AUTHED_ERROR_CODE_INVALID_MIGRATION_STATE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MigrationAuthedErrorCode toProto() {
            return MigrationAuthedErrorCode.MIGRATION_AUTHED_ERROR_CODE_INVALID_MIGRATION_STATE;
        }
    };
    public static final MigrationAuthedErrorCodeDto MIGRATION_AUTHED_ERROR_CODE_PARTNER_API_ERROR = new MigrationAuthedErrorCodeDto("MIGRATION_AUTHED_ERROR_CODE_PARTNER_API_ERROR", 3) { // from class: crypto_portkey.service.v1.MigrationAuthedErrorCodeDto.MIGRATION_AUTHED_ERROR_CODE_PARTNER_API_ERROR
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MigrationAuthedErrorCode toProto() {
            return MigrationAuthedErrorCode.MIGRATION_AUTHED_ERROR_CODE_PARTNER_API_ERROR;
        }
    };
    public static final MigrationAuthedErrorCodeDto MIGRATION_AUTHED_ERROR_CODE_NUMMUS_ERROR = new MigrationAuthedErrorCodeDto("MIGRATION_AUTHED_ERROR_CODE_NUMMUS_ERROR", 4) { // from class: crypto_portkey.service.v1.MigrationAuthedErrorCodeDto.MIGRATION_AUTHED_ERROR_CODE_NUMMUS_ERROR
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MigrationAuthedErrorCode toProto() {
            return MigrationAuthedErrorCode.MIGRATION_AUTHED_ERROR_CODE_NUMMUS_ERROR;
        }
    };
    public static final MigrationAuthedErrorCodeDto MIGRATION_AUTHED_ERROR_CODE_FSM_ERROR = new MigrationAuthedErrorCodeDto("MIGRATION_AUTHED_ERROR_CODE_FSM_ERROR", 5) { // from class: crypto_portkey.service.v1.MigrationAuthedErrorCodeDto.MIGRATION_AUTHED_ERROR_CODE_FSM_ERROR
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MigrationAuthedErrorCode toProto() {
            return MigrationAuthedErrorCode.MIGRATION_AUTHED_ERROR_CODE_FSM_ERROR;
        }
    };
    public static final MigrationAuthedErrorCodeDto MIGRATION_AUTHED_ERROR_CODE_MISSING_DATA = new MigrationAuthedErrorCodeDto("MIGRATION_AUTHED_ERROR_CODE_MISSING_DATA", 6) { // from class: crypto_portkey.service.v1.MigrationAuthedErrorCodeDto.MIGRATION_AUTHED_ERROR_CODE_MISSING_DATA
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MigrationAuthedErrorCode toProto() {
            return MigrationAuthedErrorCode.MIGRATION_AUTHED_ERROR_CODE_MISSING_DATA;
        }
    };
    public static final MigrationAuthedErrorCodeDto MIGRATION_AUTHED_ERROR_CODE_INVALID_REQUEST = new MigrationAuthedErrorCodeDto("MIGRATION_AUTHED_ERROR_CODE_INVALID_REQUEST", 7) { // from class: crypto_portkey.service.v1.MigrationAuthedErrorCodeDto.MIGRATION_AUTHED_ERROR_CODE_INVALID_REQUEST
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MigrationAuthedErrorCode toProto() {
            return MigrationAuthedErrorCode.MIGRATION_AUTHED_ERROR_CODE_INVALID_REQUEST;
        }
    };
    public static final MigrationAuthedErrorCodeDto MIGRATION_AUTHED_ERROR_CODE_INTERNAL_ERROR = new MigrationAuthedErrorCodeDto("MIGRATION_AUTHED_ERROR_CODE_INTERNAL_ERROR", 8) { // from class: crypto_portkey.service.v1.MigrationAuthedErrorCodeDto.MIGRATION_AUTHED_ERROR_CODE_INTERNAL_ERROR
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MigrationAuthedErrorCode toProto() {
            return MigrationAuthedErrorCode.MIGRATION_AUTHED_ERROR_CODE_INTERNAL_ERROR;
        }
    };
    public static final MigrationAuthedErrorCodeDto MIGRATION_AUTHED_ERROR_CODE_RETRYABLE = new MigrationAuthedErrorCodeDto("MIGRATION_AUTHED_ERROR_CODE_RETRYABLE", 9) { // from class: crypto_portkey.service.v1.MigrationAuthedErrorCodeDto.MIGRATION_AUTHED_ERROR_CODE_RETRYABLE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MigrationAuthedErrorCode toProto() {
            return MigrationAuthedErrorCode.MIGRATION_AUTHED_ERROR_CODE_RETRYABLE;
        }
    };
    public static final MigrationAuthedErrorCodeDto MIGRATION_AUTHED_ERROR_CODE_NON_RETRYABLE = new MigrationAuthedErrorCodeDto("MIGRATION_AUTHED_ERROR_CODE_NON_RETRYABLE", 10) { // from class: crypto_portkey.service.v1.MigrationAuthedErrorCodeDto.MIGRATION_AUTHED_ERROR_CODE_NON_RETRYABLE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MigrationAuthedErrorCode toProto() {
            return MigrationAuthedErrorCode.MIGRATION_AUTHED_ERROR_CODE_NON_RETRYABLE;
        }
    };
    public static final MigrationAuthedErrorCodeDto MIGRATION_AUTHED_ERROR_CODE_NON_RETRYABLE_CONTACT_SUPPORT = new MigrationAuthedErrorCodeDto("MIGRATION_AUTHED_ERROR_CODE_NON_RETRYABLE_CONTACT_SUPPORT", 11) { // from class: crypto_portkey.service.v1.MigrationAuthedErrorCodeDto.MIGRATION_AUTHED_ERROR_CODE_NON_RETRYABLE_CONTACT_SUPPORT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MigrationAuthedErrorCode toProto() {
            return MigrationAuthedErrorCode.MIGRATION_AUTHED_ERROR_CODE_NON_RETRYABLE_CONTACT_SUPPORT;
        }
    };

    private static final /* synthetic */ MigrationAuthedErrorCodeDto[] $values() {
        return new MigrationAuthedErrorCodeDto[]{MIGRATION_AUTHED_ERROR_CODE_UNSPECIFIED, MIGRATION_AUTHED_ERROR_CODE_MIGRATION_NOT_FOUND, MIGRATION_AUTHED_ERROR_CODE_INVALID_MIGRATION_STATE, MIGRATION_AUTHED_ERROR_CODE_PARTNER_API_ERROR, MIGRATION_AUTHED_ERROR_CODE_NUMMUS_ERROR, MIGRATION_AUTHED_ERROR_CODE_FSM_ERROR, MIGRATION_AUTHED_ERROR_CODE_MISSING_DATA, MIGRATION_AUTHED_ERROR_CODE_INVALID_REQUEST, MIGRATION_AUTHED_ERROR_CODE_INTERNAL_ERROR, MIGRATION_AUTHED_ERROR_CODE_RETRYABLE, MIGRATION_AUTHED_ERROR_CODE_NON_RETRYABLE, MIGRATION_AUTHED_ERROR_CODE_NON_RETRYABLE_CONTACT_SUPPORT};
    }

    public /* synthetic */ MigrationAuthedErrorCodeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<MigrationAuthedErrorCodeDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private MigrationAuthedErrorCodeDto(String str, int i) {
    }

    static {
        MigrationAuthedErrorCodeDto[] migrationAuthedErrorCodeDtoArr$values = $values();
        $VALUES = migrationAuthedErrorCodeDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(migrationAuthedErrorCodeDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: crypto_portkey.service.v1.MigrationAuthedErrorCodeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MigrationAuthedErrorCodeDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: MigrationAuthedErrorCodeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcrypto_portkey/service/v1/MigrationAuthedErrorCodeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcrypto_portkey/service/v1/MigrationAuthedErrorCodeDto;", "Lcrypto_portkey/service/v1/MigrationAuthedErrorCode;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcrypto_portkey/service/v1/MigrationAuthedErrorCodeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<MigrationAuthedErrorCodeDto, MigrationAuthedErrorCode> {

        /* compiled from: MigrationAuthedErrorCodeDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MigrationAuthedErrorCode.values().length];
                try {
                    iArr[MigrationAuthedErrorCode.MIGRATION_AUTHED_ERROR_CODE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MigrationAuthedErrorCode.MIGRATION_AUTHED_ERROR_CODE_MIGRATION_NOT_FOUND.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[MigrationAuthedErrorCode.MIGRATION_AUTHED_ERROR_CODE_INVALID_MIGRATION_STATE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[MigrationAuthedErrorCode.MIGRATION_AUTHED_ERROR_CODE_PARTNER_API_ERROR.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[MigrationAuthedErrorCode.MIGRATION_AUTHED_ERROR_CODE_NUMMUS_ERROR.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[MigrationAuthedErrorCode.MIGRATION_AUTHED_ERROR_CODE_FSM_ERROR.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[MigrationAuthedErrorCode.MIGRATION_AUTHED_ERROR_CODE_MISSING_DATA.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[MigrationAuthedErrorCode.MIGRATION_AUTHED_ERROR_CODE_INVALID_REQUEST.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[MigrationAuthedErrorCode.MIGRATION_AUTHED_ERROR_CODE_INTERNAL_ERROR.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[MigrationAuthedErrorCode.MIGRATION_AUTHED_ERROR_CODE_RETRYABLE.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[MigrationAuthedErrorCode.MIGRATION_AUTHED_ERROR_CODE_NON_RETRYABLE.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[MigrationAuthedErrorCode.MIGRATION_AUTHED_ERROR_CODE_NON_RETRYABLE_CONTACT_SUPPORT.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MigrationAuthedErrorCodeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MigrationAuthedErrorCodeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MigrationAuthedErrorCodeDto> getBinaryBase64Serializer() {
            return (KSerializer) MigrationAuthedErrorCodeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<MigrationAuthedErrorCode> getProtoAdapter() {
            return MigrationAuthedErrorCode.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MigrationAuthedErrorCodeDto getZeroValue() {
            return MigrationAuthedErrorCodeDto.MIGRATION_AUTHED_ERROR_CODE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MigrationAuthedErrorCodeDto fromProto(MigrationAuthedErrorCode proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return MigrationAuthedErrorCodeDto.MIGRATION_AUTHED_ERROR_CODE_UNSPECIFIED;
                case 2:
                    return MigrationAuthedErrorCodeDto.MIGRATION_AUTHED_ERROR_CODE_MIGRATION_NOT_FOUND;
                case 3:
                    return MigrationAuthedErrorCodeDto.MIGRATION_AUTHED_ERROR_CODE_INVALID_MIGRATION_STATE;
                case 4:
                    return MigrationAuthedErrorCodeDto.MIGRATION_AUTHED_ERROR_CODE_PARTNER_API_ERROR;
                case 5:
                    return MigrationAuthedErrorCodeDto.MIGRATION_AUTHED_ERROR_CODE_NUMMUS_ERROR;
                case 6:
                    return MigrationAuthedErrorCodeDto.MIGRATION_AUTHED_ERROR_CODE_FSM_ERROR;
                case 7:
                    return MigrationAuthedErrorCodeDto.MIGRATION_AUTHED_ERROR_CODE_MISSING_DATA;
                case 8:
                    return MigrationAuthedErrorCodeDto.MIGRATION_AUTHED_ERROR_CODE_INVALID_REQUEST;
                case 9:
                    return MigrationAuthedErrorCodeDto.MIGRATION_AUTHED_ERROR_CODE_INTERNAL_ERROR;
                case 10:
                    return MigrationAuthedErrorCodeDto.MIGRATION_AUTHED_ERROR_CODE_RETRYABLE;
                case 11:
                    return MigrationAuthedErrorCodeDto.MIGRATION_AUTHED_ERROR_CODE_NON_RETRYABLE;
                case 12:
                    return MigrationAuthedErrorCodeDto.MIGRATION_AUTHED_ERROR_CODE_NON_RETRYABLE_CONTACT_SUPPORT;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: MigrationAuthedErrorCodeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcrypto_portkey/service/v1/MigrationAuthedErrorCodeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcrypto_portkey/service/v1/MigrationAuthedErrorCodeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<MigrationAuthedErrorCodeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<MigrationAuthedErrorCodeDto, MigrationAuthedErrorCode> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/crypto_portkey.service.v1.MigrationAuthedErrorCode", MigrationAuthedErrorCodeDto.getEntries(), MigrationAuthedErrorCodeDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public MigrationAuthedErrorCodeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (MigrationAuthedErrorCodeDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, MigrationAuthedErrorCodeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static MigrationAuthedErrorCodeDto valueOf(String str) {
        return (MigrationAuthedErrorCodeDto) Enum.valueOf(MigrationAuthedErrorCodeDto.class, str);
    }

    public static MigrationAuthedErrorCodeDto[] values() {
        return (MigrationAuthedErrorCodeDto[]) $VALUES.clone();
    }
}
