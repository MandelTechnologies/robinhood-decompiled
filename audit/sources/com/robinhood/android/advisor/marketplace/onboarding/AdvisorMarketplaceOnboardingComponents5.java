package com.robinhood.android.advisor.marketplace.onboarding;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdvisorMarketplaceOnboardingComponents.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisor/marketplace/onboarding/NavigationIconStyle;", "", "<init>", "(Ljava/lang/String;I)V", "BACK", "CLOSE", "feature-advisor-marketplace-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisor.marketplace.onboarding.NavigationIconStyle, reason: use source file name */
/* loaded from: classes7.dex */
public final class AdvisorMarketplaceOnboardingComponents5 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AdvisorMarketplaceOnboardingComponents5[] $VALUES;
    public static final AdvisorMarketplaceOnboardingComponents5 BACK = new AdvisorMarketplaceOnboardingComponents5("BACK", 0);
    public static final AdvisorMarketplaceOnboardingComponents5 CLOSE = new AdvisorMarketplaceOnboardingComponents5("CLOSE", 1);

    private static final /* synthetic */ AdvisorMarketplaceOnboardingComponents5[] $values() {
        return new AdvisorMarketplaceOnboardingComponents5[]{BACK, CLOSE};
    }

    public static EnumEntries<AdvisorMarketplaceOnboardingComponents5> getEntries() {
        return $ENTRIES;
    }

    private AdvisorMarketplaceOnboardingComponents5(String str, int i) {
    }

    static {
        AdvisorMarketplaceOnboardingComponents5[] advisorMarketplaceOnboardingComponents5Arr$values = $values();
        $VALUES = advisorMarketplaceOnboardingComponents5Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(advisorMarketplaceOnboardingComponents5Arr$values);
    }

    public static AdvisorMarketplaceOnboardingComponents5 valueOf(String str) {
        return (AdvisorMarketplaceOnboardingComponents5) Enum.valueOf(AdvisorMarketplaceOnboardingComponents5.class, str);
    }

    public static AdvisorMarketplaceOnboardingComponents5[] values() {
        return (AdvisorMarketplaceOnboardingComponents5[]) $VALUES.clone();
    }
}
