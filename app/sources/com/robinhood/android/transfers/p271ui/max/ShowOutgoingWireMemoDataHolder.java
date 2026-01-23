package com.robinhood.android.transfers.p271ui.max;

import com.robinhood.android.transfers.p271ui.composecomponents.OutgoingWireMemoEntryData;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShowOutgoingWireMemoDataHolder.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/ShowOutgoingWireMemoDataHolder;", "", "displayData", "Lcom/robinhood/android/transfers/ui/composecomponents/OutgoingWireMemoEntryData;", "<init>", "(Lcom/robinhood/android/transfers/ui/composecomponents/OutgoingWireMemoEntryData;)V", "getDisplayData", "()Lcom/robinhood/android/transfers/ui/composecomponents/OutgoingWireMemoEntryData;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ShowOutgoingWireMemoDataHolder {
    public static final int $stable = StringResource.$stable;
    private final OutgoingWireMemoEntryData displayData;

    /* JADX WARN: Multi-variable type inference failed */
    public ShowOutgoingWireMemoDataHolder() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ShowOutgoingWireMemoDataHolder copy$default(ShowOutgoingWireMemoDataHolder showOutgoingWireMemoDataHolder, OutgoingWireMemoEntryData outgoingWireMemoEntryData, int i, Object obj) {
        if ((i & 1) != 0) {
            outgoingWireMemoEntryData = showOutgoingWireMemoDataHolder.displayData;
        }
        return showOutgoingWireMemoDataHolder.copy(outgoingWireMemoEntryData);
    }

    /* renamed from: component1, reason: from getter */
    public final OutgoingWireMemoEntryData getDisplayData() {
        return this.displayData;
    }

    public final ShowOutgoingWireMemoDataHolder copy(OutgoingWireMemoEntryData displayData) {
        return new ShowOutgoingWireMemoDataHolder(displayData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ShowOutgoingWireMemoDataHolder) && Intrinsics.areEqual(this.displayData, ((ShowOutgoingWireMemoDataHolder) other).displayData);
    }

    public int hashCode() {
        OutgoingWireMemoEntryData outgoingWireMemoEntryData = this.displayData;
        if (outgoingWireMemoEntryData == null) {
            return 0;
        }
        return outgoingWireMemoEntryData.hashCode();
    }

    public String toString() {
        return "ShowOutgoingWireMemoDataHolder(displayData=" + this.displayData + ")";
    }

    public ShowOutgoingWireMemoDataHolder(OutgoingWireMemoEntryData outgoingWireMemoEntryData) {
        this.displayData = outgoingWireMemoEntryData;
    }

    public /* synthetic */ ShowOutgoingWireMemoDataHolder(OutgoingWireMemoEntryData outgoingWireMemoEntryData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : outgoingWireMemoEntryData);
    }

    public final OutgoingWireMemoEntryData getDisplayData() {
        return this.displayData;
    }
}
