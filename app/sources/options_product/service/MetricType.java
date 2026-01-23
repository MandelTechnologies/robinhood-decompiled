package options_product.service;

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
/* compiled from: MetricType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u001f\b\u0086\u0081\u0002\u0018\u0000 \"2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\"B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!¨\u0006#"}, m3636d2 = {"Loptions_product/service/MetricType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "METRIC_TYPE_UNSPECIFIED", "BID_PRICE", "ASK_PRICE", "MARK_PRICE", "LAST_TRADE", "PREVIOUS_CLOSE", "HIGH_PRICE", "LOW_PRICE", "NET_CHANGE", "PCT_CHANGE", "IMPLIED_VOLATILITY", "BREAKEVEN", "TO_BREAKEVEN", "CHANCE_OF_PROFIT", "BID_SIZE", "ASK_SIZE", "VOLUME", "OPEN_INTEREST", "DELTA", "GAMMA", "THETA", "VEGA", "RHO", "CHANCE_OF_PROFIT_SHORT", "CHANCE_OF_PROFIT_LONG", "Companion", "options_product.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class MetricType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MetricType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<MetricType> ADAPTER;
    public static final MetricType ASK_PRICE;
    public static final MetricType ASK_SIZE;
    public static final MetricType BID_PRICE;
    public static final MetricType BID_SIZE;
    public static final MetricType BREAKEVEN;
    public static final MetricType CHANCE_OF_PROFIT;
    public static final MetricType CHANCE_OF_PROFIT_LONG;
    public static final MetricType CHANCE_OF_PROFIT_SHORT;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final MetricType DELTA;
    public static final MetricType GAMMA;
    public static final MetricType HIGH_PRICE;
    public static final MetricType IMPLIED_VOLATILITY;
    public static final MetricType LAST_TRADE;
    public static final MetricType LOW_PRICE;
    public static final MetricType MARK_PRICE;
    public static final MetricType METRIC_TYPE_UNSPECIFIED;
    public static final MetricType NET_CHANGE;
    public static final MetricType OPEN_INTEREST;
    public static final MetricType PCT_CHANGE;
    public static final MetricType PREVIOUS_CLOSE;
    public static final MetricType RHO;
    public static final MetricType THETA;
    public static final MetricType TO_BREAKEVEN;
    public static final MetricType VEGA;
    public static final MetricType VOLUME;
    private final int value;

    private static final /* synthetic */ MetricType[] $values() {
        return new MetricType[]{METRIC_TYPE_UNSPECIFIED, BID_PRICE, ASK_PRICE, MARK_PRICE, LAST_TRADE, PREVIOUS_CLOSE, HIGH_PRICE, LOW_PRICE, NET_CHANGE, PCT_CHANGE, IMPLIED_VOLATILITY, BREAKEVEN, TO_BREAKEVEN, CHANCE_OF_PROFIT, BID_SIZE, ASK_SIZE, VOLUME, OPEN_INTEREST, DELTA, GAMMA, THETA, VEGA, RHO, CHANCE_OF_PROFIT_SHORT, CHANCE_OF_PROFIT_LONG};
    }

    @JvmStatic
    public static final MetricType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<MetricType> getEntries() {
        return $ENTRIES;
    }

    private MetricType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final MetricType metricType = new MetricType("METRIC_TYPE_UNSPECIFIED", 0, 0);
        METRIC_TYPE_UNSPECIFIED = metricType;
        BID_PRICE = new MetricType("BID_PRICE", 1, 1);
        ASK_PRICE = new MetricType("ASK_PRICE", 2, 2);
        MARK_PRICE = new MetricType("MARK_PRICE", 3, 3);
        LAST_TRADE = new MetricType("LAST_TRADE", 4, 4);
        PREVIOUS_CLOSE = new MetricType("PREVIOUS_CLOSE", 5, 5);
        HIGH_PRICE = new MetricType("HIGH_PRICE", 6, 6);
        LOW_PRICE = new MetricType("LOW_PRICE", 7, 7);
        NET_CHANGE = new MetricType("NET_CHANGE", 8, 8);
        PCT_CHANGE = new MetricType("PCT_CHANGE", 9, 9);
        IMPLIED_VOLATILITY = new MetricType("IMPLIED_VOLATILITY", 10, 10);
        BREAKEVEN = new MetricType("BREAKEVEN", 11, 11);
        TO_BREAKEVEN = new MetricType("TO_BREAKEVEN", 12, 12);
        CHANCE_OF_PROFIT = new MetricType("CHANCE_OF_PROFIT", 13, 13);
        BID_SIZE = new MetricType("BID_SIZE", 14, 14);
        ASK_SIZE = new MetricType("ASK_SIZE", 15, 15);
        VOLUME = new MetricType("VOLUME", 16, 16);
        OPEN_INTEREST = new MetricType("OPEN_INTEREST", 17, 17);
        DELTA = new MetricType("DELTA", 18, 18);
        GAMMA = new MetricType("GAMMA", 19, 19);
        THETA = new MetricType("THETA", 20, 20);
        VEGA = new MetricType("VEGA", 21, 21);
        RHO = new MetricType("RHO", 22, 22);
        CHANCE_OF_PROFIT_SHORT = new MetricType("CHANCE_OF_PROFIT_SHORT", 23, 23);
        CHANCE_OF_PROFIT_LONG = new MetricType("CHANCE_OF_PROFIT_LONG", 24, 24);
        MetricType[] metricTypeArr$values = $values();
        $VALUES = metricTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(metricTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MetricType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<MetricType>(orCreateKotlinClass, syntax, metricType) { // from class: options_product.service.MetricType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public MetricType fromValue(int value) {
                return MetricType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: MetricType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Loptions_product/service/MetricType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Loptions_product/service/MetricType;", "fromValue", "value", "", "options_product.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MetricType fromValue(int value) {
            switch (value) {
                case 0:
                    return MetricType.METRIC_TYPE_UNSPECIFIED;
                case 1:
                    return MetricType.BID_PRICE;
                case 2:
                    return MetricType.ASK_PRICE;
                case 3:
                    return MetricType.MARK_PRICE;
                case 4:
                    return MetricType.LAST_TRADE;
                case 5:
                    return MetricType.PREVIOUS_CLOSE;
                case 6:
                    return MetricType.HIGH_PRICE;
                case 7:
                    return MetricType.LOW_PRICE;
                case 8:
                    return MetricType.NET_CHANGE;
                case 9:
                    return MetricType.PCT_CHANGE;
                case 10:
                    return MetricType.IMPLIED_VOLATILITY;
                case 11:
                    return MetricType.BREAKEVEN;
                case 12:
                    return MetricType.TO_BREAKEVEN;
                case 13:
                    return MetricType.CHANCE_OF_PROFIT;
                case 14:
                    return MetricType.BID_SIZE;
                case 15:
                    return MetricType.ASK_SIZE;
                case 16:
                    return MetricType.VOLUME;
                case 17:
                    return MetricType.OPEN_INTEREST;
                case 18:
                    return MetricType.DELTA;
                case 19:
                    return MetricType.GAMMA;
                case 20:
                    return MetricType.THETA;
                case 21:
                    return MetricType.VEGA;
                case 22:
                    return MetricType.RHO;
                case 23:
                    return MetricType.CHANCE_OF_PROFIT_SHORT;
                case 24:
                    return MetricType.CHANCE_OF_PROFIT_LONG;
                default:
                    return null;
            }
        }
    }

    public static MetricType valueOf(String str) {
        return (MetricType) Enum.valueOf(MetricType.class, str);
    }

    public static MetricType[] values() {
        return (MetricType[]) $VALUES.clone();
    }
}
