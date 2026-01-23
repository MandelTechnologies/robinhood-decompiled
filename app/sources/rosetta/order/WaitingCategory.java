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
/* compiled from: WaitingCategory.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \u00152\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0015B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0016"}, m3636d2 = {"Lrosetta/order/WaitingCategory;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "WAITING_CATEGORY_UNSPECIFIED", "VENUE_REJECTION", "INSTRUMENT_IPO", "INSTRUMENT_OTC", "INTERNAL_ERROR", "INSTRUMENT_INTERNAL_HALT", "ALL_DAY_TRADING_SESSION_KILL_SWITCH", "MANUAL_BULK_ACTION", "REJECTION_CIRCUIT_BREAKER", "UNSOLICITED_CANCEL", "ADV_MAC_VIOLATION", "RULES_ENGINE_DROP_TO_REVIEW", "Companion", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class WaitingCategory implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ WaitingCategory[] $VALUES;

    @JvmField
    public static final ProtoAdapter<WaitingCategory> ADAPTER;
    public static final WaitingCategory ADV_MAC_VIOLATION;
    public static final WaitingCategory ALL_DAY_TRADING_SESSION_KILL_SWITCH;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final WaitingCategory INSTRUMENT_INTERNAL_HALT;
    public static final WaitingCategory INSTRUMENT_IPO;
    public static final WaitingCategory INSTRUMENT_OTC;
    public static final WaitingCategory INTERNAL_ERROR;
    public static final WaitingCategory MANUAL_BULK_ACTION;
    public static final WaitingCategory REJECTION_CIRCUIT_BREAKER;
    public static final WaitingCategory RULES_ENGINE_DROP_TO_REVIEW;
    public static final WaitingCategory UNSOLICITED_CANCEL;
    public static final WaitingCategory VENUE_REJECTION;
    public static final WaitingCategory WAITING_CATEGORY_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ WaitingCategory[] $values() {
        return new WaitingCategory[]{WAITING_CATEGORY_UNSPECIFIED, VENUE_REJECTION, INSTRUMENT_IPO, INSTRUMENT_OTC, INTERNAL_ERROR, INSTRUMENT_INTERNAL_HALT, ALL_DAY_TRADING_SESSION_KILL_SWITCH, MANUAL_BULK_ACTION, REJECTION_CIRCUIT_BREAKER, UNSOLICITED_CANCEL, ADV_MAC_VIOLATION, RULES_ENGINE_DROP_TO_REVIEW};
    }

    @JvmStatic
    public static final WaitingCategory fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<WaitingCategory> getEntries() {
        return $ENTRIES;
    }

    private WaitingCategory(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final WaitingCategory waitingCategory = new WaitingCategory("WAITING_CATEGORY_UNSPECIFIED", 0, 0);
        WAITING_CATEGORY_UNSPECIFIED = waitingCategory;
        VENUE_REJECTION = new WaitingCategory("VENUE_REJECTION", 1, 1);
        INSTRUMENT_IPO = new WaitingCategory("INSTRUMENT_IPO", 2, 2);
        INSTRUMENT_OTC = new WaitingCategory("INSTRUMENT_OTC", 3, 3);
        INTERNAL_ERROR = new WaitingCategory("INTERNAL_ERROR", 4, 4);
        INSTRUMENT_INTERNAL_HALT = new WaitingCategory("INSTRUMENT_INTERNAL_HALT", 5, 5);
        ALL_DAY_TRADING_SESSION_KILL_SWITCH = new WaitingCategory("ALL_DAY_TRADING_SESSION_KILL_SWITCH", 6, 6);
        MANUAL_BULK_ACTION = new WaitingCategory("MANUAL_BULK_ACTION", 7, 7);
        REJECTION_CIRCUIT_BREAKER = new WaitingCategory("REJECTION_CIRCUIT_BREAKER", 8, 8);
        UNSOLICITED_CANCEL = new WaitingCategory("UNSOLICITED_CANCEL", 9, 9);
        ADV_MAC_VIOLATION = new WaitingCategory("ADV_MAC_VIOLATION", 10, 10);
        RULES_ENGINE_DROP_TO_REVIEW = new WaitingCategory("RULES_ENGINE_DROP_TO_REVIEW", 11, 11);
        WaitingCategory[] waitingCategoryArr$values = $values();
        $VALUES = waitingCategoryArr$values;
        $ENTRIES = EnumEntries2.enumEntries(waitingCategoryArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(WaitingCategory.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<WaitingCategory>(orCreateKotlinClass, syntax, waitingCategory) { // from class: rosetta.order.WaitingCategory$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public WaitingCategory fromValue(int value) {
                return WaitingCategory.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: WaitingCategory.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/order/WaitingCategory$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/order/WaitingCategory;", "fromValue", "value", "", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final WaitingCategory fromValue(int value) {
            switch (value) {
                case 0:
                    return WaitingCategory.WAITING_CATEGORY_UNSPECIFIED;
                case 1:
                    return WaitingCategory.VENUE_REJECTION;
                case 2:
                    return WaitingCategory.INSTRUMENT_IPO;
                case 3:
                    return WaitingCategory.INSTRUMENT_OTC;
                case 4:
                    return WaitingCategory.INTERNAL_ERROR;
                case 5:
                    return WaitingCategory.INSTRUMENT_INTERNAL_HALT;
                case 6:
                    return WaitingCategory.ALL_DAY_TRADING_SESSION_KILL_SWITCH;
                case 7:
                    return WaitingCategory.MANUAL_BULK_ACTION;
                case 8:
                    return WaitingCategory.REJECTION_CIRCUIT_BREAKER;
                case 9:
                    return WaitingCategory.UNSOLICITED_CANCEL;
                case 10:
                    return WaitingCategory.ADV_MAC_VIOLATION;
                case 11:
                    return WaitingCategory.RULES_ENGINE_DROP_TO_REVIEW;
                default:
                    return null;
            }
        }
    }

    public static WaitingCategory valueOf(String str) {
        return (WaitingCategory) Enum.valueOf(WaitingCategory.class, str);
    }

    public static WaitingCategory[] values() {
        return (WaitingCategory[]) $VALUES.clone();
    }
}
