package rosetta.order;

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
/* compiled from: MarketHours.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lrosetta/order/MarketHours;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "MARKET_HOURS_UNSPECIFIED", "REGULAR_HOURS", "EXTENDED_HOURS", "HYPER_EXTENDED_HOURS", "ALL_DAY_HOURS", "REGULAR_CURB_HOURS", "Companion", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class MarketHours implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MarketHours[] $VALUES;

    @JvmField
    public static final ProtoAdapter<MarketHours> ADAPTER;
    public static final MarketHours ALL_DAY_HOURS;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final MarketHours EXTENDED_HOURS;
    public static final MarketHours HYPER_EXTENDED_HOURS;
    public static final MarketHours MARKET_HOURS_UNSPECIFIED;
    public static final MarketHours REGULAR_CURB_HOURS;
    public static final MarketHours REGULAR_HOURS;
    private final int value;

    private static final /* synthetic */ MarketHours[] $values() {
        return new MarketHours[]{MARKET_HOURS_UNSPECIFIED, REGULAR_HOURS, EXTENDED_HOURS, HYPER_EXTENDED_HOURS, ALL_DAY_HOURS, REGULAR_CURB_HOURS};
    }

    @JvmStatic
    public static final MarketHours fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<MarketHours> getEntries() {
        return $ENTRIES;
    }

    private MarketHours(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final MarketHours marketHours = new MarketHours("MARKET_HOURS_UNSPECIFIED", 0, 0);
        MARKET_HOURS_UNSPECIFIED = marketHours;
        REGULAR_HOURS = new MarketHours("REGULAR_HOURS", 1, 1);
        EXTENDED_HOURS = new MarketHours("EXTENDED_HOURS", 2, 2);
        HYPER_EXTENDED_HOURS = new MarketHours("HYPER_EXTENDED_HOURS", 3, 3);
        ALL_DAY_HOURS = new MarketHours("ALL_DAY_HOURS", 4, 4);
        REGULAR_CURB_HOURS = new MarketHours("REGULAR_CURB_HOURS", 5, 5);
        MarketHours[] marketHoursArr$values = $values();
        $VALUES = marketHoursArr$values;
        $ENTRIES = EnumEntries2.enumEntries(marketHoursArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MarketHours.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<MarketHours>(orCreateKotlinClass, syntax, marketHours) { // from class: rosetta.order.MarketHours$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public MarketHours fromValue(int value) {
                return MarketHours.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: MarketHours.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/order/MarketHours$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/order/MarketHours;", "fromValue", "value", "", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MarketHours fromValue(int value) {
            if (value == 0) {
                return MarketHours.MARKET_HOURS_UNSPECIFIED;
            }
            if (value == 1) {
                return MarketHours.REGULAR_HOURS;
            }
            if (value == 2) {
                return MarketHours.EXTENDED_HOURS;
            }
            if (value == 3) {
                return MarketHours.HYPER_EXTENDED_HOURS;
            }
            if (value == 4) {
                return MarketHours.ALL_DAY_HOURS;
            }
            if (value != 5) {
                return null;
            }
            return MarketHours.REGULAR_CURB_HOURS;
        }
    }

    public static MarketHours valueOf(String str) {
        return (MarketHours) Enum.valueOf(MarketHours.class, str);
    }

    public static MarketHours[] values() {
        return (MarketHours[]) $VALUES.clone();
    }
}
