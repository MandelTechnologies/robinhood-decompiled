package com.robinhood.android.common.recurring.assetSelection;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RecurringAssetCategorySelectionV2Composable.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/assetSelection/BrokerageCashSweepsState;", "", "<init>", "(Ljava/lang/String;I)V", "ACTIVE", "INELIGIBLE", "ELIGIBLE_NOT_ENROLLED", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.recurring.assetSelection.BrokerageCashSweepsState, reason: use source file name */
/* loaded from: classes2.dex */
final class RecurringAssetCategorySelectionV2Composable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RecurringAssetCategorySelectionV2Composable[] $VALUES;
    public static final RecurringAssetCategorySelectionV2Composable ACTIVE = new RecurringAssetCategorySelectionV2Composable("ACTIVE", 0);
    public static final RecurringAssetCategorySelectionV2Composable INELIGIBLE = new RecurringAssetCategorySelectionV2Composable("INELIGIBLE", 1);
    public static final RecurringAssetCategorySelectionV2Composable ELIGIBLE_NOT_ENROLLED = new RecurringAssetCategorySelectionV2Composable("ELIGIBLE_NOT_ENROLLED", 2);

    private static final /* synthetic */ RecurringAssetCategorySelectionV2Composable[] $values() {
        return new RecurringAssetCategorySelectionV2Composable[]{ACTIVE, INELIGIBLE, ELIGIBLE_NOT_ENROLLED};
    }

    public static EnumEntries<RecurringAssetCategorySelectionV2Composable> getEntries() {
        return $ENTRIES;
    }

    private RecurringAssetCategorySelectionV2Composable(String str, int i) {
    }

    static {
        RecurringAssetCategorySelectionV2Composable[] recurringAssetCategorySelectionV2ComposableArr$values = $values();
        $VALUES = recurringAssetCategorySelectionV2ComposableArr$values;
        $ENTRIES = EnumEntries2.enumEntries(recurringAssetCategorySelectionV2ComposableArr$values);
    }

    public static RecurringAssetCategorySelectionV2Composable valueOf(String str) {
        return (RecurringAssetCategorySelectionV2Composable) Enum.valueOf(RecurringAssetCategorySelectionV2Composable.class, str);
    }

    public static RecurringAssetCategorySelectionV2Composable[] values() {
        return (RecurringAssetCategorySelectionV2Composable[]) $VALUES.clone();
    }
}
