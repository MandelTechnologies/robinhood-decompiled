package yoda.service.dashboard;

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
/* compiled from: SubAssetClassDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u001e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002)*B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020'H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!¨\u0006+"}, m3636d2 = {"Lyoda/service/dashboard/SubAssetClassDto;", "Lcom/robinhood/idl/EnumDto;", "Lyoda/service/dashboard/SubAssetClass;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "SUB_ASSET_CLASS_UNSPECIFIED", "SUB_ASSET_CLASS_US_LARGE_CAP_STOCKS", "SUB_ASSET_CLASS_REAL_ESTATE_INVESTMENT_TRUSTS", "SUB_ASSET_CLASS_US_MID_CAP_STOCKS", "SUB_ASSET_CLASS_US_SMALL_CAP_STOCKS", "SUB_ASSET_CLASS_US_MLPS", "SUB_ASSET_CLASS_INTL_DEVELOPED_MARKETS", "SUB_ASSET_CLASS_EMERGING_MARKET_STOCKS", "SUB_ASSET_CLASS_COMMODITY_STOCKS", "SUB_ASSET_CLASS_US_AGG_BONDS", "SUB_ASSET_CLASS_TBILL_BONDS", "SUB_ASSET_CLASS_US_TREASURY_BONDS", "SUB_ASSET_CLASS_US_IG_CORP_BONDS", "SUB_ASSET_CLASS_US_TIP_BONDS", "SUB_ASSET_CLASS_US_FLOATING_BONDS", "SUB_ASSET_CLASS_US_HIGH_YIELD", "SUB_ASSET_CLASS_EMERGING_MARKET_BONDS", "SUB_ASSET_CLASS_INTL_DEVELOPED_BONDS", "SUB_ASSET_CLASS_GOLD", "SUB_ASSET_CLASS_COMMODITIES", "SUB_ASSET_CLASS_CASH", "SUB_ASSET_CLASS_CRYPTO", "SUB_ASSET_CLASS_US_MUNI_BONDS", "SUB_ASSET_CLASS_US_OPPORTUNISTIC_STOCKS", "SUB_ASSET_CLASS_INTL_OPPORTUNISTIC_STOCKS", "SUB_ASSET_CLASS_OPPORTUNISTIC", "SUB_ASSET_CLASS_PRIVATE_INVESTMENTS", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public abstract class SubAssetClassDto implements Dto2<SubAssetClass>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SubAssetClassDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<SubAssetClassDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<SubAssetClassDto, SubAssetClass>> binaryBase64Serializer$delegate;
    public static final SubAssetClassDto SUB_ASSET_CLASS_UNSPECIFIED = new SubAssetClassDto("SUB_ASSET_CLASS_UNSPECIFIED", 0) { // from class: yoda.service.dashboard.SubAssetClassDto.SUB_ASSET_CLASS_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClass toProto() {
            return SubAssetClass.SUB_ASSET_CLASS_UNSPECIFIED;
        }
    };
    public static final SubAssetClassDto SUB_ASSET_CLASS_US_LARGE_CAP_STOCKS = new SubAssetClassDto("SUB_ASSET_CLASS_US_LARGE_CAP_STOCKS", 1) { // from class: yoda.service.dashboard.SubAssetClassDto.SUB_ASSET_CLASS_US_LARGE_CAP_STOCKS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClass toProto() {
            return SubAssetClass.SUB_ASSET_CLASS_US_LARGE_CAP_STOCKS;
        }
    };
    public static final SubAssetClassDto SUB_ASSET_CLASS_REAL_ESTATE_INVESTMENT_TRUSTS = new SubAssetClassDto("SUB_ASSET_CLASS_REAL_ESTATE_INVESTMENT_TRUSTS", 2) { // from class: yoda.service.dashboard.SubAssetClassDto.SUB_ASSET_CLASS_REAL_ESTATE_INVESTMENT_TRUSTS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClass toProto() {
            return SubAssetClass.SUB_ASSET_CLASS_REAL_ESTATE_INVESTMENT_TRUSTS;
        }
    };
    public static final SubAssetClassDto SUB_ASSET_CLASS_US_MID_CAP_STOCKS = new SubAssetClassDto("SUB_ASSET_CLASS_US_MID_CAP_STOCKS", 3) { // from class: yoda.service.dashboard.SubAssetClassDto.SUB_ASSET_CLASS_US_MID_CAP_STOCKS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClass toProto() {
            return SubAssetClass.SUB_ASSET_CLASS_US_MID_CAP_STOCKS;
        }
    };
    public static final SubAssetClassDto SUB_ASSET_CLASS_US_SMALL_CAP_STOCKS = new SubAssetClassDto("SUB_ASSET_CLASS_US_SMALL_CAP_STOCKS", 4) { // from class: yoda.service.dashboard.SubAssetClassDto.SUB_ASSET_CLASS_US_SMALL_CAP_STOCKS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClass toProto() {
            return SubAssetClass.SUB_ASSET_CLASS_US_SMALL_CAP_STOCKS;
        }
    };
    public static final SubAssetClassDto SUB_ASSET_CLASS_US_MLPS = new SubAssetClassDto("SUB_ASSET_CLASS_US_MLPS", 5) { // from class: yoda.service.dashboard.SubAssetClassDto.SUB_ASSET_CLASS_US_MLPS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClass toProto() {
            return SubAssetClass.SUB_ASSET_CLASS_US_MLPS;
        }
    };
    public static final SubAssetClassDto SUB_ASSET_CLASS_INTL_DEVELOPED_MARKETS = new SubAssetClassDto("SUB_ASSET_CLASS_INTL_DEVELOPED_MARKETS", 6) { // from class: yoda.service.dashboard.SubAssetClassDto.SUB_ASSET_CLASS_INTL_DEVELOPED_MARKETS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClass toProto() {
            return SubAssetClass.SUB_ASSET_CLASS_INTL_DEVELOPED_MARKETS;
        }
    };
    public static final SubAssetClassDto SUB_ASSET_CLASS_EMERGING_MARKET_STOCKS = new SubAssetClassDto("SUB_ASSET_CLASS_EMERGING_MARKET_STOCKS", 7) { // from class: yoda.service.dashboard.SubAssetClassDto.SUB_ASSET_CLASS_EMERGING_MARKET_STOCKS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClass toProto() {
            return SubAssetClass.SUB_ASSET_CLASS_EMERGING_MARKET_STOCKS;
        }
    };
    public static final SubAssetClassDto SUB_ASSET_CLASS_COMMODITY_STOCKS = new SubAssetClassDto("SUB_ASSET_CLASS_COMMODITY_STOCKS", 8) { // from class: yoda.service.dashboard.SubAssetClassDto.SUB_ASSET_CLASS_COMMODITY_STOCKS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClass toProto() {
            return SubAssetClass.SUB_ASSET_CLASS_COMMODITY_STOCKS;
        }
    };
    public static final SubAssetClassDto SUB_ASSET_CLASS_US_AGG_BONDS = new SubAssetClassDto("SUB_ASSET_CLASS_US_AGG_BONDS", 9) { // from class: yoda.service.dashboard.SubAssetClassDto.SUB_ASSET_CLASS_US_AGG_BONDS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClass toProto() {
            return SubAssetClass.SUB_ASSET_CLASS_US_AGG_BONDS;
        }
    };
    public static final SubAssetClassDto SUB_ASSET_CLASS_TBILL_BONDS = new SubAssetClassDto("SUB_ASSET_CLASS_TBILL_BONDS", 10) { // from class: yoda.service.dashboard.SubAssetClassDto.SUB_ASSET_CLASS_TBILL_BONDS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClass toProto() {
            return SubAssetClass.SUB_ASSET_CLASS_TBILL_BONDS;
        }
    };
    public static final SubAssetClassDto SUB_ASSET_CLASS_US_TREASURY_BONDS = new SubAssetClassDto("SUB_ASSET_CLASS_US_TREASURY_BONDS", 11) { // from class: yoda.service.dashboard.SubAssetClassDto.SUB_ASSET_CLASS_US_TREASURY_BONDS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClass toProto() {
            return SubAssetClass.SUB_ASSET_CLASS_US_TREASURY_BONDS;
        }
    };
    public static final SubAssetClassDto SUB_ASSET_CLASS_US_IG_CORP_BONDS = new SubAssetClassDto("SUB_ASSET_CLASS_US_IG_CORP_BONDS", 12) { // from class: yoda.service.dashboard.SubAssetClassDto.SUB_ASSET_CLASS_US_IG_CORP_BONDS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClass toProto() {
            return SubAssetClass.SUB_ASSET_CLASS_US_IG_CORP_BONDS;
        }
    };
    public static final SubAssetClassDto SUB_ASSET_CLASS_US_TIP_BONDS = new SubAssetClassDto("SUB_ASSET_CLASS_US_TIP_BONDS", 13) { // from class: yoda.service.dashboard.SubAssetClassDto.SUB_ASSET_CLASS_US_TIP_BONDS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClass toProto() {
            return SubAssetClass.SUB_ASSET_CLASS_US_TIP_BONDS;
        }
    };
    public static final SubAssetClassDto SUB_ASSET_CLASS_US_FLOATING_BONDS = new SubAssetClassDto("SUB_ASSET_CLASS_US_FLOATING_BONDS", 14) { // from class: yoda.service.dashboard.SubAssetClassDto.SUB_ASSET_CLASS_US_FLOATING_BONDS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClass toProto() {
            return SubAssetClass.SUB_ASSET_CLASS_US_FLOATING_BONDS;
        }
    };
    public static final SubAssetClassDto SUB_ASSET_CLASS_US_HIGH_YIELD = new SubAssetClassDto("SUB_ASSET_CLASS_US_HIGH_YIELD", 15) { // from class: yoda.service.dashboard.SubAssetClassDto.SUB_ASSET_CLASS_US_HIGH_YIELD
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClass toProto() {
            return SubAssetClass.SUB_ASSET_CLASS_US_HIGH_YIELD;
        }
    };
    public static final SubAssetClassDto SUB_ASSET_CLASS_EMERGING_MARKET_BONDS = new SubAssetClassDto("SUB_ASSET_CLASS_EMERGING_MARKET_BONDS", 16) { // from class: yoda.service.dashboard.SubAssetClassDto.SUB_ASSET_CLASS_EMERGING_MARKET_BONDS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClass toProto() {
            return SubAssetClass.SUB_ASSET_CLASS_EMERGING_MARKET_BONDS;
        }
    };
    public static final SubAssetClassDto SUB_ASSET_CLASS_INTL_DEVELOPED_BONDS = new SubAssetClassDto("SUB_ASSET_CLASS_INTL_DEVELOPED_BONDS", 17) { // from class: yoda.service.dashboard.SubAssetClassDto.SUB_ASSET_CLASS_INTL_DEVELOPED_BONDS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClass toProto() {
            return SubAssetClass.SUB_ASSET_CLASS_INTL_DEVELOPED_BONDS;
        }
    };
    public static final SubAssetClassDto SUB_ASSET_CLASS_GOLD = new SubAssetClassDto("SUB_ASSET_CLASS_GOLD", 18) { // from class: yoda.service.dashboard.SubAssetClassDto.SUB_ASSET_CLASS_GOLD
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClass toProto() {
            return SubAssetClass.SUB_ASSET_CLASS_GOLD;
        }
    };
    public static final SubAssetClassDto SUB_ASSET_CLASS_COMMODITIES = new SubAssetClassDto("SUB_ASSET_CLASS_COMMODITIES", 19) { // from class: yoda.service.dashboard.SubAssetClassDto.SUB_ASSET_CLASS_COMMODITIES
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClass toProto() {
            return SubAssetClass.SUB_ASSET_CLASS_COMMODITIES;
        }
    };
    public static final SubAssetClassDto SUB_ASSET_CLASS_CASH = new SubAssetClassDto("SUB_ASSET_CLASS_CASH", 20) { // from class: yoda.service.dashboard.SubAssetClassDto.SUB_ASSET_CLASS_CASH
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClass toProto() {
            return SubAssetClass.SUB_ASSET_CLASS_CASH;
        }
    };
    public static final SubAssetClassDto SUB_ASSET_CLASS_CRYPTO = new SubAssetClassDto("SUB_ASSET_CLASS_CRYPTO", 21) { // from class: yoda.service.dashboard.SubAssetClassDto.SUB_ASSET_CLASS_CRYPTO
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClass toProto() {
            return SubAssetClass.SUB_ASSET_CLASS_CRYPTO;
        }
    };
    public static final SubAssetClassDto SUB_ASSET_CLASS_US_MUNI_BONDS = new SubAssetClassDto("SUB_ASSET_CLASS_US_MUNI_BONDS", 22) { // from class: yoda.service.dashboard.SubAssetClassDto.SUB_ASSET_CLASS_US_MUNI_BONDS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClass toProto() {
            return SubAssetClass.SUB_ASSET_CLASS_US_MUNI_BONDS;
        }
    };
    public static final SubAssetClassDto SUB_ASSET_CLASS_US_OPPORTUNISTIC_STOCKS = new SubAssetClassDto("SUB_ASSET_CLASS_US_OPPORTUNISTIC_STOCKS", 23) { // from class: yoda.service.dashboard.SubAssetClassDto.SUB_ASSET_CLASS_US_OPPORTUNISTIC_STOCKS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClass toProto() {
            return SubAssetClass.SUB_ASSET_CLASS_US_OPPORTUNISTIC_STOCKS;
        }
    };
    public static final SubAssetClassDto SUB_ASSET_CLASS_INTL_OPPORTUNISTIC_STOCKS = new SubAssetClassDto("SUB_ASSET_CLASS_INTL_OPPORTUNISTIC_STOCKS", 24) { // from class: yoda.service.dashboard.SubAssetClassDto.SUB_ASSET_CLASS_INTL_OPPORTUNISTIC_STOCKS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClass toProto() {
            return SubAssetClass.SUB_ASSET_CLASS_INTL_OPPORTUNISTIC_STOCKS;
        }
    };
    public static final SubAssetClassDto SUB_ASSET_CLASS_OPPORTUNISTIC = new SubAssetClassDto("SUB_ASSET_CLASS_OPPORTUNISTIC", 25) { // from class: yoda.service.dashboard.SubAssetClassDto.SUB_ASSET_CLASS_OPPORTUNISTIC
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClass toProto() {
            return SubAssetClass.SUB_ASSET_CLASS_OPPORTUNISTIC;
        }
    };
    public static final SubAssetClassDto SUB_ASSET_CLASS_PRIVATE_INVESTMENTS = new SubAssetClassDto("SUB_ASSET_CLASS_PRIVATE_INVESTMENTS", 26) { // from class: yoda.service.dashboard.SubAssetClassDto.SUB_ASSET_CLASS_PRIVATE_INVESTMENTS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClass toProto() {
            return SubAssetClass.SUB_ASSET_CLASS_PRIVATE_INVESTMENTS;
        }
    };

    private static final /* synthetic */ SubAssetClassDto[] $values() {
        return new SubAssetClassDto[]{SUB_ASSET_CLASS_UNSPECIFIED, SUB_ASSET_CLASS_US_LARGE_CAP_STOCKS, SUB_ASSET_CLASS_REAL_ESTATE_INVESTMENT_TRUSTS, SUB_ASSET_CLASS_US_MID_CAP_STOCKS, SUB_ASSET_CLASS_US_SMALL_CAP_STOCKS, SUB_ASSET_CLASS_US_MLPS, SUB_ASSET_CLASS_INTL_DEVELOPED_MARKETS, SUB_ASSET_CLASS_EMERGING_MARKET_STOCKS, SUB_ASSET_CLASS_COMMODITY_STOCKS, SUB_ASSET_CLASS_US_AGG_BONDS, SUB_ASSET_CLASS_TBILL_BONDS, SUB_ASSET_CLASS_US_TREASURY_BONDS, SUB_ASSET_CLASS_US_IG_CORP_BONDS, SUB_ASSET_CLASS_US_TIP_BONDS, SUB_ASSET_CLASS_US_FLOATING_BONDS, SUB_ASSET_CLASS_US_HIGH_YIELD, SUB_ASSET_CLASS_EMERGING_MARKET_BONDS, SUB_ASSET_CLASS_INTL_DEVELOPED_BONDS, SUB_ASSET_CLASS_GOLD, SUB_ASSET_CLASS_COMMODITIES, SUB_ASSET_CLASS_CASH, SUB_ASSET_CLASS_CRYPTO, SUB_ASSET_CLASS_US_MUNI_BONDS, SUB_ASSET_CLASS_US_OPPORTUNISTIC_STOCKS, SUB_ASSET_CLASS_INTL_OPPORTUNISTIC_STOCKS, SUB_ASSET_CLASS_OPPORTUNISTIC, SUB_ASSET_CLASS_PRIVATE_INVESTMENTS};
    }

    public /* synthetic */ SubAssetClassDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<SubAssetClassDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private SubAssetClassDto(String str, int i) {
    }

    static {
        SubAssetClassDto[] subAssetClassDtoArr$values = $values();
        $VALUES = subAssetClassDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(subAssetClassDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: yoda.service.dashboard.SubAssetClassDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SubAssetClassDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: SubAssetClassDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lyoda/service/dashboard/SubAssetClassDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lyoda/service/dashboard/SubAssetClassDto;", "Lyoda/service/dashboard/SubAssetClass;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lyoda/service/dashboard/SubAssetClassDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<SubAssetClassDto, SubAssetClass> {

        /* compiled from: SubAssetClassDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes28.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SubAssetClass.values().length];
                try {
                    iArr[SubAssetClass.SUB_ASSET_CLASS_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SubAssetClass.SUB_ASSET_CLASS_US_LARGE_CAP_STOCKS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SubAssetClass.SUB_ASSET_CLASS_REAL_ESTATE_INVESTMENT_TRUSTS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[SubAssetClass.SUB_ASSET_CLASS_US_MID_CAP_STOCKS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[SubAssetClass.SUB_ASSET_CLASS_US_SMALL_CAP_STOCKS.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[SubAssetClass.SUB_ASSET_CLASS_US_MLPS.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[SubAssetClass.SUB_ASSET_CLASS_INTL_DEVELOPED_MARKETS.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[SubAssetClass.SUB_ASSET_CLASS_EMERGING_MARKET_STOCKS.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[SubAssetClass.SUB_ASSET_CLASS_COMMODITY_STOCKS.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[SubAssetClass.SUB_ASSET_CLASS_US_AGG_BONDS.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[SubAssetClass.SUB_ASSET_CLASS_TBILL_BONDS.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[SubAssetClass.SUB_ASSET_CLASS_US_TREASURY_BONDS.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[SubAssetClass.SUB_ASSET_CLASS_US_IG_CORP_BONDS.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[SubAssetClass.SUB_ASSET_CLASS_US_TIP_BONDS.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[SubAssetClass.SUB_ASSET_CLASS_US_FLOATING_BONDS.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[SubAssetClass.SUB_ASSET_CLASS_US_HIGH_YIELD.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[SubAssetClass.SUB_ASSET_CLASS_EMERGING_MARKET_BONDS.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[SubAssetClass.SUB_ASSET_CLASS_INTL_DEVELOPED_BONDS.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[SubAssetClass.SUB_ASSET_CLASS_GOLD.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[SubAssetClass.SUB_ASSET_CLASS_COMMODITIES.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[SubAssetClass.SUB_ASSET_CLASS_CASH.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[SubAssetClass.SUB_ASSET_CLASS_CRYPTO.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[SubAssetClass.SUB_ASSET_CLASS_US_MUNI_BONDS.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[SubAssetClass.SUB_ASSET_CLASS_US_OPPORTUNISTIC_STOCKS.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[SubAssetClass.SUB_ASSET_CLASS_INTL_OPPORTUNISTIC_STOCKS.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr[SubAssetClass.SUB_ASSET_CLASS_OPPORTUNISTIC.ordinal()] = 26;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr[SubAssetClass.SUB_ASSET_CLASS_PRIVATE_INVESTMENTS.ordinal()] = 27;
                } catch (NoSuchFieldError unused27) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SubAssetClassDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SubAssetClassDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SubAssetClassDto> getBinaryBase64Serializer() {
            return (KSerializer) SubAssetClassDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<SubAssetClass> getProtoAdapter() {
            return SubAssetClass.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SubAssetClassDto getZeroValue() {
            return SubAssetClassDto.SUB_ASSET_CLASS_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SubAssetClassDto fromProto(SubAssetClass proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return SubAssetClassDto.SUB_ASSET_CLASS_UNSPECIFIED;
                case 2:
                    return SubAssetClassDto.SUB_ASSET_CLASS_US_LARGE_CAP_STOCKS;
                case 3:
                    return SubAssetClassDto.SUB_ASSET_CLASS_REAL_ESTATE_INVESTMENT_TRUSTS;
                case 4:
                    return SubAssetClassDto.SUB_ASSET_CLASS_US_MID_CAP_STOCKS;
                case 5:
                    return SubAssetClassDto.SUB_ASSET_CLASS_US_SMALL_CAP_STOCKS;
                case 6:
                    return SubAssetClassDto.SUB_ASSET_CLASS_US_MLPS;
                case 7:
                    return SubAssetClassDto.SUB_ASSET_CLASS_INTL_DEVELOPED_MARKETS;
                case 8:
                    return SubAssetClassDto.SUB_ASSET_CLASS_EMERGING_MARKET_STOCKS;
                case 9:
                    return SubAssetClassDto.SUB_ASSET_CLASS_COMMODITY_STOCKS;
                case 10:
                    return SubAssetClassDto.SUB_ASSET_CLASS_US_AGG_BONDS;
                case 11:
                    return SubAssetClassDto.SUB_ASSET_CLASS_TBILL_BONDS;
                case 12:
                    return SubAssetClassDto.SUB_ASSET_CLASS_US_TREASURY_BONDS;
                case 13:
                    return SubAssetClassDto.SUB_ASSET_CLASS_US_IG_CORP_BONDS;
                case 14:
                    return SubAssetClassDto.SUB_ASSET_CLASS_US_TIP_BONDS;
                case 15:
                    return SubAssetClassDto.SUB_ASSET_CLASS_US_FLOATING_BONDS;
                case 16:
                    return SubAssetClassDto.SUB_ASSET_CLASS_US_HIGH_YIELD;
                case 17:
                    return SubAssetClassDto.SUB_ASSET_CLASS_EMERGING_MARKET_BONDS;
                case 18:
                    return SubAssetClassDto.SUB_ASSET_CLASS_INTL_DEVELOPED_BONDS;
                case 19:
                    return SubAssetClassDto.SUB_ASSET_CLASS_GOLD;
                case 20:
                    return SubAssetClassDto.SUB_ASSET_CLASS_COMMODITIES;
                case 21:
                    return SubAssetClassDto.SUB_ASSET_CLASS_CASH;
                case 22:
                    return SubAssetClassDto.SUB_ASSET_CLASS_CRYPTO;
                case 23:
                    return SubAssetClassDto.SUB_ASSET_CLASS_US_MUNI_BONDS;
                case 24:
                    return SubAssetClassDto.SUB_ASSET_CLASS_US_OPPORTUNISTIC_STOCKS;
                case 25:
                    return SubAssetClassDto.SUB_ASSET_CLASS_INTL_OPPORTUNISTIC_STOCKS;
                case 26:
                    return SubAssetClassDto.SUB_ASSET_CLASS_OPPORTUNISTIC;
                case 27:
                    return SubAssetClassDto.SUB_ASSET_CLASS_PRIVATE_INVESTMENTS;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: SubAssetClassDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lyoda/service/dashboard/SubAssetClassDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lyoda/service/dashboard/SubAssetClassDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<SubAssetClassDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<SubAssetClassDto, SubAssetClass> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/yoda.service.dashboard.SubAssetClass", SubAssetClassDto.getEntries(), SubAssetClassDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public SubAssetClassDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (SubAssetClassDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, SubAssetClassDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static SubAssetClassDto valueOf(String str) {
        return (SubAssetClassDto) Enum.valueOf(SubAssetClassDto.class, str);
    }

    public static SubAssetClassDto[] values() {
        return (SubAssetClassDto[]) $VALUES.clone();
    }
}
