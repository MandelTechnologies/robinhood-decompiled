package rosetta.ledger.trade;

import com.plaid.internal.EnumC7081g;
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
/* compiled from: TradeType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lrosetta/ledger/trade/TradeType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TRADE_TYPE_UNSPECIFIED", "AGENCY", "PRINCIPAL", "RISKLESS_PRINCIPAL", "PRIMARY_ISSUE", "Companion", "rosetta.ledger.trade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class TradeType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TradeType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<TradeType> ADAPTER;
    public static final TradeType AGENCY;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final TradeType PRIMARY_ISSUE;
    public static final TradeType PRINCIPAL;
    public static final TradeType RISKLESS_PRINCIPAL;
    public static final TradeType TRADE_TYPE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ TradeType[] $values() {
        return new TradeType[]{TRADE_TYPE_UNSPECIFIED, AGENCY, PRINCIPAL, RISKLESS_PRINCIPAL, PRIMARY_ISSUE};
    }

    @JvmStatic
    public static final TradeType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<TradeType> getEntries() {
        return $ENTRIES;
    }

    private TradeType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final TradeType tradeType = new TradeType("TRADE_TYPE_UNSPECIFIED", 0, 0);
        TRADE_TYPE_UNSPECIFIED = tradeType;
        AGENCY = new TradeType("AGENCY", 1, 120);
        PRINCIPAL = new TradeType("PRINCIPAL", 2, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE);
        RISKLESS_PRINCIPAL = new TradeType("RISKLESS_PRINCIPAL", 3, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
        PRIMARY_ISSUE = new TradeType("PRIMARY_ISSUE", 4, 123);
        TradeType[] tradeTypeArr$values = $values();
        $VALUES = tradeTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(tradeTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TradeType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<TradeType>(orCreateKotlinClass, syntax, tradeType) { // from class: rosetta.ledger.trade.TradeType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public TradeType fromValue(int value) {
                return TradeType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: TradeType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/ledger/trade/TradeType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/ledger/trade/TradeType;", "fromValue", "value", "", "rosetta.ledger.trade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TradeType fromValue(int value) {
            if (value == 0) {
                return TradeType.TRADE_TYPE_UNSPECIFIED;
            }
            switch (value) {
                case 120:
                    return TradeType.AGENCY;
                case SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE:
                    return TradeType.PRINCIPAL;
                case SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE:
                    return TradeType.RISKLESS_PRINCIPAL;
                case 123:
                    return TradeType.PRIMARY_ISSUE;
                default:
                    return null;
            }
        }
    }

    public static TradeType valueOf(String str) {
        return (TradeType) Enum.valueOf(TradeType.class, str);
    }

    public static TradeType[] values() {
        return (TradeType[]) $VALUES.clone();
    }
}
