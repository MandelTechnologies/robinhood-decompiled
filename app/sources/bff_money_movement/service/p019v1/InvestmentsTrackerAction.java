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
/* compiled from: InvestmentsTrackerAction.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerAction;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ACTION_UNSPECIFIED", "TRANSFER_BUTTON", "UPSELL_RETIREMENT", "ACCOUNT_CLICKED", "GET_STARTED_ACTION", "CONNECT_ROW_CLICKED", "CONNECT_ROW_CLICKED_BANK_ACCOUNT", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class InvestmentsTrackerAction implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InvestmentsTrackerAction[] $VALUES;
    public static final InvestmentsTrackerAction ACCOUNT_CLICKED;
    public static final InvestmentsTrackerAction ACTION_UNSPECIFIED;

    @JvmField
    public static final ProtoAdapter<InvestmentsTrackerAction> ADAPTER;
    public static final InvestmentsTrackerAction CONNECT_ROW_CLICKED;
    public static final InvestmentsTrackerAction CONNECT_ROW_CLICKED_BANK_ACCOUNT;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final InvestmentsTrackerAction GET_STARTED_ACTION;
    public static final InvestmentsTrackerAction TRANSFER_BUTTON;
    public static final InvestmentsTrackerAction UPSELL_RETIREMENT;
    private final int value;

    private static final /* synthetic */ InvestmentsTrackerAction[] $values() {
        return new InvestmentsTrackerAction[]{ACTION_UNSPECIFIED, TRANSFER_BUTTON, UPSELL_RETIREMENT, ACCOUNT_CLICKED, GET_STARTED_ACTION, CONNECT_ROW_CLICKED, CONNECT_ROW_CLICKED_BANK_ACCOUNT};
    }

    @JvmStatic
    public static final InvestmentsTrackerAction fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<InvestmentsTrackerAction> getEntries() {
        return $ENTRIES;
    }

    private InvestmentsTrackerAction(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final InvestmentsTrackerAction investmentsTrackerAction = new InvestmentsTrackerAction("ACTION_UNSPECIFIED", 0, 0);
        ACTION_UNSPECIFIED = investmentsTrackerAction;
        TRANSFER_BUTTON = new InvestmentsTrackerAction("TRANSFER_BUTTON", 1, 1);
        UPSELL_RETIREMENT = new InvestmentsTrackerAction("UPSELL_RETIREMENT", 2, 2);
        ACCOUNT_CLICKED = new InvestmentsTrackerAction("ACCOUNT_CLICKED", 3, 3);
        GET_STARTED_ACTION = new InvestmentsTrackerAction("GET_STARTED_ACTION", 4, 4);
        CONNECT_ROW_CLICKED = new InvestmentsTrackerAction("CONNECT_ROW_CLICKED", 5, 5);
        CONNECT_ROW_CLICKED_BANK_ACCOUNT = new InvestmentsTrackerAction("CONNECT_ROW_CLICKED_BANK_ACCOUNT", 6, 6);
        InvestmentsTrackerAction[] investmentsTrackerActionArr$values = $values();
        $VALUES = investmentsTrackerActionArr$values;
        $ENTRIES = EnumEntries2.enumEntries(investmentsTrackerActionArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InvestmentsTrackerAction.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<InvestmentsTrackerAction>(orCreateKotlinClass, syntax, investmentsTrackerAction) { // from class: bff_money_movement.service.v1.InvestmentsTrackerAction$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public InvestmentsTrackerAction fromValue(int value) {
                return InvestmentsTrackerAction.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: InvestmentsTrackerAction.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerAction$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lbff_money_movement/service/v1/InvestmentsTrackerAction;", "fromValue", "value", "", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final InvestmentsTrackerAction fromValue(int value) {
            switch (value) {
                case 0:
                    return InvestmentsTrackerAction.ACTION_UNSPECIFIED;
                case 1:
                    return InvestmentsTrackerAction.TRANSFER_BUTTON;
                case 2:
                    return InvestmentsTrackerAction.UPSELL_RETIREMENT;
                case 3:
                    return InvestmentsTrackerAction.ACCOUNT_CLICKED;
                case 4:
                    return InvestmentsTrackerAction.GET_STARTED_ACTION;
                case 5:
                    return InvestmentsTrackerAction.CONNECT_ROW_CLICKED;
                case 6:
                    return InvestmentsTrackerAction.CONNECT_ROW_CLICKED_BANK_ACCOUNT;
                default:
                    return null;
            }
        }
    }

    public static InvestmentsTrackerAction valueOf(String str) {
        return (InvestmentsTrackerAction) Enum.valueOf(InvestmentsTrackerAction.class, str);
    }

    public static InvestmentsTrackerAction[] values() {
        return (InvestmentsTrackerAction[]) $VALUES.clone();
    }
}
