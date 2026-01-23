package bonfire.proto.idl.margin.p036v1;

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
/* compiled from: MarginInvestingState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lbonfire/proto/idl/margin/v1/MarginInvestingState;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "MARGIN_INVESTING_STATE_UNSPECIFIED", "MARGIN_INVESTING_STATE_ENABLED", "MARGIN_INVESTING_STATE_DISABLED", "MARGIN_INVESTING_STATE_UNAVAILABLE", "Companion", "bonfire.maintenance_table.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class MarginInvestingState implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MarginInvestingState[] $VALUES;

    @JvmField
    public static final ProtoAdapter<MarginInvestingState> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final MarginInvestingState MARGIN_INVESTING_STATE_DISABLED;
    public static final MarginInvestingState MARGIN_INVESTING_STATE_ENABLED;
    public static final MarginInvestingState MARGIN_INVESTING_STATE_UNAVAILABLE;
    public static final MarginInvestingState MARGIN_INVESTING_STATE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ MarginInvestingState[] $values() {
        return new MarginInvestingState[]{MARGIN_INVESTING_STATE_UNSPECIFIED, MARGIN_INVESTING_STATE_ENABLED, MARGIN_INVESTING_STATE_DISABLED, MARGIN_INVESTING_STATE_UNAVAILABLE};
    }

    @JvmStatic
    public static final MarginInvestingState fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<MarginInvestingState> getEntries() {
        return $ENTRIES;
    }

    private MarginInvestingState(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final MarginInvestingState marginInvestingState = new MarginInvestingState("MARGIN_INVESTING_STATE_UNSPECIFIED", 0, 0);
        MARGIN_INVESTING_STATE_UNSPECIFIED = marginInvestingState;
        MARGIN_INVESTING_STATE_ENABLED = new MarginInvestingState("MARGIN_INVESTING_STATE_ENABLED", 1, 1);
        MARGIN_INVESTING_STATE_DISABLED = new MarginInvestingState("MARGIN_INVESTING_STATE_DISABLED", 2, 2);
        MARGIN_INVESTING_STATE_UNAVAILABLE = new MarginInvestingState("MARGIN_INVESTING_STATE_UNAVAILABLE", 3, 3);
        MarginInvestingState[] marginInvestingStateArr$values = $values();
        $VALUES = marginInvestingStateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(marginInvestingStateArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MarginInvestingState.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<MarginInvestingState>(orCreateKotlinClass, syntax, marginInvestingState) { // from class: bonfire.proto.idl.margin.v1.MarginInvestingState$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public MarginInvestingState fromValue(int value) {
                return MarginInvestingState.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: MarginInvestingState.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lbonfire/proto/idl/margin/v1/MarginInvestingState$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lbonfire/proto/idl/margin/v1/MarginInvestingState;", "fromValue", "value", "", "bonfire.maintenance_table.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MarginInvestingState fromValue(int value) {
            if (value == 0) {
                return MarginInvestingState.MARGIN_INVESTING_STATE_UNSPECIFIED;
            }
            if (value == 1) {
                return MarginInvestingState.MARGIN_INVESTING_STATE_ENABLED;
            }
            if (value == 2) {
                return MarginInvestingState.MARGIN_INVESTING_STATE_DISABLED;
            }
            if (value != 3) {
                return null;
            }
            return MarginInvestingState.MARGIN_INVESTING_STATE_UNAVAILABLE;
        }
    }

    public static MarginInvestingState valueOf(String str) {
        return (MarginInvestingState) Enum.valueOf(MarginInvestingState.class, str);
    }

    public static MarginInvestingState[] values() {
        return (MarginInvestingState[]) $VALUES.clone();
    }
}
