package nummus.p512v1;

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
/* compiled from: TaxLotStrategyType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lnummus/v1/TaxLotStrategyType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TAX_LOT_STRATEGY_TYPE_UNSPECIFIED", "TAX_LOT_STRATEGY_TYPE_FIRST_IN", "TAX_LOT_STRATEGY_TYPE_LAST_IN", "TAX_LOT_STRATEGY_TYPE_HIGHEST_COST", "TAX_LOT_STRATEGY_TYPE_LOWEST_COST", "TAX_LOT_STRATEGY_TYPE_CUSTOM", "Companion", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class TaxLotStrategyType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TaxLotStrategyType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<TaxLotStrategyType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final TaxLotStrategyType TAX_LOT_STRATEGY_TYPE_CUSTOM;
    public static final TaxLotStrategyType TAX_LOT_STRATEGY_TYPE_FIRST_IN;
    public static final TaxLotStrategyType TAX_LOT_STRATEGY_TYPE_HIGHEST_COST;
    public static final TaxLotStrategyType TAX_LOT_STRATEGY_TYPE_LAST_IN;
    public static final TaxLotStrategyType TAX_LOT_STRATEGY_TYPE_LOWEST_COST;
    public static final TaxLotStrategyType TAX_LOT_STRATEGY_TYPE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ TaxLotStrategyType[] $values() {
        return new TaxLotStrategyType[]{TAX_LOT_STRATEGY_TYPE_UNSPECIFIED, TAX_LOT_STRATEGY_TYPE_FIRST_IN, TAX_LOT_STRATEGY_TYPE_LAST_IN, TAX_LOT_STRATEGY_TYPE_HIGHEST_COST, TAX_LOT_STRATEGY_TYPE_LOWEST_COST, TAX_LOT_STRATEGY_TYPE_CUSTOM};
    }

    @JvmStatic
    public static final TaxLotStrategyType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<TaxLotStrategyType> getEntries() {
        return $ENTRIES;
    }

    private TaxLotStrategyType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final TaxLotStrategyType taxLotStrategyType = new TaxLotStrategyType("TAX_LOT_STRATEGY_TYPE_UNSPECIFIED", 0, 0);
        TAX_LOT_STRATEGY_TYPE_UNSPECIFIED = taxLotStrategyType;
        TAX_LOT_STRATEGY_TYPE_FIRST_IN = new TaxLotStrategyType("TAX_LOT_STRATEGY_TYPE_FIRST_IN", 1, 1);
        TAX_LOT_STRATEGY_TYPE_LAST_IN = new TaxLotStrategyType("TAX_LOT_STRATEGY_TYPE_LAST_IN", 2, 2);
        TAX_LOT_STRATEGY_TYPE_HIGHEST_COST = new TaxLotStrategyType("TAX_LOT_STRATEGY_TYPE_HIGHEST_COST", 3, 3);
        TAX_LOT_STRATEGY_TYPE_LOWEST_COST = new TaxLotStrategyType("TAX_LOT_STRATEGY_TYPE_LOWEST_COST", 4, 4);
        TAX_LOT_STRATEGY_TYPE_CUSTOM = new TaxLotStrategyType("TAX_LOT_STRATEGY_TYPE_CUSTOM", 5, 5);
        TaxLotStrategyType[] taxLotStrategyTypeArr$values = $values();
        $VALUES = taxLotStrategyTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(taxLotStrategyTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TaxLotStrategyType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<TaxLotStrategyType>(orCreateKotlinClass, syntax, taxLotStrategyType) { // from class: nummus.v1.TaxLotStrategyType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public TaxLotStrategyType fromValue(int value) {
                return TaxLotStrategyType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: TaxLotStrategyType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lnummus/v1/TaxLotStrategyType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lnummus/v1/TaxLotStrategyType;", "fromValue", "value", "", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TaxLotStrategyType fromValue(int value) {
            if (value == 0) {
                return TaxLotStrategyType.TAX_LOT_STRATEGY_TYPE_UNSPECIFIED;
            }
            if (value == 1) {
                return TaxLotStrategyType.TAX_LOT_STRATEGY_TYPE_FIRST_IN;
            }
            if (value == 2) {
                return TaxLotStrategyType.TAX_LOT_STRATEGY_TYPE_LAST_IN;
            }
            if (value == 3) {
                return TaxLotStrategyType.TAX_LOT_STRATEGY_TYPE_HIGHEST_COST;
            }
            if (value == 4) {
                return TaxLotStrategyType.TAX_LOT_STRATEGY_TYPE_LOWEST_COST;
            }
            if (value != 5) {
                return null;
            }
            return TaxLotStrategyType.TAX_LOT_STRATEGY_TYPE_CUSTOM;
        }
    }

    public static TaxLotStrategyType valueOf(String str) {
        return (TaxLotStrategyType) Enum.valueOf(TaxLotStrategyType.class, str);
    }

    public static TaxLotStrategyType[] values() {
        return (TaxLotStrategyType[]) $VALUES.clone();
    }
}
