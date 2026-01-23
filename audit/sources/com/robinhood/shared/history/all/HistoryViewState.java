package com.robinhood.shared.history.all;

import androidx.paging.PagedList;
import com.robinhood.android.common.history.p082ui.HistoryFilter;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.shared.history.HistoryDisclosure;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.udf.UiEvent;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: HistoryViewState.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BÛ\u0001\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f\u0018\u00010\t\u0012\u001a\b\u0002\u0010\r\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f\u0018\u00010\t\u0012\u001a\b\u0002\u0010\u000e\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0004HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010#J\u001b\u00109\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f\u0018\u00010\tHÆ\u0003J\u001b\u0010:\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f\u0018\u00010\tHÆ\u0003J\u001b\u0010;\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f\u0018\u00010\tHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010=\u001a\u00020\u0012HÆ\u0003J\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÂ\u0003J\t\u0010?\u001a\u00020\u0012HÂ\u0003J\t\u0010@\u001a\u00020\u0012HÂ\u0003J\t\u0010A\u001a\u00020\u0012HÂ\u0003J\t\u0010B\u001a\u00020\u0012HÂ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u001bHÂ\u0003Jâ\u0001\u0010D\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f\u0018\u00010\t2\u001a\b\u0002\u0010\r\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f\u0018\u00010\t2\u001a\b\u0002\u0010\u000e\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00122\b\b\u0002\u0010\u0018\u001a\u00020\u00122\b\b\u0002\u0010\u0019\u001a\u00020\u00122\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÆ\u0001¢\u0006\u0002\u0010EJ\u0013\u0010F\u001a\u00020\u00122\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010H\u001a\u00020\u0007HÖ\u0001J\t\u0010I\u001a\u00020JHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R#\u0010\b\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R#\u0010\r\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R#\u0010\u000e\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010-\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b-\u0010,R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u0002000/8F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0019\u00103\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b4\u00105¨\u0006K"}, m3636d2 = {"Lcom/robinhood/shared/history/all/HistoryViewState;", "", "selectableFilters", "", "Lcom/robinhood/android/common/history/ui/HistoryFilter;", "selectedFilter", "emptyStateTextResId", "", "pendingItems", "Landroidx/paging/PagedList;", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "Lcom/robinhood/shared/models/history/shared/GenericStatefulHistoryEvent;", "recentItems", "olderItems", "transactionReference", "Lcom/robinhood/shared/models/history/shared/TransactionReference;", "fromDeepLink", "", "shouldShowTransactionDetail", "Lcom/robinhood/udf/UiEvent;", "", "inCryptoRegionGate", "inFuturesRegionGate", "inEcRegionGate", "hasSpendingAccount", "userLocality", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "(Ljava/util/Set;Lcom/robinhood/android/common/history/ui/HistoryFilter;Ljava/lang/Integer;Landroidx/paging/PagedList;Landroidx/paging/PagedList;Landroidx/paging/PagedList;Lcom/robinhood/shared/models/history/shared/TransactionReference;ZLcom/robinhood/udf/UiEvent;ZZZZLcom/robinhood/iso/countrycode/CountryCode$Supported;)V", "getSelectableFilters", "()Ljava/util/Set;", "getSelectedFilter", "()Lcom/robinhood/android/common/history/ui/HistoryFilter;", "getEmptyStateTextResId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPendingItems", "()Landroidx/paging/PagedList;", "getRecentItems", "getOlderItems", "getTransactionReference", "()Lcom/robinhood/shared/models/history/shared/TransactionReference;", "getFromDeepLink", "()Z", "isDisclosureBtnVisible", "disclosures", "", "Lcom/robinhood/shared/history/HistoryDisclosure;", "getDisclosures", "()Ljava/util/List;", "showTransactionDetailEvent", "getShowTransactionDetailEvent", "()Lcom/robinhood/udf/UiEvent;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/util/Set;Lcom/robinhood/android/common/history/ui/HistoryFilter;Ljava/lang/Integer;Landroidx/paging/PagedList;Landroidx/paging/PagedList;Landroidx/paging/PagedList;Lcom/robinhood/shared/models/history/shared/TransactionReference;ZLcom/robinhood/udf/UiEvent;ZZZZLcom/robinhood/iso/countrycode/CountryCode$Supported;)Lcom/robinhood/shared/history/all/HistoryViewState;", "equals", "other", "hashCode", "toString", "", "feature-all-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final /* data */ class HistoryViewState {
    public static final int $stable = 8;
    private final Integer emptyStateTextResId;
    private final boolean fromDeepLink;
    private final boolean hasSpendingAccount;
    private final boolean inCryptoRegionGate;
    private final boolean inEcRegionGate;
    private final boolean inFuturesRegionGate;
    private final PagedList<StatefulHistoryEvent<HistoryEvent>> olderItems;
    private final PagedList<StatefulHistoryEvent<HistoryEvent>> pendingItems;
    private final PagedList<StatefulHistoryEvent<HistoryEvent>> recentItems;
    private final Set<HistoryFilter> selectableFilters;
    private final HistoryFilter selectedFilter;
    private final UiEvent<Unit> shouldShowTransactionDetail;
    private final TransactionReference transactionReference;
    private final CountryCode.Supported userLocality;

    public HistoryViewState() {
        this(null, null, null, null, null, null, null, false, null, false, false, false, false, null, 16383, null);
    }

    /* renamed from: component10, reason: from getter */
    private final boolean getInCryptoRegionGate() {
        return this.inCryptoRegionGate;
    }

    /* renamed from: component11, reason: from getter */
    private final boolean getInFuturesRegionGate() {
        return this.inFuturesRegionGate;
    }

    /* renamed from: component12, reason: from getter */
    private final boolean getInEcRegionGate() {
        return this.inEcRegionGate;
    }

    /* renamed from: component13, reason: from getter */
    private final boolean getHasSpendingAccount() {
        return this.hasSpendingAccount;
    }

    /* renamed from: component14, reason: from getter */
    private final CountryCode.Supported getUserLocality() {
        return this.userLocality;
    }

    private final UiEvent<Unit> component9() {
        return this.shouldShowTransactionDetail;
    }

    public final Set<HistoryFilter> component1() {
        return this.selectableFilters;
    }

    /* renamed from: component2, reason: from getter */
    public final HistoryFilter getSelectedFilter() {
        return this.selectedFilter;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getEmptyStateTextResId() {
        return this.emptyStateTextResId;
    }

    public final PagedList<StatefulHistoryEvent<HistoryEvent>> component4() {
        return this.pendingItems;
    }

    public final PagedList<StatefulHistoryEvent<HistoryEvent>> component5() {
        return this.recentItems;
    }

    public final PagedList<StatefulHistoryEvent<HistoryEvent>> component6() {
        return this.olderItems;
    }

    /* renamed from: component7, reason: from getter */
    public final TransactionReference getTransactionReference() {
        return this.transactionReference;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getFromDeepLink() {
        return this.fromDeepLink;
    }

    public final HistoryViewState copy(Set<? extends HistoryFilter> selectableFilters, HistoryFilter selectedFilter, Integer emptyStateTextResId, PagedList<StatefulHistoryEvent<HistoryEvent>> pendingItems, PagedList<StatefulHistoryEvent<HistoryEvent>> recentItems, PagedList<StatefulHistoryEvent<HistoryEvent>> olderItems, TransactionReference transactionReference, boolean fromDeepLink, UiEvent<Unit> shouldShowTransactionDetail, boolean inCryptoRegionGate, boolean inFuturesRegionGate, boolean inEcRegionGate, boolean hasSpendingAccount, CountryCode.Supported userLocality) {
        Intrinsics.checkNotNullParameter(selectableFilters, "selectableFilters");
        Intrinsics.checkNotNullParameter(selectedFilter, "selectedFilter");
        Intrinsics.checkNotNullParameter(shouldShowTransactionDetail, "shouldShowTransactionDetail");
        return new HistoryViewState(selectableFilters, selectedFilter, emptyStateTextResId, pendingItems, recentItems, olderItems, transactionReference, fromDeepLink, shouldShowTransactionDetail, inCryptoRegionGate, inFuturesRegionGate, inEcRegionGate, hasSpendingAccount, userLocality);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HistoryViewState)) {
            return false;
        }
        HistoryViewState historyViewState = (HistoryViewState) other;
        return Intrinsics.areEqual(this.selectableFilters, historyViewState.selectableFilters) && this.selectedFilter == historyViewState.selectedFilter && Intrinsics.areEqual(this.emptyStateTextResId, historyViewState.emptyStateTextResId) && Intrinsics.areEqual(this.pendingItems, historyViewState.pendingItems) && Intrinsics.areEqual(this.recentItems, historyViewState.recentItems) && Intrinsics.areEqual(this.olderItems, historyViewState.olderItems) && Intrinsics.areEqual(this.transactionReference, historyViewState.transactionReference) && this.fromDeepLink == historyViewState.fromDeepLink && Intrinsics.areEqual(this.shouldShowTransactionDetail, historyViewState.shouldShowTransactionDetail) && this.inCryptoRegionGate == historyViewState.inCryptoRegionGate && this.inFuturesRegionGate == historyViewState.inFuturesRegionGate && this.inEcRegionGate == historyViewState.inEcRegionGate && this.hasSpendingAccount == historyViewState.hasSpendingAccount && Intrinsics.areEqual(this.userLocality, historyViewState.userLocality);
    }

    public int hashCode() {
        int iHashCode = ((this.selectableFilters.hashCode() * 31) + this.selectedFilter.hashCode()) * 31;
        Integer num = this.emptyStateTextResId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        PagedList<StatefulHistoryEvent<HistoryEvent>> pagedList = this.pendingItems;
        int iHashCode3 = (iHashCode2 + (pagedList == null ? 0 : pagedList.hashCode())) * 31;
        PagedList<StatefulHistoryEvent<HistoryEvent>> pagedList2 = this.recentItems;
        int iHashCode4 = (iHashCode3 + (pagedList2 == null ? 0 : pagedList2.hashCode())) * 31;
        PagedList<StatefulHistoryEvent<HistoryEvent>> pagedList3 = this.olderItems;
        int iHashCode5 = (iHashCode4 + (pagedList3 == null ? 0 : pagedList3.hashCode())) * 31;
        TransactionReference transactionReference = this.transactionReference;
        int iHashCode6 = (((((((((((((iHashCode5 + (transactionReference == null ? 0 : transactionReference.hashCode())) * 31) + Boolean.hashCode(this.fromDeepLink)) * 31) + this.shouldShowTransactionDetail.hashCode()) * 31) + Boolean.hashCode(this.inCryptoRegionGate)) * 31) + Boolean.hashCode(this.inFuturesRegionGate)) * 31) + Boolean.hashCode(this.inEcRegionGate)) * 31) + Boolean.hashCode(this.hasSpendingAccount)) * 31;
        CountryCode.Supported supported = this.userLocality;
        return iHashCode6 + (supported != null ? supported.hashCode() : 0);
    }

    public String toString() {
        return "HistoryViewState(selectableFilters=" + this.selectableFilters + ", selectedFilter=" + this.selectedFilter + ", emptyStateTextResId=" + this.emptyStateTextResId + ", pendingItems=" + this.pendingItems + ", recentItems=" + this.recentItems + ", olderItems=" + this.olderItems + ", transactionReference=" + this.transactionReference + ", fromDeepLink=" + this.fromDeepLink + ", shouldShowTransactionDetail=" + this.shouldShowTransactionDetail + ", inCryptoRegionGate=" + this.inCryptoRegionGate + ", inFuturesRegionGate=" + this.inFuturesRegionGate + ", inEcRegionGate=" + this.inEcRegionGate + ", hasSpendingAccount=" + this.hasSpendingAccount + ", userLocality=" + this.userLocality + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HistoryViewState(Set<? extends HistoryFilter> selectableFilters, HistoryFilter selectedFilter, Integer num, PagedList<StatefulHistoryEvent<HistoryEvent>> pagedList, PagedList<StatefulHistoryEvent<HistoryEvent>> pagedList2, PagedList<StatefulHistoryEvent<HistoryEvent>> pagedList3, TransactionReference transactionReference, boolean z, UiEvent<Unit> shouldShowTransactionDetail, boolean z2, boolean z3, boolean z4, boolean z5, CountryCode.Supported supported) {
        Intrinsics.checkNotNullParameter(selectableFilters, "selectableFilters");
        Intrinsics.checkNotNullParameter(selectedFilter, "selectedFilter");
        Intrinsics.checkNotNullParameter(shouldShowTransactionDetail, "shouldShowTransactionDetail");
        this.selectableFilters = selectableFilters;
        this.selectedFilter = selectedFilter;
        this.emptyStateTextResId = num;
        this.pendingItems = pagedList;
        this.recentItems = pagedList2;
        this.olderItems = pagedList3;
        this.transactionReference = transactionReference;
        this.fromDeepLink = z;
        this.shouldShowTransactionDetail = shouldShowTransactionDetail;
        this.inCryptoRegionGate = z2;
        this.inFuturesRegionGate = z3;
        this.inEcRegionGate = z4;
        this.hasSpendingAccount = z5;
        this.userLocality = supported;
    }

    public /* synthetic */ HistoryViewState(Set set, HistoryFilter historyFilter, Integer num, PagedList pagedList, PagedList pagedList2, PagedList pagedList3, TransactionReference transactionReference, boolean z, UiEvent uiEvent, boolean z2, boolean z3, boolean z4, boolean z5, CountryCode.Supported supported, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SetsKt.setOf(HistoryFilter.ALL) : set, (i & 2) != 0 ? HistoryFilter.ALL : historyFilter, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : pagedList, (i & 16) != 0 ? null : pagedList2, (i & 32) != 0 ? null : pagedList3, (i & 64) != 0 ? null : transactionReference, (i & 128) != 0 ? false : z, (i & 256) != 0 ? new UiEvent(Unit.INSTANCE) : uiEvent, (i & 512) != 0 ? false : z2, (i & 1024) != 0 ? false : z3, (i & 2048) != 0 ? false : z4, (i & 4096) == 0 ? z5 : false, (i & 8192) != 0 ? null : supported);
    }

    public final Set<HistoryFilter> getSelectableFilters() {
        return this.selectableFilters;
    }

    public final HistoryFilter getSelectedFilter() {
        return this.selectedFilter;
    }

    public final Integer getEmptyStateTextResId() {
        return this.emptyStateTextResId;
    }

    public final PagedList<StatefulHistoryEvent<HistoryEvent>> getPendingItems() {
        return this.pendingItems;
    }

    public final PagedList<StatefulHistoryEvent<HistoryEvent>> getRecentItems() {
        return this.recentItems;
    }

    public final PagedList<StatefulHistoryEvent<HistoryEvent>> getOlderItems() {
        return this.olderItems;
    }

    public final TransactionReference getTransactionReference() {
        return this.transactionReference;
    }

    public final boolean getFromDeepLink() {
        return this.fromDeepLink;
    }

    public final boolean isDisclosureBtnVisible() {
        return this.hasSpendingAccount || this.inFuturesRegionGate;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<HistoryDisclosure> getDisclosures() {
        HistoryDisclosure historyDisclosure;
        CountryCode.Supported supported = this.userLocality;
        CountryCode.Supported.UnitedKingdom unitedKingdom = CountryCode.Supported.UnitedKingdom.INSTANCE;
        HistoryDisclosure historyDisclosure2 = Intrinsics.areEqual(supported, unitedKingdom) ? HistoryDisclosure.BASE_UK : HistoryDisclosure.BASE;
        HistoryDisclosure historyDisclosure3 = HistoryDisclosure.CRYPTO;
        if (!this.inCryptoRegionGate) {
            historyDisclosure3 = null;
        }
        CountryCode.Supported supported2 = this.userLocality;
        if (Intrinsics.areEqual(supported2, CountryCode.Supported.UnitedStates.INSTANCE)) {
            boolean z = this.inFuturesRegionGate;
            if (z && this.inEcRegionGate) {
                historyDisclosure = HistoryDisclosure.FUTURES_AND_EVENT_CONTRACTS;
            } else if (z) {
                historyDisclosure = HistoryDisclosure.FUTURES;
            } else {
                historyDisclosure = this.inEcRegionGate ? HistoryDisclosure.EVENT_CONTRACTS : null;
            }
        } else if (Intrinsics.areEqual(supported2, unitedKingdom) && this.inFuturesRegionGate) {
            historyDisclosure = HistoryDisclosure.FUTURES_UK;
        }
        return CollectionsKt.listOfNotNull((Object[]) new HistoryDisclosure[]{historyDisclosure2, historyDisclosure3, historyDisclosure, this.hasSpendingAccount ? HistoryDisclosure.SPENDING : null});
    }

    public final UiEvent<TransactionReference> getShowTransactionDetailEvent() {
        if (this.transactionReference == null || this.shouldShowTransactionDetail.consume() == null) {
            return null;
        }
        return new UiEvent<>(this.transactionReference);
    }
}
