package com.robinhood.android.common.portfolio.unified;

import com.robinhood.android.models.portfolio.PositionsDisplayOptions;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DisplayType.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/unified/DisplayType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "UNKNOWN", "LAST_PRICE", "PERCENT_CHANGE", "TOTAL_PERCENT_CHANGE", "Companion", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class DisplayType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DisplayType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final DisplayType LAST_PRICE;
    public static final DisplayType PERCENT_CHANGE;
    public static final DisplayType TOTAL_PERCENT_CHANGE;
    public static final DisplayType UNKNOWN = new DisplayType("UNKNOWN", 0, "unknown");
    private static final ImmutableList3<DisplayType> defaultTypes;
    private static final ImmutableList3<DisplayType> optionsTypes;
    private final String value;

    private static final /* synthetic */ DisplayType[] $values() {
        return new DisplayType[]{UNKNOWN, LAST_PRICE, PERCENT_CHANGE, TOTAL_PERCENT_CHANGE};
    }

    public static EnumEntries<DisplayType> getEntries() {
        return $ENTRIES;
    }

    private DisplayType(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        DisplayType displayType = new DisplayType("LAST_PRICE", 1, "last-price");
        LAST_PRICE = displayType;
        DisplayType displayType2 = new DisplayType("PERCENT_CHANGE", 2, PositionsDisplayOptions.PERCENT_CHANGE);
        PERCENT_CHANGE = displayType2;
        DisplayType displayType3 = new DisplayType("TOTAL_PERCENT_CHANGE", 3, "total-percent-change");
        TOTAL_PERCENT_CHANGE = displayType3;
        DisplayType[] displayTypeArr$values = $values();
        $VALUES = displayTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(displayTypeArr$values);
        INSTANCE = new Companion(null);
        defaultTypes = extensions2.persistentListOf(displayType, displayType2);
        optionsTypes = extensions2.persistentListOf(displayType, displayType2, displayType3);
    }

    /* compiled from: DisplayType.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/unified/DisplayType$Companion;", "", "<init>", "()V", "defaultTypes", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/robinhood/android/common/portfolio/unified/DisplayType;", "getDefaultTypes", "()Lkotlinx/collections/immutable/PersistentList;", "optionsTypes", "getOptionsTypes", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ImmutableList3<DisplayType> getDefaultTypes() {
            return DisplayType.defaultTypes;
        }

        public final ImmutableList3<DisplayType> getOptionsTypes() {
            return DisplayType.optionsTypes;
        }
    }

    public static DisplayType valueOf(String str) {
        return (DisplayType) Enum.valueOf(DisplayType.class, str);
    }

    public static DisplayType[] values() {
        return (DisplayType[]) $VALUES.clone();
    }
}
