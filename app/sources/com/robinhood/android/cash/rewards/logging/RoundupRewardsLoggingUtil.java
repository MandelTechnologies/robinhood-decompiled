package com.robinhood.android.cash.rewards.logging;

import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.RHYContext;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RoundupRewardsLoggingUtil.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006*\u00020\u0007R\u0015\u0010\b\u001a\u00060\u0005j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/logging/RoundupRewardsLoggingUtil;", "", "<init>", "()V", "getOnboardingContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RewardsOnboarding$Action;", "roundupGeneralContext", "getRoundupGeneralContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class RoundupRewardsLoggingUtil {
    public static final RoundupRewardsLoggingUtil INSTANCE = new RoundupRewardsLoggingUtil();
    private static final Context roundupGeneralContext = new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new RHYContext(RHYContext.ProductArea.REWARDS, "roundup_general", "unknown", RHYContext.AccountType.ACCOUNT_TYPE_UNSPECIFIED, null, null, 48, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -2049, -1, -1, -1, 16383, null);
    public static final int $stable = 8;

    /* compiled from: RoundupRewardsLoggingUtil.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LegacyIntentKey.RewardsOnboarding.Action.values().length];
            try {
                iArr[LegacyIntentKey.RewardsOnboarding.Action.CREATE_ENROLLMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LegacyIntentKey.RewardsOnboarding.Action.RESUME_ENROLLMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LegacyIntentKey.RewardsOnboarding.Action.CHANGE_INVESTMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private RoundupRewardsLoggingUtil() {
    }

    public final Context getOnboardingContext(LegacyIntentKey.RewardsOnboarding.Action action) {
        String str;
        Intrinsics.checkNotNullParameter(action, "<this>");
        RHYContext.ProductArea productArea = RHYContext.ProductArea.REWARDS;
        int i = WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
        if (i == 1) {
            str = "roundup_enrollment";
        } else if (i == 2) {
            str = "roundup_resume";
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "roundup_selection_update";
        }
        return new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new RHYContext(productArea, str, "unknown", RHYContext.AccountType.ACCOUNT_TYPE_UNSPECIFIED, null, null, 48, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -2049, -1, -1, -1, 16383, null);
    }

    public final Context getRoundupGeneralContext() {
        return roundupGeneralContext;
    }
}
