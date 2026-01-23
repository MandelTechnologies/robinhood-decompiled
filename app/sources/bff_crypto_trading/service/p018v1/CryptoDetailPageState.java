package bff_crypto_trading.service.p018v1;

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
/* compiled from: CryptoDetailPageState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\b\u0086\u0081\u0002\u0018\u0000 \u001c2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u001cB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001d"}, m3636d2 = {"Lbff_crypto_trading/service/v1/CryptoDetailPageState;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CRYPTO_DETAIL_PAGE_STATE_UNSPECIFIED", "CRYPTO_DETAIL_PAGE_STATE_TRADE_BANNER", "CRYPTO_DETAIL_PAGE_STATE_CHART", "CRYPTO_DETAIL_PAGE_STATE_POSITION", "CRYPTO_DETAIL_PAGE_STATE_MICROGRAM_PROMOTIONAL_CARD", "CRYPTO_DETAIL_PAGE_STATE_CURRENCY_PAIR_DESCRIPTION", "CRYPTO_DETAIL_PAGE_STATE_HISTORY", "CRYPTO_DETAIL_PAGE_STATE_DISCLOSURES", "CRYPTO_DETAIL_PAGE_STATE_STAKING", "CRYPTO_DETAIL_PAGE_STATE_PERPETUALS", "CRYPTO_DETAIL_PAGE_STATE_STATS", "CRYPTO_DETAIL_PAGE_STATE_EQUITY_ANALYST_RATINGS", "CRYPTO_DETAIL_PAGE_STATE_EQUITY_EARNINGS", "CRYPTO_DETAIL_PAGE_STATE_TOP_LEVEL_BANNER", "CRYPTO_DETAIL_PAGE_STATE_PENDING_ORDERS", "CRYPTO_DETAIL_PAGE_STATE_IAC_CARD_BELOW_CHART", "CRYPTO_DETAIL_PAGE_STATE_BREAKING_NEWS", "CRYPTO_DETAIL_PAGE_STATE_NEWSFEED", "CRYPTO_DETAIL_PAGE_STATE_RECURRING", "Companion", "bff_crypto_trading.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class CryptoDetailPageState implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CryptoDetailPageState[] $VALUES;

    @JvmField
    public static final ProtoAdapter<CryptoDetailPageState> ADAPTER;
    public static final CryptoDetailPageState CRYPTO_DETAIL_PAGE_STATE_BREAKING_NEWS;
    public static final CryptoDetailPageState CRYPTO_DETAIL_PAGE_STATE_CHART;
    public static final CryptoDetailPageState CRYPTO_DETAIL_PAGE_STATE_CURRENCY_PAIR_DESCRIPTION;
    public static final CryptoDetailPageState CRYPTO_DETAIL_PAGE_STATE_DISCLOSURES;
    public static final CryptoDetailPageState CRYPTO_DETAIL_PAGE_STATE_EQUITY_ANALYST_RATINGS;
    public static final CryptoDetailPageState CRYPTO_DETAIL_PAGE_STATE_EQUITY_EARNINGS;
    public static final CryptoDetailPageState CRYPTO_DETAIL_PAGE_STATE_HISTORY;
    public static final CryptoDetailPageState CRYPTO_DETAIL_PAGE_STATE_IAC_CARD_BELOW_CHART;
    public static final CryptoDetailPageState CRYPTO_DETAIL_PAGE_STATE_MICROGRAM_PROMOTIONAL_CARD;
    public static final CryptoDetailPageState CRYPTO_DETAIL_PAGE_STATE_NEWSFEED;
    public static final CryptoDetailPageState CRYPTO_DETAIL_PAGE_STATE_PENDING_ORDERS;
    public static final CryptoDetailPageState CRYPTO_DETAIL_PAGE_STATE_PERPETUALS;
    public static final CryptoDetailPageState CRYPTO_DETAIL_PAGE_STATE_POSITION;
    public static final CryptoDetailPageState CRYPTO_DETAIL_PAGE_STATE_RECURRING;
    public static final CryptoDetailPageState CRYPTO_DETAIL_PAGE_STATE_STAKING;
    public static final CryptoDetailPageState CRYPTO_DETAIL_PAGE_STATE_STATS;
    public static final CryptoDetailPageState CRYPTO_DETAIL_PAGE_STATE_TOP_LEVEL_BANNER;
    public static final CryptoDetailPageState CRYPTO_DETAIL_PAGE_STATE_TRADE_BANNER;
    public static final CryptoDetailPageState CRYPTO_DETAIL_PAGE_STATE_UNSPECIFIED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;

    private static final /* synthetic */ CryptoDetailPageState[] $values() {
        return new CryptoDetailPageState[]{CRYPTO_DETAIL_PAGE_STATE_UNSPECIFIED, CRYPTO_DETAIL_PAGE_STATE_TRADE_BANNER, CRYPTO_DETAIL_PAGE_STATE_CHART, CRYPTO_DETAIL_PAGE_STATE_POSITION, CRYPTO_DETAIL_PAGE_STATE_MICROGRAM_PROMOTIONAL_CARD, CRYPTO_DETAIL_PAGE_STATE_CURRENCY_PAIR_DESCRIPTION, CRYPTO_DETAIL_PAGE_STATE_HISTORY, CRYPTO_DETAIL_PAGE_STATE_DISCLOSURES, CRYPTO_DETAIL_PAGE_STATE_STAKING, CRYPTO_DETAIL_PAGE_STATE_PERPETUALS, CRYPTO_DETAIL_PAGE_STATE_STATS, CRYPTO_DETAIL_PAGE_STATE_EQUITY_ANALYST_RATINGS, CRYPTO_DETAIL_PAGE_STATE_EQUITY_EARNINGS, CRYPTO_DETAIL_PAGE_STATE_TOP_LEVEL_BANNER, CRYPTO_DETAIL_PAGE_STATE_PENDING_ORDERS, CRYPTO_DETAIL_PAGE_STATE_IAC_CARD_BELOW_CHART, CRYPTO_DETAIL_PAGE_STATE_BREAKING_NEWS, CRYPTO_DETAIL_PAGE_STATE_NEWSFEED, CRYPTO_DETAIL_PAGE_STATE_RECURRING};
    }

    @JvmStatic
    public static final CryptoDetailPageState fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<CryptoDetailPageState> getEntries() {
        return $ENTRIES;
    }

    private CryptoDetailPageState(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final CryptoDetailPageState cryptoDetailPageState = new CryptoDetailPageState("CRYPTO_DETAIL_PAGE_STATE_UNSPECIFIED", 0, 0);
        CRYPTO_DETAIL_PAGE_STATE_UNSPECIFIED = cryptoDetailPageState;
        CRYPTO_DETAIL_PAGE_STATE_TRADE_BANNER = new CryptoDetailPageState("CRYPTO_DETAIL_PAGE_STATE_TRADE_BANNER", 1, 1);
        CRYPTO_DETAIL_PAGE_STATE_CHART = new CryptoDetailPageState("CRYPTO_DETAIL_PAGE_STATE_CHART", 2, 2);
        CRYPTO_DETAIL_PAGE_STATE_POSITION = new CryptoDetailPageState("CRYPTO_DETAIL_PAGE_STATE_POSITION", 3, 3);
        CRYPTO_DETAIL_PAGE_STATE_MICROGRAM_PROMOTIONAL_CARD = new CryptoDetailPageState("CRYPTO_DETAIL_PAGE_STATE_MICROGRAM_PROMOTIONAL_CARD", 4, 4);
        CRYPTO_DETAIL_PAGE_STATE_CURRENCY_PAIR_DESCRIPTION = new CryptoDetailPageState("CRYPTO_DETAIL_PAGE_STATE_CURRENCY_PAIR_DESCRIPTION", 5, 5);
        CRYPTO_DETAIL_PAGE_STATE_HISTORY = new CryptoDetailPageState("CRYPTO_DETAIL_PAGE_STATE_HISTORY", 6, 6);
        CRYPTO_DETAIL_PAGE_STATE_DISCLOSURES = new CryptoDetailPageState("CRYPTO_DETAIL_PAGE_STATE_DISCLOSURES", 7, 7);
        CRYPTO_DETAIL_PAGE_STATE_STAKING = new CryptoDetailPageState("CRYPTO_DETAIL_PAGE_STATE_STAKING", 8, 8);
        CRYPTO_DETAIL_PAGE_STATE_PERPETUALS = new CryptoDetailPageState("CRYPTO_DETAIL_PAGE_STATE_PERPETUALS", 9, 9);
        CRYPTO_DETAIL_PAGE_STATE_STATS = new CryptoDetailPageState("CRYPTO_DETAIL_PAGE_STATE_STATS", 10, 10);
        CRYPTO_DETAIL_PAGE_STATE_EQUITY_ANALYST_RATINGS = new CryptoDetailPageState("CRYPTO_DETAIL_PAGE_STATE_EQUITY_ANALYST_RATINGS", 11, 11);
        CRYPTO_DETAIL_PAGE_STATE_EQUITY_EARNINGS = new CryptoDetailPageState("CRYPTO_DETAIL_PAGE_STATE_EQUITY_EARNINGS", 12, 12);
        CRYPTO_DETAIL_PAGE_STATE_TOP_LEVEL_BANNER = new CryptoDetailPageState("CRYPTO_DETAIL_PAGE_STATE_TOP_LEVEL_BANNER", 13, 13);
        CRYPTO_DETAIL_PAGE_STATE_PENDING_ORDERS = new CryptoDetailPageState("CRYPTO_DETAIL_PAGE_STATE_PENDING_ORDERS", 14, 14);
        CRYPTO_DETAIL_PAGE_STATE_IAC_CARD_BELOW_CHART = new CryptoDetailPageState("CRYPTO_DETAIL_PAGE_STATE_IAC_CARD_BELOW_CHART", 15, 15);
        CRYPTO_DETAIL_PAGE_STATE_BREAKING_NEWS = new CryptoDetailPageState("CRYPTO_DETAIL_PAGE_STATE_BREAKING_NEWS", 16, 16);
        CRYPTO_DETAIL_PAGE_STATE_NEWSFEED = new CryptoDetailPageState("CRYPTO_DETAIL_PAGE_STATE_NEWSFEED", 17, 17);
        CRYPTO_DETAIL_PAGE_STATE_RECURRING = new CryptoDetailPageState("CRYPTO_DETAIL_PAGE_STATE_RECURRING", 18, 18);
        CryptoDetailPageState[] cryptoDetailPageStateArr$values = $values();
        $VALUES = cryptoDetailPageStateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(cryptoDetailPageStateArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CryptoDetailPageState.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<CryptoDetailPageState>(orCreateKotlinClass, syntax, cryptoDetailPageState) { // from class: bff_crypto_trading.service.v1.CryptoDetailPageState$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public CryptoDetailPageState fromValue(int value) {
                return CryptoDetailPageState.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: CryptoDetailPageState.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lbff_crypto_trading/service/v1/CryptoDetailPageState$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lbff_crypto_trading/service/v1/CryptoDetailPageState;", "fromValue", "value", "", "bff_crypto_trading.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoDetailPageState fromValue(int value) {
            switch (value) {
                case 0:
                    return CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_UNSPECIFIED;
                case 1:
                    return CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_TRADE_BANNER;
                case 2:
                    return CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_CHART;
                case 3:
                    return CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_POSITION;
                case 4:
                    return CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_MICROGRAM_PROMOTIONAL_CARD;
                case 5:
                    return CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_CURRENCY_PAIR_DESCRIPTION;
                case 6:
                    return CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_HISTORY;
                case 7:
                    return CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_DISCLOSURES;
                case 8:
                    return CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_STAKING;
                case 9:
                    return CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_PERPETUALS;
                case 10:
                    return CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_STATS;
                case 11:
                    return CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_EQUITY_ANALYST_RATINGS;
                case 12:
                    return CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_EQUITY_EARNINGS;
                case 13:
                    return CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_TOP_LEVEL_BANNER;
                case 14:
                    return CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_PENDING_ORDERS;
                case 15:
                    return CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_IAC_CARD_BELOW_CHART;
                case 16:
                    return CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_BREAKING_NEWS;
                case 17:
                    return CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_NEWSFEED;
                case 18:
                    return CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_RECURRING;
                default:
                    return null;
            }
        }
    }

    public static CryptoDetailPageState valueOf(String str) {
        return (CryptoDetailPageState) Enum.valueOf(CryptoDetailPageState.class, str);
    }

    public static CryptoDetailPageState[] values() {
        return (CryptoDetailPageState[]) $VALUES.clone();
    }
}
