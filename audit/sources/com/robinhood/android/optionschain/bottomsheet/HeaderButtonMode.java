package com.robinhood.android.optionschain.bottomsheet;

import com.robinhood.android.educationtour.EducationTourElementIds;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionChainBottomSheetComponent.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/optionschain/bottomsheet/HeaderButtonMode;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "CONTINUE", EducationTourElementIds.ADD_TO_WATCHLIST_ELEMENT_ID, "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
final class HeaderButtonMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HeaderButtonMode[] $VALUES;
    public static final HeaderButtonMode NONE = new HeaderButtonMode("NONE", 0);
    public static final HeaderButtonMode CONTINUE = new HeaderButtonMode("CONTINUE", 1);
    public static final HeaderButtonMode WATCHLIST = new HeaderButtonMode(EducationTourElementIds.ADD_TO_WATCHLIST_ELEMENT_ID, 2);

    private static final /* synthetic */ HeaderButtonMode[] $values() {
        return new HeaderButtonMode[]{NONE, CONTINUE, WATCHLIST};
    }

    public static EnumEntries<HeaderButtonMode> getEntries() {
        return $ENTRIES;
    }

    private HeaderButtonMode(String str, int i) {
    }

    static {
        HeaderButtonMode[] headerButtonModeArr$values = $values();
        $VALUES = headerButtonModeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(headerButtonModeArr$values);
    }

    public static HeaderButtonMode valueOf(String str) {
        return (HeaderButtonMode) Enum.valueOf(HeaderButtonMode.class, str);
    }

    public static HeaderButtonMode[] values() {
        return (HeaderButtonMode[]) $VALUES.clone();
    }
}
