package black_widow.contracts.mobile_app_chart.proto.p024v1;

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
/* compiled from: EquitiesOrderSide.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesOrderSide;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "EQUITIES_ORDER_SIDE_UNSPECIFIED", "EQUITIES_ORDER_SIDE_BUY", "EQUITIES_ORDER_SIDE_SELL", "EQUITIES_ORDER_SIDE_SELL_SHORT", "Companion", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class EquitiesOrderSide implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EquitiesOrderSide[] $VALUES;

    @JvmField
    public static final ProtoAdapter<EquitiesOrderSide> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final EquitiesOrderSide EQUITIES_ORDER_SIDE_BUY;
    public static final EquitiesOrderSide EQUITIES_ORDER_SIDE_SELL;
    public static final EquitiesOrderSide EQUITIES_ORDER_SIDE_SELL_SHORT;
    public static final EquitiesOrderSide EQUITIES_ORDER_SIDE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ EquitiesOrderSide[] $values() {
        return new EquitiesOrderSide[]{EQUITIES_ORDER_SIDE_UNSPECIFIED, EQUITIES_ORDER_SIDE_BUY, EQUITIES_ORDER_SIDE_SELL, EQUITIES_ORDER_SIDE_SELL_SHORT};
    }

    @JvmStatic
    public static final EquitiesOrderSide fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<EquitiesOrderSide> getEntries() {
        return $ENTRIES;
    }

    private EquitiesOrderSide(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final EquitiesOrderSide equitiesOrderSide = new EquitiesOrderSide("EQUITIES_ORDER_SIDE_UNSPECIFIED", 0, 0);
        EQUITIES_ORDER_SIDE_UNSPECIFIED = equitiesOrderSide;
        EQUITIES_ORDER_SIDE_BUY = new EquitiesOrderSide("EQUITIES_ORDER_SIDE_BUY", 1, 1);
        EQUITIES_ORDER_SIDE_SELL = new EquitiesOrderSide("EQUITIES_ORDER_SIDE_SELL", 2, 2);
        EQUITIES_ORDER_SIDE_SELL_SHORT = new EquitiesOrderSide("EQUITIES_ORDER_SIDE_SELL_SHORT", 3, 3);
        EquitiesOrderSide[] equitiesOrderSideArr$values = $values();
        $VALUES = equitiesOrderSideArr$values;
        $ENTRIES = EnumEntries2.enumEntries(equitiesOrderSideArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EquitiesOrderSide.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<EquitiesOrderSide>(orCreateKotlinClass, syntax, equitiesOrderSide) { // from class: black_widow.contracts.mobile_app_chart.proto.v1.EquitiesOrderSide$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public EquitiesOrderSide fromValue(int value) {
                return EquitiesOrderSide.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: EquitiesOrderSide.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesOrderSide$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesOrderSide;", "fromValue", "value", "", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EquitiesOrderSide fromValue(int value) {
            if (value == 0) {
                return EquitiesOrderSide.EQUITIES_ORDER_SIDE_UNSPECIFIED;
            }
            if (value == 1) {
                return EquitiesOrderSide.EQUITIES_ORDER_SIDE_BUY;
            }
            if (value == 2) {
                return EquitiesOrderSide.EQUITIES_ORDER_SIDE_SELL;
            }
            if (value != 3) {
                return null;
            }
            return EquitiesOrderSide.EQUITIES_ORDER_SIDE_SELL_SHORT;
        }
    }

    public static EquitiesOrderSide valueOf(String str) {
        return (EquitiesOrderSide) Enum.valueOf(EquitiesOrderSide.class, str);
    }

    public static EquitiesOrderSide[] values() {
        return (EquitiesOrderSide[]) $VALUES.clone();
    }
}
