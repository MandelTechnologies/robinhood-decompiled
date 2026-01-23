package hippo.model.p469v1;

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
/* compiled from: WidgetType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00132\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0014"}, m3636d2 = {"Lhippo/model/v1/WidgetType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "WIDGET_TYPE_UNSPECIFIED", "WIDGET_TYPE_POSITIONS_TABLE", "WIDGET_TYPE_RECENT_ORDERS_TABLE", "WIDGET_TYPE_ACCOUNT_INFO", "WIDGET_TYPE_CHART", "WIDGET_TYPE_OPTION_CHAIN", "WIDGET_TYPE_WATCHLIST", "WIDGET_TYPE_SNAPSHOT", "WIDGET_TYPE_LADDER", "WIDGET_TYPE_SCANNER", "Companion", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class WidgetType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ WidgetType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<WidgetType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final WidgetType WIDGET_TYPE_ACCOUNT_INFO;
    public static final WidgetType WIDGET_TYPE_CHART;
    public static final WidgetType WIDGET_TYPE_LADDER;
    public static final WidgetType WIDGET_TYPE_OPTION_CHAIN;
    public static final WidgetType WIDGET_TYPE_POSITIONS_TABLE;
    public static final WidgetType WIDGET_TYPE_RECENT_ORDERS_TABLE;
    public static final WidgetType WIDGET_TYPE_SCANNER;
    public static final WidgetType WIDGET_TYPE_SNAPSHOT;
    public static final WidgetType WIDGET_TYPE_UNSPECIFIED;
    public static final WidgetType WIDGET_TYPE_WATCHLIST;
    private final int value;

    private static final /* synthetic */ WidgetType[] $values() {
        return new WidgetType[]{WIDGET_TYPE_UNSPECIFIED, WIDGET_TYPE_POSITIONS_TABLE, WIDGET_TYPE_RECENT_ORDERS_TABLE, WIDGET_TYPE_ACCOUNT_INFO, WIDGET_TYPE_CHART, WIDGET_TYPE_OPTION_CHAIN, WIDGET_TYPE_WATCHLIST, WIDGET_TYPE_SNAPSHOT, WIDGET_TYPE_LADDER, WIDGET_TYPE_SCANNER};
    }

    @JvmStatic
    public static final WidgetType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<WidgetType> getEntries() {
        return $ENTRIES;
    }

    private WidgetType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final WidgetType widgetType = new WidgetType("WIDGET_TYPE_UNSPECIFIED", 0, 0);
        WIDGET_TYPE_UNSPECIFIED = widgetType;
        WIDGET_TYPE_POSITIONS_TABLE = new WidgetType("WIDGET_TYPE_POSITIONS_TABLE", 1, 1);
        WIDGET_TYPE_RECENT_ORDERS_TABLE = new WidgetType("WIDGET_TYPE_RECENT_ORDERS_TABLE", 2, 2);
        WIDGET_TYPE_ACCOUNT_INFO = new WidgetType("WIDGET_TYPE_ACCOUNT_INFO", 3, 3);
        WIDGET_TYPE_CHART = new WidgetType("WIDGET_TYPE_CHART", 4, 4);
        WIDGET_TYPE_OPTION_CHAIN = new WidgetType("WIDGET_TYPE_OPTION_CHAIN", 5, 5);
        WIDGET_TYPE_WATCHLIST = new WidgetType("WIDGET_TYPE_WATCHLIST", 6, 6);
        WIDGET_TYPE_SNAPSHOT = new WidgetType("WIDGET_TYPE_SNAPSHOT", 7, 7);
        WIDGET_TYPE_LADDER = new WidgetType("WIDGET_TYPE_LADDER", 8, 8);
        WIDGET_TYPE_SCANNER = new WidgetType("WIDGET_TYPE_SCANNER", 9, 9);
        WidgetType[] widgetTypeArr$values = $values();
        $VALUES = widgetTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(widgetTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(WidgetType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<WidgetType>(orCreateKotlinClass, syntax, widgetType) { // from class: hippo.model.v1.WidgetType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public WidgetType fromValue(int value) {
                return WidgetType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: WidgetType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lhippo/model/v1/WidgetType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lhippo/model/v1/WidgetType;", "fromValue", "value", "", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final WidgetType fromValue(int value) {
            switch (value) {
                case 0:
                    return WidgetType.WIDGET_TYPE_UNSPECIFIED;
                case 1:
                    return WidgetType.WIDGET_TYPE_POSITIONS_TABLE;
                case 2:
                    return WidgetType.WIDGET_TYPE_RECENT_ORDERS_TABLE;
                case 3:
                    return WidgetType.WIDGET_TYPE_ACCOUNT_INFO;
                case 4:
                    return WidgetType.WIDGET_TYPE_CHART;
                case 5:
                    return WidgetType.WIDGET_TYPE_OPTION_CHAIN;
                case 6:
                    return WidgetType.WIDGET_TYPE_WATCHLIST;
                case 7:
                    return WidgetType.WIDGET_TYPE_SNAPSHOT;
                case 8:
                    return WidgetType.WIDGET_TYPE_LADDER;
                case 9:
                    return WidgetType.WIDGET_TYPE_SCANNER;
                default:
                    return null;
            }
        }
    }

    public static WidgetType valueOf(String str) {
        return (WidgetType) Enum.valueOf(WidgetType.class, str);
    }

    public static WidgetType[] values() {
        return (WidgetType[]) $VALUES.clone();
    }
}
