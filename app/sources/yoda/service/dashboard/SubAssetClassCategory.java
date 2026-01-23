package yoda.service.dashboard;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SubAssetClassCategory.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b)\b\u0086\u0081\u0002\u0018\u0000 ,2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001,B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+¨\u0006-"}, m3636d2 = {"Lyoda/service/dashboard/SubAssetClassCategory;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SUB_ASSET_CLASS_CATEGORY_UNSPECIFIED", "SUB_ASSET_CLASS_CATEGORY_US_BROAD_US_LC_STOCKS", "SUB_ASSET_CLASS_CATEGORY_US_QUALITY_STOCKS", "SUB_ASSET_CLASS_CATEGORY_US_VALUE_STOCKS", "SUB_ASSET_CLASS_CATEGORY_US_MOMENTUM_STOCKS", "SUB_ASSET_CLASS_CATEGORY_US_GROWTH_STOCKS", "SUB_ASSET_CLASS_CATEGORY_US_DIVIDEND_STOCKS", "SUB_ASSET_CLASS_CATEGORY_REAL_ESTATE_INVESTMENT_TRUSTS", "SUB_ASSET_CLASS_CATEGORY_US_MID_CAP_STOCKS", "SUB_ASSET_CLASS_CATEGORY_US_SMALL_CAP_STOCKS", "SUB_ASSET_CLASS_CATEGORY_AUSTRALIA", "SUB_ASSET_CLASS_CATEGORY_CANADA", "SUB_ASSET_CLASS_CATEGORY_JAPAN", "SUB_ASSET_CLASS_CATEGORY_EUROPE", "SUB_ASSET_CLASS_CATEGORY_EMERGING_MARKET_STOCKS", "SUB_ASSET_CLASS_CATEGORY_COMMODITY_STOCKS", "SUB_ASSET_CLASS_CATEGORY_US_AGG_BONDS", "SUB_ASSET_CLASS_CATEGORY_TBILL_BONDS", "SUB_ASSET_CLASS_CATEGORY_US_TREASURY_BONDS", "SUB_ASSET_CLASS_CATEGORY_US_IG_CORP_BONDS", "SUB_ASSET_CLASS_CATEGORY_US_TIP_BONDS", "SUB_ASSET_CLASS_CATEGORY_US_FLOATING_BONDS", "SUB_ASSET_CLASS_CATEGORY_US_HIGH_YIELD", "SUB_ASSET_CLASS_CATEGORY_EMERGING_MARKET_BONDS", "SUB_ASSET_CLASS_CATEGORY_INTL_DEVELOPED_BONDS", "SUB_ASSET_CLASS_CATEGORY_GOLD", "SUB_ASSET_CLASS_CATEGORY_COMMODITIES", "SUB_ASSET_CLASS_CATEGORY_CASH", "SUB_ASSET_CLASS_CATEGORY_INTL_DEVELOPED_MARKETS", "SUB_ASSET_CLASS_CATEGORY_CRYPTO", "SUB_ASSET_CLASS_CATEGORY_US_MUNI_BONDS", "SUB_ASSET_CLASS_CATEGORY_US_OPPORTUNISTIC_STOCKS", "SUB_ASSET_CLASS_CATEGORY_INTL_OPPORTUNISTIC_STOCKS", "SUB_ASSET_CLASS_CATEGORY_OPPORTUNISTIC", "SUB_ASSET_CLASS_CATEGORY_PRIVATE_INVESTMENTS", "Companion", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class SubAssetClassCategory implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SubAssetClassCategory[] $VALUES;

    @JvmField
    public static final ProtoAdapter<SubAssetClassCategory> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final SubAssetClassCategory SUB_ASSET_CLASS_CATEGORY_AUSTRALIA;
    public static final SubAssetClassCategory SUB_ASSET_CLASS_CATEGORY_CANADA;
    public static final SubAssetClassCategory SUB_ASSET_CLASS_CATEGORY_CASH;
    public static final SubAssetClassCategory SUB_ASSET_CLASS_CATEGORY_COMMODITIES;
    public static final SubAssetClassCategory SUB_ASSET_CLASS_CATEGORY_COMMODITY_STOCKS;
    public static final SubAssetClassCategory SUB_ASSET_CLASS_CATEGORY_CRYPTO;
    public static final SubAssetClassCategory SUB_ASSET_CLASS_CATEGORY_EMERGING_MARKET_BONDS;
    public static final SubAssetClassCategory SUB_ASSET_CLASS_CATEGORY_EMERGING_MARKET_STOCKS;
    public static final SubAssetClassCategory SUB_ASSET_CLASS_CATEGORY_EUROPE;
    public static final SubAssetClassCategory SUB_ASSET_CLASS_CATEGORY_GOLD;
    public static final SubAssetClassCategory SUB_ASSET_CLASS_CATEGORY_INTL_DEVELOPED_BONDS;
    public static final SubAssetClassCategory SUB_ASSET_CLASS_CATEGORY_INTL_DEVELOPED_MARKETS;
    public static final SubAssetClassCategory SUB_ASSET_CLASS_CATEGORY_INTL_OPPORTUNISTIC_STOCKS;
    public static final SubAssetClassCategory SUB_ASSET_CLASS_CATEGORY_JAPAN;
    public static final SubAssetClassCategory SUB_ASSET_CLASS_CATEGORY_OPPORTUNISTIC;
    public static final SubAssetClassCategory SUB_ASSET_CLASS_CATEGORY_PRIVATE_INVESTMENTS;
    public static final SubAssetClassCategory SUB_ASSET_CLASS_CATEGORY_REAL_ESTATE_INVESTMENT_TRUSTS;
    public static final SubAssetClassCategory SUB_ASSET_CLASS_CATEGORY_TBILL_BONDS;
    public static final SubAssetClassCategory SUB_ASSET_CLASS_CATEGORY_UNSPECIFIED;
    public static final SubAssetClassCategory SUB_ASSET_CLASS_CATEGORY_US_AGG_BONDS;
    public static final SubAssetClassCategory SUB_ASSET_CLASS_CATEGORY_US_BROAD_US_LC_STOCKS;
    public static final SubAssetClassCategory SUB_ASSET_CLASS_CATEGORY_US_DIVIDEND_STOCKS;
    public static final SubAssetClassCategory SUB_ASSET_CLASS_CATEGORY_US_FLOATING_BONDS;
    public static final SubAssetClassCategory SUB_ASSET_CLASS_CATEGORY_US_GROWTH_STOCKS;
    public static final SubAssetClassCategory SUB_ASSET_CLASS_CATEGORY_US_HIGH_YIELD;
    public static final SubAssetClassCategory SUB_ASSET_CLASS_CATEGORY_US_IG_CORP_BONDS;
    public static final SubAssetClassCategory SUB_ASSET_CLASS_CATEGORY_US_MID_CAP_STOCKS;
    public static final SubAssetClassCategory SUB_ASSET_CLASS_CATEGORY_US_MOMENTUM_STOCKS;
    public static final SubAssetClassCategory SUB_ASSET_CLASS_CATEGORY_US_MUNI_BONDS;
    public static final SubAssetClassCategory SUB_ASSET_CLASS_CATEGORY_US_OPPORTUNISTIC_STOCKS;
    public static final SubAssetClassCategory SUB_ASSET_CLASS_CATEGORY_US_QUALITY_STOCKS;
    public static final SubAssetClassCategory SUB_ASSET_CLASS_CATEGORY_US_SMALL_CAP_STOCKS;
    public static final SubAssetClassCategory SUB_ASSET_CLASS_CATEGORY_US_TIP_BONDS;
    public static final SubAssetClassCategory SUB_ASSET_CLASS_CATEGORY_US_TREASURY_BONDS;
    public static final SubAssetClassCategory SUB_ASSET_CLASS_CATEGORY_US_VALUE_STOCKS;
    private final int value;

    private static final /* synthetic */ SubAssetClassCategory[] $values() {
        return new SubAssetClassCategory[]{SUB_ASSET_CLASS_CATEGORY_UNSPECIFIED, SUB_ASSET_CLASS_CATEGORY_US_BROAD_US_LC_STOCKS, SUB_ASSET_CLASS_CATEGORY_US_QUALITY_STOCKS, SUB_ASSET_CLASS_CATEGORY_US_VALUE_STOCKS, SUB_ASSET_CLASS_CATEGORY_US_MOMENTUM_STOCKS, SUB_ASSET_CLASS_CATEGORY_US_GROWTH_STOCKS, SUB_ASSET_CLASS_CATEGORY_US_DIVIDEND_STOCKS, SUB_ASSET_CLASS_CATEGORY_REAL_ESTATE_INVESTMENT_TRUSTS, SUB_ASSET_CLASS_CATEGORY_US_MID_CAP_STOCKS, SUB_ASSET_CLASS_CATEGORY_US_SMALL_CAP_STOCKS, SUB_ASSET_CLASS_CATEGORY_AUSTRALIA, SUB_ASSET_CLASS_CATEGORY_CANADA, SUB_ASSET_CLASS_CATEGORY_JAPAN, SUB_ASSET_CLASS_CATEGORY_EUROPE, SUB_ASSET_CLASS_CATEGORY_EMERGING_MARKET_STOCKS, SUB_ASSET_CLASS_CATEGORY_COMMODITY_STOCKS, SUB_ASSET_CLASS_CATEGORY_US_AGG_BONDS, SUB_ASSET_CLASS_CATEGORY_TBILL_BONDS, SUB_ASSET_CLASS_CATEGORY_US_TREASURY_BONDS, SUB_ASSET_CLASS_CATEGORY_US_IG_CORP_BONDS, SUB_ASSET_CLASS_CATEGORY_US_TIP_BONDS, SUB_ASSET_CLASS_CATEGORY_US_FLOATING_BONDS, SUB_ASSET_CLASS_CATEGORY_US_HIGH_YIELD, SUB_ASSET_CLASS_CATEGORY_EMERGING_MARKET_BONDS, SUB_ASSET_CLASS_CATEGORY_INTL_DEVELOPED_BONDS, SUB_ASSET_CLASS_CATEGORY_GOLD, SUB_ASSET_CLASS_CATEGORY_COMMODITIES, SUB_ASSET_CLASS_CATEGORY_CASH, SUB_ASSET_CLASS_CATEGORY_INTL_DEVELOPED_MARKETS, SUB_ASSET_CLASS_CATEGORY_CRYPTO, SUB_ASSET_CLASS_CATEGORY_US_MUNI_BONDS, SUB_ASSET_CLASS_CATEGORY_US_OPPORTUNISTIC_STOCKS, SUB_ASSET_CLASS_CATEGORY_INTL_OPPORTUNISTIC_STOCKS, SUB_ASSET_CLASS_CATEGORY_OPPORTUNISTIC, SUB_ASSET_CLASS_CATEGORY_PRIVATE_INVESTMENTS};
    }

    @JvmStatic
    public static final SubAssetClassCategory fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<SubAssetClassCategory> getEntries() {
        return $ENTRIES;
    }

    private SubAssetClassCategory(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final SubAssetClassCategory subAssetClassCategory = new SubAssetClassCategory("SUB_ASSET_CLASS_CATEGORY_UNSPECIFIED", 0, 0);
        SUB_ASSET_CLASS_CATEGORY_UNSPECIFIED = subAssetClassCategory;
        SUB_ASSET_CLASS_CATEGORY_US_BROAD_US_LC_STOCKS = new SubAssetClassCategory("SUB_ASSET_CLASS_CATEGORY_US_BROAD_US_LC_STOCKS", 1, 1);
        SUB_ASSET_CLASS_CATEGORY_US_QUALITY_STOCKS = new SubAssetClassCategory("SUB_ASSET_CLASS_CATEGORY_US_QUALITY_STOCKS", 2, 2);
        SUB_ASSET_CLASS_CATEGORY_US_VALUE_STOCKS = new SubAssetClassCategory("SUB_ASSET_CLASS_CATEGORY_US_VALUE_STOCKS", 3, 3);
        SUB_ASSET_CLASS_CATEGORY_US_MOMENTUM_STOCKS = new SubAssetClassCategory("SUB_ASSET_CLASS_CATEGORY_US_MOMENTUM_STOCKS", 4, 4);
        SUB_ASSET_CLASS_CATEGORY_US_GROWTH_STOCKS = new SubAssetClassCategory("SUB_ASSET_CLASS_CATEGORY_US_GROWTH_STOCKS", 5, 5);
        SUB_ASSET_CLASS_CATEGORY_US_DIVIDEND_STOCKS = new SubAssetClassCategory("SUB_ASSET_CLASS_CATEGORY_US_DIVIDEND_STOCKS", 6, 6);
        SUB_ASSET_CLASS_CATEGORY_REAL_ESTATE_INVESTMENT_TRUSTS = new SubAssetClassCategory("SUB_ASSET_CLASS_CATEGORY_REAL_ESTATE_INVESTMENT_TRUSTS", 7, 7);
        SUB_ASSET_CLASS_CATEGORY_US_MID_CAP_STOCKS = new SubAssetClassCategory("SUB_ASSET_CLASS_CATEGORY_US_MID_CAP_STOCKS", 8, 8);
        SUB_ASSET_CLASS_CATEGORY_US_SMALL_CAP_STOCKS = new SubAssetClassCategory("SUB_ASSET_CLASS_CATEGORY_US_SMALL_CAP_STOCKS", 9, 9);
        SUB_ASSET_CLASS_CATEGORY_AUSTRALIA = new SubAssetClassCategory("SUB_ASSET_CLASS_CATEGORY_AUSTRALIA", 10, 10);
        SUB_ASSET_CLASS_CATEGORY_CANADA = new SubAssetClassCategory("SUB_ASSET_CLASS_CATEGORY_CANADA", 11, 11);
        SUB_ASSET_CLASS_CATEGORY_JAPAN = new SubAssetClassCategory("SUB_ASSET_CLASS_CATEGORY_JAPAN", 12, 12);
        SUB_ASSET_CLASS_CATEGORY_EUROPE = new SubAssetClassCategory("SUB_ASSET_CLASS_CATEGORY_EUROPE", 13, 13);
        SUB_ASSET_CLASS_CATEGORY_EMERGING_MARKET_STOCKS = new SubAssetClassCategory("SUB_ASSET_CLASS_CATEGORY_EMERGING_MARKET_STOCKS", 14, 14);
        SUB_ASSET_CLASS_CATEGORY_COMMODITY_STOCKS = new SubAssetClassCategory("SUB_ASSET_CLASS_CATEGORY_COMMODITY_STOCKS", 15, 15);
        SUB_ASSET_CLASS_CATEGORY_US_AGG_BONDS = new SubAssetClassCategory("SUB_ASSET_CLASS_CATEGORY_US_AGG_BONDS", 16, 16);
        SUB_ASSET_CLASS_CATEGORY_TBILL_BONDS = new SubAssetClassCategory("SUB_ASSET_CLASS_CATEGORY_TBILL_BONDS", 17, 17);
        SUB_ASSET_CLASS_CATEGORY_US_TREASURY_BONDS = new SubAssetClassCategory("SUB_ASSET_CLASS_CATEGORY_US_TREASURY_BONDS", 18, 18);
        SUB_ASSET_CLASS_CATEGORY_US_IG_CORP_BONDS = new SubAssetClassCategory("SUB_ASSET_CLASS_CATEGORY_US_IG_CORP_BONDS", 19, 19);
        SUB_ASSET_CLASS_CATEGORY_US_TIP_BONDS = new SubAssetClassCategory("SUB_ASSET_CLASS_CATEGORY_US_TIP_BONDS", 20, 20);
        SUB_ASSET_CLASS_CATEGORY_US_FLOATING_BONDS = new SubAssetClassCategory("SUB_ASSET_CLASS_CATEGORY_US_FLOATING_BONDS", 21, 21);
        SUB_ASSET_CLASS_CATEGORY_US_HIGH_YIELD = new SubAssetClassCategory("SUB_ASSET_CLASS_CATEGORY_US_HIGH_YIELD", 22, 22);
        SUB_ASSET_CLASS_CATEGORY_EMERGING_MARKET_BONDS = new SubAssetClassCategory("SUB_ASSET_CLASS_CATEGORY_EMERGING_MARKET_BONDS", 23, 23);
        SUB_ASSET_CLASS_CATEGORY_INTL_DEVELOPED_BONDS = new SubAssetClassCategory("SUB_ASSET_CLASS_CATEGORY_INTL_DEVELOPED_BONDS", 24, 24);
        SUB_ASSET_CLASS_CATEGORY_GOLD = new SubAssetClassCategory("SUB_ASSET_CLASS_CATEGORY_GOLD", 25, 25);
        SUB_ASSET_CLASS_CATEGORY_COMMODITIES = new SubAssetClassCategory("SUB_ASSET_CLASS_CATEGORY_COMMODITIES", 26, 26);
        SUB_ASSET_CLASS_CATEGORY_CASH = new SubAssetClassCategory("SUB_ASSET_CLASS_CATEGORY_CASH", 27, 27);
        SUB_ASSET_CLASS_CATEGORY_INTL_DEVELOPED_MARKETS = new SubAssetClassCategory("SUB_ASSET_CLASS_CATEGORY_INTL_DEVELOPED_MARKETS", 28, 28);
        SUB_ASSET_CLASS_CATEGORY_CRYPTO = new SubAssetClassCategory("SUB_ASSET_CLASS_CATEGORY_CRYPTO", 29, 29);
        SUB_ASSET_CLASS_CATEGORY_US_MUNI_BONDS = new SubAssetClassCategory("SUB_ASSET_CLASS_CATEGORY_US_MUNI_BONDS", 30, 30);
        SUB_ASSET_CLASS_CATEGORY_US_OPPORTUNISTIC_STOCKS = new SubAssetClassCategory("SUB_ASSET_CLASS_CATEGORY_US_OPPORTUNISTIC_STOCKS", 31, 31);
        SUB_ASSET_CLASS_CATEGORY_INTL_OPPORTUNISTIC_STOCKS = new SubAssetClassCategory("SUB_ASSET_CLASS_CATEGORY_INTL_OPPORTUNISTIC_STOCKS", 32, 32);
        SUB_ASSET_CLASS_CATEGORY_OPPORTUNISTIC = new SubAssetClassCategory("SUB_ASSET_CLASS_CATEGORY_OPPORTUNISTIC", 33, 33);
        SUB_ASSET_CLASS_CATEGORY_PRIVATE_INVESTMENTS = new SubAssetClassCategory("SUB_ASSET_CLASS_CATEGORY_PRIVATE_INVESTMENTS", 34, 34);
        SubAssetClassCategory[] subAssetClassCategoryArr$values = $values();
        $VALUES = subAssetClassCategoryArr$values;
        $ENTRIES = EnumEntries2.enumEntries(subAssetClassCategoryArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SubAssetClassCategory.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<SubAssetClassCategory>(orCreateKotlinClass, syntax, subAssetClassCategory) { // from class: yoda.service.dashboard.SubAssetClassCategory$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public SubAssetClassCategory fromValue(int value) {
                return SubAssetClassCategory.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: SubAssetClassCategory.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lyoda/service/dashboard/SubAssetClassCategory$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lyoda/service/dashboard/SubAssetClassCategory;", "fromValue", "value", "", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SubAssetClassCategory fromValue(int value) {
            switch (value) {
                case 0:
                    return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_UNSPECIFIED;
                case 1:
                    return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_US_BROAD_US_LC_STOCKS;
                case 2:
                    return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_US_QUALITY_STOCKS;
                case 3:
                    return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_US_VALUE_STOCKS;
                case 4:
                    return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_US_MOMENTUM_STOCKS;
                case 5:
                    return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_US_GROWTH_STOCKS;
                case 6:
                    return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_US_DIVIDEND_STOCKS;
                case 7:
                    return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_REAL_ESTATE_INVESTMENT_TRUSTS;
                case 8:
                    return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_US_MID_CAP_STOCKS;
                case 9:
                    return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_US_SMALL_CAP_STOCKS;
                case 10:
                    return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_AUSTRALIA;
                case 11:
                    return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_CANADA;
                case 12:
                    return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_JAPAN;
                case 13:
                    return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_EUROPE;
                case 14:
                    return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_EMERGING_MARKET_STOCKS;
                case 15:
                    return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_COMMODITY_STOCKS;
                case 16:
                    return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_US_AGG_BONDS;
                case 17:
                    return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_TBILL_BONDS;
                case 18:
                    return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_US_TREASURY_BONDS;
                case 19:
                    return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_US_IG_CORP_BONDS;
                case 20:
                    return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_US_TIP_BONDS;
                case 21:
                    return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_US_FLOATING_BONDS;
                case 22:
                    return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_US_HIGH_YIELD;
                case 23:
                    return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_EMERGING_MARKET_BONDS;
                case 24:
                    return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_INTL_DEVELOPED_BONDS;
                case 25:
                    return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_GOLD;
                case 26:
                    return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_COMMODITIES;
                case 27:
                    return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_CASH;
                case 28:
                    return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_INTL_DEVELOPED_MARKETS;
                case 29:
                    return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_CRYPTO;
                case 30:
                    return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_US_MUNI_BONDS;
                case 31:
                    return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_US_OPPORTUNISTIC_STOCKS;
                case 32:
                    return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_INTL_OPPORTUNISTIC_STOCKS;
                case 33:
                    return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_OPPORTUNISTIC;
                case 34:
                    return SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_PRIVATE_INVESTMENTS;
                default:
                    return null;
            }
        }
    }

    public static SubAssetClassCategory valueOf(String str) {
        return (SubAssetClassCategory) Enum.valueOf(SubAssetClassCategory.class, str);
    }

    public static SubAssetClassCategory[] values() {
        return (SubAssetClassCategory[]) $VALUES.clone();
    }
}
