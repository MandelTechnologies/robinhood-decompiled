package com.robinhood.android.retirement.contracts;

import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.onboarding.contracts.OnboardingUpsellIntentKey;
import com.robinhood.models.api.ColorTheme;
import com.robinhood.rosetta.eventlogging.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementLastKnownEntryPointManager.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\u001a\u0010\u001b\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0010\"\u0004\b\u001d\u0010\u0012R\u0011\u0010\u001e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0010R\u0011\u0010 \u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b \u0010\u0010R\u0015\u0010!\u001a\u00060\"j\u0002`#8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/retirement/contracts/RetirementLastKnownEntryPointManager;", "", "<init>", "()V", "DASHBOARD_SWIPEY_CTA", "", "SYP_UPSELL", "newUserOnboardingRetirementUpsell", "", "lastKnownEntryPoint", "getLastKnownEntryPoint", "()Ljava/lang/String;", "setLastKnownEntryPoint", "(Ljava/lang/String;)V", "isFromRhfOnboarding", "", "()Z", "setFromRhfOnboarding", "(Z)V", "theme", "Lcom/robinhood/models/api/ColorTheme;", "getTheme", "()Lcom/robinhood/models/api/ColorTheme;", "setTheme", "(Lcom/robinhood/models/api/ColorTheme;)V", "isPartnershipOnboarding", "setPartnershipOnboarding", "shouldLaunchTaxMatchPromoForResurrectedUser", "getShouldLaunchTaxMatchPromoForResurrectedUser", "setShouldLaunchTaxMatchPromoForResurrectedUser", "shouldHideRecurringButton", "getShouldHideRecurringButton", "isAuthenticationRequired", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RetirementLastKnownEntryPointManager {
    public static final String DASHBOARD_SWIPEY_CTA = "dashboard-swipey-cta";
    public static final String SYP_UPSELL = "syp-ret-upsell";
    private static boolean isFromRhfOnboarding;
    private static boolean isPartnershipOnboarding;
    private static String lastKnownEntryPoint;
    private static boolean shouldLaunchTaxMatchPromoForResurrectedUser;
    public static final RetirementLastKnownEntryPointManager INSTANCE = new RetirementLastKnownEntryPointManager();
    private static final List<String> newUserOnboardingRetirementUpsell = CollectionsKt.listOf((Object[]) new String[]{OnboardingUpsellIntentKey.ONBOARDING_UPSELL, OnboardingUpsellIntentKey.MENU_OF_OPTIONS_UPSELL, OnboardingUpsellIntentKey.RESURRECTIONS_M2_UPSELL, OnboardingUpsellIntentKey.RETIREMENT_MATCH_PROMO, OnboardingUpsellIntentKey.GOLD_DEFAULT_OPT_IN});
    private static ColorTheme theme = ColorTheme.DEFAULT;

    private RetirementLastKnownEntryPointManager() {
    }

    public final String getLastKnownEntryPoint() {
        return lastKnownEntryPoint;
    }

    public final void setLastKnownEntryPoint(String str) {
        lastKnownEntryPoint = str;
    }

    public final boolean isFromRhfOnboarding() {
        return isFromRhfOnboarding;
    }

    public final void setFromRhfOnboarding(boolean z) {
        isFromRhfOnboarding = z;
    }

    public final ColorTheme getTheme() {
        return theme;
    }

    public final void setTheme(ColorTheme colorTheme) {
        Intrinsics.checkNotNullParameter(colorTheme, "<set-?>");
        theme = colorTheme;
    }

    public final boolean isPartnershipOnboarding() {
        return isPartnershipOnboarding;
    }

    public final void setPartnershipOnboarding(boolean z) {
        isPartnershipOnboarding = z;
    }

    public final boolean getShouldLaunchTaxMatchPromoForResurrectedUser() {
        return shouldLaunchTaxMatchPromoForResurrectedUser;
    }

    public final void setShouldLaunchTaxMatchPromoForResurrectedUser(boolean z) {
        shouldLaunchTaxMatchPromoForResurrectedUser = z;
    }

    public final boolean getShouldHideRecurringButton() {
        List<String> list = newUserOnboardingRetirementUpsell;
        String str = lastKnownEntryPoint;
        if (str == null) {
            str = "";
        }
        return list.contains(str);
    }

    public final boolean isAuthenticationRequired() {
        return (isFromRhfOnboarding || isPartnershipOnboarding) ? false : true;
    }

    public final Context getLoggingContext() {
        String str = lastKnownEntryPoint;
        if (str == null) {
            str = "";
        }
        return new Context(0, 0, 0, null, null, null, null, null, 0, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null);
    }
}
