package advisory.proto.p008v1;

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
/* compiled from: TaxLossHarvestStrategyType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestStrategyType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "STRATEGY_UNSPECIFIED", "STRATEGY_OFFSET_MANAGED", "STRATEGY_OFFSET_ALL", "STRATEGY_MAX_LOSSES", "STRATEGY_DONT_HARVEST", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class TaxLossHarvestStrategyType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TaxLossHarvestStrategyType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<TaxLossHarvestStrategyType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final TaxLossHarvestStrategyType STRATEGY_DONT_HARVEST;
    public static final TaxLossHarvestStrategyType STRATEGY_MAX_LOSSES;
    public static final TaxLossHarvestStrategyType STRATEGY_OFFSET_ALL;
    public static final TaxLossHarvestStrategyType STRATEGY_OFFSET_MANAGED;
    public static final TaxLossHarvestStrategyType STRATEGY_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ TaxLossHarvestStrategyType[] $values() {
        return new TaxLossHarvestStrategyType[]{STRATEGY_UNSPECIFIED, STRATEGY_OFFSET_MANAGED, STRATEGY_OFFSET_ALL, STRATEGY_MAX_LOSSES, STRATEGY_DONT_HARVEST};
    }

    @JvmStatic
    public static final TaxLossHarvestStrategyType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<TaxLossHarvestStrategyType> getEntries() {
        return $ENTRIES;
    }

    private TaxLossHarvestStrategyType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final TaxLossHarvestStrategyType taxLossHarvestStrategyType = new TaxLossHarvestStrategyType("STRATEGY_UNSPECIFIED", 0, 0);
        STRATEGY_UNSPECIFIED = taxLossHarvestStrategyType;
        STRATEGY_OFFSET_MANAGED = new TaxLossHarvestStrategyType("STRATEGY_OFFSET_MANAGED", 1, 1);
        STRATEGY_OFFSET_ALL = new TaxLossHarvestStrategyType("STRATEGY_OFFSET_ALL", 2, 2);
        STRATEGY_MAX_LOSSES = new TaxLossHarvestStrategyType("STRATEGY_MAX_LOSSES", 3, 3);
        STRATEGY_DONT_HARVEST = new TaxLossHarvestStrategyType("STRATEGY_DONT_HARVEST", 4, 4);
        TaxLossHarvestStrategyType[] taxLossHarvestStrategyTypeArr$values = $values();
        $VALUES = taxLossHarvestStrategyTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(taxLossHarvestStrategyTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TaxLossHarvestStrategyType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<TaxLossHarvestStrategyType>(orCreateKotlinClass, syntax, taxLossHarvestStrategyType) { // from class: advisory.proto.v1.TaxLossHarvestStrategyType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public TaxLossHarvestStrategyType fromValue(int value) {
                return TaxLossHarvestStrategyType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: TaxLossHarvestStrategyType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestStrategyType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Ladvisory/proto/v1/TaxLossHarvestStrategyType;", "fromValue", "value", "", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TaxLossHarvestStrategyType fromValue(int value) {
            if (value == 0) {
                return TaxLossHarvestStrategyType.STRATEGY_UNSPECIFIED;
            }
            if (value == 1) {
                return TaxLossHarvestStrategyType.STRATEGY_OFFSET_MANAGED;
            }
            if (value == 2) {
                return TaxLossHarvestStrategyType.STRATEGY_OFFSET_ALL;
            }
            if (value == 3) {
                return TaxLossHarvestStrategyType.STRATEGY_MAX_LOSSES;
            }
            if (value != 4) {
                return null;
            }
            return TaxLossHarvestStrategyType.STRATEGY_DONT_HARVEST;
        }
    }

    public static TaxLossHarvestStrategyType valueOf(String str) {
        return (TaxLossHarvestStrategyType) Enum.valueOf(TaxLossHarvestStrategyType.class, str);
    }

    public static TaxLossHarvestStrategyType[] values() {
        return (TaxLossHarvestStrategyType[]) $VALUES.clone();
    }
}
