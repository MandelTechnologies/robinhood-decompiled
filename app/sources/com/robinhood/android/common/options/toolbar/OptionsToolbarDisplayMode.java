package com.robinhood.android.common.options.toolbar;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionsToolbarDisplayMode.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/options/toolbar/OptionsToolbarDisplayMode;", "", "<init>", "(Ljava/lang/String;I)V", "OPTIONS_DETAIL_PAGE", "OPTIONS_PROJECTED_RETURN_PAGE", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class OptionsToolbarDisplayMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionsToolbarDisplayMode[] $VALUES;
    public static final OptionsToolbarDisplayMode OPTIONS_DETAIL_PAGE = new OptionsToolbarDisplayMode("OPTIONS_DETAIL_PAGE", 0);
    public static final OptionsToolbarDisplayMode OPTIONS_PROJECTED_RETURN_PAGE = new OptionsToolbarDisplayMode("OPTIONS_PROJECTED_RETURN_PAGE", 1);

    private static final /* synthetic */ OptionsToolbarDisplayMode[] $values() {
        return new OptionsToolbarDisplayMode[]{OPTIONS_DETAIL_PAGE, OPTIONS_PROJECTED_RETURN_PAGE};
    }

    public static EnumEntries<OptionsToolbarDisplayMode> getEntries() {
        return $ENTRIES;
    }

    private OptionsToolbarDisplayMode(String str, int i) {
    }

    static {
        OptionsToolbarDisplayMode[] optionsToolbarDisplayModeArr$values = $values();
        $VALUES = optionsToolbarDisplayModeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionsToolbarDisplayModeArr$values);
    }

    public static OptionsToolbarDisplayMode valueOf(String str) {
        return (OptionsToolbarDisplayMode) Enum.valueOf(OptionsToolbarDisplayMode.class, str);
    }

    public static OptionsToolbarDisplayMode[] values() {
        return (OptionsToolbarDisplayMode[]) $VALUES.clone();
    }
}
