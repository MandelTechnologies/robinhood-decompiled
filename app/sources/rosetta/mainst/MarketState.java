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
/* compiled from: MarketState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lrosetta/mainst/MarketState;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "MARKET_STATE_UNSPECIFIED", "MARKET_STATE_ACTIVE", "MARKET_STATE_CONFIRMED", "MARKET_STATE_OUT", "MARKET_STATE_RESTING", "MARKET_STATE_WAITING", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class MarketState implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MarketState[] $VALUES;

    @JvmField
    public static final ProtoAdapter<MarketState> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final MarketState MARKET_STATE_ACTIVE;
    public static final MarketState MARKET_STATE_CONFIRMED;
    public static final MarketState MARKET_STATE_OUT;
    public static final MarketState MARKET_STATE_RESTING;
    public static final MarketState MARKET_STATE_UNSPECIFIED;
    public static final MarketState MARKET_STATE_WAITING;
    private final int value;

    private static final /* synthetic */ MarketState[] $values() {
        return new MarketState[]{MARKET_STATE_UNSPECIFIED, MARKET_STATE_ACTIVE, MARKET_STATE_CONFIRMED, MARKET_STATE_OUT, MARKET_STATE_RESTING, MARKET_STATE_WAITING};
    }

    @JvmStatic
    public static final MarketState fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<MarketState> getEntries() {
        return $ENTRIES;
    }

    private MarketState(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final MarketState marketState = new MarketState("MARKET_STATE_UNSPECIFIED", 0, 0);
        MARKET_STATE_UNSPECIFIED = marketState;
        MARKET_STATE_ACTIVE = new MarketState("MARKET_STATE_ACTIVE", 1, 1);
        MARKET_STATE_CONFIRMED = new MarketState("MARKET_STATE_CONFIRMED", 2, 2);
        MARKET_STATE_OUT = new MarketState("MARKET_STATE_OUT", 3, 3);
        MARKET_STATE_RESTING = new MarketState("MARKET_STATE_RESTING", 4, 4);
        MARKET_STATE_WAITING = new MarketState("MARKET_STATE_WAITING", 5, 5);
        MarketState[] marketStateArr$values = $values();
        $VALUES = marketStateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(marketStateArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MarketState.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<MarketState>(orCreateKotlinClass, syntax, marketState) { // from class: rosetta.mainst.MarketState$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public MarketState fromValue(int value) {
                return MarketState.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: MarketState.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/mainst/MarketState$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/mainst/MarketState;", "fromValue", "value", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MarketState fromValue(int value) {
            if (value == 0) {
                return MarketState.MARKET_STATE_UNSPECIFIED;
            }
            if (value == 1) {
                return MarketState.MARKET_STATE_ACTIVE;
            }
            if (value == 2) {
                return MarketState.MARKET_STATE_CONFIRMED;
            }
            if (value == 3) {
                return MarketState.MARKET_STATE_OUT;
            }
            if (value == 4) {
                return MarketState.MARKET_STATE_RESTING;
            }
            if (value != 5) {
                return null;
            }
            return MarketState.MARKET_STATE_WAITING;
        }
    }

    public static MarketState valueOf(String str) {
        return (MarketState) Enum.valueOf(MarketState.class, str);
    }

    public static MarketState[] values() {
        return (MarketState[]) $VALUES.clone();
    }
}
