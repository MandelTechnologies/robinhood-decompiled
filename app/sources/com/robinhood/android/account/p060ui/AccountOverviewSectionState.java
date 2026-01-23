package com.robinhood.android.account.p060ui;

import com.robinhood.android.models.accountoverview.p184db.CardOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: AccountOverviewSectionState.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u000e\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/account/ui/AccountOverviewSectionState;", "", "identifier", "Lcom/robinhood/android/models/accountoverview/db/CardOrder$CardIdentifier;", "<init>", "(Lcom/robinhood/android/models/accountoverview/db/CardOrder$CardIdentifier;)V", "getIdentifier", "()Lcom/robinhood/android/models/accountoverview/db/CardOrder$CardIdentifier;", "Lcom/robinhood/android/account/ui/AccountOverviewRhdSectionState;", "Lcom/robinhood/android/account/ui/AccountSelectorState;", "Lcom/robinhood/android/account/ui/AccountTypeSectionState;", "Lcom/robinhood/android/account/ui/DayTradeSectionState;", "Lcom/robinhood/android/account/ui/DripSectionState;", "Lcom/robinhood/android/account/ui/InfoBannerSectionState;", "Lcom/robinhood/android/account/ui/InstantSectionState;", "Lcom/robinhood/android/account/ui/MarginSectionState;", "Lcom/robinhood/android/account/ui/OptionsSectionState;", "Lcom/robinhood/android/account/ui/PlaceholderSectionState;", "Lcom/robinhood/android/account/ui/PortfolioSectionState;", "Lcom/robinhood/android/account/ui/RecurringSectionState;", "Lcom/robinhood/android/account/ui/SlipSectionState;", "Lcom/robinhood/android/account/ui/SweepSectionState;", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public abstract class AccountOverviewSectionState {
    public static final int $stable = 0;
    private final CardOrder.CardIdentifier identifier;

    public /* synthetic */ AccountOverviewSectionState(CardOrder.CardIdentifier cardIdentifier, DefaultConstructorMarker defaultConstructorMarker) {
        this(cardIdentifier);
    }

    private AccountOverviewSectionState(CardOrder.CardIdentifier cardIdentifier) {
        this.identifier = cardIdentifier;
    }

    public CardOrder.CardIdentifier getIdentifier() {
        return this.identifier;
    }
}
