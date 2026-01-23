package rosetta.account;

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
/* compiled from: BrokerageAccountTypeDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u001c\u001dB\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u001e"}, m3636d2 = {"Lrosetta/account/BrokerageAccountTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lrosetta/account/BrokerageAccountType;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED", "INDIVIDUAL", "IRA_TRADITIONAL", "IRA_ROTH", "IRA_TRADITIONAL_INHERITED", "IRA_ROTH_INHERITED", "JOINT_TENANCY_WITH_ROS", "CUSTODIAL_UGMA", "CUSTODIAL_UTMA", "ISA_STOCKS_AND_SHARES", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.account_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public abstract class BrokerageAccountTypeDto implements Dto2<BrokerageAccountType>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BrokerageAccountTypeDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<BrokerageAccountTypeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<BrokerageAccountTypeDto, BrokerageAccountType>> binaryBase64Serializer$delegate;
    private final String json_value;
    public static final BrokerageAccountTypeDto BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED = new BrokerageAccountTypeDto("BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED", 0) { // from class: rosetta.account.BrokerageAccountTypeDto.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BrokerageAccountType toProto() {
            return BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED;
        }
    };
    public static final BrokerageAccountTypeDto INDIVIDUAL = new BrokerageAccountTypeDto("INDIVIDUAL", 1) { // from class: rosetta.account.BrokerageAccountTypeDto.INDIVIDUAL
        {
            String str = "individual";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BrokerageAccountType toProto() {
            return BrokerageAccountType.INDIVIDUAL;
        }
    };
    public static final BrokerageAccountTypeDto IRA_TRADITIONAL = new BrokerageAccountTypeDto("IRA_TRADITIONAL", 2) { // from class: rosetta.account.BrokerageAccountTypeDto.IRA_TRADITIONAL
        {
            String str = "ira_traditional";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BrokerageAccountType toProto() {
            return BrokerageAccountType.IRA_TRADITIONAL;
        }
    };
    public static final BrokerageAccountTypeDto IRA_ROTH = new BrokerageAccountTypeDto("IRA_ROTH", 3) { // from class: rosetta.account.BrokerageAccountTypeDto.IRA_ROTH
        {
            String str = "ira_roth";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BrokerageAccountType toProto() {
            return BrokerageAccountType.IRA_ROTH;
        }
    };
    public static final BrokerageAccountTypeDto IRA_TRADITIONAL_INHERITED = new BrokerageAccountTypeDto("IRA_TRADITIONAL_INHERITED", 4) { // from class: rosetta.account.BrokerageAccountTypeDto.IRA_TRADITIONAL_INHERITED
        {
            String str = "ira_traditional_inherited";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BrokerageAccountType toProto() {
            return BrokerageAccountType.IRA_TRADITIONAL_INHERITED;
        }
    };
    public static final BrokerageAccountTypeDto IRA_ROTH_INHERITED = new BrokerageAccountTypeDto("IRA_ROTH_INHERITED", 5) { // from class: rosetta.account.BrokerageAccountTypeDto.IRA_ROTH_INHERITED
        {
            String str = "ira_roth_inherited";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BrokerageAccountType toProto() {
            return BrokerageAccountType.IRA_ROTH_INHERITED;
        }
    };
    public static final BrokerageAccountTypeDto JOINT_TENANCY_WITH_ROS = new BrokerageAccountTypeDto("JOINT_TENANCY_WITH_ROS", 6) { // from class: rosetta.account.BrokerageAccountTypeDto.JOINT_TENANCY_WITH_ROS
        {
            String str = "joint_tenancy_with_ros";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BrokerageAccountType toProto() {
            return BrokerageAccountType.JOINT_TENANCY_WITH_ROS;
        }
    };
    public static final BrokerageAccountTypeDto CUSTODIAL_UGMA = new BrokerageAccountTypeDto("CUSTODIAL_UGMA", 7) { // from class: rosetta.account.BrokerageAccountTypeDto.CUSTODIAL_UGMA
        {
            String str = "custodial_ugma";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BrokerageAccountType toProto() {
            return BrokerageAccountType.CUSTODIAL_UGMA;
        }
    };
    public static final BrokerageAccountTypeDto CUSTODIAL_UTMA = new BrokerageAccountTypeDto("CUSTODIAL_UTMA", 8) { // from class: rosetta.account.BrokerageAccountTypeDto.CUSTODIAL_UTMA
        {
            String str = "custodial_utma";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BrokerageAccountType toProto() {
            return BrokerageAccountType.CUSTODIAL_UTMA;
        }
    };
    public static final BrokerageAccountTypeDto ISA_STOCKS_AND_SHARES = new BrokerageAccountTypeDto("ISA_STOCKS_AND_SHARES", 9) { // from class: rosetta.account.BrokerageAccountTypeDto.ISA_STOCKS_AND_SHARES
        {
            String str = "isa_stocks_and_shares";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BrokerageAccountType toProto() {
            return BrokerageAccountType.ISA_STOCKS_AND_SHARES;
        }
    };

    private static final /* synthetic */ BrokerageAccountTypeDto[] $values() {
        return new BrokerageAccountTypeDto[]{BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED, INDIVIDUAL, IRA_TRADITIONAL, IRA_ROTH, IRA_TRADITIONAL_INHERITED, IRA_ROTH_INHERITED, JOINT_TENANCY_WITH_ROS, CUSTODIAL_UGMA, CUSTODIAL_UTMA, ISA_STOCKS_AND_SHARES};
    }

    public /* synthetic */ BrokerageAccountTypeDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    public static EnumEntries<BrokerageAccountTypeDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private BrokerageAccountTypeDto(String str, int i, String str2) {
        this.json_value = str2;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    static {
        BrokerageAccountTypeDto[] brokerageAccountTypeDtoArr$values = $values();
        $VALUES = brokerageAccountTypeDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(brokerageAccountTypeDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rosetta.account.BrokerageAccountTypeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BrokerageAccountTypeDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: BrokerageAccountTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrosetta/account/BrokerageAccountTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrosetta/account/BrokerageAccountTypeDto;", "Lrosetta/account/BrokerageAccountType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrosetta/account/BrokerageAccountTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.account_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<BrokerageAccountTypeDto, BrokerageAccountType> {

        /* compiled from: BrokerageAccountTypeDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[BrokerageAccountType.values().length];
                try {
                    iArr[BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[BrokerageAccountType.INDIVIDUAL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[BrokerageAccountType.IRA_TRADITIONAL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[BrokerageAccountType.IRA_ROTH.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[BrokerageAccountType.IRA_TRADITIONAL_INHERITED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[BrokerageAccountType.IRA_ROTH_INHERITED.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[BrokerageAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[BrokerageAccountType.CUSTODIAL_UGMA.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[BrokerageAccountType.CUSTODIAL_UTMA.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[BrokerageAccountType.ISA_STOCKS_AND_SHARES.ordinal()] = 10;
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

        public final KSerializer<BrokerageAccountTypeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BrokerageAccountTypeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BrokerageAccountTypeDto> getBinaryBase64Serializer() {
            return (KSerializer) BrokerageAccountTypeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<BrokerageAccountType> getProtoAdapter() {
            return BrokerageAccountType.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BrokerageAccountTypeDto getZeroValue() {
            return BrokerageAccountTypeDto.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BrokerageAccountTypeDto fromProto(BrokerageAccountType proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return BrokerageAccountTypeDto.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED;
                case 2:
                    return BrokerageAccountTypeDto.INDIVIDUAL;
                case 3:
                    return BrokerageAccountTypeDto.IRA_TRADITIONAL;
                case 4:
                    return BrokerageAccountTypeDto.IRA_ROTH;
                case 5:
                    return BrokerageAccountTypeDto.IRA_TRADITIONAL_INHERITED;
                case 6:
                    return BrokerageAccountTypeDto.IRA_ROTH_INHERITED;
                case 7:
                    return BrokerageAccountTypeDto.JOINT_TENANCY_WITH_ROS;
                case 8:
                    return BrokerageAccountTypeDto.CUSTODIAL_UGMA;
                case 9:
                    return BrokerageAccountTypeDto.CUSTODIAL_UTMA;
                case 10:
                    return BrokerageAccountTypeDto.ISA_STOCKS_AND_SHARES;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: BrokerageAccountTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrosetta/account/BrokerageAccountTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrosetta/account/BrokerageAccountTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.account_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Serializer implements KSerializer<BrokerageAccountTypeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<BrokerageAccountTypeDto, BrokerageAccountType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.account.BrokerageAccountType", BrokerageAccountTypeDto.getEntries(), BrokerageAccountTypeDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public BrokerageAccountTypeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (BrokerageAccountTypeDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, BrokerageAccountTypeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static BrokerageAccountTypeDto valueOf(String str) {
        return (BrokerageAccountTypeDto) Enum.valueOf(BrokerageAccountTypeDto.class, str);
    }

    public static BrokerageAccountTypeDto[] values() {
        return (BrokerageAccountTypeDto[]) $VALUES.clone();
    }
}
