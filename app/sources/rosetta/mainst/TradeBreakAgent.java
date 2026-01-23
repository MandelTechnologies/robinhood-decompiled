package rosetta.mainst;

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
/* compiled from: TradeBreakAgent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lrosetta/mainst/TradeBreakAgent;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TRADE_BREAK_AGENT_UNSPECIFIED", "TRADE_BREAK_AGENT_VENUE", "TRADE_BREAK_AGENT_MAINST", "TRADE_BREAK_AGENT_ORDER_BATCHER", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class TradeBreakAgent implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TradeBreakAgent[] $VALUES;

    @JvmField
    public static final ProtoAdapter<TradeBreakAgent> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final TradeBreakAgent TRADE_BREAK_AGENT_MAINST;
    public static final TradeBreakAgent TRADE_BREAK_AGENT_ORDER_BATCHER;
    public static final TradeBreakAgent TRADE_BREAK_AGENT_UNSPECIFIED;
    public static final TradeBreakAgent TRADE_BREAK_AGENT_VENUE;
    private final int value;

    private static final /* synthetic */ TradeBreakAgent[] $values() {
        return new TradeBreakAgent[]{TRADE_BREAK_AGENT_UNSPECIFIED, TRADE_BREAK_AGENT_VENUE, TRADE_BREAK_AGENT_MAINST, TRADE_BREAK_AGENT_ORDER_BATCHER};
    }

    @JvmStatic
    public static final TradeBreakAgent fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<TradeBreakAgent> getEntries() {
        return $ENTRIES;
    }

    private TradeBreakAgent(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final TradeBreakAgent tradeBreakAgent = new TradeBreakAgent("TRADE_BREAK_AGENT_UNSPECIFIED", 0, 0);
        TRADE_BREAK_AGENT_UNSPECIFIED = tradeBreakAgent;
        TRADE_BREAK_AGENT_VENUE = new TradeBreakAgent("TRADE_BREAK_AGENT_VENUE", 1, 1);
        TRADE_BREAK_AGENT_MAINST = new TradeBreakAgent("TRADE_BREAK_AGENT_MAINST", 2, 2);
        TRADE_BREAK_AGENT_ORDER_BATCHER = new TradeBreakAgent("TRADE_BREAK_AGENT_ORDER_BATCHER", 3, 3);
        TradeBreakAgent[] tradeBreakAgentArr$values = $values();
        $VALUES = tradeBreakAgentArr$values;
        $ENTRIES = EnumEntries2.enumEntries(tradeBreakAgentArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TradeBreakAgent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<TradeBreakAgent>(orCreateKotlinClass, syntax, tradeBreakAgent) { // from class: rosetta.mainst.TradeBreakAgent$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public TradeBreakAgent fromValue(int value) {
                return TradeBreakAgent.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: TradeBreakAgent.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/mainst/TradeBreakAgent$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/mainst/TradeBreakAgent;", "fromValue", "value", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TradeBreakAgent fromValue(int value) {
            if (value == 0) {
                return TradeBreakAgent.TRADE_BREAK_AGENT_UNSPECIFIED;
            }
            if (value == 1) {
                return TradeBreakAgent.TRADE_BREAK_AGENT_VENUE;
            }
            if (value == 2) {
                return TradeBreakAgent.TRADE_BREAK_AGENT_MAINST;
            }
            if (value != 3) {
                return null;
            }
            return TradeBreakAgent.TRADE_BREAK_AGENT_ORDER_BATCHER;
        }
    }

    public static TradeBreakAgent valueOf(String str) {
        return (TradeBreakAgent) Enum.valueOf(TradeBreakAgent.class, str);
    }

    public static TradeBreakAgent[] values() {
        return (TradeBreakAgent[]) $VALUES.clone();
    }
}
