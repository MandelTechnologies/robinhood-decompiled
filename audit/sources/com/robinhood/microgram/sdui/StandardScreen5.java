package com.robinhood.microgram.sdui;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.enums.RhEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StandardScreen.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/Theme;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "DEFAULT", "ACHROMATIC", "CRYPTO", "LIGHT", "DARK", "LIGHT_ACHROMATIC", "DARK_ACHROMATIC", "Companion", "lib-microgram-sdui-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.microgram.sdui.Theme, reason: use source file name */
/* loaded from: classes13.dex */
public final class StandardScreen5 implements RhEnum<StandardScreen5> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ StandardScreen5[] $VALUES;
    private final String serverValue;
    public static final StandardScreen5 DEFAULT = new StandardScreen5("DEFAULT", 0, AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT);
    public static final StandardScreen5 ACHROMATIC = new StandardScreen5("ACHROMATIC", 1, "achromatic");
    public static final StandardScreen5 CRYPTO = new StandardScreen5("CRYPTO", 2, AnalyticsStrings.TAB_NAV_TAB_BAR_CRYPTO);
    public static final StandardScreen5 LIGHT = new StandardScreen5("LIGHT", 3, "light");
    public static final StandardScreen5 DARK = new StandardScreen5("DARK", 4, "dark");
    public static final StandardScreen5 LIGHT_ACHROMATIC = new StandardScreen5("LIGHT_ACHROMATIC", 5, "light_achromatic");
    public static final StandardScreen5 DARK_ACHROMATIC = new StandardScreen5("DARK_ACHROMATIC", 6, "dark_achromatic");

    private static final /* synthetic */ StandardScreen5[] $values() {
        return new StandardScreen5[]{DEFAULT, ACHROMATIC, CRYPTO, LIGHT, DARK, LIGHT_ACHROMATIC, DARK_ACHROMATIC};
    }

    public static EnumEntries<StandardScreen5> getEntries() {
        return $ENTRIES;
    }

    private StandardScreen5(String str, int i, String str2) {
        this.serverValue = str2;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    static {
        StandardScreen5[] standardScreen5Arr$values = $values();
        $VALUES = standardScreen5Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(standardScreen5Arr$values);
        INSTANCE = new Companion(null);
    }

    public static StandardScreen5 valueOf(String str) {
        return (StandardScreen5) Enum.valueOf(StandardScreen5.class, str);
    }

    public static StandardScreen5[] values() {
        return (StandardScreen5[]) $VALUES.clone();
    }
}
