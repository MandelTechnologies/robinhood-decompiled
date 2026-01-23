package com.robinhood.android.indexes.detail.components.tradebar;

import com.robinhood.android.common.p088ui.view.AbstractTradeBarOverlayView;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndexDetailPageTradeBarStates.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/tradebar/IndexDetailPageTradeBarViewState;", "", "tradeOptionsAction", "Lcom/robinhood/android/common/ui/view/AbstractTradeBarOverlayView$ExpandAction;", "tradeOptionsIntentKey", "Lcom/robinhood/android/navigation/keys/IntentKey;", "accountSwitcherState", "Lcom/robinhood/android/indexes/detail/components/tradebar/IndexAccountSwitcherState;", "<init>", "(Lcom/robinhood/android/common/ui/view/AbstractTradeBarOverlayView$ExpandAction;Lcom/robinhood/android/navigation/keys/IntentKey;Lcom/robinhood/android/indexes/detail/components/tradebar/IndexAccountSwitcherState;)V", "getTradeOptionsAction", "()Lcom/robinhood/android/common/ui/view/AbstractTradeBarOverlayView$ExpandAction;", "getTradeOptionsIntentKey", "()Lcom/robinhood/android/navigation/keys/IntentKey;", "getAccountSwitcherState", "()Lcom/robinhood/android/indexes/detail/components/tradebar/IndexAccountSwitcherState;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class IndexDetailPageTradeBarViewState {
    public static final int $stable = 8;
    private final IndexAccountSwitcherState accountSwitcherState;
    private final AbstractTradeBarOverlayView.ExpandAction tradeOptionsAction;
    private final IntentKey tradeOptionsIntentKey;

    public static /* synthetic */ IndexDetailPageTradeBarViewState copy$default(IndexDetailPageTradeBarViewState indexDetailPageTradeBarViewState, AbstractTradeBarOverlayView.ExpandAction expandAction, IntentKey intentKey, IndexAccountSwitcherState indexAccountSwitcherState, int i, Object obj) {
        if ((i & 1) != 0) {
            expandAction = indexDetailPageTradeBarViewState.tradeOptionsAction;
        }
        if ((i & 2) != 0) {
            intentKey = indexDetailPageTradeBarViewState.tradeOptionsIntentKey;
        }
        if ((i & 4) != 0) {
            indexAccountSwitcherState = indexDetailPageTradeBarViewState.accountSwitcherState;
        }
        return indexDetailPageTradeBarViewState.copy(expandAction, intentKey, indexAccountSwitcherState);
    }

    /* renamed from: component1, reason: from getter */
    public final AbstractTradeBarOverlayView.ExpandAction getTradeOptionsAction() {
        return this.tradeOptionsAction;
    }

    /* renamed from: component2, reason: from getter */
    public final IntentKey getTradeOptionsIntentKey() {
        return this.tradeOptionsIntentKey;
    }

    /* renamed from: component3, reason: from getter */
    public final IndexAccountSwitcherState getAccountSwitcherState() {
        return this.accountSwitcherState;
    }

    public final IndexDetailPageTradeBarViewState copy(AbstractTradeBarOverlayView.ExpandAction tradeOptionsAction, IntentKey tradeOptionsIntentKey, IndexAccountSwitcherState accountSwitcherState) {
        return new IndexDetailPageTradeBarViewState(tradeOptionsAction, tradeOptionsIntentKey, accountSwitcherState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndexDetailPageTradeBarViewState)) {
            return false;
        }
        IndexDetailPageTradeBarViewState indexDetailPageTradeBarViewState = (IndexDetailPageTradeBarViewState) other;
        return Intrinsics.areEqual(this.tradeOptionsAction, indexDetailPageTradeBarViewState.tradeOptionsAction) && Intrinsics.areEqual(this.tradeOptionsIntentKey, indexDetailPageTradeBarViewState.tradeOptionsIntentKey) && Intrinsics.areEqual(this.accountSwitcherState, indexDetailPageTradeBarViewState.accountSwitcherState);
    }

    public int hashCode() {
        AbstractTradeBarOverlayView.ExpandAction expandAction = this.tradeOptionsAction;
        int iHashCode = (expandAction == null ? 0 : expandAction.hashCode()) * 31;
        IntentKey intentKey = this.tradeOptionsIntentKey;
        int iHashCode2 = (iHashCode + (intentKey == null ? 0 : intentKey.hashCode())) * 31;
        IndexAccountSwitcherState indexAccountSwitcherState = this.accountSwitcherState;
        return iHashCode2 + (indexAccountSwitcherState != null ? indexAccountSwitcherState.hashCode() : 0);
    }

    public String toString() {
        return "IndexDetailPageTradeBarViewState(tradeOptionsAction=" + this.tradeOptionsAction + ", tradeOptionsIntentKey=" + this.tradeOptionsIntentKey + ", accountSwitcherState=" + this.accountSwitcherState + ")";
    }

    public IndexDetailPageTradeBarViewState(AbstractTradeBarOverlayView.ExpandAction expandAction, IntentKey intentKey, IndexAccountSwitcherState indexAccountSwitcherState) {
        this.tradeOptionsAction = expandAction;
        this.tradeOptionsIntentKey = intentKey;
        this.accountSwitcherState = indexAccountSwitcherState;
    }

    public final AbstractTradeBarOverlayView.ExpandAction getTradeOptionsAction() {
        return this.tradeOptionsAction;
    }

    public final IntentKey getTradeOptionsIntentKey() {
        return this.tradeOptionsIntentKey;
    }

    public final IndexAccountSwitcherState getAccountSwitcherState() {
        return this.accountSwitcherState;
    }
}
