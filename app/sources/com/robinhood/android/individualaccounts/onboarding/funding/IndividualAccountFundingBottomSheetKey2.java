package com.robinhood.android.individualaccounts.onboarding.funding;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IndividualAccountFundingBottomSheetKey.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/individualaccounts/onboarding/funding/FundAccountType;", "", "<init>", "(Ljava/lang/String;I)V", "ASSETS", "CASH", "feature-individual-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.individualaccounts.onboarding.funding.FundAccountType, reason: use source file name */
/* loaded from: classes10.dex */
public final class IndividualAccountFundingBottomSheetKey2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ IndividualAccountFundingBottomSheetKey2[] $VALUES;
    public static final IndividualAccountFundingBottomSheetKey2 ASSETS = new IndividualAccountFundingBottomSheetKey2("ASSETS", 0);
    public static final IndividualAccountFundingBottomSheetKey2 CASH = new IndividualAccountFundingBottomSheetKey2("CASH", 1);

    private static final /* synthetic */ IndividualAccountFundingBottomSheetKey2[] $values() {
        return new IndividualAccountFundingBottomSheetKey2[]{ASSETS, CASH};
    }

    public static EnumEntries<IndividualAccountFundingBottomSheetKey2> getEntries() {
        return $ENTRIES;
    }

    private IndividualAccountFundingBottomSheetKey2(String str, int i) {
    }

    static {
        IndividualAccountFundingBottomSheetKey2[] individualAccountFundingBottomSheetKey2Arr$values = $values();
        $VALUES = individualAccountFundingBottomSheetKey2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(individualAccountFundingBottomSheetKey2Arr$values);
    }

    public static IndividualAccountFundingBottomSheetKey2 valueOf(String str) {
        return (IndividualAccountFundingBottomSheetKey2) Enum.valueOf(IndividualAccountFundingBottomSheetKey2.class, str);
    }

    public static IndividualAccountFundingBottomSheetKey2[] values() {
        return (IndividualAccountFundingBottomSheetKey2[]) $VALUES.clone();
    }
}
