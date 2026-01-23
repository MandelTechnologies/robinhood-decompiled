package hippo.model.p469v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Deprecated;
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
/* compiled from: UXFlagName.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b,\b\u0086\u0081\u0002\u0018\u0000 /2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001/B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.¨\u00060"}, m3636d2 = {"Lhippo/model/v1/UXFlagName;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "UX_FLAG_NAME_UNSPECIFIED", "BLACK_WIDOW_EDUCATION_FIRST_TRADE", "BLACK_WIDOW_EDUCATION_ADD_LAYOUT", "ONBOARDING_WEB_CLIENT_PREFERENCE", "BLACK_WIDOW_EDUCATION_WIDGET_LINKING", "BLACK_WIDOW_SIGNED_LEGEND_AGREEMENT", "BLACK_WIDOW_FIRST_LAYOUT_CREATED", "BLACK_WIDOW_FIRST_WIDGET_ADDED", "BLACK_WIDOW_FIRST_SINGLE_LEG_TRADE", "BLACK_WIDOW_FIRST_MULTI_LEG_TRADE", "BLACK_WIDOW_EDUCATION_OPTION_CHAIN_L2", "BLACK_WIDOW_EDUCATION_OPTION_CHAIN_L3", "BLACK_WIDOW_EDUCATION_FEATURE_DISCOVERY", "BLACK_WIDOW_EDUCATION_VOLUME_AS_INDICATOR", "BLACK_WIDOW_EDUCATION_OPTION_CHART_LINKED_DERIVATIVE", "BLACK_WIDOW_EDUCATION_CHART_DRAWINGS_SYNC", "BLACK_WIDOW_OPTION_CHAIN_ANALYZER", "BLACK_WIDOW_MAC_POSITION_PILL_OPENED", "BLACK_WIDOW_EDUCATION_OPTION_CHAIN_ANALYZER", "BLACK_WIDOW_SHOULD_DEFAULT_TO_LEGEND", "BLACK_WIDOW_HAS_DEFAULTED_TO_LEGEND", "BLACK_WIDOW_DEFAULT_TO_LEGEND", "BLACK_WIDOW_HAS_SEEN_DEFAULT_TO_LEGEND_BANNER", "BLACK_WIDOW_DEFAULT_WEB_CLIENT", "BLACK_WIDOW_FIRST_WIDGET_ADDED_OPTIONS_INTEREST", "BLACK_WIDOW_EDUCATION_CUSTOMIZE_LAYOUT", "BLACK_WIDOW_OPTIONS_TEMPLATE_APPLIED", "ADVISORY_ANDROID_RETURNS_HUB_BENCHMARK_INFO", "BLACK_WIDOW_EDUCATION_OPTION_ORDER_FORM_LINKED_LEGS", "BLACK_WIDOW_EDUCATION_OPTIONS_INTEREST_FIRST_WIDGET", "EQUITY_SHORT_SELLING_NEW_USER_EXPERIENCE", "EQUITY_SHORT_SELLING_SHIMMER", "BLACK_WIDOW_LADDER_APP_SETTINGS_DISMISSED", "BLACK_WIDOW_EDUCATION_WIDGET_AUTO_SEND", "BLACK_WIDOW_EDUCATION_PRIVACY_MODE", "BLACK_WIDOW_LADDER_APP_SETTINGS_SHOWN", "BLACK_WIDOW_HOTKEY_AUTO_SEND_ORDER_CONFIRMATION_SHOWN", "EQUITY_TAX_LOTS_NEW_LABEL", "Companion", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class UXFlagName implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ UXFlagName[] $VALUES;

    @JvmField
    public static final ProtoAdapter<UXFlagName> ADAPTER;
    public static final UXFlagName ADVISORY_ANDROID_RETURNS_HUB_BENCHMARK_INFO;

    @Deprecated
    public static final UXFlagName BLACK_WIDOW_DEFAULT_TO_LEGEND;
    public static final UXFlagName BLACK_WIDOW_DEFAULT_WEB_CLIENT;
    public static final UXFlagName BLACK_WIDOW_EDUCATION_ADD_LAYOUT;
    public static final UXFlagName BLACK_WIDOW_EDUCATION_CHART_DRAWINGS_SYNC;
    public static final UXFlagName BLACK_WIDOW_EDUCATION_CUSTOMIZE_LAYOUT;
    public static final UXFlagName BLACK_WIDOW_EDUCATION_FEATURE_DISCOVERY;
    public static final UXFlagName BLACK_WIDOW_EDUCATION_FIRST_TRADE;
    public static final UXFlagName BLACK_WIDOW_EDUCATION_OPTIONS_INTEREST_FIRST_WIDGET;
    public static final UXFlagName BLACK_WIDOW_EDUCATION_OPTION_CHAIN_ANALYZER;
    public static final UXFlagName BLACK_WIDOW_EDUCATION_OPTION_CHAIN_L2;
    public static final UXFlagName BLACK_WIDOW_EDUCATION_OPTION_CHAIN_L3;
    public static final UXFlagName BLACK_WIDOW_EDUCATION_OPTION_CHART_LINKED_DERIVATIVE;
    public static final UXFlagName BLACK_WIDOW_EDUCATION_OPTION_ORDER_FORM_LINKED_LEGS;
    public static final UXFlagName BLACK_WIDOW_EDUCATION_PRIVACY_MODE;
    public static final UXFlagName BLACK_WIDOW_EDUCATION_VOLUME_AS_INDICATOR;
    public static final UXFlagName BLACK_WIDOW_EDUCATION_WIDGET_AUTO_SEND;
    public static final UXFlagName BLACK_WIDOW_EDUCATION_WIDGET_LINKING;
    public static final UXFlagName BLACK_WIDOW_FIRST_LAYOUT_CREATED;
    public static final UXFlagName BLACK_WIDOW_FIRST_MULTI_LEG_TRADE;
    public static final UXFlagName BLACK_WIDOW_FIRST_SINGLE_LEG_TRADE;
    public static final UXFlagName BLACK_WIDOW_FIRST_WIDGET_ADDED;

    @Deprecated
    public static final UXFlagName BLACK_WIDOW_FIRST_WIDGET_ADDED_OPTIONS_INTEREST;

    @Deprecated
    public static final UXFlagName BLACK_WIDOW_HAS_DEFAULTED_TO_LEGEND;

    @Deprecated
    public static final UXFlagName BLACK_WIDOW_HAS_SEEN_DEFAULT_TO_LEGEND_BANNER;
    public static final UXFlagName BLACK_WIDOW_HOTKEY_AUTO_SEND_ORDER_CONFIRMATION_SHOWN;
    public static final UXFlagName BLACK_WIDOW_LADDER_APP_SETTINGS_DISMISSED;
    public static final UXFlagName BLACK_WIDOW_LADDER_APP_SETTINGS_SHOWN;
    public static final UXFlagName BLACK_WIDOW_MAC_POSITION_PILL_OPENED;
    public static final UXFlagName BLACK_WIDOW_OPTIONS_TEMPLATE_APPLIED;

    @Deprecated
    public static final UXFlagName BLACK_WIDOW_OPTION_CHAIN_ANALYZER;

    @Deprecated
    public static final UXFlagName BLACK_WIDOW_SHOULD_DEFAULT_TO_LEGEND;
    public static final UXFlagName BLACK_WIDOW_SIGNED_LEGEND_AGREEMENT;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final UXFlagName EQUITY_SHORT_SELLING_NEW_USER_EXPERIENCE;
    public static final UXFlagName EQUITY_SHORT_SELLING_SHIMMER;
    public static final UXFlagName EQUITY_TAX_LOTS_NEW_LABEL;
    public static final UXFlagName ONBOARDING_WEB_CLIENT_PREFERENCE;
    public static final UXFlagName UX_FLAG_NAME_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ UXFlagName[] $values() {
        return new UXFlagName[]{UX_FLAG_NAME_UNSPECIFIED, BLACK_WIDOW_EDUCATION_FIRST_TRADE, BLACK_WIDOW_EDUCATION_ADD_LAYOUT, ONBOARDING_WEB_CLIENT_PREFERENCE, BLACK_WIDOW_EDUCATION_WIDGET_LINKING, BLACK_WIDOW_SIGNED_LEGEND_AGREEMENT, BLACK_WIDOW_FIRST_LAYOUT_CREATED, BLACK_WIDOW_FIRST_WIDGET_ADDED, BLACK_WIDOW_FIRST_SINGLE_LEG_TRADE, BLACK_WIDOW_FIRST_MULTI_LEG_TRADE, BLACK_WIDOW_EDUCATION_OPTION_CHAIN_L2, BLACK_WIDOW_EDUCATION_OPTION_CHAIN_L3, BLACK_WIDOW_EDUCATION_FEATURE_DISCOVERY, BLACK_WIDOW_EDUCATION_VOLUME_AS_INDICATOR, BLACK_WIDOW_EDUCATION_OPTION_CHART_LINKED_DERIVATIVE, BLACK_WIDOW_EDUCATION_CHART_DRAWINGS_SYNC, BLACK_WIDOW_OPTION_CHAIN_ANALYZER, BLACK_WIDOW_MAC_POSITION_PILL_OPENED, BLACK_WIDOW_EDUCATION_OPTION_CHAIN_ANALYZER, BLACK_WIDOW_SHOULD_DEFAULT_TO_LEGEND, BLACK_WIDOW_HAS_DEFAULTED_TO_LEGEND, BLACK_WIDOW_DEFAULT_TO_LEGEND, BLACK_WIDOW_HAS_SEEN_DEFAULT_TO_LEGEND_BANNER, BLACK_WIDOW_DEFAULT_WEB_CLIENT, BLACK_WIDOW_FIRST_WIDGET_ADDED_OPTIONS_INTEREST, BLACK_WIDOW_EDUCATION_CUSTOMIZE_LAYOUT, BLACK_WIDOW_OPTIONS_TEMPLATE_APPLIED, ADVISORY_ANDROID_RETURNS_HUB_BENCHMARK_INFO, BLACK_WIDOW_EDUCATION_OPTION_ORDER_FORM_LINKED_LEGS, BLACK_WIDOW_EDUCATION_OPTIONS_INTEREST_FIRST_WIDGET, EQUITY_SHORT_SELLING_NEW_USER_EXPERIENCE, EQUITY_SHORT_SELLING_SHIMMER, BLACK_WIDOW_LADDER_APP_SETTINGS_DISMISSED, BLACK_WIDOW_EDUCATION_WIDGET_AUTO_SEND, BLACK_WIDOW_EDUCATION_PRIVACY_MODE, BLACK_WIDOW_LADDER_APP_SETTINGS_SHOWN, BLACK_WIDOW_HOTKEY_AUTO_SEND_ORDER_CONFIRMATION_SHOWN, EQUITY_TAX_LOTS_NEW_LABEL};
    }

    @JvmStatic
    public static final UXFlagName fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<UXFlagName> getEntries() {
        return $ENTRIES;
    }

    private UXFlagName(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final UXFlagName uXFlagName = new UXFlagName("UX_FLAG_NAME_UNSPECIFIED", 0, 0);
        UX_FLAG_NAME_UNSPECIFIED = uXFlagName;
        BLACK_WIDOW_EDUCATION_FIRST_TRADE = new UXFlagName("BLACK_WIDOW_EDUCATION_FIRST_TRADE", 1, 1);
        BLACK_WIDOW_EDUCATION_ADD_LAYOUT = new UXFlagName("BLACK_WIDOW_EDUCATION_ADD_LAYOUT", 2, 2);
        ONBOARDING_WEB_CLIENT_PREFERENCE = new UXFlagName("ONBOARDING_WEB_CLIENT_PREFERENCE", 3, 3);
        BLACK_WIDOW_EDUCATION_WIDGET_LINKING = new UXFlagName("BLACK_WIDOW_EDUCATION_WIDGET_LINKING", 4, 4);
        BLACK_WIDOW_SIGNED_LEGEND_AGREEMENT = new UXFlagName("BLACK_WIDOW_SIGNED_LEGEND_AGREEMENT", 5, 5);
        BLACK_WIDOW_FIRST_LAYOUT_CREATED = new UXFlagName("BLACK_WIDOW_FIRST_LAYOUT_CREATED", 6, 6);
        BLACK_WIDOW_FIRST_WIDGET_ADDED = new UXFlagName("BLACK_WIDOW_FIRST_WIDGET_ADDED", 7, 7);
        BLACK_WIDOW_FIRST_SINGLE_LEG_TRADE = new UXFlagName("BLACK_WIDOW_FIRST_SINGLE_LEG_TRADE", 8, 8);
        BLACK_WIDOW_FIRST_MULTI_LEG_TRADE = new UXFlagName("BLACK_WIDOW_FIRST_MULTI_LEG_TRADE", 9, 9);
        BLACK_WIDOW_EDUCATION_OPTION_CHAIN_L2 = new UXFlagName("BLACK_WIDOW_EDUCATION_OPTION_CHAIN_L2", 10, 10);
        BLACK_WIDOW_EDUCATION_OPTION_CHAIN_L3 = new UXFlagName("BLACK_WIDOW_EDUCATION_OPTION_CHAIN_L3", 11, 11);
        BLACK_WIDOW_EDUCATION_FEATURE_DISCOVERY = new UXFlagName("BLACK_WIDOW_EDUCATION_FEATURE_DISCOVERY", 12, 12);
        BLACK_WIDOW_EDUCATION_VOLUME_AS_INDICATOR = new UXFlagName("BLACK_WIDOW_EDUCATION_VOLUME_AS_INDICATOR", 13, 13);
        BLACK_WIDOW_EDUCATION_OPTION_CHART_LINKED_DERIVATIVE = new UXFlagName("BLACK_WIDOW_EDUCATION_OPTION_CHART_LINKED_DERIVATIVE", 14, 14);
        BLACK_WIDOW_EDUCATION_CHART_DRAWINGS_SYNC = new UXFlagName("BLACK_WIDOW_EDUCATION_CHART_DRAWINGS_SYNC", 15, 15);
        BLACK_WIDOW_OPTION_CHAIN_ANALYZER = new UXFlagName("BLACK_WIDOW_OPTION_CHAIN_ANALYZER", 16, 16);
        BLACK_WIDOW_MAC_POSITION_PILL_OPENED = new UXFlagName("BLACK_WIDOW_MAC_POSITION_PILL_OPENED", 17, 17);
        BLACK_WIDOW_EDUCATION_OPTION_CHAIN_ANALYZER = new UXFlagName("BLACK_WIDOW_EDUCATION_OPTION_CHAIN_ANALYZER", 18, 18);
        BLACK_WIDOW_SHOULD_DEFAULT_TO_LEGEND = new UXFlagName("BLACK_WIDOW_SHOULD_DEFAULT_TO_LEGEND", 19, 19);
        BLACK_WIDOW_HAS_DEFAULTED_TO_LEGEND = new UXFlagName("BLACK_WIDOW_HAS_DEFAULTED_TO_LEGEND", 20, 20);
        BLACK_WIDOW_DEFAULT_TO_LEGEND = new UXFlagName("BLACK_WIDOW_DEFAULT_TO_LEGEND", 21, 21);
        BLACK_WIDOW_HAS_SEEN_DEFAULT_TO_LEGEND_BANNER = new UXFlagName("BLACK_WIDOW_HAS_SEEN_DEFAULT_TO_LEGEND_BANNER", 22, 22);
        BLACK_WIDOW_DEFAULT_WEB_CLIENT = new UXFlagName("BLACK_WIDOW_DEFAULT_WEB_CLIENT", 23, 23);
        BLACK_WIDOW_FIRST_WIDGET_ADDED_OPTIONS_INTEREST = new UXFlagName("BLACK_WIDOW_FIRST_WIDGET_ADDED_OPTIONS_INTEREST", 24, 24);
        BLACK_WIDOW_EDUCATION_CUSTOMIZE_LAYOUT = new UXFlagName("BLACK_WIDOW_EDUCATION_CUSTOMIZE_LAYOUT", 25, 25);
        BLACK_WIDOW_OPTIONS_TEMPLATE_APPLIED = new UXFlagName("BLACK_WIDOW_OPTIONS_TEMPLATE_APPLIED", 26, 26);
        ADVISORY_ANDROID_RETURNS_HUB_BENCHMARK_INFO = new UXFlagName("ADVISORY_ANDROID_RETURNS_HUB_BENCHMARK_INFO", 27, 27);
        BLACK_WIDOW_EDUCATION_OPTION_ORDER_FORM_LINKED_LEGS = new UXFlagName("BLACK_WIDOW_EDUCATION_OPTION_ORDER_FORM_LINKED_LEGS", 28, 28);
        BLACK_WIDOW_EDUCATION_OPTIONS_INTEREST_FIRST_WIDGET = new UXFlagName("BLACK_WIDOW_EDUCATION_OPTIONS_INTEREST_FIRST_WIDGET", 29, 29);
        EQUITY_SHORT_SELLING_NEW_USER_EXPERIENCE = new UXFlagName("EQUITY_SHORT_SELLING_NEW_USER_EXPERIENCE", 30, 30);
        EQUITY_SHORT_SELLING_SHIMMER = new UXFlagName("EQUITY_SHORT_SELLING_SHIMMER", 31, 31);
        BLACK_WIDOW_LADDER_APP_SETTINGS_DISMISSED = new UXFlagName("BLACK_WIDOW_LADDER_APP_SETTINGS_DISMISSED", 32, 32);
        BLACK_WIDOW_EDUCATION_WIDGET_AUTO_SEND = new UXFlagName("BLACK_WIDOW_EDUCATION_WIDGET_AUTO_SEND", 33, 33);
        BLACK_WIDOW_EDUCATION_PRIVACY_MODE = new UXFlagName("BLACK_WIDOW_EDUCATION_PRIVACY_MODE", 34, 34);
        BLACK_WIDOW_LADDER_APP_SETTINGS_SHOWN = new UXFlagName("BLACK_WIDOW_LADDER_APP_SETTINGS_SHOWN", 35, 35);
        BLACK_WIDOW_HOTKEY_AUTO_SEND_ORDER_CONFIRMATION_SHOWN = new UXFlagName("BLACK_WIDOW_HOTKEY_AUTO_SEND_ORDER_CONFIRMATION_SHOWN", 36, 36);
        EQUITY_TAX_LOTS_NEW_LABEL = new UXFlagName("EQUITY_TAX_LOTS_NEW_LABEL", 37, 37);
        UXFlagName[] uXFlagNameArr$values = $values();
        $VALUES = uXFlagNameArr$values;
        $ENTRIES = EnumEntries2.enumEntries(uXFlagNameArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UXFlagName.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<UXFlagName>(orCreateKotlinClass, syntax, uXFlagName) { // from class: hippo.model.v1.UXFlagName$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public UXFlagName fromValue(int value) {
                return UXFlagName.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: UXFlagName.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lhippo/model/v1/UXFlagName$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lhippo/model/v1/UXFlagName;", "fromValue", "value", "", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final UXFlagName fromValue(int value) {
            switch (value) {
                case 0:
                    return UXFlagName.UX_FLAG_NAME_UNSPECIFIED;
                case 1:
                    return UXFlagName.BLACK_WIDOW_EDUCATION_FIRST_TRADE;
                case 2:
                    return UXFlagName.BLACK_WIDOW_EDUCATION_ADD_LAYOUT;
                case 3:
                    return UXFlagName.ONBOARDING_WEB_CLIENT_PREFERENCE;
                case 4:
                    return UXFlagName.BLACK_WIDOW_EDUCATION_WIDGET_LINKING;
                case 5:
                    return UXFlagName.BLACK_WIDOW_SIGNED_LEGEND_AGREEMENT;
                case 6:
                    return UXFlagName.BLACK_WIDOW_FIRST_LAYOUT_CREATED;
                case 7:
                    return UXFlagName.BLACK_WIDOW_FIRST_WIDGET_ADDED;
                case 8:
                    return UXFlagName.BLACK_WIDOW_FIRST_SINGLE_LEG_TRADE;
                case 9:
                    return UXFlagName.BLACK_WIDOW_FIRST_MULTI_LEG_TRADE;
                case 10:
                    return UXFlagName.BLACK_WIDOW_EDUCATION_OPTION_CHAIN_L2;
                case 11:
                    return UXFlagName.BLACK_WIDOW_EDUCATION_OPTION_CHAIN_L3;
                case 12:
                    return UXFlagName.BLACK_WIDOW_EDUCATION_FEATURE_DISCOVERY;
                case 13:
                    return UXFlagName.BLACK_WIDOW_EDUCATION_VOLUME_AS_INDICATOR;
                case 14:
                    return UXFlagName.BLACK_WIDOW_EDUCATION_OPTION_CHART_LINKED_DERIVATIVE;
                case 15:
                    return UXFlagName.BLACK_WIDOW_EDUCATION_CHART_DRAWINGS_SYNC;
                case 16:
                    return UXFlagName.BLACK_WIDOW_OPTION_CHAIN_ANALYZER;
                case 17:
                    return UXFlagName.BLACK_WIDOW_MAC_POSITION_PILL_OPENED;
                case 18:
                    return UXFlagName.BLACK_WIDOW_EDUCATION_OPTION_CHAIN_ANALYZER;
                case 19:
                    return UXFlagName.BLACK_WIDOW_SHOULD_DEFAULT_TO_LEGEND;
                case 20:
                    return UXFlagName.BLACK_WIDOW_HAS_DEFAULTED_TO_LEGEND;
                case 21:
                    return UXFlagName.BLACK_WIDOW_DEFAULT_TO_LEGEND;
                case 22:
                    return UXFlagName.BLACK_WIDOW_HAS_SEEN_DEFAULT_TO_LEGEND_BANNER;
                case 23:
                    return UXFlagName.BLACK_WIDOW_DEFAULT_WEB_CLIENT;
                case 24:
                    return UXFlagName.BLACK_WIDOW_FIRST_WIDGET_ADDED_OPTIONS_INTEREST;
                case 25:
                    return UXFlagName.BLACK_WIDOW_EDUCATION_CUSTOMIZE_LAYOUT;
                case 26:
                    return UXFlagName.BLACK_WIDOW_OPTIONS_TEMPLATE_APPLIED;
                case 27:
                    return UXFlagName.ADVISORY_ANDROID_RETURNS_HUB_BENCHMARK_INFO;
                case 28:
                    return UXFlagName.BLACK_WIDOW_EDUCATION_OPTION_ORDER_FORM_LINKED_LEGS;
                case 29:
                    return UXFlagName.BLACK_WIDOW_EDUCATION_OPTIONS_INTEREST_FIRST_WIDGET;
                case 30:
                    return UXFlagName.EQUITY_SHORT_SELLING_NEW_USER_EXPERIENCE;
                case 31:
                    return UXFlagName.EQUITY_SHORT_SELLING_SHIMMER;
                case 32:
                    return UXFlagName.BLACK_WIDOW_LADDER_APP_SETTINGS_DISMISSED;
                case 33:
                    return UXFlagName.BLACK_WIDOW_EDUCATION_WIDGET_AUTO_SEND;
                case 34:
                    return UXFlagName.BLACK_WIDOW_EDUCATION_PRIVACY_MODE;
                case 35:
                    return UXFlagName.BLACK_WIDOW_LADDER_APP_SETTINGS_SHOWN;
                case 36:
                    return UXFlagName.BLACK_WIDOW_HOTKEY_AUTO_SEND_ORDER_CONFIRMATION_SHOWN;
                case 37:
                    return UXFlagName.EQUITY_TAX_LOTS_NEW_LABEL;
                default:
                    return null;
            }
        }
    }

    public static UXFlagName valueOf(String str) {
        return (UXFlagName) Enum.valueOf(UXFlagName.class, str);
    }

    public static UXFlagName[] values() {
        return (UXFlagName[]) $VALUES.clone();
    }
}
