package com.robinhood.android.retirementhistory;

import com.robinhood.android.models.retirement.api.ApiRetirementFeeHistoryDetail;
import com.robinhood.android.models.retirement.p194db.RetirementHistoryItem;
import com.robinhood.android.retirementhistory.RetirementHistoryItemViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.serverdriven.experimental.api.DataRowStacked;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.util.Money;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementHistoryItemDataState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/retirementhistory/RetirementHistoryItemDataState;", "", "listItem", "Lcom/robinhood/android/models/retirement/db/RetirementHistoryItem;", "detailItem", "Lcom/robinhood/android/models/retirement/api/ApiRetirementFeeHistoryDetail;", "<init>", "(Lcom/robinhood/android/models/retirement/db/RetirementHistoryItem;Lcom/robinhood/android/models/retirement/api/ApiRetirementFeeHistoryDetail;)V", "getListItem", "()Lcom/robinhood/android/models/retirement/db/RetirementHistoryItem;", "getDetailItem", "()Lcom/robinhood/android/models/retirement/api/ApiRetirementFeeHistoryDetail;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Provider", "feature-retirement-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RetirementHistoryItemDataState {
    private final ApiRetirementFeeHistoryDetail detailItem;
    private final RetirementHistoryItem listItem;

    /* renamed from: Provider, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public RetirementHistoryItemDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ RetirementHistoryItemDataState copy$default(RetirementHistoryItemDataState retirementHistoryItemDataState, RetirementHistoryItem retirementHistoryItem, ApiRetirementFeeHistoryDetail apiRetirementFeeHistoryDetail, int i, Object obj) {
        if ((i & 1) != 0) {
            retirementHistoryItem = retirementHistoryItemDataState.listItem;
        }
        if ((i & 2) != 0) {
            apiRetirementFeeHistoryDetail = retirementHistoryItemDataState.detailItem;
        }
        return retirementHistoryItemDataState.copy(retirementHistoryItem, apiRetirementFeeHistoryDetail);
    }

    /* renamed from: component1, reason: from getter */
    public final RetirementHistoryItem getListItem() {
        return this.listItem;
    }

    /* renamed from: component2, reason: from getter */
    public final ApiRetirementFeeHistoryDetail getDetailItem() {
        return this.detailItem;
    }

    public final RetirementHistoryItemDataState copy(RetirementHistoryItem listItem, ApiRetirementFeeHistoryDetail detailItem) {
        return new RetirementHistoryItemDataState(listItem, detailItem);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RetirementHistoryItemDataState)) {
            return false;
        }
        RetirementHistoryItemDataState retirementHistoryItemDataState = (RetirementHistoryItemDataState) other;
        return Intrinsics.areEqual(this.listItem, retirementHistoryItemDataState.listItem) && Intrinsics.areEqual(this.detailItem, retirementHistoryItemDataState.detailItem);
    }

    public int hashCode() {
        RetirementHistoryItem retirementHistoryItem = this.listItem;
        int iHashCode = (retirementHistoryItem == null ? 0 : retirementHistoryItem.hashCode()) * 31;
        ApiRetirementFeeHistoryDetail apiRetirementFeeHistoryDetail = this.detailItem;
        return iHashCode + (apiRetirementFeeHistoryDetail != null ? apiRetirementFeeHistoryDetail.hashCode() : 0);
    }

    public String toString() {
        return "RetirementHistoryItemDataState(listItem=" + this.listItem + ", detailItem=" + this.detailItem + ")";
    }

    public RetirementHistoryItemDataState(RetirementHistoryItem retirementHistoryItem, ApiRetirementFeeHistoryDetail apiRetirementFeeHistoryDetail) {
        this.listItem = retirementHistoryItem;
        this.detailItem = apiRetirementFeeHistoryDetail;
    }

    public /* synthetic */ RetirementHistoryItemDataState(RetirementHistoryItem retirementHistoryItem, ApiRetirementFeeHistoryDetail apiRetirementFeeHistoryDetail, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : retirementHistoryItem, (i & 2) != 0 ? null : apiRetirementFeeHistoryDetail);
    }

    public final RetirementHistoryItem getListItem() {
        return this.listItem;
    }

    public final ApiRetirementFeeHistoryDetail getDetailItem() {
        return this.detailItem;
    }

    /* compiled from: RetirementHistoryItemDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/retirementhistory/RetirementHistoryItemDataState$Provider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/retirementhistory/RetirementHistoryItemDataState;", "Lcom/robinhood/android/retirementhistory/RetirementHistoryItemViewState;", "<init>", "()V", "reduce", "dataState", "feature-retirement-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.retirementhistory.RetirementHistoryItemDataState$Provider, reason: from kotlin metadata */
    public static final class Companion implements StateProvider<RetirementHistoryItemDataState, RetirementHistoryItemViewState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.StateProvider
        public RetirementHistoryItemViewState reduce(RetirementHistoryItemDataState dataState) {
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            if (dataState.getListItem() == null) {
                return RetirementHistoryItemViewState.Loading.INSTANCE;
            }
            String str = Money.Adjustment.format$default(dataState.getListItem().getAdjustment(), false, null, 3, null);
            String title = dataState.getListItem().getTitle();
            ApiRetirementFeeHistoryDetail detailItem = dataState.getDetailItem();
            List<DataRowStacked<GenericAction>> rows = detailItem != null ? detailItem.getRows() : null;
            if (rows == null) {
                rows = CollectionsKt.emptyList();
            }
            ApiRetirementFeeHistoryDetail detailItem2 = dataState.getDetailItem();
            List<UIComponent<GenericAction>> footer = detailItem2 != null ? detailItem2.getFooter() : null;
            if (footer == null) {
                footer = CollectionsKt.emptyList();
            }
            return new RetirementHistoryItemViewState.Loaded(str, title, rows, footer);
        }
    }
}
