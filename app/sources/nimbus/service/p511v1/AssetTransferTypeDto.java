package nimbus.service.p511v1;

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
/* compiled from: AssetTransferTypeDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002./B\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020,H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&¨\u00060"}, m3636d2 = {"Lnimbus/service/v1/AssetTransferTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lnimbus/service/v1/AssetTransferType;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "TYPE_UNSPECIFIED", "INDIVIDUAL_TO_JOINT", "JOINT_TO_INDIVIDUAL", "INDIVIDUAL_TO_INDIVIDUAL", "INDIVIDUAL_TO_MANAGED_INDIVIDUAL", "JOINT_TO_MANAGED_INDIVIDUAL", "IRA_TRADITIONAL_TO_IRA_TRADITIONAL", "IRA_ROTH_TO_IRA_ROTH", "IRA_TRADITIONAL_TO_MANAGED_IRA_TRADITIONAL", "IRA_ROTH_TO_MANAGED_IRA_ROTH", "INDIVIDUAL_TO_CUSTODIAL_UTMA", "INDIVIDUAL_TO_CUSTODIAL_UGMA", "JOINT_TO_CUSTODIAL_UTMA", "JOINT_TO_CUSTODIAL_UGMA", "CUSTODIAL_UTMA_TO_CUSTODIAL_UTMA", "CUSTODIAL_UGMA_TO_CUSTODIAL_UGMA", "CUSTODIAL_UTMA_TO_MANAGED_CUSTODIAL_UTMA", "CUSTODIAL_UGMA_TO_MANAGED_CUSTODIAL_UGMA", "CUSTODIAL_UTMA_TO_INDIVIDUAL", "CUSTODIAL_UGMA_TO_INDIVIDUAL", "CUSTODIAL_UTMA_TO_MANAGED_INDIVIDUAL", "CUSTODIAL_UGMA_TO_MANAGED_INDIVIDUAL", "CUSTODIAL_UTMA_TO_JOINT", "CUSTODIAL_UGMA_TO_JOINT", "INDIVIDUAL_TO_MANAGED_CUSTODIAL_UTMA", "INDIVIDUAL_TO_MANAGED_CUSTODIAL_UGMA", "JOINT_TO_MANAGED_CUSTODIAL_UTMA", "JOINT_TO_MANAGED_CUSTODIAL_UGMA", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public abstract class AssetTransferTypeDto implements Dto2<AssetTransferType>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AssetTransferTypeDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<AssetTransferTypeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AssetTransferTypeDto, AssetTransferType>> binaryBase64Serializer$delegate;
    private final String json_value;
    public static final AssetTransferTypeDto TYPE_UNSPECIFIED = new AssetTransferTypeDto("TYPE_UNSPECIFIED", 0) { // from class: nimbus.service.v1.AssetTransferTypeDto.TYPE_UNSPECIFIED
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferType toProto() {
            return AssetTransferType.TYPE_UNSPECIFIED;
        }
    };
    public static final AssetTransferTypeDto INDIVIDUAL_TO_JOINT = new AssetTransferTypeDto("INDIVIDUAL_TO_JOINT", 1) { // from class: nimbus.service.v1.AssetTransferTypeDto.INDIVIDUAL_TO_JOINT
        {
            String str = "individual_to_joint";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferType toProto() {
            return AssetTransferType.INDIVIDUAL_TO_JOINT;
        }
    };
    public static final AssetTransferTypeDto JOINT_TO_INDIVIDUAL = new AssetTransferTypeDto("JOINT_TO_INDIVIDUAL", 2) { // from class: nimbus.service.v1.AssetTransferTypeDto.JOINT_TO_INDIVIDUAL
        {
            String str = "joint_to_individual";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferType toProto() {
            return AssetTransferType.JOINT_TO_INDIVIDUAL;
        }
    };
    public static final AssetTransferTypeDto INDIVIDUAL_TO_INDIVIDUAL = new AssetTransferTypeDto("INDIVIDUAL_TO_INDIVIDUAL", 3) { // from class: nimbus.service.v1.AssetTransferTypeDto.INDIVIDUAL_TO_INDIVIDUAL
        {
            String str = "individual_to_individual";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferType toProto() {
            return AssetTransferType.INDIVIDUAL_TO_INDIVIDUAL;
        }
    };
    public static final AssetTransferTypeDto INDIVIDUAL_TO_MANAGED_INDIVIDUAL = new AssetTransferTypeDto("INDIVIDUAL_TO_MANAGED_INDIVIDUAL", 4) { // from class: nimbus.service.v1.AssetTransferTypeDto.INDIVIDUAL_TO_MANAGED_INDIVIDUAL
        {
            String str = "individual_to_managed_individual";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferType toProto() {
            return AssetTransferType.INDIVIDUAL_TO_MANAGED_INDIVIDUAL;
        }
    };
    public static final AssetTransferTypeDto JOINT_TO_MANAGED_INDIVIDUAL = new AssetTransferTypeDto("JOINT_TO_MANAGED_INDIVIDUAL", 5) { // from class: nimbus.service.v1.AssetTransferTypeDto.JOINT_TO_MANAGED_INDIVIDUAL
        {
            String str = "joint_to_managed_individual";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferType toProto() {
            return AssetTransferType.JOINT_TO_MANAGED_INDIVIDUAL;
        }
    };
    public static final AssetTransferTypeDto IRA_TRADITIONAL_TO_IRA_TRADITIONAL = new AssetTransferTypeDto("IRA_TRADITIONAL_TO_IRA_TRADITIONAL", 6) { // from class: nimbus.service.v1.AssetTransferTypeDto.IRA_TRADITIONAL_TO_IRA_TRADITIONAL
        {
            String str = "ira_traditional_to_ira_traditional";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferType toProto() {
            return AssetTransferType.IRA_TRADITIONAL_TO_IRA_TRADITIONAL;
        }
    };
    public static final AssetTransferTypeDto IRA_ROTH_TO_IRA_ROTH = new AssetTransferTypeDto("IRA_ROTH_TO_IRA_ROTH", 7) { // from class: nimbus.service.v1.AssetTransferTypeDto.IRA_ROTH_TO_IRA_ROTH
        {
            String str = "ira_roth_to_ira_roth";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferType toProto() {
            return AssetTransferType.IRA_ROTH_TO_IRA_ROTH;
        }
    };
    public static final AssetTransferTypeDto IRA_TRADITIONAL_TO_MANAGED_IRA_TRADITIONAL = new AssetTransferTypeDto("IRA_TRADITIONAL_TO_MANAGED_IRA_TRADITIONAL", 8) { // from class: nimbus.service.v1.AssetTransferTypeDto.IRA_TRADITIONAL_TO_MANAGED_IRA_TRADITIONAL
        {
            String str = "ira_traditional_to_managed_ira_traditional";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferType toProto() {
            return AssetTransferType.IRA_TRADITIONAL_TO_MANAGED_IRA_TRADITIONAL;
        }
    };
    public static final AssetTransferTypeDto IRA_ROTH_TO_MANAGED_IRA_ROTH = new AssetTransferTypeDto("IRA_ROTH_TO_MANAGED_IRA_ROTH", 9) { // from class: nimbus.service.v1.AssetTransferTypeDto.IRA_ROTH_TO_MANAGED_IRA_ROTH
        {
            String str = "ira_roth_to_managed_ira_roth";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferType toProto() {
            return AssetTransferType.IRA_ROTH_TO_MANAGED_IRA_ROTH;
        }
    };
    public static final AssetTransferTypeDto INDIVIDUAL_TO_CUSTODIAL_UTMA = new AssetTransferTypeDto("INDIVIDUAL_TO_CUSTODIAL_UTMA", 10) { // from class: nimbus.service.v1.AssetTransferTypeDto.INDIVIDUAL_TO_CUSTODIAL_UTMA
        {
            String str = "individual_to_custodial_utma";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferType toProto() {
            return AssetTransferType.INDIVIDUAL_TO_CUSTODIAL_UTMA;
        }
    };
    public static final AssetTransferTypeDto INDIVIDUAL_TO_CUSTODIAL_UGMA = new AssetTransferTypeDto("INDIVIDUAL_TO_CUSTODIAL_UGMA", 11) { // from class: nimbus.service.v1.AssetTransferTypeDto.INDIVIDUAL_TO_CUSTODIAL_UGMA
        {
            String str = "individual_to_custodial_ugma";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferType toProto() {
            return AssetTransferType.INDIVIDUAL_TO_CUSTODIAL_UGMA;
        }
    };
    public static final AssetTransferTypeDto JOINT_TO_CUSTODIAL_UTMA = new AssetTransferTypeDto("JOINT_TO_CUSTODIAL_UTMA", 12) { // from class: nimbus.service.v1.AssetTransferTypeDto.JOINT_TO_CUSTODIAL_UTMA
        {
            String str = "joint_to_custodial_utma";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferType toProto() {
            return AssetTransferType.JOINT_TO_CUSTODIAL_UTMA;
        }
    };
    public static final AssetTransferTypeDto JOINT_TO_CUSTODIAL_UGMA = new AssetTransferTypeDto("JOINT_TO_CUSTODIAL_UGMA", 13) { // from class: nimbus.service.v1.AssetTransferTypeDto.JOINT_TO_CUSTODIAL_UGMA
        {
            String str = "joint_to_custodial_ugma";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferType toProto() {
            return AssetTransferType.JOINT_TO_CUSTODIAL_UGMA;
        }
    };
    public static final AssetTransferTypeDto CUSTODIAL_UTMA_TO_CUSTODIAL_UTMA = new AssetTransferTypeDto("CUSTODIAL_UTMA_TO_CUSTODIAL_UTMA", 14) { // from class: nimbus.service.v1.AssetTransferTypeDto.CUSTODIAL_UTMA_TO_CUSTODIAL_UTMA
        {
            String str = "custodial_utma_to_custodial_utma";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferType toProto() {
            return AssetTransferType.CUSTODIAL_UTMA_TO_CUSTODIAL_UTMA;
        }
    };
    public static final AssetTransferTypeDto CUSTODIAL_UGMA_TO_CUSTODIAL_UGMA = new AssetTransferTypeDto("CUSTODIAL_UGMA_TO_CUSTODIAL_UGMA", 15) { // from class: nimbus.service.v1.AssetTransferTypeDto.CUSTODIAL_UGMA_TO_CUSTODIAL_UGMA
        {
            String str = "custodial_ugma_to_custodial_ugma";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferType toProto() {
            return AssetTransferType.CUSTODIAL_UGMA_TO_CUSTODIAL_UGMA;
        }
    };
    public static final AssetTransferTypeDto CUSTODIAL_UTMA_TO_MANAGED_CUSTODIAL_UTMA = new AssetTransferTypeDto("CUSTODIAL_UTMA_TO_MANAGED_CUSTODIAL_UTMA", 16) { // from class: nimbus.service.v1.AssetTransferTypeDto.CUSTODIAL_UTMA_TO_MANAGED_CUSTODIAL_UTMA
        {
            String str = "custodial_utma_to_managed_custodial_utma";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferType toProto() {
            return AssetTransferType.CUSTODIAL_UTMA_TO_MANAGED_CUSTODIAL_UTMA;
        }
    };
    public static final AssetTransferTypeDto CUSTODIAL_UGMA_TO_MANAGED_CUSTODIAL_UGMA = new AssetTransferTypeDto("CUSTODIAL_UGMA_TO_MANAGED_CUSTODIAL_UGMA", 17) { // from class: nimbus.service.v1.AssetTransferTypeDto.CUSTODIAL_UGMA_TO_MANAGED_CUSTODIAL_UGMA
        {
            String str = "custodial_ugma_to_managed_custodial_ugma";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferType toProto() {
            return AssetTransferType.CUSTODIAL_UGMA_TO_MANAGED_CUSTODIAL_UGMA;
        }
    };
    public static final AssetTransferTypeDto CUSTODIAL_UTMA_TO_INDIVIDUAL = new AssetTransferTypeDto("CUSTODIAL_UTMA_TO_INDIVIDUAL", 18) { // from class: nimbus.service.v1.AssetTransferTypeDto.CUSTODIAL_UTMA_TO_INDIVIDUAL
        {
            String str = "custodial_utma_to_individual";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferType toProto() {
            return AssetTransferType.CUSTODIAL_UTMA_TO_INDIVIDUAL;
        }
    };
    public static final AssetTransferTypeDto CUSTODIAL_UGMA_TO_INDIVIDUAL = new AssetTransferTypeDto("CUSTODIAL_UGMA_TO_INDIVIDUAL", 19) { // from class: nimbus.service.v1.AssetTransferTypeDto.CUSTODIAL_UGMA_TO_INDIVIDUAL
        {
            String str = "custodial_ugma_to_individual";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferType toProto() {
            return AssetTransferType.CUSTODIAL_UGMA_TO_INDIVIDUAL;
        }
    };
    public static final AssetTransferTypeDto CUSTODIAL_UTMA_TO_MANAGED_INDIVIDUAL = new AssetTransferTypeDto("CUSTODIAL_UTMA_TO_MANAGED_INDIVIDUAL", 20) { // from class: nimbus.service.v1.AssetTransferTypeDto.CUSTODIAL_UTMA_TO_MANAGED_INDIVIDUAL
        {
            String str = "custodial_utma_to_managed_individual";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferType toProto() {
            return AssetTransferType.CUSTODIAL_UTMA_TO_MANAGED_INDIVIDUAL;
        }
    };
    public static final AssetTransferTypeDto CUSTODIAL_UGMA_TO_MANAGED_INDIVIDUAL = new AssetTransferTypeDto("CUSTODIAL_UGMA_TO_MANAGED_INDIVIDUAL", 21) { // from class: nimbus.service.v1.AssetTransferTypeDto.CUSTODIAL_UGMA_TO_MANAGED_INDIVIDUAL
        {
            String str = "custodial_ugma_to_managed_individual";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferType toProto() {
            return AssetTransferType.CUSTODIAL_UGMA_TO_MANAGED_INDIVIDUAL;
        }
    };
    public static final AssetTransferTypeDto CUSTODIAL_UTMA_TO_JOINT = new AssetTransferTypeDto("CUSTODIAL_UTMA_TO_JOINT", 22) { // from class: nimbus.service.v1.AssetTransferTypeDto.CUSTODIAL_UTMA_TO_JOINT
        {
            String str = "custodial_utma_to_joint";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferType toProto() {
            return AssetTransferType.CUSTODIAL_UTMA_TO_JOINT;
        }
    };
    public static final AssetTransferTypeDto CUSTODIAL_UGMA_TO_JOINT = new AssetTransferTypeDto("CUSTODIAL_UGMA_TO_JOINT", 23) { // from class: nimbus.service.v1.AssetTransferTypeDto.CUSTODIAL_UGMA_TO_JOINT
        {
            String str = "custodial_ugma_to_joint";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferType toProto() {
            return AssetTransferType.CUSTODIAL_UGMA_TO_JOINT;
        }
    };
    public static final AssetTransferTypeDto INDIVIDUAL_TO_MANAGED_CUSTODIAL_UTMA = new AssetTransferTypeDto("INDIVIDUAL_TO_MANAGED_CUSTODIAL_UTMA", 24) { // from class: nimbus.service.v1.AssetTransferTypeDto.INDIVIDUAL_TO_MANAGED_CUSTODIAL_UTMA
        {
            String str = "individual_to_managed_custodial_utma";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferType toProto() {
            return AssetTransferType.INDIVIDUAL_TO_MANAGED_CUSTODIAL_UTMA;
        }
    };
    public static final AssetTransferTypeDto INDIVIDUAL_TO_MANAGED_CUSTODIAL_UGMA = new AssetTransferTypeDto("INDIVIDUAL_TO_MANAGED_CUSTODIAL_UGMA", 25) { // from class: nimbus.service.v1.AssetTransferTypeDto.INDIVIDUAL_TO_MANAGED_CUSTODIAL_UGMA
        {
            String str = "individual_to_managed_custodial_ugma";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferType toProto() {
            return AssetTransferType.INDIVIDUAL_TO_MANAGED_CUSTODIAL_UGMA;
        }
    };
    public static final AssetTransferTypeDto JOINT_TO_MANAGED_CUSTODIAL_UTMA = new AssetTransferTypeDto("JOINT_TO_MANAGED_CUSTODIAL_UTMA", 26) { // from class: nimbus.service.v1.AssetTransferTypeDto.JOINT_TO_MANAGED_CUSTODIAL_UTMA
        {
            String str = "joint_to_managed_custodial_utma";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferType toProto() {
            return AssetTransferType.JOINT_TO_MANAGED_CUSTODIAL_UTMA;
        }
    };
    public static final AssetTransferTypeDto JOINT_TO_MANAGED_CUSTODIAL_UGMA = new AssetTransferTypeDto("JOINT_TO_MANAGED_CUSTODIAL_UGMA", 27) { // from class: nimbus.service.v1.AssetTransferTypeDto.JOINT_TO_MANAGED_CUSTODIAL_UGMA
        {
            String str = "joint_to_managed_custodial_ugma";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferType toProto() {
            return AssetTransferType.JOINT_TO_MANAGED_CUSTODIAL_UGMA;
        }
    };

    private static final /* synthetic */ AssetTransferTypeDto[] $values() {
        return new AssetTransferTypeDto[]{TYPE_UNSPECIFIED, INDIVIDUAL_TO_JOINT, JOINT_TO_INDIVIDUAL, INDIVIDUAL_TO_INDIVIDUAL, INDIVIDUAL_TO_MANAGED_INDIVIDUAL, JOINT_TO_MANAGED_INDIVIDUAL, IRA_TRADITIONAL_TO_IRA_TRADITIONAL, IRA_ROTH_TO_IRA_ROTH, IRA_TRADITIONAL_TO_MANAGED_IRA_TRADITIONAL, IRA_ROTH_TO_MANAGED_IRA_ROTH, INDIVIDUAL_TO_CUSTODIAL_UTMA, INDIVIDUAL_TO_CUSTODIAL_UGMA, JOINT_TO_CUSTODIAL_UTMA, JOINT_TO_CUSTODIAL_UGMA, CUSTODIAL_UTMA_TO_CUSTODIAL_UTMA, CUSTODIAL_UGMA_TO_CUSTODIAL_UGMA, CUSTODIAL_UTMA_TO_MANAGED_CUSTODIAL_UTMA, CUSTODIAL_UGMA_TO_MANAGED_CUSTODIAL_UGMA, CUSTODIAL_UTMA_TO_INDIVIDUAL, CUSTODIAL_UGMA_TO_INDIVIDUAL, CUSTODIAL_UTMA_TO_MANAGED_INDIVIDUAL, CUSTODIAL_UGMA_TO_MANAGED_INDIVIDUAL, CUSTODIAL_UTMA_TO_JOINT, CUSTODIAL_UGMA_TO_JOINT, INDIVIDUAL_TO_MANAGED_CUSTODIAL_UTMA, INDIVIDUAL_TO_MANAGED_CUSTODIAL_UGMA, JOINT_TO_MANAGED_CUSTODIAL_UTMA, JOINT_TO_MANAGED_CUSTODIAL_UGMA};
    }

    public /* synthetic */ AssetTransferTypeDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    public static EnumEntries<AssetTransferTypeDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AssetTransferTypeDto(String str, int i, String str2) {
        this.json_value = str2;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    static {
        AssetTransferTypeDto[] assetTransferTypeDtoArr$values = $values();
        $VALUES = assetTransferTypeDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(assetTransferTypeDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: nimbus.service.v1.AssetTransferTypeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetTransferTypeDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: AssetTransferTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lnimbus/service/v1/AssetTransferTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lnimbus/service/v1/AssetTransferTypeDto;", "Lnimbus/service/v1/AssetTransferType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lnimbus/service/v1/AssetTransferTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<AssetTransferTypeDto, AssetTransferType> {

        /* compiled from: AssetTransferTypeDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes11.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AssetTransferType.values().length];
                try {
                    iArr[AssetTransferType.TYPE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AssetTransferType.INDIVIDUAL_TO_JOINT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AssetTransferType.JOINT_TO_INDIVIDUAL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AssetTransferType.INDIVIDUAL_TO_INDIVIDUAL.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AssetTransferType.INDIVIDUAL_TO_MANAGED_INDIVIDUAL.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[AssetTransferType.JOINT_TO_MANAGED_INDIVIDUAL.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[AssetTransferType.IRA_TRADITIONAL_TO_IRA_TRADITIONAL.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[AssetTransferType.IRA_ROTH_TO_IRA_ROTH.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[AssetTransferType.IRA_TRADITIONAL_TO_MANAGED_IRA_TRADITIONAL.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[AssetTransferType.IRA_ROTH_TO_MANAGED_IRA_ROTH.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[AssetTransferType.INDIVIDUAL_TO_CUSTODIAL_UTMA.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[AssetTransferType.INDIVIDUAL_TO_CUSTODIAL_UGMA.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[AssetTransferType.JOINT_TO_CUSTODIAL_UTMA.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[AssetTransferType.JOINT_TO_CUSTODIAL_UGMA.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[AssetTransferType.CUSTODIAL_UTMA_TO_CUSTODIAL_UTMA.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[AssetTransferType.CUSTODIAL_UGMA_TO_CUSTODIAL_UGMA.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[AssetTransferType.CUSTODIAL_UTMA_TO_MANAGED_CUSTODIAL_UTMA.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[AssetTransferType.CUSTODIAL_UGMA_TO_MANAGED_CUSTODIAL_UGMA.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[AssetTransferType.CUSTODIAL_UTMA_TO_INDIVIDUAL.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[AssetTransferType.CUSTODIAL_UGMA_TO_INDIVIDUAL.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[AssetTransferType.CUSTODIAL_UTMA_TO_MANAGED_INDIVIDUAL.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[AssetTransferType.CUSTODIAL_UGMA_TO_MANAGED_INDIVIDUAL.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[AssetTransferType.CUSTODIAL_UTMA_TO_JOINT.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[AssetTransferType.CUSTODIAL_UGMA_TO_JOINT.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[AssetTransferType.INDIVIDUAL_TO_MANAGED_CUSTODIAL_UTMA.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr[AssetTransferType.INDIVIDUAL_TO_MANAGED_CUSTODIAL_UGMA.ordinal()] = 26;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr[AssetTransferType.JOINT_TO_MANAGED_CUSTODIAL_UTMA.ordinal()] = 27;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr[AssetTransferType.JOINT_TO_MANAGED_CUSTODIAL_UGMA.ordinal()] = 28;
                } catch (NoSuchFieldError unused28) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AssetTransferTypeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AssetTransferTypeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AssetTransferTypeDto> getBinaryBase64Serializer() {
            return (KSerializer) AssetTransferTypeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AssetTransferType> getProtoAdapter() {
            return AssetTransferType.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AssetTransferTypeDto getZeroValue() {
            return AssetTransferTypeDto.TYPE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AssetTransferTypeDto fromProto(AssetTransferType proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return AssetTransferTypeDto.TYPE_UNSPECIFIED;
                case 2:
                    return AssetTransferTypeDto.INDIVIDUAL_TO_JOINT;
                case 3:
                    return AssetTransferTypeDto.JOINT_TO_INDIVIDUAL;
                case 4:
                    return AssetTransferTypeDto.INDIVIDUAL_TO_INDIVIDUAL;
                case 5:
                    return AssetTransferTypeDto.INDIVIDUAL_TO_MANAGED_INDIVIDUAL;
                case 6:
                    return AssetTransferTypeDto.JOINT_TO_MANAGED_INDIVIDUAL;
                case 7:
                    return AssetTransferTypeDto.IRA_TRADITIONAL_TO_IRA_TRADITIONAL;
                case 8:
                    return AssetTransferTypeDto.IRA_ROTH_TO_IRA_ROTH;
                case 9:
                    return AssetTransferTypeDto.IRA_TRADITIONAL_TO_MANAGED_IRA_TRADITIONAL;
                case 10:
                    return AssetTransferTypeDto.IRA_ROTH_TO_MANAGED_IRA_ROTH;
                case 11:
                    return AssetTransferTypeDto.INDIVIDUAL_TO_CUSTODIAL_UTMA;
                case 12:
                    return AssetTransferTypeDto.INDIVIDUAL_TO_CUSTODIAL_UGMA;
                case 13:
                    return AssetTransferTypeDto.JOINT_TO_CUSTODIAL_UTMA;
                case 14:
                    return AssetTransferTypeDto.JOINT_TO_CUSTODIAL_UGMA;
                case 15:
                    return AssetTransferTypeDto.CUSTODIAL_UTMA_TO_CUSTODIAL_UTMA;
                case 16:
                    return AssetTransferTypeDto.CUSTODIAL_UGMA_TO_CUSTODIAL_UGMA;
                case 17:
                    return AssetTransferTypeDto.CUSTODIAL_UTMA_TO_MANAGED_CUSTODIAL_UTMA;
                case 18:
                    return AssetTransferTypeDto.CUSTODIAL_UGMA_TO_MANAGED_CUSTODIAL_UGMA;
                case 19:
                    return AssetTransferTypeDto.CUSTODIAL_UTMA_TO_INDIVIDUAL;
                case 20:
                    return AssetTransferTypeDto.CUSTODIAL_UGMA_TO_INDIVIDUAL;
                case 21:
                    return AssetTransferTypeDto.CUSTODIAL_UTMA_TO_MANAGED_INDIVIDUAL;
                case 22:
                    return AssetTransferTypeDto.CUSTODIAL_UGMA_TO_MANAGED_INDIVIDUAL;
                case 23:
                    return AssetTransferTypeDto.CUSTODIAL_UTMA_TO_JOINT;
                case 24:
                    return AssetTransferTypeDto.CUSTODIAL_UGMA_TO_JOINT;
                case 25:
                    return AssetTransferTypeDto.INDIVIDUAL_TO_MANAGED_CUSTODIAL_UTMA;
                case 26:
                    return AssetTransferTypeDto.INDIVIDUAL_TO_MANAGED_CUSTODIAL_UGMA;
                case 27:
                    return AssetTransferTypeDto.JOINT_TO_MANAGED_CUSTODIAL_UTMA;
                case 28:
                    return AssetTransferTypeDto.JOINT_TO_MANAGED_CUSTODIAL_UGMA;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AssetTransferTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lnimbus/service/v1/AssetTransferTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lnimbus/service/v1/AssetTransferTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final class Serializer implements KSerializer<AssetTransferTypeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<AssetTransferTypeDto, AssetTransferType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/nimbus.service.v1.AssetTransferType", AssetTransferTypeDto.getEntries(), AssetTransferTypeDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public AssetTransferTypeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (AssetTransferTypeDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AssetTransferTypeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static AssetTransferTypeDto valueOf(String str) {
        return (AssetTransferTypeDto) Enum.valueOf(AssetTransferTypeDto.class, str);
    }

    public static AssetTransferTypeDto[] values() {
        return (AssetTransferTypeDto[]) $VALUES.clone();
    }
}
