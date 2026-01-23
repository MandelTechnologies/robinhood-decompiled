package com.robinhood.android.acats.plaid.transfer.partial;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsPlaidPartialTransferDuxo.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferSortData;", "", "sortKey", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferSortKey;", "chipText", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferSortKey;Lcom/robinhood/utils/resource/StringResource;)V", "getSortKey", "()Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferSortKey;", "getChipText", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-acats-plaid_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AcatsPlaidPartialTransferSortData {
    public static final int $stable = 0;
    private final StringResource chipText;
    private final AcatsPlaidPartialTransferDuxo6 sortKey;

    public static /* synthetic */ AcatsPlaidPartialTransferSortData copy$default(AcatsPlaidPartialTransferSortData acatsPlaidPartialTransferSortData, AcatsPlaidPartialTransferDuxo6 acatsPlaidPartialTransferDuxo6, StringResource stringResource, int i, Object obj) {
        if ((i & 1) != 0) {
            acatsPlaidPartialTransferDuxo6 = acatsPlaidPartialTransferSortData.sortKey;
        }
        if ((i & 2) != 0) {
            stringResource = acatsPlaidPartialTransferSortData.chipText;
        }
        return acatsPlaidPartialTransferSortData.copy(acatsPlaidPartialTransferDuxo6, stringResource);
    }

    /* renamed from: component1, reason: from getter */
    public final AcatsPlaidPartialTransferDuxo6 getSortKey() {
        return this.sortKey;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getChipText() {
        return this.chipText;
    }

    public final AcatsPlaidPartialTransferSortData copy(AcatsPlaidPartialTransferDuxo6 sortKey, StringResource chipText) {
        Intrinsics.checkNotNullParameter(sortKey, "sortKey");
        Intrinsics.checkNotNullParameter(chipText, "chipText");
        return new AcatsPlaidPartialTransferSortData(sortKey, chipText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsPlaidPartialTransferSortData)) {
            return false;
        }
        AcatsPlaidPartialTransferSortData acatsPlaidPartialTransferSortData = (AcatsPlaidPartialTransferSortData) other;
        return this.sortKey == acatsPlaidPartialTransferSortData.sortKey && Intrinsics.areEqual(this.chipText, acatsPlaidPartialTransferSortData.chipText);
    }

    public int hashCode() {
        return (this.sortKey.hashCode() * 31) + this.chipText.hashCode();
    }

    public String toString() {
        return "AcatsPlaidPartialTransferSortData(sortKey=" + this.sortKey + ", chipText=" + this.chipText + ")";
    }

    public AcatsPlaidPartialTransferSortData(AcatsPlaidPartialTransferDuxo6 sortKey, StringResource chipText) {
        Intrinsics.checkNotNullParameter(sortKey, "sortKey");
        Intrinsics.checkNotNullParameter(chipText, "chipText");
        this.sortKey = sortKey;
        this.chipText = chipText;
    }

    public final AcatsPlaidPartialTransferDuxo6 getSortKey() {
        return this.sortKey;
    }

    public final StringResource getChipText() {
        return this.chipText;
    }
}
