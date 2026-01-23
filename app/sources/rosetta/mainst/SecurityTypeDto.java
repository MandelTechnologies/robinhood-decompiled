package rosetta.mainst;

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
/* compiled from: SecurityTypeDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002()B\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020&H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006*"}, m3636d2 = {"Lrosetta/mainst/SecurityTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lrosetta/mainst/SecurityType;", "Landroid/os/Parcelable;", "", "db_enum", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getDb_enum", "()Ljava/lang/String;", "SECURITY_TYPE_UNSPECIFIED", "ADR", "CEF", "CONTRA", "ESCROW", "ETP", "LP", "MLP", "NYRS", "OPEN_ENDED_FUND", "PFD", "PRE_FILING", "PRE_IPO", "REIT", "RIGHT", "RLT", "STOCK", "TRACKING", "UNIT", "WHEN_ISSUED", "WRT", "CVR", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public abstract class SecurityTypeDto implements Dto2<SecurityType>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SecurityTypeDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<SecurityTypeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<SecurityTypeDto, SecurityType>> binaryBase64Serializer$delegate;
    private final String db_enum;
    public static final SecurityTypeDto SECURITY_TYPE_UNSPECIFIED = new SecurityTypeDto("SECURITY_TYPE_UNSPECIFIED", 0) { // from class: rosetta.mainst.SecurityTypeDto.SECURITY_TYPE_UNSPECIFIED
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SecurityType toProto() {
            return SecurityType.SECURITY_TYPE_UNSPECIFIED;
        }
    };
    public static final SecurityTypeDto ADR = new SecurityTypeDto("ADR", 1) { // from class: rosetta.mainst.SecurityTypeDto.ADR
        {
            String str = Instrument.TYPE_ADR;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SecurityType toProto() {
            return SecurityType.ADR;
        }
    };
    public static final SecurityTypeDto CEF = new SecurityTypeDto("CEF", 2) { // from class: rosetta.mainst.SecurityTypeDto.CEF
        {
            String str = Instrument.TYPE_CEF;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SecurityType toProto() {
            return SecurityType.CEF;
        }
    };
    public static final SecurityTypeDto CONTRA = new SecurityTypeDto("CONTRA", 3) { // from class: rosetta.mainst.SecurityTypeDto.CONTRA
        {
            String str = "contra";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SecurityType toProto() {
            return SecurityType.CONTRA;
        }
    };
    public static final SecurityTypeDto ESCROW = new SecurityTypeDto("ESCROW", 4) { // from class: rosetta.mainst.SecurityTypeDto.ESCROW
        {
            String str = "escrow";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SecurityType toProto() {
            return SecurityType.ESCROW;
        }
    };
    public static final SecurityTypeDto ETP = new SecurityTypeDto("ETP", 5) { // from class: rosetta.mainst.SecurityTypeDto.ETP
        {
            String str = Instrument.TYPE_ETP;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SecurityType toProto() {
            return SecurityType.ETP;
        }
    };

    /* renamed from: LP */
    public static final SecurityTypeDto f8173LP = new SecurityTypeDto("LP", 6) { // from class: rosetta.mainst.SecurityTypeDto.LP
        {
            String str = Instrument.TYPE_LP;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SecurityType toProto() {
            return SecurityType.f8172LP;
        }
    };
    public static final SecurityTypeDto MLP = new SecurityTypeDto("MLP", 7) { // from class: rosetta.mainst.SecurityTypeDto.MLP
        {
            String str = Instrument.TYPE_MLP;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SecurityType toProto() {
            return SecurityType.MLP;
        }
    };
    public static final SecurityTypeDto NYRS = new SecurityTypeDto("NYRS", 8) { // from class: rosetta.mainst.SecurityTypeDto.NYRS
        {
            String str = Instrument.TYPE_NYRS;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SecurityType toProto() {
            return SecurityType.NYRS;
        }
    };
    public static final SecurityTypeDto OPEN_ENDED_FUND = new SecurityTypeDto("OPEN_ENDED_FUND", 9) { // from class: rosetta.mainst.SecurityTypeDto.OPEN_ENDED_FUND
        {
            String str = "open_ended_fund";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SecurityType toProto() {
            return SecurityType.OPEN_ENDED_FUND;
        }
    };
    public static final SecurityTypeDto PFD = new SecurityTypeDto("PFD", 10) { // from class: rosetta.mainst.SecurityTypeDto.PFD
        {
            String str = Instrument.TYPE_PFD;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SecurityType toProto() {
            return SecurityType.PFD;
        }
    };
    public static final SecurityTypeDto PRE_FILING = new SecurityTypeDto("PRE_FILING", 11) { // from class: rosetta.mainst.SecurityTypeDto.PRE_FILING
        {
            String str = "pre_filing";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SecurityType toProto() {
            return SecurityType.PRE_FILING;
        }
    };
    public static final SecurityTypeDto PRE_IPO = new SecurityTypeDto("PRE_IPO", 12) { // from class: rosetta.mainst.SecurityTypeDto.PRE_IPO
        {
            String str = Instrument.TYPE_PRE_IPO;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SecurityType toProto() {
            return SecurityType.PRE_IPO;
        }
    };
    public static final SecurityTypeDto REIT = new SecurityTypeDto("REIT", 13) { // from class: rosetta.mainst.SecurityTypeDto.REIT
        {
            String str = Instrument.TYPE_REIT;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SecurityType toProto() {
            return SecurityType.REIT;
        }
    };
    public static final SecurityTypeDto RIGHT = new SecurityTypeDto("RIGHT", 14) { // from class: rosetta.mainst.SecurityTypeDto.RIGHT
        {
            String str = "right";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SecurityType toProto() {
            return SecurityType.RIGHT;
        }
    };
    public static final SecurityTypeDto RLT = new SecurityTypeDto("RLT", 15) { // from class: rosetta.mainst.SecurityTypeDto.RLT
        {
            String str = Instrument.TYPE_RLT;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SecurityType toProto() {
            return SecurityType.RLT;
        }
    };
    public static final SecurityTypeDto STOCK = new SecurityTypeDto("STOCK", 16) { // from class: rosetta.mainst.SecurityTypeDto.STOCK
        {
            String str = "stock";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SecurityType toProto() {
            return SecurityType.STOCK;
        }
    };
    public static final SecurityTypeDto TRACKING = new SecurityTypeDto("TRACKING", 17) { // from class: rosetta.mainst.SecurityTypeDto.TRACKING
        {
            String str = Instrument.TYPE_TRACKING;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SecurityType toProto() {
            return SecurityType.TRACKING;
        }
    };
    public static final SecurityTypeDto UNIT = new SecurityTypeDto("UNIT", 18) { // from class: rosetta.mainst.SecurityTypeDto.UNIT
        {
            String str = Instrument.TYPE_UNIT;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SecurityType toProto() {
            return SecurityType.UNIT;
        }
    };
    public static final SecurityTypeDto WHEN_ISSUED = new SecurityTypeDto("WHEN_ISSUED", 19) { // from class: rosetta.mainst.SecurityTypeDto.WHEN_ISSUED
        {
            String str = "when_issued";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SecurityType toProto() {
            return SecurityType.WHEN_ISSUED;
        }
    };
    public static final SecurityTypeDto WRT = new SecurityTypeDto("WRT", 20) { // from class: rosetta.mainst.SecurityTypeDto.WRT
        {
            String str = Instrument.TYPE_WRT;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SecurityType toProto() {
            return SecurityType.WRT;
        }
    };
    public static final SecurityTypeDto CVR = new SecurityTypeDto("CVR", 21) { // from class: rosetta.mainst.SecurityTypeDto.CVR
        {
            String str = "cvr";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SecurityType toProto() {
            return SecurityType.CVR;
        }
    };

    private static final /* synthetic */ SecurityTypeDto[] $values() {
        return new SecurityTypeDto[]{SECURITY_TYPE_UNSPECIFIED, ADR, CEF, CONTRA, ESCROW, ETP, f8173LP, MLP, NYRS, OPEN_ENDED_FUND, PFD, PRE_FILING, PRE_IPO, REIT, RIGHT, RLT, STOCK, TRACKING, UNIT, WHEN_ISSUED, WRT, CVR};
    }

    public /* synthetic */ SecurityTypeDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    public static EnumEntries<SecurityTypeDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private SecurityTypeDto(String str, int i, String str2) {
        this.db_enum = str2;
    }

    public final String getDb_enum() {
        return this.db_enum;
    }

    static {
        SecurityTypeDto[] securityTypeDtoArr$values = $values();
        $VALUES = securityTypeDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(securityTypeDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rosetta.mainst.SecurityTypeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SecurityTypeDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: SecurityTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrosetta/mainst/SecurityTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrosetta/mainst/SecurityTypeDto;", "Lrosetta/mainst/SecurityType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrosetta/mainst/SecurityTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<SecurityTypeDto, SecurityType> {

        /* compiled from: SecurityTypeDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SecurityType.values().length];
                try {
                    iArr[SecurityType.SECURITY_TYPE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SecurityType.ADR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SecurityType.CEF.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[SecurityType.CONTRA.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[SecurityType.ESCROW.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[SecurityType.ETP.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[SecurityType.f8172LP.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[SecurityType.MLP.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[SecurityType.NYRS.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[SecurityType.OPEN_ENDED_FUND.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[SecurityType.PFD.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[SecurityType.PRE_FILING.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[SecurityType.PRE_IPO.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[SecurityType.REIT.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[SecurityType.RIGHT.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[SecurityType.RLT.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[SecurityType.STOCK.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[SecurityType.TRACKING.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[SecurityType.UNIT.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[SecurityType.WHEN_ISSUED.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[SecurityType.WRT.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[SecurityType.CVR.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
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
        public ProtoAdapter<SecurityType> getProtoAdapter() {
            return SecurityType.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SecurityTypeDto getZeroValue() {
            return SecurityTypeDto.SECURITY_TYPE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SecurityTypeDto fromProto(SecurityType proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return SecurityTypeDto.SECURITY_TYPE_UNSPECIFIED;
                case 2:
                    return SecurityTypeDto.ADR;
                case 3:
                    return SecurityTypeDto.CEF;
                case 4:
                    return SecurityTypeDto.CONTRA;
                case 5:
                    return SecurityTypeDto.ESCROW;
                case 6:
                    return SecurityTypeDto.ETP;
                case 7:
                    return SecurityTypeDto.f8173LP;
                case 8:
                    return SecurityTypeDto.MLP;
                case 9:
                    return SecurityTypeDto.NYRS;
                case 10:
                    return SecurityTypeDto.OPEN_ENDED_FUND;
                case 11:
                    return SecurityTypeDto.PFD;
                case 12:
                    return SecurityTypeDto.PRE_FILING;
                case 13:
                    return SecurityTypeDto.PRE_IPO;
                case 14:
                    return SecurityTypeDto.REIT;
                case 15:
                    return SecurityTypeDto.RIGHT;
                case 16:
                    return SecurityTypeDto.RLT;
                case 17:
                    return SecurityTypeDto.STOCK;
                case 18:
                    return SecurityTypeDto.TRACKING;
                case 19:
                    return SecurityTypeDto.UNIT;
                case 20:
                    return SecurityTypeDto.WHEN_ISSUED;
                case 21:
                    return SecurityTypeDto.WRT;
                case 22:
                    return SecurityTypeDto.CVR;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: SecurityTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrosetta/mainst/SecurityTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrosetta/mainst/SecurityTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Serializer implements KSerializer<SecurityTypeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<SecurityTypeDto, SecurityType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.mainst.SecurityType", SecurityTypeDto.getEntries(), SecurityTypeDto.INSTANCE.getZeroValue());

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
