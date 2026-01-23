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
/* compiled from: TaxLotSortType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lnummus/v1/TaxLotSortType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TAX_LOT_SORT_TYPE_UNSPECIFIED", "TAX_LOT_SORT_TYPE_DATE", "TAX_LOT_SORT_TYPE_COST_PER_UNIT", "TAX_LOT_SORT_TYPE_GAIN_LOSS", "TAX_LOT_SORT_TYPE_AVAILABLE_QUANTITY", "TAX_LOT_SORT_TYPE_OPEN_DATE", "Companion", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class TaxLotSortType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TaxLotSortType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<TaxLotSortType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final TaxLotSortType TAX_LOT_SORT_TYPE_AVAILABLE_QUANTITY;
    public static final TaxLotSortType TAX_LOT_SORT_TYPE_COST_PER_UNIT;
    public static final TaxLotSortType TAX_LOT_SORT_TYPE_DATE;
    public static final TaxLotSortType TAX_LOT_SORT_TYPE_GAIN_LOSS;
    public static final TaxLotSortType TAX_LOT_SORT_TYPE_OPEN_DATE;
    public static final TaxLotSortType TAX_LOT_SORT_TYPE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ TaxLotSortType[] $values() {
        return new TaxLotSortType[]{TAX_LOT_SORT_TYPE_UNSPECIFIED, TAX_LOT_SORT_TYPE_DATE, TAX_LOT_SORT_TYPE_COST_PER_UNIT, TAX_LOT_SORT_TYPE_GAIN_LOSS, TAX_LOT_SORT_TYPE_AVAILABLE_QUANTITY, TAX_LOT_SORT_TYPE_OPEN_DATE};
    }

    @JvmStatic
    public static final TaxLotSortType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<TaxLotSortType> getEntries() {
        return $ENTRIES;
    }

    private TaxLotSortType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final TaxLotSortType taxLotSortType = new TaxLotSortType("TAX_LOT_SORT_TYPE_UNSPECIFIED", 0, 0);
        TAX_LOT_SORT_TYPE_UNSPECIFIED = taxLotSortType;
        TAX_LOT_SORT_TYPE_DATE = new TaxLotSortType("TAX_LOT_SORT_TYPE_DATE", 1, 1);
        TAX_LOT_SORT_TYPE_COST_PER_UNIT = new TaxLotSortType("TAX_LOT_SORT_TYPE_COST_PER_UNIT", 2, 2);
        TAX_LOT_SORT_TYPE_GAIN_LOSS = new TaxLotSortType("TAX_LOT_SORT_TYPE_GAIN_LOSS", 3, 3);
        TAX_LOT_SORT_TYPE_AVAILABLE_QUANTITY = new TaxLotSortType("TAX_LOT_SORT_TYPE_AVAILABLE_QUANTITY", 4, 4);
        TAX_LOT_SORT_TYPE_OPEN_DATE = new TaxLotSortType("TAX_LOT_SORT_TYPE_OPEN_DATE", 5, 5);
        TaxLotSortType[] taxLotSortTypeArr$values = $values();
        $VALUES = taxLotSortTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(taxLotSortTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TaxLotSortType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<TaxLotSortType>(orCreateKotlinClass, syntax, taxLotSortType) { // from class: nummus.v1.TaxLotSortType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public TaxLotSortType fromValue(int value) {
                return TaxLotSortType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: TaxLotSortType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lnummus/v1/TaxLotSortType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lnummus/v1/TaxLotSortType;", "fromValue", "value", "", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TaxLotSortType fromValue(int value) {
            if (value == 0) {
                return TaxLotSortType.TAX_LOT_SORT_TYPE_UNSPECIFIED;
            }
            if (value == 1) {
                return TaxLotSortType.TAX_LOT_SORT_TYPE_DATE;
            }
            if (value == 2) {
                return TaxLotSortType.TAX_LOT_SORT_TYPE_COST_PER_UNIT;
            }
            if (value == 3) {
                return TaxLotSortType.TAX_LOT_SORT_TYPE_GAIN_LOSS;
            }
            if (value == 4) {
                return TaxLotSortType.TAX_LOT_SORT_TYPE_AVAILABLE_QUANTITY;
            }
            if (value != 5) {
                return null;
            }
            return TaxLotSortType.TAX_LOT_SORT_TYPE_OPEN_DATE;
        }
    }

    public static TaxLotSortType valueOf(String str) {
        return (TaxLotSortType) Enum.valueOf(TaxLotSortType.class, str);
    }

    public static TaxLotSortType[] values() {
        return (TaxLotSortType[]) $VALUES.clone();
    }
}
