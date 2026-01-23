package bff_money_movement.service.p019v1;

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
/* compiled from: InvestmentsTrackerComponentType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \u00152\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0015B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0016"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TYPE_UNSPECIFIED", "BUTTON", "UPSELL", "CATEGORY_SECTION", "METADATA", "STOCK_CELL", "GET_STARTED", "PERFORMANCE_CHART", "MANAGE_EXTERNAL_ACCOUNTS", "CATEGORY_PERCENTAGE_CELL", "ALLOCATIONS_BAR", "UPSELL_CARD", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class InvestmentsTrackerComponentType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InvestmentsTrackerComponentType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<InvestmentsTrackerComponentType> ADAPTER;
    public static final InvestmentsTrackerComponentType ALLOCATIONS_BAR;
    public static final InvestmentsTrackerComponentType BUTTON;
    public static final InvestmentsTrackerComponentType CATEGORY_PERCENTAGE_CELL;
    public static final InvestmentsTrackerComponentType CATEGORY_SECTION;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final InvestmentsTrackerComponentType GET_STARTED;
    public static final InvestmentsTrackerComponentType MANAGE_EXTERNAL_ACCOUNTS;
    public static final InvestmentsTrackerComponentType METADATA;
    public static final InvestmentsTrackerComponentType PERFORMANCE_CHART;
    public static final InvestmentsTrackerComponentType STOCK_CELL;
    public static final InvestmentsTrackerComponentType TYPE_UNSPECIFIED;
    public static final InvestmentsTrackerComponentType UPSELL;
    public static final InvestmentsTrackerComponentType UPSELL_CARD;
    private final int value;

    private static final /* synthetic */ InvestmentsTrackerComponentType[] $values() {
        return new InvestmentsTrackerComponentType[]{TYPE_UNSPECIFIED, BUTTON, UPSELL, CATEGORY_SECTION, METADATA, STOCK_CELL, GET_STARTED, PERFORMANCE_CHART, MANAGE_EXTERNAL_ACCOUNTS, CATEGORY_PERCENTAGE_CELL, ALLOCATIONS_BAR, UPSELL_CARD};
    }

    @JvmStatic
    public static final InvestmentsTrackerComponentType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<InvestmentsTrackerComponentType> getEntries() {
        return $ENTRIES;
    }

    private InvestmentsTrackerComponentType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final InvestmentsTrackerComponentType investmentsTrackerComponentType = new InvestmentsTrackerComponentType("TYPE_UNSPECIFIED", 0, 0);
        TYPE_UNSPECIFIED = investmentsTrackerComponentType;
        BUTTON = new InvestmentsTrackerComponentType("BUTTON", 1, 1);
        UPSELL = new InvestmentsTrackerComponentType("UPSELL", 2, 2);
        CATEGORY_SECTION = new InvestmentsTrackerComponentType("CATEGORY_SECTION", 3, 3);
        METADATA = new InvestmentsTrackerComponentType("METADATA", 4, 4);
        STOCK_CELL = new InvestmentsTrackerComponentType("STOCK_CELL", 5, 5);
        GET_STARTED = new InvestmentsTrackerComponentType("GET_STARTED", 6, 6);
        PERFORMANCE_CHART = new InvestmentsTrackerComponentType("PERFORMANCE_CHART", 7, 7);
        MANAGE_EXTERNAL_ACCOUNTS = new InvestmentsTrackerComponentType("MANAGE_EXTERNAL_ACCOUNTS", 8, 8);
        CATEGORY_PERCENTAGE_CELL = new InvestmentsTrackerComponentType("CATEGORY_PERCENTAGE_CELL", 9, 9);
        ALLOCATIONS_BAR = new InvestmentsTrackerComponentType("ALLOCATIONS_BAR", 10, 10);
        UPSELL_CARD = new InvestmentsTrackerComponentType("UPSELL_CARD", 11, 11);
        InvestmentsTrackerComponentType[] investmentsTrackerComponentTypeArr$values = $values();
        $VALUES = investmentsTrackerComponentTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(investmentsTrackerComponentTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InvestmentsTrackerComponentType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<InvestmentsTrackerComponentType>(orCreateKotlinClass, syntax, investmentsTrackerComponentType) { // from class: bff_money_movement.service.v1.InvestmentsTrackerComponentType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public InvestmentsTrackerComponentType fromValue(int value) {
                return InvestmentsTrackerComponentType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: InvestmentsTrackerComponentType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentType;", "fromValue", "value", "", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final InvestmentsTrackerComponentType fromValue(int value) {
            switch (value) {
                case 0:
                    return InvestmentsTrackerComponentType.TYPE_UNSPECIFIED;
                case 1:
                    return InvestmentsTrackerComponentType.BUTTON;
                case 2:
                    return InvestmentsTrackerComponentType.UPSELL;
                case 3:
                    return InvestmentsTrackerComponentType.CATEGORY_SECTION;
                case 4:
                    return InvestmentsTrackerComponentType.METADATA;
                case 5:
                    return InvestmentsTrackerComponentType.STOCK_CELL;
                case 6:
                    return InvestmentsTrackerComponentType.GET_STARTED;
                case 7:
                    return InvestmentsTrackerComponentType.PERFORMANCE_CHART;
                case 8:
                    return InvestmentsTrackerComponentType.MANAGE_EXTERNAL_ACCOUNTS;
                case 9:
                    return InvestmentsTrackerComponentType.CATEGORY_PERCENTAGE_CELL;
                case 10:
                    return InvestmentsTrackerComponentType.ALLOCATIONS_BAR;
                case 11:
                    return InvestmentsTrackerComponentType.UPSELL_CARD;
                default:
                    return null;
            }
        }
    }

    public static InvestmentsTrackerComponentType valueOf(String str) {
        return (InvestmentsTrackerComponentType) Enum.valueOf(InvestmentsTrackerComponentType.class, str);
    }

    public static InvestmentsTrackerComponentType[] values() {
        return (InvestmentsTrackerComponentType[]) $VALUES.clone();
    }
}
