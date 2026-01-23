package microgram.p507ui.contracts;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.Enums4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Theme.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, m3636d2 = {"Lmicrogram/ui/contracts/Theme;", "", "(Ljava/lang/String;I)V", "DEFAULT", "ACHROMATIC", "CRYPTO", "DARK", "DARK_ACHROMATIC", "LIGHT", "LIGHT_ACHROMATIC", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final class Theme {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Theme[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    @SerialName(AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT)
    public static final Theme DEFAULT = new Theme("DEFAULT", 0);

    @SerialName("achromatic")
    public static final Theme ACHROMATIC = new Theme("ACHROMATIC", 1);

    @SerialName(AnalyticsStrings.TAB_NAV_TAB_BAR_CRYPTO)
    public static final Theme CRYPTO = new Theme("CRYPTO", 2);

    @SerialName("dark")
    public static final Theme DARK = new Theme("DARK", 3);

    @SerialName("dark_achromatic")
    public static final Theme DARK_ACHROMATIC = new Theme("DARK_ACHROMATIC", 4);

    @SerialName("light")
    public static final Theme LIGHT = new Theme("LIGHT", 5);

    @SerialName("light_achromatic")
    public static final Theme LIGHT_ACHROMATIC = new Theme("LIGHT_ACHROMATIC", 6);

    private static final /* synthetic */ Theme[] $values() {
        return new Theme[]{DEFAULT, ACHROMATIC, CRYPTO, DARK, DARK_ACHROMATIC, LIGHT, LIGHT_ACHROMATIC};
    }

    public static EnumEntries<Theme> getEntries() {
        return $ENTRIES;
    }

    public static Theme valueOf(String str) {
        return (Theme) Enum.valueOf(Theme.class, str);
    }

    public static Theme[] values() {
        return (Theme[]) $VALUES.clone();
    }

    /* compiled from: Theme.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/contracts/Theme$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/contracts/Theme;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) Theme.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<Theme> serializer() {
            return get$cachedSerializer();
        }
    }

    private Theme(String str, int i) {
    }

    static {
        Theme[] themeArr$values = $values();
        $VALUES = themeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(themeArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: microgram.ui.contracts.Theme.Companion.1
            @Override // kotlin.jvm.functions.Function0
            public final KSerializer<Object> invoke() {
                return Enums4.createAnnotatedEnumSerializer("microgram.ui.contracts.Theme", Theme.values(), new String[]{AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "achromatic", AnalyticsStrings.TAB_NAV_TAB_BAR_CRYPTO, "dark", "dark_achromatic", "light", "light_achromatic"}, new Annotation[][]{null, null, null, null, null, null, null}, null);
            }
        });
    }
}
