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
/* compiled from: SubAssetClass.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b!\b\u0086\u0081\u0002\u0018\u0000 $2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001$B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#¨\u0006%"}, m3636d2 = {"Lyoda/service/dashboard/SubAssetClass;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SUB_ASSET_CLASS_UNSPECIFIED", "SUB_ASSET_CLASS_US_LARGE_CAP_STOCKS", "SUB_ASSET_CLASS_REAL_ESTATE_INVESTMENT_TRUSTS", "SUB_ASSET_CLASS_US_MID_CAP_STOCKS", "SUB_ASSET_CLASS_US_SMALL_CAP_STOCKS", "SUB_ASSET_CLASS_US_MLPS", "SUB_ASSET_CLASS_INTL_DEVELOPED_MARKETS", "SUB_ASSET_CLASS_EMERGING_MARKET_STOCKS", "SUB_ASSET_CLASS_COMMODITY_STOCKS", "SUB_ASSET_CLASS_US_AGG_BONDS", "SUB_ASSET_CLASS_TBILL_BONDS", "SUB_ASSET_CLASS_US_TREASURY_BONDS", "SUB_ASSET_CLASS_US_IG_CORP_BONDS", "SUB_ASSET_CLASS_US_TIP_BONDS", "SUB_ASSET_CLASS_US_FLOATING_BONDS", "SUB_ASSET_CLASS_US_HIGH_YIELD", "SUB_ASSET_CLASS_EMERGING_MARKET_BONDS", "SUB_ASSET_CLASS_INTL_DEVELOPED_BONDS", "SUB_ASSET_CLASS_GOLD", "SUB_ASSET_CLASS_COMMODITIES", "SUB_ASSET_CLASS_CASH", "SUB_ASSET_CLASS_CRYPTO", "SUB_ASSET_CLASS_US_MUNI_BONDS", "SUB_ASSET_CLASS_US_OPPORTUNISTIC_STOCKS", "SUB_ASSET_CLASS_INTL_OPPORTUNISTIC_STOCKS", "SUB_ASSET_CLASS_OPPORTUNISTIC", "SUB_ASSET_CLASS_PRIVATE_INVESTMENTS", "Companion", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class SubAssetClass implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SubAssetClass[] $VALUES;

    @JvmField
    public static final ProtoAdapter<SubAssetClass> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final SubAssetClass SUB_ASSET_CLASS_CASH;
    public static final SubAssetClass SUB_ASSET_CLASS_COMMODITIES;
    public static final SubAssetClass SUB_ASSET_CLASS_COMMODITY_STOCKS;
    public static final SubAssetClass SUB_ASSET_CLASS_CRYPTO;
    public static final SubAssetClass SUB_ASSET_CLASS_EMERGING_MARKET_BONDS;
    public static final SubAssetClass SUB_ASSET_CLASS_EMERGING_MARKET_STOCKS;
    public static final SubAssetClass SUB_ASSET_CLASS_GOLD;
    public static final SubAssetClass SUB_ASSET_CLASS_INTL_DEVELOPED_BONDS;
    public static final SubAssetClass SUB_ASSET_CLASS_INTL_DEVELOPED_MARKETS;
    public static final SubAssetClass SUB_ASSET_CLASS_INTL_OPPORTUNISTIC_STOCKS;
    public static final SubAssetClass SUB_ASSET_CLASS_OPPORTUNISTIC;
    public static final SubAssetClass SUB_ASSET_CLASS_PRIVATE_INVESTMENTS;
    public static final SubAssetClass SUB_ASSET_CLASS_REAL_ESTATE_INVESTMENT_TRUSTS;
    public static final SubAssetClass SUB_ASSET_CLASS_TBILL_BONDS;
    public static final SubAssetClass SUB_ASSET_CLASS_UNSPECIFIED;
    public static final SubAssetClass SUB_ASSET_CLASS_US_AGG_BONDS;
    public static final SubAssetClass SUB_ASSET_CLASS_US_FLOATING_BONDS;
    public static final SubAssetClass SUB_ASSET_CLASS_US_HIGH_YIELD;
    public static final SubAssetClass SUB_ASSET_CLASS_US_IG_CORP_BONDS;
    public static final SubAssetClass SUB_ASSET_CLASS_US_LARGE_CAP_STOCKS;
    public static final SubAssetClass SUB_ASSET_CLASS_US_MID_CAP_STOCKS;
    public static final SubAssetClass SUB_ASSET_CLASS_US_MLPS;
    public static final SubAssetClass SUB_ASSET_CLASS_US_MUNI_BONDS;
    public static final SubAssetClass SUB_ASSET_CLASS_US_OPPORTUNISTIC_STOCKS;
    public static final SubAssetClass SUB_ASSET_CLASS_US_SMALL_CAP_STOCKS;
    public static final SubAssetClass SUB_ASSET_CLASS_US_TIP_BONDS;
    public static final SubAssetClass SUB_ASSET_CLASS_US_TREASURY_BONDS;
    private final int value;

    private static final /* synthetic */ SubAssetClass[] $values() {
        return new SubAssetClass[]{SUB_ASSET_CLASS_UNSPECIFIED, SUB_ASSET_CLASS_US_LARGE_CAP_STOCKS, SUB_ASSET_CLASS_REAL_ESTATE_INVESTMENT_TRUSTS, SUB_ASSET_CLASS_US_MID_CAP_STOCKS, SUB_ASSET_CLASS_US_SMALL_CAP_STOCKS, SUB_ASSET_CLASS_US_MLPS, SUB_ASSET_CLASS_INTL_DEVELOPED_MARKETS, SUB_ASSET_CLASS_EMERGING_MARKET_STOCKS, SUB_ASSET_CLASS_COMMODITY_STOCKS, SUB_ASSET_CLASS_US_AGG_BONDS, SUB_ASSET_CLASS_TBILL_BONDS, SUB_ASSET_CLASS_US_TREASURY_BONDS, SUB_ASSET_CLASS_US_IG_CORP_BONDS, SUB_ASSET_CLASS_US_TIP_BONDS, SUB_ASSET_CLASS_US_FLOATING_BONDS, SUB_ASSET_CLASS_US_HIGH_YIELD, SUB_ASSET_CLASS_EMERGING_MARKET_BONDS, SUB_ASSET_CLASS_INTL_DEVELOPED_BONDS, SUB_ASSET_CLASS_GOLD, SUB_ASSET_CLASS_COMMODITIES, SUB_ASSET_CLASS_CASH, SUB_ASSET_CLASS_CRYPTO, SUB_ASSET_CLASS_US_MUNI_BONDS, SUB_ASSET_CLASS_US_OPPORTUNISTIC_STOCKS, SUB_ASSET_CLASS_INTL_OPPORTUNISTIC_STOCKS, SUB_ASSET_CLASS_OPPORTUNISTIC, SUB_ASSET_CLASS_PRIVATE_INVESTMENTS};
    }

    @JvmStatic
    public static final SubAssetClass fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<SubAssetClass> getEntries() {
        return $ENTRIES;
    }

    private SubAssetClass(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final SubAssetClass subAssetClass = new SubAssetClass("SUB_ASSET_CLASS_UNSPECIFIED", 0, 0);
        SUB_ASSET_CLASS_UNSPECIFIED = subAssetClass;
        SUB_ASSET_CLASS_US_LARGE_CAP_STOCKS = new SubAssetClass("SUB_ASSET_CLASS_US_LARGE_CAP_STOCKS", 1, 1);
        SUB_ASSET_CLASS_REAL_ESTATE_INVESTMENT_TRUSTS = new SubAssetClass("SUB_ASSET_CLASS_REAL_ESTATE_INVESTMENT_TRUSTS", 2, 2);
        SUB_ASSET_CLASS_US_MID_CAP_STOCKS = new SubAssetClass("SUB_ASSET_CLASS_US_MID_CAP_STOCKS", 3, 3);
        SUB_ASSET_CLASS_US_SMALL_CAP_STOCKS = new SubAssetClass("SUB_ASSET_CLASS_US_SMALL_CAP_STOCKS", 4, 4);
        SUB_ASSET_CLASS_US_MLPS = new SubAssetClass("SUB_ASSET_CLASS_US_MLPS", 5, 5);
        SUB_ASSET_CLASS_INTL_DEVELOPED_MARKETS = new SubAssetClass("SUB_ASSET_CLASS_INTL_DEVELOPED_MARKETS", 6, 6);
        SUB_ASSET_CLASS_EMERGING_MARKET_STOCKS = new SubAssetClass("SUB_ASSET_CLASS_EMERGING_MARKET_STOCKS", 7, 7);
        SUB_ASSET_CLASS_COMMODITY_STOCKS = new SubAssetClass("SUB_ASSET_CLASS_COMMODITY_STOCKS", 8, 8);
        SUB_ASSET_CLASS_US_AGG_BONDS = new SubAssetClass("SUB_ASSET_CLASS_US_AGG_BONDS", 9, 9);
        SUB_ASSET_CLASS_TBILL_BONDS = new SubAssetClass("SUB_ASSET_CLASS_TBILL_BONDS", 10, 10);
        SUB_ASSET_CLASS_US_TREASURY_BONDS = new SubAssetClass("SUB_ASSET_CLASS_US_TREASURY_BONDS", 11, 11);
        SUB_ASSET_CLASS_US_IG_CORP_BONDS = new SubAssetClass("SUB_ASSET_CLASS_US_IG_CORP_BONDS", 12, 12);
        SUB_ASSET_CLASS_US_TIP_BONDS = new SubAssetClass("SUB_ASSET_CLASS_US_TIP_BONDS", 13, 13);
        SUB_ASSET_CLASS_US_FLOATING_BONDS = new SubAssetClass("SUB_ASSET_CLASS_US_FLOATING_BONDS", 14, 14);
        SUB_ASSET_CLASS_US_HIGH_YIELD = new SubAssetClass("SUB_ASSET_CLASS_US_HIGH_YIELD", 15, 15);
        SUB_ASSET_CLASS_EMERGING_MARKET_BONDS = new SubAssetClass("SUB_ASSET_CLASS_EMERGING_MARKET_BONDS", 16, 17);
        SUB_ASSET_CLASS_INTL_DEVELOPED_BONDS = new SubAssetClass("SUB_ASSET_CLASS_INTL_DEVELOPED_BONDS", 17, 18);
        SUB_ASSET_CLASS_GOLD = new SubAssetClass("SUB_ASSET_CLASS_GOLD", 18, 19);
        SUB_ASSET_CLASS_COMMODITIES = new SubAssetClass("SUB_ASSET_CLASS_COMMODITIES", 19, 20);
        SUB_ASSET_CLASS_CASH = new SubAssetClass("SUB_ASSET_CLASS_CASH", 20, 21);
        SUB_ASSET_CLASS_CRYPTO = new SubAssetClass("SUB_ASSET_CLASS_CRYPTO", 21, 22);
        SUB_ASSET_CLASS_US_MUNI_BONDS = new SubAssetClass("SUB_ASSET_CLASS_US_MUNI_BONDS", 22, 23);
        SUB_ASSET_CLASS_US_OPPORTUNISTIC_STOCKS = new SubAssetClass("SUB_ASSET_CLASS_US_OPPORTUNISTIC_STOCKS", 23, 24);
        SUB_ASSET_CLASS_INTL_OPPORTUNISTIC_STOCKS = new SubAssetClass("SUB_ASSET_CLASS_INTL_OPPORTUNISTIC_STOCKS", 24, 25);
        SUB_ASSET_CLASS_OPPORTUNISTIC = new SubAssetClass("SUB_ASSET_CLASS_OPPORTUNISTIC", 25, 26);
        SUB_ASSET_CLASS_PRIVATE_INVESTMENTS = new SubAssetClass("SUB_ASSET_CLASS_PRIVATE_INVESTMENTS", 26, 27);
        SubAssetClass[] subAssetClassArr$values = $values();
        $VALUES = subAssetClassArr$values;
        $ENTRIES = EnumEntries2.enumEntries(subAssetClassArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SubAssetClass.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<SubAssetClass>(orCreateKotlinClass, syntax, subAssetClass) { // from class: yoda.service.dashboard.SubAssetClass$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public SubAssetClass fromValue(int value) {
                return SubAssetClass.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: SubAssetClass.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lyoda/service/dashboard/SubAssetClass$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lyoda/service/dashboard/SubAssetClass;", "fromValue", "value", "", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SubAssetClass fromValue(int value) {
            switch (value) {
                case 0:
                    return SubAssetClass.SUB_ASSET_CLASS_UNSPECIFIED;
                case 1:
                    return SubAssetClass.SUB_ASSET_CLASS_US_LARGE_CAP_STOCKS;
                case 2:
                    return SubAssetClass.SUB_ASSET_CLASS_REAL_ESTATE_INVESTMENT_TRUSTS;
                case 3:
                    return SubAssetClass.SUB_ASSET_CLASS_US_MID_CAP_STOCKS;
                case 4:
                    return SubAssetClass.SUB_ASSET_CLASS_US_SMALL_CAP_STOCKS;
                case 5:
                    return SubAssetClass.SUB_ASSET_CLASS_US_MLPS;
                case 6:
                    return SubAssetClass.SUB_ASSET_CLASS_INTL_DEVELOPED_MARKETS;
                case 7:
                    return SubAssetClass.SUB_ASSET_CLASS_EMERGING_MARKET_STOCKS;
                case 8:
                    return SubAssetClass.SUB_ASSET_CLASS_COMMODITY_STOCKS;
                case 9:
                    return SubAssetClass.SUB_ASSET_CLASS_US_AGG_BONDS;
                case 10:
                    return SubAssetClass.SUB_ASSET_CLASS_TBILL_BONDS;
                case 11:
                    return SubAssetClass.SUB_ASSET_CLASS_US_TREASURY_BONDS;
                case 12:
                    return SubAssetClass.SUB_ASSET_CLASS_US_IG_CORP_BONDS;
                case 13:
                    return SubAssetClass.SUB_ASSET_CLASS_US_TIP_BONDS;
                case 14:
                    return SubAssetClass.SUB_ASSET_CLASS_US_FLOATING_BONDS;
                case 15:
                    return SubAssetClass.SUB_ASSET_CLASS_US_HIGH_YIELD;
                case 16:
                default:
                    return null;
                case 17:
                    return SubAssetClass.SUB_ASSET_CLASS_EMERGING_MARKET_BONDS;
                case 18:
                    return SubAssetClass.SUB_ASSET_CLASS_INTL_DEVELOPED_BONDS;
                case 19:
                    return SubAssetClass.SUB_ASSET_CLASS_GOLD;
                case 20:
                    return SubAssetClass.SUB_ASSET_CLASS_COMMODITIES;
                case 21:
                    return SubAssetClass.SUB_ASSET_CLASS_CASH;
                case 22:
                    return SubAssetClass.SUB_ASSET_CLASS_CRYPTO;
                case 23:
                    return SubAssetClass.SUB_ASSET_CLASS_US_MUNI_BONDS;
                case 24:
                    return SubAssetClass.SUB_ASSET_CLASS_US_OPPORTUNISTIC_STOCKS;
                case 25:
                    return SubAssetClass.SUB_ASSET_CLASS_INTL_OPPORTUNISTIC_STOCKS;
                case 26:
                    return SubAssetClass.SUB_ASSET_CLASS_OPPORTUNISTIC;
                case 27:
                    return SubAssetClass.SUB_ASSET_CLASS_PRIVATE_INVESTMENTS;
            }
        }
    }

    public static SubAssetClass valueOf(String str) {
        return (SubAssetClass) Enum.valueOf(SubAssetClass.class, str);
    }

    public static SubAssetClass[] values() {
        return (SubAssetClass[]) $VALUES.clone();
    }
}
