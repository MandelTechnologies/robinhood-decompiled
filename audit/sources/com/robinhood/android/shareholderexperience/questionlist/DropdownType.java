package com.robinhood.android.shareholderexperience.questionlist;

import com.robinhood.android.shareholderexperience.C28477R;
import com.robinhood.shared.education.order.OrderTypeEducationLearnMoreFragment;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DropdownType.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/DropdownType;", "", OrderTypeEducationLearnMoreFragment.ARG_TITLE_RES, "", "<init>", "(Ljava/lang/String;II)V", "getTitleRes", "()I", "SORT", "FILTER", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class DropdownType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DropdownType[] $VALUES;
    private final int titleRes;
    public static final DropdownType SORT = new DropdownType("SORT", 0, C28477R.string.question_dropdown_sheet_sort_title);
    public static final DropdownType FILTER = new DropdownType("FILTER", 1, C28477R.string.question_dropdown_sheet_filter_title);

    private static final /* synthetic */ DropdownType[] $values() {
        return new DropdownType[]{SORT, FILTER};
    }

    public static EnumEntries<DropdownType> getEntries() {
        return $ENTRIES;
    }

    private DropdownType(String str, int i, int i2) {
        this.titleRes = i2;
    }

    public final int getTitleRes() {
        return this.titleRes;
    }

    static {
        DropdownType[] dropdownTypeArr$values = $values();
        $VALUES = dropdownTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(dropdownTypeArr$values);
    }

    public static DropdownType valueOf(String str) {
        return (DropdownType) Enum.valueOf(DropdownType.class, str);
    }

    public static DropdownType[] values() {
        return (DropdownType[]) $VALUES.clone();
    }
}
