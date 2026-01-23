package com.robinhood.android.cash.rewards.p074ui.notification;

import com.robinhood.android.cash.rewards.C10176R;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.models.api.pluto.RoundupInvestmentType;
import com.robinhood.models.p320db.RoundupReward;
import com.robinhood.models.p355ui.UiRoundupReward;
import com.robinhood.models.util.Money;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardsNotificationDetailsViewState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u0015\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001e\u001a\u00020\u000bHÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\tR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/notification/RewardsNotificationDetailsViewState;", "", "uiRoundupReward", "Lcom/robinhood/models/ui/UiRoundupReward;", "<init>", "(Lcom/robinhood/models/ui/UiRoundupReward;)V", "bonusRateMessage", "Lcom/robinhood/utils/resource/StringResource;", "getBonusRateMessage", "()Lcom/robinhood/utils/resource/StringResource;", "roundupAmount", "", "getRoundupAmount", "()Ljava/lang/String;", "bonusAmount", "getBonusAmount", "totalRoundupMessage", "getTotalRoundupMessage", "totalRoundupAmount", "getTotalRoundupAmount", "disclaimerStringRes", "", "getDisclaimerStringRes", "()Ljava/lang/Integer;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RewardsNotificationDetailsViewState {
    public static final int $stable = 8;
    private final UiRoundupReward uiRoundupReward;

    /* compiled from: RewardsNotificationDetailsViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RoundupInvestmentType.values().length];
            try {
                iArr[RoundupInvestmentType.STOCK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RoundupInvestmentType.CRYPTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RewardsNotificationDetailsViewState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: component1, reason: from getter */
    private final UiRoundupReward getUiRoundupReward() {
        return this.uiRoundupReward;
    }

    public static /* synthetic */ RewardsNotificationDetailsViewState copy$default(RewardsNotificationDetailsViewState rewardsNotificationDetailsViewState, UiRoundupReward uiRoundupReward, int i, Object obj) {
        if ((i & 1) != 0) {
            uiRoundupReward = rewardsNotificationDetailsViewState.uiRoundupReward;
        }
        return rewardsNotificationDetailsViewState.copy(uiRoundupReward);
    }

    public final RewardsNotificationDetailsViewState copy(UiRoundupReward uiRoundupReward) {
        return new RewardsNotificationDetailsViewState(uiRoundupReward);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RewardsNotificationDetailsViewState) && Intrinsics.areEqual(this.uiRoundupReward, ((RewardsNotificationDetailsViewState) other).uiRoundupReward);
    }

    public int hashCode() {
        UiRoundupReward uiRoundupReward = this.uiRoundupReward;
        if (uiRoundupReward == null) {
            return 0;
        }
        return uiRoundupReward.hashCode();
    }

    public String toString() {
        return "RewardsNotificationDetailsViewState(uiRoundupReward=" + this.uiRoundupReward + ")";
    }

    public RewardsNotificationDetailsViewState(UiRoundupReward uiRoundupReward) {
        this.uiRoundupReward = uiRoundupReward;
    }

    public /* synthetic */ RewardsNotificationDetailsViewState(UiRoundupReward uiRoundupReward, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uiRoundupReward);
    }

    public final StringResource getBonusRateMessage() {
        RoundupReward roundupReward;
        UiRoundupReward uiRoundupReward = this.uiRoundupReward;
        if (uiRoundupReward == null || (roundupReward = uiRoundupReward.getRoundupReward()) == null) {
            return null;
        }
        return StringResource.INSTANCE.invoke(C10176R.string.rewards_notification_weekly_bonus_rate, Formats.getPercentFormat().format(roundupReward.getBonusRate()));
    }

    public final String getRoundupAmount() {
        RoundupReward roundupReward;
        Money roundupAmount;
        UiRoundupReward uiRoundupReward = this.uiRoundupReward;
        if (uiRoundupReward == null || (roundupReward = uiRoundupReward.getRoundupReward()) == null || (roundupAmount = roundupReward.getRoundupAmount()) == null) {
            return null;
        }
        return Money.format$default(roundupAmount, null, false, null, false, 0, null, false, null, false, false, 1023, null);
    }

    public final String getBonusAmount() {
        RoundupReward roundupReward;
        Money bonusAmount;
        UiRoundupReward uiRoundupReward = this.uiRoundupReward;
        if (uiRoundupReward == null || (roundupReward = uiRoundupReward.getRoundupReward()) == null || (bonusAmount = roundupReward.getBonusAmount()) == null) {
            return null;
        }
        return Money.format$default(bonusAmount, null, false, null, false, 0, null, false, null, false, false, 1023, null);
    }

    public final StringResource getTotalRoundupMessage() {
        String assetSymbol;
        UiRoundupReward uiRoundupReward = this.uiRoundupReward;
        if (uiRoundupReward == null || (assetSymbol = uiRoundupReward.getAssetSymbol()) == null) {
            return null;
        }
        return StringResource.INSTANCE.invoke(C10176R.string.rewards_notification_weekly_total, assetSymbol);
    }

    public final String getTotalRoundupAmount() {
        RoundupReward roundupReward;
        UiRoundupReward uiRoundupReward = this.uiRoundupReward;
        if (uiRoundupReward == null || (roundupReward = uiRoundupReward.getRoundupReward()) == null) {
            return null;
        }
        return Money.format$default(roundupReward.getRoundupAmount().plus(roundupReward.getBonusAmount()), null, false, null, false, 0, null, false, null, false, false, 1023, null);
    }

    public final Integer getDisclaimerStringRes() {
        RoundupReward roundupReward;
        UiRoundupReward uiRoundupReward = this.uiRoundupReward;
        RoundupInvestmentType investmentType = (uiRoundupReward == null || (roundupReward = uiRoundupReward.getRoundupReward()) == null) ? null : roundupReward.getInvestmentType();
        int i = investmentType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[investmentType.ordinal()];
        if (i == 1) {
            return Integer.valueOf(C10176R.string.rewards_notification_weekly_brokerage_disclaimer);
        }
        if (i != 2) {
            return null;
        }
        return Integer.valueOf(C10176R.string.rewards_notification_weekly_crypto_disclaimer);
    }
}
