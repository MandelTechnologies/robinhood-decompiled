package com.robinhood.android.advisory.dashboard.overview.portfolio;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CategoryDrillDown.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/overview/portfolio/SwipeState;", "", "<init>", "(Ljava/lang/String;I)V", "RESTING", "LEFT", "RIGHT", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.dashboard.overview.portfolio.SwipeState, reason: use source file name */
/* loaded from: classes7.dex */
public final class CategoryDrillDown5 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CategoryDrillDown5[] $VALUES;
    public static final CategoryDrillDown5 RESTING = new CategoryDrillDown5("RESTING", 0);
    public static final CategoryDrillDown5 LEFT = new CategoryDrillDown5("LEFT", 1);
    public static final CategoryDrillDown5 RIGHT = new CategoryDrillDown5("RIGHT", 2);

    private static final /* synthetic */ CategoryDrillDown5[] $values() {
        return new CategoryDrillDown5[]{RESTING, LEFT, RIGHT};
    }

    public static EnumEntries<CategoryDrillDown5> getEntries() {
        return $ENTRIES;
    }

    private CategoryDrillDown5(String str, int i) {
    }

    static {
        CategoryDrillDown5[] categoryDrillDown5Arr$values = $values();
        $VALUES = categoryDrillDown5Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(categoryDrillDown5Arr$values);
    }

    public static CategoryDrillDown5 valueOf(String str) {
        return (CategoryDrillDown5) Enum.valueOf(CategoryDrillDown5.class, str);
    }

    public static CategoryDrillDown5[] values() {
        return (CategoryDrillDown5[]) $VALUES.clone();
    }
}
