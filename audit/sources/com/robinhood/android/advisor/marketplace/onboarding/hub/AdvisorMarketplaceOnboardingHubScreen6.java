package com.robinhood.android.advisor.marketplace.onboarding.hub;

import com.robinhood.android.advisor.marketplace.onboarding.C8572R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdvisorMarketplaceOnboardingHubScreen.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/advisor/marketplace/onboarding/hub/HubType;", "", "title", "", "icon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "<init>", "(Ljava/lang/String;IILcom/robinhood/android/libdesignsystem/serverui/IconAsset;)V", "getTitle", "()I", "getIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "MATCHES", "MEETINGS", "feature-advisor-marketplace-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisor.marketplace.onboarding.hub.HubType, reason: use source file name */
/* loaded from: classes7.dex */
public final class AdvisorMarketplaceOnboardingHubScreen6 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AdvisorMarketplaceOnboardingHubScreen6[] $VALUES;
    public static final AdvisorMarketplaceOnboardingHubScreen6 MATCHES = new AdvisorMarketplaceOnboardingHubScreen6("MATCHES", 0, C8572R.string.marketplace_matches_hub_title, ServerToBentoAssetMapper2.PERSON_16);
    public static final AdvisorMarketplaceOnboardingHubScreen6 MEETINGS = new AdvisorMarketplaceOnboardingHubScreen6("MEETINGS", 1, C8572R.string.marketplace_meetings_hub_title, ServerToBentoAssetMapper2.CALENDAR_16);
    private final ServerToBentoAssetMapper2 icon;
    private final int title;

    private static final /* synthetic */ AdvisorMarketplaceOnboardingHubScreen6[] $values() {
        return new AdvisorMarketplaceOnboardingHubScreen6[]{MATCHES, MEETINGS};
    }

    public static EnumEntries<AdvisorMarketplaceOnboardingHubScreen6> getEntries() {
        return $ENTRIES;
    }

    private AdvisorMarketplaceOnboardingHubScreen6(String str, int i, int i2, ServerToBentoAssetMapper2 serverToBentoAssetMapper2) {
        this.title = i2;
        this.icon = serverToBentoAssetMapper2;
    }

    public final int getTitle() {
        return this.title;
    }

    public final ServerToBentoAssetMapper2 getIcon() {
        return this.icon;
    }

    static {
        AdvisorMarketplaceOnboardingHubScreen6[] advisorMarketplaceOnboardingHubScreen6Arr$values = $values();
        $VALUES = advisorMarketplaceOnboardingHubScreen6Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(advisorMarketplaceOnboardingHubScreen6Arr$values);
    }

    public static AdvisorMarketplaceOnboardingHubScreen6 valueOf(String str) {
        return (AdvisorMarketplaceOnboardingHubScreen6) Enum.valueOf(AdvisorMarketplaceOnboardingHubScreen6.class, str);
    }

    public static AdvisorMarketplaceOnboardingHubScreen6[] values() {
        return (AdvisorMarketplaceOnboardingHubScreen6[]) $VALUES.clone();
    }
}
