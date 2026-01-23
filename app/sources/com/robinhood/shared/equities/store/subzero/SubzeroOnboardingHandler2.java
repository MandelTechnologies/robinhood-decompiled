package com.robinhood.shared.equities.store.subzero;

import com.robinhood.android.educationtour.EducationTourScreenNames;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SubzeroOnboardingHandler.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/equities/store/subzero/SubzeroOnboardingEntryPoint;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", EducationTourScreenNames.STOCK_DETAIL_PAGE_SCREEN, "LADDER", "MOBILE_ADVANCED_CHART", "lib-store-subzero_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.equities.store.subzero.SubzeroOnboardingEntryPoint, reason: use source file name */
/* loaded from: classes6.dex */
public final class SubzeroOnboardingHandler2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SubzeroOnboardingHandler2[] $VALUES;
    private final String value;
    public static final SubzeroOnboardingHandler2 STOCK_DETAIL_PAGE = new SubzeroOnboardingHandler2(EducationTourScreenNames.STOCK_DETAIL_PAGE_SCREEN, 0, EducationTourScreenNames.STOCK_DETAIL_PAGE_SCREEN);
    public static final SubzeroOnboardingHandler2 LADDER = new SubzeroOnboardingHandler2("LADDER", 1, "LADDER");
    public static final SubzeroOnboardingHandler2 MOBILE_ADVANCED_CHART = new SubzeroOnboardingHandler2("MOBILE_ADVANCED_CHART", 2, "MOBILE_ADVANCED_CHART");

    private static final /* synthetic */ SubzeroOnboardingHandler2[] $values() {
        return new SubzeroOnboardingHandler2[]{STOCK_DETAIL_PAGE, LADDER, MOBILE_ADVANCED_CHART};
    }

    public static EnumEntries<SubzeroOnboardingHandler2> getEntries() {
        return $ENTRIES;
    }

    private SubzeroOnboardingHandler2(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        SubzeroOnboardingHandler2[] subzeroOnboardingHandler2Arr$values = $values();
        $VALUES = subzeroOnboardingHandler2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(subzeroOnboardingHandler2Arr$values);
    }

    public static SubzeroOnboardingHandler2 valueOf(String str) {
        return (SubzeroOnboardingHandler2) Enum.valueOf(SubzeroOnboardingHandler2.class, str);
    }

    public static SubzeroOnboardingHandler2[] values() {
        return (SubzeroOnboardingHandler2[]) $VALUES.clone();
    }
}
