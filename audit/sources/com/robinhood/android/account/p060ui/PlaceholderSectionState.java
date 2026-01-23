package com.robinhood.android.account.p060ui;

import com.robinhood.android.models.accountoverview.p184db.CardOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountOverviewPlaceholderCard.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/account/ui/PlaceholderSectionState;", "Lcom/robinhood/android/account/ui/AccountOverviewSectionState;", "identifier", "Lcom/robinhood/android/models/accountoverview/db/CardOrder$CardIdentifier;", "<init>", "(Lcom/robinhood/android/models/accountoverview/db/CardOrder$CardIdentifier;)V", "getIdentifier", "()Lcom/robinhood/android/models/accountoverview/db/CardOrder$CardIdentifier;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class PlaceholderSectionState extends AccountOverviewSectionState {
    public static final int $stable = 0;
    private final CardOrder.CardIdentifier identifier;

    public static /* synthetic */ PlaceholderSectionState copy$default(PlaceholderSectionState placeholderSectionState, CardOrder.CardIdentifier cardIdentifier, int i, Object obj) {
        if ((i & 1) != 0) {
            cardIdentifier = placeholderSectionState.identifier;
        }
        return placeholderSectionState.copy(cardIdentifier);
    }

    /* renamed from: component1, reason: from getter */
    public final CardOrder.CardIdentifier getIdentifier() {
        return this.identifier;
    }

    public final PlaceholderSectionState copy(CardOrder.CardIdentifier identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return new PlaceholderSectionState(identifier);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PlaceholderSectionState) && this.identifier == ((PlaceholderSectionState) other).identifier;
    }

    public int hashCode() {
        return this.identifier.hashCode();
    }

    public String toString() {
        return "PlaceholderSectionState(identifier=" + this.identifier + ")";
    }

    @Override // com.robinhood.android.account.p060ui.AccountOverviewSectionState
    public CardOrder.CardIdentifier getIdentifier() {
        return this.identifier;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaceholderSectionState(CardOrder.CardIdentifier identifier) {
        super(identifier, null);
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.identifier = identifier;
    }
}
