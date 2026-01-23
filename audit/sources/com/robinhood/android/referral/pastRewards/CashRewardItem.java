package com.robinhood.android.referral.pastRewards;

import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.models.p355ui.UiCashRewardItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardsComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/referral/pastRewards/CashRewardItem;", "Lcom/robinhood/android/referral/pastRewards/RewardItem;", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/models/ui/UiCashRewardItem;", "<init>", "(Lcom/robinhood/models/ui/UiCashRewardItem;)V", "getItem", "()Lcom/robinhood/models/ui/UiCashRewardItem;", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
final class CashRewardItem extends RewardItem {
    private final UiCashRewardItem item;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashRewardItem(UiCashRewardItem item) {
        super(null);
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
    }

    public final UiCashRewardItem getItem() {
        return this.item;
    }
}
