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
/* compiled from: SubAssetClassCategoryDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b&\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u000212B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u00020/H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)¨\u00063"}, m3636d2 = {"Lyoda/service/dashboard/SubAssetClassCategoryDto;", "Lcom/robinhood/idl/EnumDto;", "Lyoda/service/dashboard/SubAssetClassCategory;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "SUB_ASSET_CLASS_CATEGORY_UNSPECIFIED", "SUB_ASSET_CLASS_CATEGORY_US_BROAD_US_LC_STOCKS", "SUB_ASSET_CLASS_CATEGORY_US_QUALITY_STOCKS", "SUB_ASSET_CLASS_CATEGORY_US_VALUE_STOCKS", "SUB_ASSET_CLASS_CATEGORY_US_MOMENTUM_STOCKS", "SUB_ASSET_CLASS_CATEGORY_US_GROWTH_STOCKS", "SUB_ASSET_CLASS_CATEGORY_US_DIVIDEND_STOCKS", "SUB_ASSET_CLASS_CATEGORY_REAL_ESTATE_INVESTMENT_TRUSTS", "SUB_ASSET_CLASS_CATEGORY_US_MID_CAP_STOCKS", "SUB_ASSET_CLASS_CATEGORY_US_SMALL_CAP_STOCKS", "SUB_ASSET_CLASS_CATEGORY_AUSTRALIA", "SUB_ASSET_CLASS_CATEGORY_CANADA", "SUB_ASSET_CLASS_CATEGORY_JAPAN", "SUB_ASSET_CLASS_CATEGORY_EUROPE", "SUB_ASSET_CLASS_CATEGORY_EMERGING_MARKET_STOCKS", "SUB_ASSET_CLASS_CATEGORY_COMMODITY_STOCKS", "SUB_ASSET_CLASS_CATEGORY_US_AGG_BONDS", "SUB_ASSET_CLASS_CATEGORY_TBILL_BONDS", "SUB_ASSET_CLASS_CATEGORY_US_TREASURY_BONDS", "SUB_ASSET_CLASS_CATEGORY_US_IG_CORP_BONDS", "SUB_ASSET_CLASS_CATEGORY_US_TIP_BONDS", "SUB_ASSET_CLASS_CATEGORY_US_FLOATING_BONDS", "SUB_ASSET_CLASS_CATEGORY_US_HIGH_YIELD", "SUB_ASSET_CLASS_CATEGORY_EMERGING_MARKET_BONDS", "SUB_ASSET_CLASS_CATEGORY_INTL_DEVELOPED_BONDS", "SUB_ASSET_CLASS_CATEGORY_GOLD", "SUB_ASSET_CLASS_CATEGORY_COMMODITIES", "SUB_ASSET_CLASS_CATEGORY_CASH", "SUB_ASSET_CLASS_CATEGORY_INTL_DEVELOPED_MARKETS", "SUB_ASSET_CLASS_CATEGORY_CRYPTO", "SUB_ASSET_CLASS_CATEGORY_US_MUNI_BONDS", "SUB_ASSET_CLASS_CATEGORY_US_OPPORTUNISTIC_STOCKS", "SUB_ASSET_CLASS_CATEGORY_INTL_OPPORTUNISTIC_STOCKS", "SUB_ASSET_CLASS_CATEGORY_OPPORTUNISTIC", "SUB_ASSET_CLASS_CATEGORY_PRIVATE_INVESTMENTS", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public abstract class SubAssetClassCategoryDto implements Dto2<SubAssetClassCategory>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SubAssetClassCategoryDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<SubAssetClassCategoryDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<SubAssetClassCategoryDto, SubAssetClassCategory>> binaryBase64Serializer$delegate;
    public static final SubAssetClassCategoryDto SUB_ASSET_CLASS_CATEGORY_UNSPECIFIED = new SubAssetClassCategoryDto("SUB_ASSET_CLASS_CATEGORY_UNSPECIFIED", 0) { // from class: yoda.service.dashboard.SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClassCategory toProto() {
            return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_UNSPECIFIED;
        }
    };
    public static final SubAssetClassCategoryDto SUB_ASSET_CLASS_CATEGORY_US_BROAD_US_LC_STOCKS = new SubAssetClassCategoryDto("SUB_ASSET_CLASS_CATEGORY_US_BROAD_US_LC_STOCKS", 1) { // from class: yoda.service.dashboard.SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_US_BROAD_US_LC_STOCKS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClassCategory toProto() {
            return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_US_BROAD_US_LC_STOCKS;
        }
    };
    public static final SubAssetClassCategoryDto SUB_ASSET_CLASS_CATEGORY_US_QUALITY_STOCKS = new SubAssetClassCategoryDto("SUB_ASSET_CLASS_CATEGORY_US_QUALITY_STOCKS", 2) { // from class: yoda.service.dashboard.SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_US_QUALITY_STOCKS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClassCategory toProto() {
            return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_US_QUALITY_STOCKS;
        }
    };
    public static final SubAssetClassCategoryDto SUB_ASSET_CLASS_CATEGORY_US_VALUE_STOCKS = new SubAssetClassCategoryDto("SUB_ASSET_CLASS_CATEGORY_US_VALUE_STOCKS", 3) { // from class: yoda.service.dashboard.SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_US_VALUE_STOCKS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClassCategory toProto() {
            return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_US_VALUE_STOCKS;
        }
    };
    public static final SubAssetClassCategoryDto SUB_ASSET_CLASS_CATEGORY_US_MOMENTUM_STOCKS = new SubAssetClassCategoryDto("SUB_ASSET_CLASS_CATEGORY_US_MOMENTUM_STOCKS", 4) { // from class: yoda.service.dashboard.SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_US_MOMENTUM_STOCKS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClassCategory toProto() {
            return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_US_MOMENTUM_STOCKS;
        }
    };
    public static final SubAssetClassCategoryDto SUB_ASSET_CLASS_CATEGORY_US_GROWTH_STOCKS = new SubAssetClassCategoryDto("SUB_ASSET_CLASS_CATEGORY_US_GROWTH_STOCKS", 5) { // from class: yoda.service.dashboard.SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_US_GROWTH_STOCKS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClassCategory toProto() {
            return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_US_GROWTH_STOCKS;
        }
    };
    public static final SubAssetClassCategoryDto SUB_ASSET_CLASS_CATEGORY_US_DIVIDEND_STOCKS = new SubAssetClassCategoryDto("SUB_ASSET_CLASS_CATEGORY_US_DIVIDEND_STOCKS", 6) { // from class: yoda.service.dashboard.SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_US_DIVIDEND_STOCKS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClassCategory toProto() {
            return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_US_DIVIDEND_STOCKS;
        }
    };
    public static final SubAssetClassCategoryDto SUB_ASSET_CLASS_CATEGORY_REAL_ESTATE_INVESTMENT_TRUSTS = new SubAssetClassCategoryDto("SUB_ASSET_CLASS_CATEGORY_REAL_ESTATE_INVESTMENT_TRUSTS", 7) { // from class: yoda.service.dashboard.SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_REAL_ESTATE_INVESTMENT_TRUSTS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClassCategory toProto() {
            return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_REAL_ESTATE_INVESTMENT_TRUSTS;
        }
    };
    public static final SubAssetClassCategoryDto SUB_ASSET_CLASS_CATEGORY_US_MID_CAP_STOCKS = new SubAssetClassCategoryDto("SUB_ASSET_CLASS_CATEGORY_US_MID_CAP_STOCKS", 8) { // from class: yoda.service.dashboard.SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_US_MID_CAP_STOCKS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClassCategory toProto() {
            return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_US_MID_CAP_STOCKS;
        }
    };
    public static final SubAssetClassCategoryDto SUB_ASSET_CLASS_CATEGORY_US_SMALL_CAP_STOCKS = new SubAssetClassCategoryDto("SUB_ASSET_CLASS_CATEGORY_US_SMALL_CAP_STOCKS", 9) { // from class: yoda.service.dashboard.SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_US_SMALL_CAP_STOCKS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClassCategory toProto() {
            return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_US_SMALL_CAP_STOCKS;
        }
    };
    public static final SubAssetClassCategoryDto SUB_ASSET_CLASS_CATEGORY_AUSTRALIA = new SubAssetClassCategoryDto("SUB_ASSET_CLASS_CATEGORY_AUSTRALIA", 10) { // from class: yoda.service.dashboard.SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_AUSTRALIA
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClassCategory toProto() {
            return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_AUSTRALIA;
        }
    };
    public static final SubAssetClassCategoryDto SUB_ASSET_CLASS_CATEGORY_CANADA = new SubAssetClassCategoryDto("SUB_ASSET_CLASS_CATEGORY_CANADA", 11) { // from class: yoda.service.dashboard.SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_CANADA
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClassCategory toProto() {
            return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_CANADA;
        }
    };
    public static final SubAssetClassCategoryDto SUB_ASSET_CLASS_CATEGORY_JAPAN = new SubAssetClassCategoryDto("SUB_ASSET_CLASS_CATEGORY_JAPAN", 12) { // from class: yoda.service.dashboard.SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_JAPAN
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClassCategory toProto() {
            return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_JAPAN;
        }
    };
    public static final SubAssetClassCategoryDto SUB_ASSET_CLASS_CATEGORY_EUROPE = new SubAssetClassCategoryDto("SUB_ASSET_CLASS_CATEGORY_EUROPE", 13) { // from class: yoda.service.dashboard.SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_EUROPE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClassCategory toProto() {
            return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_EUROPE;
        }
    };
    public static final SubAssetClassCategoryDto SUB_ASSET_CLASS_CATEGORY_EMERGING_MARKET_STOCKS = new SubAssetClassCategoryDto("SUB_ASSET_CLASS_CATEGORY_EMERGING_MARKET_STOCKS", 14) { // from class: yoda.service.dashboard.SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_EMERGING_MARKET_STOCKS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClassCategory toProto() {
            return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_EMERGING_MARKET_STOCKS;
        }
    };
    public static final SubAssetClassCategoryDto SUB_ASSET_CLASS_CATEGORY_COMMODITY_STOCKS = new SubAssetClassCategoryDto("SUB_ASSET_CLASS_CATEGORY_COMMODITY_STOCKS", 15) { // from class: yoda.service.dashboard.SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_COMMODITY_STOCKS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClassCategory toProto() {
            return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_COMMODITY_STOCKS;
        }
    };
    public static final SubAssetClassCategoryDto SUB_ASSET_CLASS_CATEGORY_US_AGG_BONDS = new SubAssetClassCategoryDto("SUB_ASSET_CLASS_CATEGORY_US_AGG_BONDS", 16) { // from class: yoda.service.dashboard.SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_US_AGG_BONDS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClassCategory toProto() {
            return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_US_AGG_BONDS;
        }
    };
    public static final SubAssetClassCategoryDto SUB_ASSET_CLASS_CATEGORY_TBILL_BONDS = new SubAssetClassCategoryDto("SUB_ASSET_CLASS_CATEGORY_TBILL_BONDS", 17) { // from class: yoda.service.dashboard.SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_TBILL_BONDS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClassCategory toProto() {
            return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_TBILL_BONDS;
        }
    };
    public static final SubAssetClassCategoryDto SUB_ASSET_CLASS_CATEGORY_US_TREASURY_BONDS = new SubAssetClassCategoryDto("SUB_ASSET_CLASS_CATEGORY_US_TREASURY_BONDS", 18) { // from class: yoda.service.dashboard.SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_US_TREASURY_BONDS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClassCategory toProto() {
            return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_US_TREASURY_BONDS;
        }
    };
    public static final SubAssetClassCategoryDto SUB_ASSET_CLASS_CATEGORY_US_IG_CORP_BONDS = new SubAssetClassCategoryDto("SUB_ASSET_CLASS_CATEGORY_US_IG_CORP_BONDS", 19) { // from class: yoda.service.dashboard.SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_US_IG_CORP_BONDS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClassCategory toProto() {
            return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_US_IG_CORP_BONDS;
        }
    };
    public static final SubAssetClassCategoryDto SUB_ASSET_CLASS_CATEGORY_US_TIP_BONDS = new SubAssetClassCategoryDto("SUB_ASSET_CLASS_CATEGORY_US_TIP_BONDS", 20) { // from class: yoda.service.dashboard.SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_US_TIP_BONDS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClassCategory toProto() {
            return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_US_TIP_BONDS;
        }
    };
    public static final SubAssetClassCategoryDto SUB_ASSET_CLASS_CATEGORY_US_FLOATING_BONDS = new SubAssetClassCategoryDto("SUB_ASSET_CLASS_CATEGORY_US_FLOATING_BONDS", 21) { // from class: yoda.service.dashboard.SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_US_FLOATING_BONDS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClassCategory toProto() {
            return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_US_FLOATING_BONDS;
        }
    };
    public static final SubAssetClassCategoryDto SUB_ASSET_CLASS_CATEGORY_US_HIGH_YIELD = new SubAssetClassCategoryDto("SUB_ASSET_CLASS_CATEGORY_US_HIGH_YIELD", 22) { // from class: yoda.service.dashboard.SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_US_HIGH_YIELD
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClassCategory toProto() {
            return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_US_HIGH_YIELD;
        }
    };
    public static final SubAssetClassCategoryDto SUB_ASSET_CLASS_CATEGORY_EMERGING_MARKET_BONDS = new SubAssetClassCategoryDto("SUB_ASSET_CLASS_CATEGORY_EMERGING_MARKET_BONDS", 23) { // from class: yoda.service.dashboard.SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_EMERGING_MARKET_BONDS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClassCategory toProto() {
            return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_EMERGING_MARKET_BONDS;
        }
    };
    public static final SubAssetClassCategoryDto SUB_ASSET_CLASS_CATEGORY_INTL_DEVELOPED_BONDS = new SubAssetClassCategoryDto("SUB_ASSET_CLASS_CATEGORY_INTL_DEVELOPED_BONDS", 24) { // from class: yoda.service.dashboard.SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_INTL_DEVELOPED_BONDS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClassCategory toProto() {
            return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_INTL_DEVELOPED_BONDS;
        }
    };
    public static final SubAssetClassCategoryDto SUB_ASSET_CLASS_CATEGORY_GOLD = new SubAssetClassCategoryDto("SUB_ASSET_CLASS_CATEGORY_GOLD", 25) { // from class: yoda.service.dashboard.SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_GOLD
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClassCategory toProto() {
            return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_GOLD;
        }
    };
    public static final SubAssetClassCategoryDto SUB_ASSET_CLASS_CATEGORY_COMMODITIES = new SubAssetClassCategoryDto("SUB_ASSET_CLASS_CATEGORY_COMMODITIES", 26) { // from class: yoda.service.dashboard.SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_COMMODITIES
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClassCategory toProto() {
            return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_COMMODITIES;
        }
    };
    public static final SubAssetClassCategoryDto SUB_ASSET_CLASS_CATEGORY_CASH = new SubAssetClassCategoryDto("SUB_ASSET_CLASS_CATEGORY_CASH", 27) { // from class: yoda.service.dashboard.SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_CASH
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClassCategory toProto() {
            return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_CASH;
        }
    };
    public static final SubAssetClassCategoryDto SUB_ASSET_CLASS_CATEGORY_INTL_DEVELOPED_MARKETS = new SubAssetClassCategoryDto("SUB_ASSET_CLASS_CATEGORY_INTL_DEVELOPED_MARKETS", 28) { // from class: yoda.service.dashboard.SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_INTL_DEVELOPED_MARKETS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClassCategory toProto() {
            return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_INTL_DEVELOPED_MARKETS;
        }
    };
    public static final SubAssetClassCategoryDto SUB_ASSET_CLASS_CATEGORY_CRYPTO = new SubAssetClassCategoryDto("SUB_ASSET_CLASS_CATEGORY_CRYPTO", 29) { // from class: yoda.service.dashboard.SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_CRYPTO
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClassCategory toProto() {
            return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_CRYPTO;
        }
    };
    public static final SubAssetClassCategoryDto SUB_ASSET_CLASS_CATEGORY_US_MUNI_BONDS = new SubAssetClassCategoryDto("SUB_ASSET_CLASS_CATEGORY_US_MUNI_BONDS", 30) { // from class: yoda.service.dashboard.SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_US_MUNI_BONDS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClassCategory toProto() {
            return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_US_MUNI_BONDS;
        }
    };
    public static final SubAssetClassCategoryDto SUB_ASSET_CLASS_CATEGORY_US_OPPORTUNISTIC_STOCKS = new SubAssetClassCategoryDto("SUB_ASSET_CLASS_CATEGORY_US_OPPORTUNISTIC_STOCKS", 31) { // from class: yoda.service.dashboard.SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_US_OPPORTUNISTIC_STOCKS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClassCategory toProto() {
            return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_US_OPPORTUNISTIC_STOCKS;
        }
    };
    public static final SubAssetClassCategoryDto SUB_ASSET_CLASS_CATEGORY_INTL_OPPORTUNISTIC_STOCKS = new SubAssetClassCategoryDto("SUB_ASSET_CLASS_CATEGORY_INTL_OPPORTUNISTIC_STOCKS", 32) { // from class: yoda.service.dashboard.SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_INTL_OPPORTUNISTIC_STOCKS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClassCategory toProto() {
            return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_INTL_OPPORTUNISTIC_STOCKS;
        }
    };
    public static final SubAssetClassCategoryDto SUB_ASSET_CLASS_CATEGORY_OPPORTUNISTIC = new SubAssetClassCategoryDto("SUB_ASSET_CLASS_CATEGORY_OPPORTUNISTIC", 33) { // from class: yoda.service.dashboard.SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_OPPORTUNISTIC
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClassCategory toProto() {
            return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_OPPORTUNISTIC;
        }
    };
    public static final SubAssetClassCategoryDto SUB_ASSET_CLASS_CATEGORY_PRIVATE_INVESTMENTS = new SubAssetClassCategoryDto("SUB_ASSET_CLASS_CATEGORY_PRIVATE_INVESTMENTS", 34) { // from class: yoda.service.dashboard.SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_PRIVATE_INVESTMENTS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubAssetClassCategory toProto() {
            return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_PRIVATE_INVESTMENTS;
        }
    };

    private static final /* synthetic */ SubAssetClassCategoryDto[] $values() {
        return new SubAssetClassCategoryDto[]{SUB_ASSET_CLASS_CATEGORY_UNSPECIFIED, SUB_ASSET_CLASS_CATEGORY_US_BROAD_US_LC_STOCKS, SUB_ASSET_CLASS_CATEGORY_US_QUALITY_STOCKS, SUB_ASSET_CLASS_CATEGORY_US_VALUE_STOCKS, SUB_ASSET_CLASS_CATEGORY_US_MOMENTUM_STOCKS, SUB_ASSET_CLASS_CATEGORY_US_GROWTH_STOCKS, SUB_ASSET_CLASS_CATEGORY_US_DIVIDEND_STOCKS, SUB_ASSET_CLASS_CATEGORY_REAL_ESTATE_INVESTMENT_TRUSTS, SUB_ASSET_CLASS_CATEGORY_US_MID_CAP_STOCKS, SUB_ASSET_CLASS_CATEGORY_US_SMALL_CAP_STOCKS, SUB_ASSET_CLASS_CATEGORY_AUSTRALIA, SUB_ASSET_CLASS_CATEGORY_CANADA, SUB_ASSET_CLASS_CATEGORY_JAPAN, SUB_ASSET_CLASS_CATEGORY_EUROPE, SUB_ASSET_CLASS_CATEGORY_EMERGING_MARKET_STOCKS, SUB_ASSET_CLASS_CATEGORY_COMMODITY_STOCKS, SUB_ASSET_CLASS_CATEGORY_US_AGG_BONDS, SUB_ASSET_CLASS_CATEGORY_TBILL_BONDS, SUB_ASSET_CLASS_CATEGORY_US_TREASURY_BONDS, SUB_ASSET_CLASS_CATEGORY_US_IG_CORP_BONDS, SUB_ASSET_CLASS_CATEGORY_US_TIP_BONDS, SUB_ASSET_CLASS_CATEGORY_US_FLOATING_BONDS, SUB_ASSET_CLASS_CATEGORY_US_HIGH_YIELD, SUB_ASSET_CLASS_CATEGORY_EMERGING_MARKET_BONDS, SUB_ASSET_CLASS_CATEGORY_INTL_DEVELOPED_BONDS, SUB_ASSET_CLASS_CATEGORY_GOLD, SUB_ASSET_CLASS_CATEGORY_COMMODITIES, SUB_ASSET_CLASS_CATEGORY_CASH, SUB_ASSET_CLASS_CATEGORY_INTL_DEVELOPED_MARKETS, SUB_ASSET_CLASS_CATEGORY_CRYPTO, SUB_ASSET_CLASS_CATEGORY_US_MUNI_BONDS, SUB_ASSET_CLASS_CATEGORY_US_OPPORTUNISTIC_STOCKS, SUB_ASSET_CLASS_CATEGORY_INTL_OPPORTUNISTIC_STOCKS, SUB_ASSET_CLASS_CATEGORY_OPPORTUNISTIC, SUB_ASSET_CLASS_CATEGORY_PRIVATE_INVESTMENTS};
    }

    public /* synthetic */ SubAssetClassCategoryDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<SubAssetClassCategoryDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private SubAssetClassCategoryDto(String str, int i) {
    }

    static {
        SubAssetClassCategoryDto[] subAssetClassCategoryDtoArr$values = $values();
        $VALUES = subAssetClassCategoryDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(subAssetClassCategoryDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: yoda.service.dashboard.SubAssetClassCategoryDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SubAssetClassCategoryDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: SubAssetClassCategoryDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lyoda/service/dashboard/SubAssetClassCategoryDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lyoda/service/dashboard/SubAssetClassCategoryDto;", "Lyoda/service/dashboard/SubAssetClassCategory;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lyoda/service/dashboard/SubAssetClassCategoryDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<SubAssetClassCategoryDto, SubAssetClassCategory> {

        /* compiled from: SubAssetClassCategoryDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes28.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SubAssetClassCategory.values().length];
                try {
                    iArr[SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_US_BROAD_US_LC_STOCKS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_US_QUALITY_STOCKS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_US_VALUE_STOCKS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_US_MOMENTUM_STOCKS.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_US_GROWTH_STOCKS.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_US_DIVIDEND_STOCKS.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_REAL_ESTATE_INVESTMENT_TRUSTS.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_US_MID_CAP_STOCKS.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_US_SMALL_CAP_STOCKS.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_AUSTRALIA.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_CANADA.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_JAPAN.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_EUROPE.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_EMERGING_MARKET_STOCKS.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_COMMODITY_STOCKS.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_US_AGG_BONDS.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_TBILL_BONDS.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_US_TREASURY_BONDS.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_US_IG_CORP_BONDS.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_US_TIP_BONDS.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_US_FLOATING_BONDS.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_US_HIGH_YIELD.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_EMERGING_MARKET_BONDS.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_INTL_DEVELOPED_BONDS.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr[SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_GOLD.ordinal()] = 26;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr[SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_COMMODITIES.ordinal()] = 27;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr[SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_CASH.ordinal()] = 28;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr[SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_INTL_DEVELOPED_MARKETS.ordinal()] = 29;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr[SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_CRYPTO.ordinal()] = 30;
                } catch (NoSuchFieldError unused30) {
                }
                try {
                    iArr[SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_US_MUNI_BONDS.ordinal()] = 31;
                } catch (NoSuchFieldError unused31) {
                }
                try {
                    iArr[SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_US_OPPORTUNISTIC_STOCKS.ordinal()] = 32;
                } catch (NoSuchFieldError unused32) {
                }
                try {
                    iArr[SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_INTL_OPPORTUNISTIC_STOCKS.ordinal()] = 33;
                } catch (NoSuchFieldError unused33) {
                }
                try {
                    iArr[SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_OPPORTUNISTIC.ordinal()] = 34;
                } catch (NoSuchFieldError unused34) {
                }
                try {
                    iArr[SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_PRIVATE_INVESTMENTS.ordinal()] = 35;
                } catch (NoSuchFieldError unused35) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SubAssetClassCategoryDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SubAssetClassCategoryDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SubAssetClassCategoryDto> getBinaryBase64Serializer() {
            return (KSerializer) SubAssetClassCategoryDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<SubAssetClassCategory> getProtoAdapter() {
            return SubAssetClassCategory.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SubAssetClassCategoryDto getZeroValue() {
            return SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SubAssetClassCategoryDto fromProto(SubAssetClassCategory proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_UNSPECIFIED;
                case 2:
                    return SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_US_BROAD_US_LC_STOCKS;
                case 3:
                    return SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_US_QUALITY_STOCKS;
                case 4:
                    return SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_US_VALUE_STOCKS;
                case 5:
                    return SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_US_MOMENTUM_STOCKS;
                case 6:
                    return SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_US_GROWTH_STOCKS;
                case 7:
                    return SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_US_DIVIDEND_STOCKS;
                case 8:
                    return SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_REAL_ESTATE_INVESTMENT_TRUSTS;
                case 9:
                    return SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_US_MID_CAP_STOCKS;
                case 10:
                    return SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_US_SMALL_CAP_STOCKS;
                case 11:
                    return SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_AUSTRALIA;
                case 12:
                    return SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_CANADA;
                case 13:
                    return SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_JAPAN;
                case 14:
                    return SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_EUROPE;
                case 15:
                    return SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_EMERGING_MARKET_STOCKS;
                case 16:
                    return SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_COMMODITY_STOCKS;
                case 17:
                    return SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_US_AGG_BONDS;
                case 18:
                    return SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_TBILL_BONDS;
                case 19:
                    return SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_US_TREASURY_BONDS;
                case 20:
                    return SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_US_IG_CORP_BONDS;
                case 21:
                    return SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_US_TIP_BONDS;
                case 22:
                    return SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_US_FLOATING_BONDS;
                case 23:
                    return SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_US_HIGH_YIELD;
                case 24:
                    return SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_EMERGING_MARKET_BONDS;
                case 25:
                    return SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_INTL_DEVELOPED_BONDS;
                case 26:
                    return SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_GOLD;
                case 27:
                    return SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_COMMODITIES;
                case 28:
                    return SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_CASH;
                case 29:
                    return SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_INTL_DEVELOPED_MARKETS;
                case 30:
                    return SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_CRYPTO;
                case 31:
                    return SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_US_MUNI_BONDS;
                case 32:
                    return SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_US_OPPORTUNISTIC_STOCKS;
                case 33:
                    return SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_INTL_OPPORTUNISTIC_STOCKS;
                case 34:
                    return SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_OPPORTUNISTIC;
                case 35:
                    return SubAssetClassCategoryDto.SUB_ASSET_CLASS_CATEGORY_PRIVATE_INVESTMENTS;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: SubAssetClassCategoryDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lyoda/service/dashboard/SubAssetClassCategoryDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lyoda/service/dashboard/SubAssetClassCategoryDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<SubAssetClassCategoryDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<SubAssetClassCategoryDto, SubAssetClassCategory> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/yoda.service.dashboard.SubAssetClassCategory", SubAssetClassCategoryDto.getEntries(), SubAssetClassCategoryDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public SubAssetClassCategoryDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (SubAssetClassCategoryDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, SubAssetClassCategoryDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static SubAssetClassCategoryDto valueOf(String str) {
        return (SubAssetClassCategoryDto) Enum.valueOf(SubAssetClassCategoryDto.class, str);
    }

    public static SubAssetClassCategoryDto[] values() {
        return (SubAssetClassCategoryDto[]) $VALUES.clone();
    }
}
