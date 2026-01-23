package crypto_perpetuals.common.p435v1;

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
/* compiled from: AccountStatusDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0018\u0019B\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u001a"}, m3636d2 = {"Lcrypto_perpetuals/common/v1/AccountStatusDto;", "Lcom/robinhood/idl/EnumDto;", "Lcrypto_perpetuals/common/v1/AccountStatus;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "ACCOUNT_STATUS_UNSPECIFIED", "ACCOUNT_STATUS_ACTIVE", "ACCOUNT_STATUS_INACTIVE", "ACCOUNT_STATUS_POSITION_REDUCING_ONLY", "ACCOUNT_STATUS_PENDING_APPROVAL", "ACCOUNT_STATUS_ACCOUNT_NOT_FOUND", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "crypto_perpetuals.common.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes18.dex */
public abstract class AccountStatusDto implements Dto2<AccountStatus>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AccountStatusDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<AccountStatusDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AccountStatusDto, AccountStatus>> binaryBase64Serializer$delegate;
    private final String json_value;
    public static final AccountStatusDto ACCOUNT_STATUS_UNSPECIFIED = new AccountStatusDto("ACCOUNT_STATUS_UNSPECIFIED", 0) { // from class: crypto_perpetuals.common.v1.AccountStatusDto.ACCOUNT_STATUS_UNSPECIFIED
        {
            String str = "unspecified";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AccountStatus toProto() {
            return AccountStatus.ACCOUNT_STATUS_UNSPECIFIED;
        }
    };
    public static final AccountStatusDto ACCOUNT_STATUS_ACTIVE = new AccountStatusDto("ACCOUNT_STATUS_ACTIVE", 1) { // from class: crypto_perpetuals.common.v1.AccountStatusDto.ACCOUNT_STATUS_ACTIVE
        {
            String str = "active";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AccountStatus toProto() {
            return AccountStatus.ACCOUNT_STATUS_ACTIVE;
        }
    };
    public static final AccountStatusDto ACCOUNT_STATUS_INACTIVE = new AccountStatusDto("ACCOUNT_STATUS_INACTIVE", 2) { // from class: crypto_perpetuals.common.v1.AccountStatusDto.ACCOUNT_STATUS_INACTIVE
        {
            String str = Instrument.STATE_INACTIVE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AccountStatus toProto() {
            return AccountStatus.ACCOUNT_STATUS_INACTIVE;
        }
    };
    public static final AccountStatusDto ACCOUNT_STATUS_POSITION_REDUCING_ONLY = new AccountStatusDto("ACCOUNT_STATUS_POSITION_REDUCING_ONLY", 3) { // from class: crypto_perpetuals.common.v1.AccountStatusDto.ACCOUNT_STATUS_POSITION_REDUCING_ONLY
        {
            String str = "position_reducing_only";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AccountStatus toProto() {
            return AccountStatus.ACCOUNT_STATUS_POSITION_REDUCING_ONLY;
        }
    };
    public static final AccountStatusDto ACCOUNT_STATUS_PENDING_APPROVAL = new AccountStatusDto("ACCOUNT_STATUS_PENDING_APPROVAL", 4) { // from class: crypto_perpetuals.common.v1.AccountStatusDto.ACCOUNT_STATUS_PENDING_APPROVAL
        {
            String str = "pending_approval";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AccountStatus toProto() {
            return AccountStatus.ACCOUNT_STATUS_PENDING_APPROVAL;
        }
    };
    public static final AccountStatusDto ACCOUNT_STATUS_ACCOUNT_NOT_FOUND = new AccountStatusDto("ACCOUNT_STATUS_ACCOUNT_NOT_FOUND", 5) { // from class: crypto_perpetuals.common.v1.AccountStatusDto.ACCOUNT_STATUS_ACCOUNT_NOT_FOUND
        {
            String str = "account_not_found";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AccountStatus toProto() {
            return AccountStatus.ACCOUNT_STATUS_ACCOUNT_NOT_FOUND;
        }
    };

    private static final /* synthetic */ AccountStatusDto[] $values() {
        return new AccountStatusDto[]{ACCOUNT_STATUS_UNSPECIFIED, ACCOUNT_STATUS_ACTIVE, ACCOUNT_STATUS_INACTIVE, ACCOUNT_STATUS_POSITION_REDUCING_ONLY, ACCOUNT_STATUS_PENDING_APPROVAL, ACCOUNT_STATUS_ACCOUNT_NOT_FOUND};
    }

    public /* synthetic */ AccountStatusDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    public static EnumEntries<AccountStatusDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AccountStatusDto(String str, int i, String str2) {
        this.json_value = str2;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    static {
        AccountStatusDto[] accountStatusDtoArr$values = $values();
        $VALUES = accountStatusDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(accountStatusDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: crypto_perpetuals.common.v1.AccountStatusDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountStatusDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: AccountStatusDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcrypto_perpetuals/common/v1/AccountStatusDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcrypto_perpetuals/common/v1/AccountStatusDto;", "Lcrypto_perpetuals/common/v1/AccountStatus;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcrypto_perpetuals/common/v1/AccountStatusDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_perpetuals.common.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<AccountStatusDto, AccountStatus> {

        /* compiled from: AccountStatusDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AccountStatus.values().length];
                try {
                    iArr[AccountStatus.ACCOUNT_STATUS_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AccountStatus.ACCOUNT_STATUS_ACTIVE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AccountStatus.ACCOUNT_STATUS_INACTIVE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AccountStatus.ACCOUNT_STATUS_POSITION_REDUCING_ONLY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AccountStatus.ACCOUNT_STATUS_PENDING_APPROVAL.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[AccountStatus.ACCOUNT_STATUS_ACCOUNT_NOT_FOUND.ordinal()] = 6;
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

        public final KSerializer<AccountStatusDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AccountStatusDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AccountStatusDto> getBinaryBase64Serializer() {
            return (KSerializer) AccountStatusDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AccountStatus> getProtoAdapter() {
            return AccountStatus.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AccountStatusDto getZeroValue() {
            return AccountStatusDto.ACCOUNT_STATUS_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AccountStatusDto fromProto(AccountStatus proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return AccountStatusDto.ACCOUNT_STATUS_UNSPECIFIED;
                case 2:
                    return AccountStatusDto.ACCOUNT_STATUS_ACTIVE;
                case 3:
                    return AccountStatusDto.ACCOUNT_STATUS_INACTIVE;
                case 4:
                    return AccountStatusDto.ACCOUNT_STATUS_POSITION_REDUCING_ONLY;
                case 5:
                    return AccountStatusDto.ACCOUNT_STATUS_PENDING_APPROVAL;
                case 6:
                    return AccountStatusDto.ACCOUNT_STATUS_ACCOUNT_NOT_FOUND;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AccountStatusDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcrypto_perpetuals/common/v1/AccountStatusDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcrypto_perpetuals/common/v1/AccountStatusDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "crypto_perpetuals.common.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<AccountStatusDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<AccountStatusDto, AccountStatus> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/crypto_perpetuals.common.v1.AccountStatus", AccountStatusDto.getEntries(), AccountStatusDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public AccountStatusDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (AccountStatusDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AccountStatusDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static AccountStatusDto valueOf(String str) {
        return (AccountStatusDto) Enum.valueOf(AccountStatusDto.class, str);
    }

    public static AccountStatusDto[] values() {
        return (AccountStatusDto[]) $VALUES.clone();
    }
}
