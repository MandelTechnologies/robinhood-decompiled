package com.robinhood.rosetta.i18n;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.iso.countrycode.CountryCode;
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
/* compiled from: LocalityDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b.\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002;<B\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u0016J\b\u0010:\u001a\u000209H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3¨\u0006="}, m3636d2 = {"Lcom/robinhood/rosetta/i18n/LocalityDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/i18n/Locality;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "LOCALITY_UNSPECIFIED", CountryCode.COUNTRY_CODE_US, CountryCode.COUNTRY_CODE_GB, CountryCode.COUNTRY_CODE_AT, CountryCode.COUNTRY_CODE_BE, CountryCode.COUNTRY_CODE_BG, CountryCode.COUNTRY_CODE_HR, CountryCode.COUNTRY_CODE_CY, CountryCode.COUNTRY_CODE_CZ, CountryCode.COUNTRY_CODE_DK, CountryCode.COUNTRY_CODE_EE, CountryCode.COUNTRY_CODE_FI, CountryCode.COUNTRY_CODE_FR, CountryCode.COUNTRY_CODE_DE, CountryCode.COUNTRY_CODE_GR, CountryCode.COUNTRY_CODE_HU, CountryCode.COUNTRY_CODE_IE, CountryCode.COUNTRY_CODE_IT, CountryCode.COUNTRY_CODE_LV, CountryCode.COUNTRY_CODE_LT, CountryCode.COUNTRY_CODE_LU, CountryCode.COUNTRY_CODE_MT, CountryCode.COUNTRY_CODE_NL, CountryCode.COUNTRY_CODE_PL, CountryCode.COUNTRY_CODE_PT, CountryCode.COUNTRY_CODE_RO, CountryCode.COUNTRY_CODE_SK, CountryCode.COUNTRY_CODE_SI, CountryCode.COUNTRY_CODE_ES, CountryCode.COUNTRY_CODE_SE, CountryCode.COUNTRY_CODE_SG, CountryCode.COUNTRY_CODE_TW, CountryCode.COUNTRY_CODE_HK, CountryCode.COUNTRY_CODE_ID, CountryCode.COUNTRY_CODE_MY, CountryCode.COUNTRY_CODE_TH, CountryCode.COUNTRY_CODE_VN, CountryCode.COUNTRY_CODE_IN, CountryCode.COUNTRY_CODE_NO, CountryCode.COUNTRY_CODE_LI, CountryCode.COUNTRY_CODE_IS, "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.i18n_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public abstract class LocalityDto implements Dto2<Locality>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LocalityDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<LocalityDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<LocalityDto, Locality>> binaryBase64Serializer$delegate;
    private final String json_value;
    public static final LocalityDto LOCALITY_UNSPECIFIED = new LocalityDto("LOCALITY_UNSPECIFIED", 0) { // from class: com.robinhood.rosetta.i18n.LocalityDto.LOCALITY_UNSPECIFIED
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Locality toProto() {
            return Locality.LOCALITY_UNSPECIFIED;
        }
    };

    /* renamed from: US */
    public static final LocalityDto f6148US = new LocalityDto(CountryCode.COUNTRY_CODE_US, 1) { // from class: com.robinhood.rosetta.i18n.LocalityDto.US
        {
            String str = CountryCode.COUNTRY_CODE_US;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Locality toProto() {
            return Locality.f6108US;
        }
    };

    /* renamed from: GB */
    public static final LocalityDto f6121GB = new LocalityDto(CountryCode.COUNTRY_CODE_GB, 2) { // from class: com.robinhood.rosetta.i18n.LocalityDto.GB
        {
            String str = CountryCode.COUNTRY_CODE_GB;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Locality toProto() {
            return Locality.f6081GB;
        }
    };

    /* renamed from: AT */
    public static final LocalityDto f6110AT = new LocalityDto(CountryCode.COUNTRY_CODE_AT, 3) { // from class: com.robinhood.rosetta.i18n.LocalityDto.AT
        {
            String str = CountryCode.COUNTRY_CODE_AT;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Locality toProto() {
            return Locality.f6070AT;
        }
    };

    /* renamed from: BE */
    public static final LocalityDto f6111BE = new LocalityDto(CountryCode.COUNTRY_CODE_BE, 4) { // from class: com.robinhood.rosetta.i18n.LocalityDto.BE
        {
            String str = CountryCode.COUNTRY_CODE_BE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Locality toProto() {
            return Locality.f6071BE;
        }
    };

    /* renamed from: BG */
    public static final LocalityDto f6112BG = new LocalityDto(CountryCode.COUNTRY_CODE_BG, 5) { // from class: com.robinhood.rosetta.i18n.LocalityDto.BG
        {
            String str = CountryCode.COUNTRY_CODE_BG;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Locality toProto() {
            return Locality.f6072BG;
        }
    };

    /* renamed from: HR */
    public static final LocalityDto f6124HR = new LocalityDto(CountryCode.COUNTRY_CODE_HR, 6) { // from class: com.robinhood.rosetta.i18n.LocalityDto.HR
        {
            String str = CountryCode.COUNTRY_CODE_HR;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Locality toProto() {
            return Locality.f6084HR;
        }
    };

    /* renamed from: CY */
    public static final LocalityDto f6113CY = new LocalityDto(CountryCode.COUNTRY_CODE_CY, 7) { // from class: com.robinhood.rosetta.i18n.LocalityDto.CY
        {
            String str = CountryCode.COUNTRY_CODE_CY;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Locality toProto() {
            return Locality.f6073CY;
        }
    };

    /* renamed from: CZ */
    public static final LocalityDto f6114CZ = new LocalityDto(CountryCode.COUNTRY_CODE_CZ, 8) { // from class: com.robinhood.rosetta.i18n.LocalityDto.CZ
        {
            String str = CountryCode.COUNTRY_CODE_CZ;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Locality toProto() {
            return Locality.f6074CZ;
        }
    };

    /* renamed from: DK */
    public static final LocalityDto f6116DK = new LocalityDto(CountryCode.COUNTRY_CODE_DK, 9) { // from class: com.robinhood.rosetta.i18n.LocalityDto.DK
        {
            String str = CountryCode.COUNTRY_CODE_DK;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Locality toProto() {
            return Locality.f6076DK;
        }
    };

    /* renamed from: EE */
    public static final LocalityDto f6117EE = new LocalityDto(CountryCode.COUNTRY_CODE_EE, 10) { // from class: com.robinhood.rosetta.i18n.LocalityDto.EE
        {
            String str = CountryCode.COUNTRY_CODE_EE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Locality toProto() {
            return Locality.f6077EE;
        }
    };

    /* renamed from: FI */
    public static final LocalityDto f6119FI = new LocalityDto(CountryCode.COUNTRY_CODE_FI, 11) { // from class: com.robinhood.rosetta.i18n.LocalityDto.FI
        {
            String str = CountryCode.COUNTRY_CODE_FI;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Locality toProto() {
            return Locality.f6079FI;
        }
    };

    /* renamed from: FR */
    public static final LocalityDto f6120FR = new LocalityDto(CountryCode.COUNTRY_CODE_FR, 12) { // from class: com.robinhood.rosetta.i18n.LocalityDto.FR
        {
            String str = CountryCode.COUNTRY_CODE_FR;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Locality toProto() {
            return Locality.f6080FR;
        }
    };

    /* renamed from: DE */
    public static final LocalityDto f6115DE = new LocalityDto(CountryCode.COUNTRY_CODE_DE, 13) { // from class: com.robinhood.rosetta.i18n.LocalityDto.DE
        {
            String str = CountryCode.COUNTRY_CODE_DE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Locality toProto() {
            return Locality.f6075DE;
        }
    };

    /* renamed from: GR */
    public static final LocalityDto f6122GR = new LocalityDto(CountryCode.COUNTRY_CODE_GR, 14) { // from class: com.robinhood.rosetta.i18n.LocalityDto.GR
        {
            String str = CountryCode.COUNTRY_CODE_GR;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Locality toProto() {
            return Locality.f6082GR;
        }
    };

    /* renamed from: HU */
    public static final LocalityDto f6125HU = new LocalityDto(CountryCode.COUNTRY_CODE_HU, 15) { // from class: com.robinhood.rosetta.i18n.LocalityDto.HU
        {
            String str = CountryCode.COUNTRY_CODE_HU;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Locality toProto() {
            return Locality.f6085HU;
        }
    };

    /* renamed from: IE */
    public static final LocalityDto f6127IE = new LocalityDto(CountryCode.COUNTRY_CODE_IE, 16) { // from class: com.robinhood.rosetta.i18n.LocalityDto.IE
        {
            String str = CountryCode.COUNTRY_CODE_IE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Locality toProto() {
            return Locality.f6087IE;
        }
    };

    /* renamed from: IT */
    public static final LocalityDto f6130IT = new LocalityDto(CountryCode.COUNTRY_CODE_IT, 17) { // from class: com.robinhood.rosetta.i18n.LocalityDto.IT
        {
            String str = CountryCode.COUNTRY_CODE_IT;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Locality toProto() {
            return Locality.f6090IT;
        }
    };

    /* renamed from: LV */
    public static final LocalityDto f6134LV = new LocalityDto(CountryCode.COUNTRY_CODE_LV, 18) { // from class: com.robinhood.rosetta.i18n.LocalityDto.LV
        {
            String str = CountryCode.COUNTRY_CODE_LV;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Locality toProto() {
            return Locality.f6094LV;
        }
    };

    /* renamed from: LT */
    public static final LocalityDto f6132LT = new LocalityDto(CountryCode.COUNTRY_CODE_LT, 19) { // from class: com.robinhood.rosetta.i18n.LocalityDto.LT
        {
            String str = CountryCode.COUNTRY_CODE_LT;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Locality toProto() {
            return Locality.f6092LT;
        }
    };

    /* renamed from: LU */
    public static final LocalityDto f6133LU = new LocalityDto(CountryCode.COUNTRY_CODE_LU, 20) { // from class: com.robinhood.rosetta.i18n.LocalityDto.LU
        {
            String str = CountryCode.COUNTRY_CODE_LU;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Locality toProto() {
            return Locality.f6093LU;
        }
    };

    /* renamed from: MT */
    public static final LocalityDto f6135MT = new LocalityDto(CountryCode.COUNTRY_CODE_MT, 21) { // from class: com.robinhood.rosetta.i18n.LocalityDto.MT
        {
            String str = CountryCode.COUNTRY_CODE_MT;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Locality toProto() {
            return Locality.f6095MT;
        }
    };

    /* renamed from: NL */
    public static final LocalityDto f6137NL = new LocalityDto(CountryCode.COUNTRY_CODE_NL, 22) { // from class: com.robinhood.rosetta.i18n.LocalityDto.NL
        {
            String str = CountryCode.COUNTRY_CODE_NL;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Locality toProto() {
            return Locality.f6097NL;
        }
    };

    /* renamed from: PL */
    public static final LocalityDto f6139PL = new LocalityDto(CountryCode.COUNTRY_CODE_PL, 23) { // from class: com.robinhood.rosetta.i18n.LocalityDto.PL
        {
            String str = CountryCode.COUNTRY_CODE_PL;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Locality toProto() {
            return Locality.f6099PL;
        }
    };

    /* renamed from: PT */
    public static final LocalityDto f6140PT = new LocalityDto(CountryCode.COUNTRY_CODE_PT, 24) { // from class: com.robinhood.rosetta.i18n.LocalityDto.PT
        {
            String str = CountryCode.COUNTRY_CODE_PT;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Locality toProto() {
            return Locality.f6100PT;
        }
    };

    /* renamed from: RO */
    public static final LocalityDto f6141RO = new LocalityDto(CountryCode.COUNTRY_CODE_RO, 25) { // from class: com.robinhood.rosetta.i18n.LocalityDto.RO
        {
            String str = CountryCode.COUNTRY_CODE_RO;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Locality toProto() {
            return Locality.f6101RO;
        }
    };

    /* renamed from: SK */
    public static final LocalityDto f6145SK = new LocalityDto(CountryCode.COUNTRY_CODE_SK, 26) { // from class: com.robinhood.rosetta.i18n.LocalityDto.SK
        {
            String str = CountryCode.COUNTRY_CODE_SK;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Locality toProto() {
            return Locality.f6105SK;
        }
    };

    /* renamed from: SI */
    public static final LocalityDto f6144SI = new LocalityDto(CountryCode.COUNTRY_CODE_SI, 27) { // from class: com.robinhood.rosetta.i18n.LocalityDto.SI
        {
            String str = CountryCode.COUNTRY_CODE_SI;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Locality toProto() {
            return Locality.f6104SI;
        }
    };

    /* renamed from: ES */
    public static final LocalityDto f6118ES = new LocalityDto(CountryCode.COUNTRY_CODE_ES, 28) { // from class: com.robinhood.rosetta.i18n.LocalityDto.ES
        {
            String str = CountryCode.COUNTRY_CODE_ES;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Locality toProto() {
            return Locality.f6078ES;
        }
    };

    /* renamed from: SE */
    public static final LocalityDto f6142SE = new LocalityDto(CountryCode.COUNTRY_CODE_SE, 29) { // from class: com.robinhood.rosetta.i18n.LocalityDto.SE
        {
            String str = CountryCode.COUNTRY_CODE_SE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Locality toProto() {
            return Locality.f6102SE;
        }
    };

    /* renamed from: SG */
    public static final LocalityDto f6143SG = new LocalityDto(CountryCode.COUNTRY_CODE_SG, 30) { // from class: com.robinhood.rosetta.i18n.LocalityDto.SG
        {
            String str = CountryCode.COUNTRY_CODE_SG;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Locality toProto() {
            return Locality.f6103SG;
        }
    };

    /* renamed from: TW */
    public static final LocalityDto f6147TW = new LocalityDto(CountryCode.COUNTRY_CODE_TW, 31) { // from class: com.robinhood.rosetta.i18n.LocalityDto.TW
        {
            String str = CountryCode.COUNTRY_CODE_TW;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Locality toProto() {
            return Locality.f6107TW;
        }
    };

    /* renamed from: HK */
    public static final LocalityDto f6123HK = new LocalityDto(CountryCode.COUNTRY_CODE_HK, 32) { // from class: com.robinhood.rosetta.i18n.LocalityDto.HK
        {
            String str = CountryCode.COUNTRY_CODE_HK;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Locality toProto() {
            return Locality.f6083HK;
        }
    };

    /* renamed from: ID */
    public static final LocalityDto f6126ID = new LocalityDto(CountryCode.COUNTRY_CODE_ID, 33) { // from class: com.robinhood.rosetta.i18n.LocalityDto.ID
        {
            String str = CountryCode.COUNTRY_CODE_ID;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Locality toProto() {
            return Locality.f6086ID;
        }
    };

    /* renamed from: MY */
    public static final LocalityDto f6136MY = new LocalityDto(CountryCode.COUNTRY_CODE_MY, 34) { // from class: com.robinhood.rosetta.i18n.LocalityDto.MY
        {
            String str = CountryCode.COUNTRY_CODE_MY;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Locality toProto() {
            return Locality.f6096MY;
        }
    };

    /* renamed from: TH */
    public static final LocalityDto f6146TH = new LocalityDto(CountryCode.COUNTRY_CODE_TH, 35) { // from class: com.robinhood.rosetta.i18n.LocalityDto.TH
        {
            String str = CountryCode.COUNTRY_CODE_TH;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Locality toProto() {
            return Locality.f6106TH;
        }
    };

    /* renamed from: VN */
    public static final LocalityDto f6149VN = new LocalityDto(CountryCode.COUNTRY_CODE_VN, 36) { // from class: com.robinhood.rosetta.i18n.LocalityDto.VN
        {
            String str = CountryCode.COUNTRY_CODE_VN;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Locality toProto() {
            return Locality.f6109VN;
        }
    };

    /* renamed from: IN */
    public static final LocalityDto f6128IN = new LocalityDto(CountryCode.COUNTRY_CODE_IN, 37) { // from class: com.robinhood.rosetta.i18n.LocalityDto.IN
        {
            String str = CountryCode.COUNTRY_CODE_IN;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Locality toProto() {
            return Locality.f6088IN;
        }
    };

    /* renamed from: NO */
    public static final LocalityDto f6138NO = new LocalityDto(CountryCode.COUNTRY_CODE_NO, 38) { // from class: com.robinhood.rosetta.i18n.LocalityDto.NO
        {
            String str = CountryCode.COUNTRY_CODE_NO;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Locality toProto() {
            return Locality.f6098NO;
        }
    };

    /* renamed from: LI */
    public static final LocalityDto f6131LI = new LocalityDto(CountryCode.COUNTRY_CODE_LI, 39) { // from class: com.robinhood.rosetta.i18n.LocalityDto.LI
        {
            String str = CountryCode.COUNTRY_CODE_LI;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Locality toProto() {
            return Locality.f6091LI;
        }
    };

    /* renamed from: IS */
    public static final LocalityDto f6129IS = new LocalityDto(CountryCode.COUNTRY_CODE_IS, 40) { // from class: com.robinhood.rosetta.i18n.LocalityDto.IS
        {
            String str = CountryCode.COUNTRY_CODE_IS;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Locality toProto() {
            return Locality.f6089IS;
        }
    };

    private static final /* synthetic */ LocalityDto[] $values() {
        return new LocalityDto[]{LOCALITY_UNSPECIFIED, f6148US, f6121GB, f6110AT, f6111BE, f6112BG, f6124HR, f6113CY, f6114CZ, f6116DK, f6117EE, f6119FI, f6120FR, f6115DE, f6122GR, f6125HU, f6127IE, f6130IT, f6134LV, f6132LT, f6133LU, f6135MT, f6137NL, f6139PL, f6140PT, f6141RO, f6145SK, f6144SI, f6118ES, f6142SE, f6143SG, f6147TW, f6123HK, f6126ID, f6136MY, f6146TH, f6149VN, f6128IN, f6138NO, f6131LI, f6129IS};
    }

    public /* synthetic */ LocalityDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    public static EnumEntries<LocalityDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private LocalityDto(String str, int i, String str2) {
        this.json_value = str2;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    static {
        LocalityDto[] localityDtoArr$values = $values();
        $VALUES = localityDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(localityDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.i18n.LocalityDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocalityDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: LocalityDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/i18n/LocalityDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/i18n/LocalityDto;", "Lcom/robinhood/rosetta/i18n/Locality;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/i18n/LocalityDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.i18n_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<LocalityDto, Locality> {

        /* compiled from: LocalityDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Locality.values().length];
                try {
                    iArr[Locality.LOCALITY_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Locality.f6108US.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Locality.f6081GB.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Locality.f6070AT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Locality.f6071BE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Locality.f6072BG.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Locality.f6084HR.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[Locality.f6073CY.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[Locality.f6074CZ.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[Locality.f6076DK.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[Locality.f6077EE.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[Locality.f6079FI.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[Locality.f6080FR.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[Locality.f6075DE.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[Locality.f6082GR.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[Locality.f6085HU.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[Locality.f6087IE.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[Locality.f6090IT.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[Locality.f6094LV.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[Locality.f6092LT.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[Locality.f6093LU.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[Locality.f6095MT.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[Locality.f6097NL.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[Locality.f6099PL.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[Locality.f6100PT.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr[Locality.f6101RO.ordinal()] = 26;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr[Locality.f6105SK.ordinal()] = 27;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr[Locality.f6104SI.ordinal()] = 28;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr[Locality.f6078ES.ordinal()] = 29;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr[Locality.f6102SE.ordinal()] = 30;
                } catch (NoSuchFieldError unused30) {
                }
                try {
                    iArr[Locality.f6103SG.ordinal()] = 31;
                } catch (NoSuchFieldError unused31) {
                }
                try {
                    iArr[Locality.f6107TW.ordinal()] = 32;
                } catch (NoSuchFieldError unused32) {
                }
                try {
                    iArr[Locality.f6083HK.ordinal()] = 33;
                } catch (NoSuchFieldError unused33) {
                }
                try {
                    iArr[Locality.f6086ID.ordinal()] = 34;
                } catch (NoSuchFieldError unused34) {
                }
                try {
                    iArr[Locality.f6096MY.ordinal()] = 35;
                } catch (NoSuchFieldError unused35) {
                }
                try {
                    iArr[Locality.f6106TH.ordinal()] = 36;
                } catch (NoSuchFieldError unused36) {
                }
                try {
                    iArr[Locality.f6109VN.ordinal()] = 37;
                } catch (NoSuchFieldError unused37) {
                }
                try {
                    iArr[Locality.f6088IN.ordinal()] = 38;
                } catch (NoSuchFieldError unused38) {
                }
                try {
                    iArr[Locality.f6098NO.ordinal()] = 39;
                } catch (NoSuchFieldError unused39) {
                }
                try {
                    iArr[Locality.f6091LI.ordinal()] = 40;
                } catch (NoSuchFieldError unused40) {
                }
                try {
                    iArr[Locality.f6089IS.ordinal()] = 41;
                } catch (NoSuchFieldError unused41) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LocalityDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<LocalityDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<LocalityDto> getBinaryBase64Serializer() {
            return (KSerializer) LocalityDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Locality> getProtoAdapter() {
            return Locality.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public LocalityDto getZeroValue() {
            return LocalityDto.LOCALITY_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public LocalityDto fromProto(Locality proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return LocalityDto.LOCALITY_UNSPECIFIED;
                case 2:
                    return LocalityDto.f6148US;
                case 3:
                    return LocalityDto.f6121GB;
                case 4:
                    return LocalityDto.f6110AT;
                case 5:
                    return LocalityDto.f6111BE;
                case 6:
                    return LocalityDto.f6112BG;
                case 7:
                    return LocalityDto.f6124HR;
                case 8:
                    return LocalityDto.f6113CY;
                case 9:
                    return LocalityDto.f6114CZ;
                case 10:
                    return LocalityDto.f6116DK;
                case 11:
                    return LocalityDto.f6117EE;
                case 12:
                    return LocalityDto.f6119FI;
                case 13:
                    return LocalityDto.f6120FR;
                case 14:
                    return LocalityDto.f6115DE;
                case 15:
                    return LocalityDto.f6122GR;
                case 16:
                    return LocalityDto.f6125HU;
                case 17:
                    return LocalityDto.f6127IE;
                case 18:
                    return LocalityDto.f6130IT;
                case 19:
                    return LocalityDto.f6134LV;
                case 20:
                    return LocalityDto.f6132LT;
                case 21:
                    return LocalityDto.f6133LU;
                case 22:
                    return LocalityDto.f6135MT;
                case 23:
                    return LocalityDto.f6137NL;
                case 24:
                    return LocalityDto.f6139PL;
                case 25:
                    return LocalityDto.f6140PT;
                case 26:
                    return LocalityDto.f6141RO;
                case 27:
                    return LocalityDto.f6145SK;
                case 28:
                    return LocalityDto.f6144SI;
                case 29:
                    return LocalityDto.f6118ES;
                case 30:
                    return LocalityDto.f6142SE;
                case 31:
                    return LocalityDto.f6143SG;
                case 32:
                    return LocalityDto.f6147TW;
                case 33:
                    return LocalityDto.f6123HK;
                case 34:
                    return LocalityDto.f6126ID;
                case 35:
                    return LocalityDto.f6136MY;
                case 36:
                    return LocalityDto.f6146TH;
                case 37:
                    return LocalityDto.f6149VN;
                case 38:
                    return LocalityDto.f6128IN;
                case 39:
                    return LocalityDto.f6138NO;
                case 40:
                    return LocalityDto.f6131LI;
                case 41:
                    return LocalityDto.f6129IS;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: LocalityDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/i18n/LocalityDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/i18n/LocalityDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.i18n_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<LocalityDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<LocalityDto, Locality> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.i18n.Locality", LocalityDto.getEntries(), LocalityDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public LocalityDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (LocalityDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, LocalityDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static LocalityDto valueOf(String str) {
        return (LocalityDto) Enum.valueOf(LocalityDto.class, str);
    }

    public static LocalityDto[] values() {
        return (LocalityDto[]) $VALUES.clone();
    }
}
