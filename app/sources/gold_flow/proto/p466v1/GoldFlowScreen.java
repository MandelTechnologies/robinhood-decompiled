package gold_flow.proto.p466v1;

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
/* compiled from: GoldFlowScreen.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u0000 \u00182\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0018B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0019"}, m3636d2 = {"Lgold_flow/proto/v1/GoldFlowScreen;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SCREEN_UNSPECIFIED", "LOADING", "ERROR", "VALUE_PROPS", "VALUE_PROPS_SDUI", "MULTI_AGREEMENTS", "SINGLE_AGREEMENT", "CONFIRMATION", "SUGGESTED_ACTION", "PLAN_SELECTION", "UPDATE_APP", "AGREEMENT_DISPLAY", "VALUE_PROPS_PROMO", "SAGE_START_APPLICATION", "SAGE_APPLICATION", "Companion", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class GoldFlowScreen implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ GoldFlowScreen[] $VALUES;

    @JvmField
    public static final ProtoAdapter<GoldFlowScreen> ADAPTER;
    public static final GoldFlowScreen AGREEMENT_DISPLAY;
    public static final GoldFlowScreen CONFIRMATION;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final GoldFlowScreen ERROR;
    public static final GoldFlowScreen LOADING;
    public static final GoldFlowScreen MULTI_AGREEMENTS;
    public static final GoldFlowScreen PLAN_SELECTION;
    public static final GoldFlowScreen SAGE_APPLICATION;
    public static final GoldFlowScreen SAGE_START_APPLICATION;
    public static final GoldFlowScreen SCREEN_UNSPECIFIED;
    public static final GoldFlowScreen SINGLE_AGREEMENT;
    public static final GoldFlowScreen SUGGESTED_ACTION;
    public static final GoldFlowScreen UPDATE_APP;
    public static final GoldFlowScreen VALUE_PROPS;
    public static final GoldFlowScreen VALUE_PROPS_PROMO;
    public static final GoldFlowScreen VALUE_PROPS_SDUI;
    private final int value;

    private static final /* synthetic */ GoldFlowScreen[] $values() {
        return new GoldFlowScreen[]{SCREEN_UNSPECIFIED, LOADING, ERROR, VALUE_PROPS, VALUE_PROPS_SDUI, MULTI_AGREEMENTS, SINGLE_AGREEMENT, CONFIRMATION, SUGGESTED_ACTION, PLAN_SELECTION, UPDATE_APP, AGREEMENT_DISPLAY, VALUE_PROPS_PROMO, SAGE_START_APPLICATION, SAGE_APPLICATION};
    }

    @JvmStatic
    public static final GoldFlowScreen fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<GoldFlowScreen> getEntries() {
        return $ENTRIES;
    }

    private GoldFlowScreen(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final GoldFlowScreen goldFlowScreen = new GoldFlowScreen("SCREEN_UNSPECIFIED", 0, 0);
        SCREEN_UNSPECIFIED = goldFlowScreen;
        LOADING = new GoldFlowScreen("LOADING", 1, 1);
        ERROR = new GoldFlowScreen("ERROR", 2, 2);
        VALUE_PROPS = new GoldFlowScreen("VALUE_PROPS", 3, 3);
        VALUE_PROPS_SDUI = new GoldFlowScreen("VALUE_PROPS_SDUI", 4, 4);
        MULTI_AGREEMENTS = new GoldFlowScreen("MULTI_AGREEMENTS", 5, 5);
        SINGLE_AGREEMENT = new GoldFlowScreen("SINGLE_AGREEMENT", 6, 6);
        CONFIRMATION = new GoldFlowScreen("CONFIRMATION", 7, 7);
        SUGGESTED_ACTION = new GoldFlowScreen("SUGGESTED_ACTION", 8, 8);
        PLAN_SELECTION = new GoldFlowScreen("PLAN_SELECTION", 9, 9);
        UPDATE_APP = new GoldFlowScreen("UPDATE_APP", 10, 10);
        AGREEMENT_DISPLAY = new GoldFlowScreen("AGREEMENT_DISPLAY", 11, 11);
        VALUE_PROPS_PROMO = new GoldFlowScreen("VALUE_PROPS_PROMO", 12, 12);
        SAGE_START_APPLICATION = new GoldFlowScreen("SAGE_START_APPLICATION", 13, 13);
        SAGE_APPLICATION = new GoldFlowScreen("SAGE_APPLICATION", 14, 14);
        GoldFlowScreen[] goldFlowScreenArr$values = $values();
        $VALUES = goldFlowScreenArr$values;
        $ENTRIES = EnumEntries2.enumEntries(goldFlowScreenArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GoldFlowScreen.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<GoldFlowScreen>(orCreateKotlinClass, syntax, goldFlowScreen) { // from class: gold_flow.proto.v1.GoldFlowScreen$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public GoldFlowScreen fromValue(int value) {
                return GoldFlowScreen.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: GoldFlowScreen.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lgold_flow/proto/v1/GoldFlowScreen$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lgold_flow/proto/v1/GoldFlowScreen;", "fromValue", "value", "", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final GoldFlowScreen fromValue(int value) {
            switch (value) {
                case 0:
                    return GoldFlowScreen.SCREEN_UNSPECIFIED;
                case 1:
                    return GoldFlowScreen.LOADING;
                case 2:
                    return GoldFlowScreen.ERROR;
                case 3:
                    return GoldFlowScreen.VALUE_PROPS;
                case 4:
                    return GoldFlowScreen.VALUE_PROPS_SDUI;
                case 5:
                    return GoldFlowScreen.MULTI_AGREEMENTS;
                case 6:
                    return GoldFlowScreen.SINGLE_AGREEMENT;
                case 7:
                    return GoldFlowScreen.CONFIRMATION;
                case 8:
                    return GoldFlowScreen.SUGGESTED_ACTION;
                case 9:
                    return GoldFlowScreen.PLAN_SELECTION;
                case 10:
                    return GoldFlowScreen.UPDATE_APP;
                case 11:
                    return GoldFlowScreen.AGREEMENT_DISPLAY;
                case 12:
                    return GoldFlowScreen.VALUE_PROPS_PROMO;
                case 13:
                    return GoldFlowScreen.SAGE_START_APPLICATION;
                case 14:
                    return GoldFlowScreen.SAGE_APPLICATION;
                default:
                    return null;
            }
        }
    }

    public static GoldFlowScreen valueOf(String str) {
        return (GoldFlowScreen) Enum.valueOf(GoldFlowScreen.class, str);
    }

    public static GoldFlowScreen[] values() {
        return (GoldFlowScreen[]) $VALUES.clone();
    }
}
