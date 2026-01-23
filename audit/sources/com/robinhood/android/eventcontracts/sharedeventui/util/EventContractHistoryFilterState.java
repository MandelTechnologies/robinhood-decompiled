package com.robinhood.android.eventcontracts.sharedeventui.util;

import com.robinhood.android.common.history.p082ui.lazyList.HistoryPreviewListParams;
import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BuildHistoryPreviewFilterForEvent.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/sharedeventui/util/EventContractHistoryFilterState;", "", "listParams", "Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListParams;", "footerKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "<init>", "(Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListParams;Lcom/robinhood/android/navigation/keys/FragmentKey;)V", "getListParams", "()Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListParams;", "getFooterKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-shared-event-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EventContractHistoryFilterState {
    public static final int $stable = 8;
    private final FragmentKey footerKey;
    private final HistoryPreviewListParams listParams;

    public static /* synthetic */ EventContractHistoryFilterState copy$default(EventContractHistoryFilterState eventContractHistoryFilterState, HistoryPreviewListParams historyPreviewListParams, FragmentKey fragmentKey, int i, Object obj) {
        if ((i & 1) != 0) {
            historyPreviewListParams = eventContractHistoryFilterState.listParams;
        }
        if ((i & 2) != 0) {
            fragmentKey = eventContractHistoryFilterState.footerKey;
        }
        return eventContractHistoryFilterState.copy(historyPreviewListParams, fragmentKey);
    }

    /* renamed from: component1, reason: from getter */
    public final HistoryPreviewListParams getListParams() {
        return this.listParams;
    }

    /* renamed from: component2, reason: from getter */
    public final FragmentKey getFooterKey() {
        return this.footerKey;
    }

    public final EventContractHistoryFilterState copy(HistoryPreviewListParams listParams, FragmentKey footerKey) {
        Intrinsics.checkNotNullParameter(listParams, "listParams");
        Intrinsics.checkNotNullParameter(footerKey, "footerKey");
        return new EventContractHistoryFilterState(listParams, footerKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventContractHistoryFilterState)) {
            return false;
        }
        EventContractHistoryFilterState eventContractHistoryFilterState = (EventContractHistoryFilterState) other;
        return Intrinsics.areEqual(this.listParams, eventContractHistoryFilterState.listParams) && Intrinsics.areEqual(this.footerKey, eventContractHistoryFilterState.footerKey);
    }

    public int hashCode() {
        return (this.listParams.hashCode() * 31) + this.footerKey.hashCode();
    }

    public String toString() {
        return "EventContractHistoryFilterState(listParams=" + this.listParams + ", footerKey=" + this.footerKey + ")";
    }

    public EventContractHistoryFilterState(HistoryPreviewListParams listParams, FragmentKey footerKey) {
        Intrinsics.checkNotNullParameter(listParams, "listParams");
        Intrinsics.checkNotNullParameter(footerKey, "footerKey");
        this.listParams = listParams;
        this.footerKey = footerKey;
    }

    public final HistoryPreviewListParams getListParams() {
        return this.listParams;
    }

    public final FragmentKey getFooterKey() {
        return this.footerKey;
    }
}
