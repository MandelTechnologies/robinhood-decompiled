package microgram.contracts.invest_tab_highlights.proto.p494v1;

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
/* compiled from: HighlightType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \u00142\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0014B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0015"}, m3636d2 = {"Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "HIGHLIGHT_TYPE_UNSPECIFIED", "TOP_MOVER", "EARNINGS", "EQUITY_PRICE_ALERT", "CRYPTO_PRICE_ALERT", "INCREASED_VOLATILITY", "YEAR_HIGH_LOW", "EC_EVENT", "EC_RESERVED", "FUTURES_TOP_MOVER", "CORTEX_PORTFOLIO_DIGEST", "Companion", "microgram.contracts.invest_tab_highlights.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class HighlightType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HighlightType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<HighlightType> ADAPTER;
    public static final HighlightType CORTEX_PORTFOLIO_DIGEST;
    public static final HighlightType CRYPTO_PRICE_ALERT;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final HighlightType EARNINGS;
    public static final HighlightType EC_EVENT;
    public static final HighlightType EC_RESERVED;
    public static final HighlightType EQUITY_PRICE_ALERT;
    public static final HighlightType FUTURES_TOP_MOVER;
    public static final HighlightType HIGHLIGHT_TYPE_UNSPECIFIED;
    public static final HighlightType INCREASED_VOLATILITY;
    public static final HighlightType TOP_MOVER;
    public static final HighlightType YEAR_HIGH_LOW;
    private final int value;

    private static final /* synthetic */ HighlightType[] $values() {
        return new HighlightType[]{HIGHLIGHT_TYPE_UNSPECIFIED, TOP_MOVER, EARNINGS, EQUITY_PRICE_ALERT, CRYPTO_PRICE_ALERT, INCREASED_VOLATILITY, YEAR_HIGH_LOW, EC_EVENT, EC_RESERVED, FUTURES_TOP_MOVER, CORTEX_PORTFOLIO_DIGEST};
    }

    @JvmStatic
    public static final HighlightType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<HighlightType> getEntries() {
        return $ENTRIES;
    }

    private HighlightType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final HighlightType highlightType = new HighlightType("HIGHLIGHT_TYPE_UNSPECIFIED", 0, 0);
        HIGHLIGHT_TYPE_UNSPECIFIED = highlightType;
        TOP_MOVER = new HighlightType("TOP_MOVER", 1, 1);
        EARNINGS = new HighlightType("EARNINGS", 2, 2);
        EQUITY_PRICE_ALERT = new HighlightType("EQUITY_PRICE_ALERT", 3, 3);
        CRYPTO_PRICE_ALERT = new HighlightType("CRYPTO_PRICE_ALERT", 4, 4);
        INCREASED_VOLATILITY = new HighlightType("INCREASED_VOLATILITY", 5, 5);
        YEAR_HIGH_LOW = new HighlightType("YEAR_HIGH_LOW", 6, 6);
        EC_EVENT = new HighlightType("EC_EVENT", 7, 7);
        EC_RESERVED = new HighlightType("EC_RESERVED", 8, 8);
        FUTURES_TOP_MOVER = new HighlightType("FUTURES_TOP_MOVER", 9, 9);
        CORTEX_PORTFOLIO_DIGEST = new HighlightType("CORTEX_PORTFOLIO_DIGEST", 10, 10);
        HighlightType[] highlightTypeArr$values = $values();
        $VALUES = highlightTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(highlightTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(HighlightType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<HighlightType>(orCreateKotlinClass, syntax, highlightType) { // from class: microgram.contracts.invest_tab_highlights.proto.v1.HighlightType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public HighlightType fromValue(int value) {
                return HighlightType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: HighlightType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightType;", "fromValue", "value", "", "microgram.contracts.invest_tab_highlights.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final HighlightType fromValue(int value) {
            switch (value) {
                case 0:
                    return HighlightType.HIGHLIGHT_TYPE_UNSPECIFIED;
                case 1:
                    return HighlightType.TOP_MOVER;
                case 2:
                    return HighlightType.EARNINGS;
                case 3:
                    return HighlightType.EQUITY_PRICE_ALERT;
                case 4:
                    return HighlightType.CRYPTO_PRICE_ALERT;
                case 5:
                    return HighlightType.INCREASED_VOLATILITY;
                case 6:
                    return HighlightType.YEAR_HIGH_LOW;
                case 7:
                    return HighlightType.EC_EVENT;
                case 8:
                    return HighlightType.EC_RESERVED;
                case 9:
                    return HighlightType.FUTURES_TOP_MOVER;
                case 10:
                    return HighlightType.CORTEX_PORTFOLIO_DIGEST;
                default:
                    return null;
            }
        }
    }

    public static HighlightType valueOf(String str) {
        return (HighlightType) Enum.valueOf(HighlightType.class, str);
    }

    public static HighlightType[] values() {
        return (HighlightType[]) $VALUES.clone();
    }
}
