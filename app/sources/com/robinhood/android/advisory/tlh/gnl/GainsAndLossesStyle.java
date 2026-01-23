package com.robinhood.android.advisory.tlh.gnl;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GainsAndLossesSection.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/tlh/gnl/GainsAndLossesStyle;", "", "<init>", "(Ljava/lang/String;I)V", "FULL_PAGE", "DASHBOARD_SECTION", "feature-tax-loss-harvesting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class GainsAndLossesStyle {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ GainsAndLossesStyle[] $VALUES;
    public static final GainsAndLossesStyle FULL_PAGE = new GainsAndLossesStyle("FULL_PAGE", 0);
    public static final GainsAndLossesStyle DASHBOARD_SECTION = new GainsAndLossesStyle("DASHBOARD_SECTION", 1);

    private static final /* synthetic */ GainsAndLossesStyle[] $values() {
        return new GainsAndLossesStyle[]{FULL_PAGE, DASHBOARD_SECTION};
    }

    public static EnumEntries<GainsAndLossesStyle> getEntries() {
        return $ENTRIES;
    }

    private GainsAndLossesStyle(String str, int i) {
    }

    static {
        GainsAndLossesStyle[] gainsAndLossesStyleArr$values = $values();
        $VALUES = gainsAndLossesStyleArr$values;
        $ENTRIES = EnumEntries2.enumEntries(gainsAndLossesStyleArr$values);
    }

    public static GainsAndLossesStyle valueOf(String str) {
        return (GainsAndLossesStyle) Enum.valueOf(GainsAndLossesStyle.class, str);
    }

    public static GainsAndLossesStyle[] values() {
        return (GainsAndLossesStyle[]) $VALUES.clone();
    }
}
