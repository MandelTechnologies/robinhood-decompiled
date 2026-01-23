package com.robinhood.android.transfers.i18n;

import androidx.paging.PagedList;
import com.robinhood.android.transfers.i18n.InternationalTransfersHubViewState;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.api.bonfire.paymentinstruments.PaymentInstrumentStatus;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.paymentinstrument.p340db.PaymentInstrumentV2;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: InternationalTransfersHubDataState.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\n¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u0017\u0010(\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005HÆ\u0003J\u0017\u0010)\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u0017\u0010+\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\nHÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010\u001eJ\t\u0010-\u001a\u00020\u0010HÆ\u0003J\u0011\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\nHÆ\u0003J\u009a\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00052\u0016\b\u0002\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u00100J\u0013\u00101\u001a\u00020\u00102\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u000206HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u000f\u0010\u001eR\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010 R\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0019\u0010\"\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#8F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u00067"}, m3636d2 = {"Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubDataState;", "", "locality", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "pendingHistoryItems", "Landroidx/paging/PagedList;", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "completedHistoryItems", "paymentInstruments", "", "Lcom/robinhood/models/paymentinstrument/db/PaymentInstrumentV2;", "withdrawableCashInfoContent", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "isMcwGbEnabled", "", "isIsaEnabled", "brokerageAccounts", "Lcom/robinhood/models/db/Account;", "<init>", "(Lcom/robinhood/iso/countrycode/CountryCode$Supported;Landroidx/paging/PagedList;Landroidx/paging/PagedList;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;ZLjava/util/List;)V", "getLocality", "()Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "getPendingHistoryItems", "()Landroidx/paging/PagedList;", "getCompletedHistoryItems", "getPaymentInstruments", "()Ljava/util/List;", "getWithdrawableCashInfoContent", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "()Z", "getBrokerageAccounts", "linkedAccountRows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$AccountRow;", "getLinkedAccountRows", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lcom/robinhood/iso/countrycode/CountryCode$Supported;Landroidx/paging/PagedList;Landroidx/paging/PagedList;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;ZLjava/util/List;)Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubDataState;", "equals", "other", "hashCode", "", "toString", "", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final /* data */ class InternationalTransfersHubDataState {
    public static final int $stable = 8;
    private final List<Account> brokerageAccounts;
    private final PagedList<StatefulHistoryEvent<HistoryEvent>> completedHistoryItems;
    private final boolean isIsaEnabled;
    private final Boolean isMcwGbEnabled;
    private final CountryCode.Supported locality;
    private final List<PaymentInstrumentV2> paymentInstruments;
    private final PagedList<StatefulHistoryEvent<HistoryEvent>> pendingHistoryItems;
    private final List<UIComponent<GenericAction>> withdrawableCashInfoContent;

    public static /* synthetic */ InternationalTransfersHubDataState copy$default(InternationalTransfersHubDataState internationalTransfersHubDataState, CountryCode.Supported supported, PagedList pagedList, PagedList pagedList2, List list, List list2, Boolean bool, boolean z, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            supported = internationalTransfersHubDataState.locality;
        }
        if ((i & 2) != 0) {
            pagedList = internationalTransfersHubDataState.pendingHistoryItems;
        }
        if ((i & 4) != 0) {
            pagedList2 = internationalTransfersHubDataState.completedHistoryItems;
        }
        if ((i & 8) != 0) {
            list = internationalTransfersHubDataState.paymentInstruments;
        }
        if ((i & 16) != 0) {
            list2 = internationalTransfersHubDataState.withdrawableCashInfoContent;
        }
        if ((i & 32) != 0) {
            bool = internationalTransfersHubDataState.isMcwGbEnabled;
        }
        if ((i & 64) != 0) {
            z = internationalTransfersHubDataState.isIsaEnabled;
        }
        if ((i & 128) != 0) {
            list3 = internationalTransfersHubDataState.brokerageAccounts;
        }
        boolean z2 = z;
        List list4 = list3;
        List list5 = list2;
        Boolean bool2 = bool;
        return internationalTransfersHubDataState.copy(supported, pagedList, pagedList2, list, list5, bool2, z2, list4);
    }

    /* renamed from: component1, reason: from getter */
    public final CountryCode.Supported getLocality() {
        return this.locality;
    }

    public final PagedList<StatefulHistoryEvent<HistoryEvent>> component2() {
        return this.pendingHistoryItems;
    }

    public final PagedList<StatefulHistoryEvent<HistoryEvent>> component3() {
        return this.completedHistoryItems;
    }

    public final List<PaymentInstrumentV2> component4() {
        return this.paymentInstruments;
    }

    public final List<UIComponent<GenericAction>> component5() {
        return this.withdrawableCashInfoContent;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getIsMcwGbEnabled() {
        return this.isMcwGbEnabled;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsIsaEnabled() {
        return this.isIsaEnabled;
    }

    public final List<Account> component8() {
        return this.brokerageAccounts;
    }

    public final InternationalTransfersHubDataState copy(CountryCode.Supported locality, PagedList<StatefulHistoryEvent<HistoryEvent>> pendingHistoryItems, PagedList<StatefulHistoryEvent<HistoryEvent>> completedHistoryItems, List<PaymentInstrumentV2> paymentInstruments, List<? extends UIComponent<? extends GenericAction>> withdrawableCashInfoContent, Boolean isMcwGbEnabled, boolean isIsaEnabled, List<Account> brokerageAccounts) {
        Intrinsics.checkNotNullParameter(locality, "locality");
        return new InternationalTransfersHubDataState(locality, pendingHistoryItems, completedHistoryItems, paymentInstruments, withdrawableCashInfoContent, isMcwGbEnabled, isIsaEnabled, brokerageAccounts);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternationalTransfersHubDataState)) {
            return false;
        }
        InternationalTransfersHubDataState internationalTransfersHubDataState = (InternationalTransfersHubDataState) other;
        return Intrinsics.areEqual(this.locality, internationalTransfersHubDataState.locality) && Intrinsics.areEqual(this.pendingHistoryItems, internationalTransfersHubDataState.pendingHistoryItems) && Intrinsics.areEqual(this.completedHistoryItems, internationalTransfersHubDataState.completedHistoryItems) && Intrinsics.areEqual(this.paymentInstruments, internationalTransfersHubDataState.paymentInstruments) && Intrinsics.areEqual(this.withdrawableCashInfoContent, internationalTransfersHubDataState.withdrawableCashInfoContent) && Intrinsics.areEqual(this.isMcwGbEnabled, internationalTransfersHubDataState.isMcwGbEnabled) && this.isIsaEnabled == internationalTransfersHubDataState.isIsaEnabled && Intrinsics.areEqual(this.brokerageAccounts, internationalTransfersHubDataState.brokerageAccounts);
    }

    public int hashCode() {
        int iHashCode = this.locality.hashCode() * 31;
        PagedList<StatefulHistoryEvent<HistoryEvent>> pagedList = this.pendingHistoryItems;
        int iHashCode2 = (iHashCode + (pagedList == null ? 0 : pagedList.hashCode())) * 31;
        PagedList<StatefulHistoryEvent<HistoryEvent>> pagedList2 = this.completedHistoryItems;
        int iHashCode3 = (iHashCode2 + (pagedList2 == null ? 0 : pagedList2.hashCode())) * 31;
        List<PaymentInstrumentV2> list = this.paymentInstruments;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<UIComponent<GenericAction>> list2 = this.withdrawableCashInfoContent;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.isMcwGbEnabled;
        int iHashCode6 = (((iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31) + Boolean.hashCode(this.isIsaEnabled)) * 31;
        List<Account> list3 = this.brokerageAccounts;
        return iHashCode6 + (list3 != null ? list3.hashCode() : 0);
    }

    public String toString() {
        return "InternationalTransfersHubDataState(locality=" + this.locality + ", pendingHistoryItems=" + this.pendingHistoryItems + ", completedHistoryItems=" + this.completedHistoryItems + ", paymentInstruments=" + this.paymentInstruments + ", withdrawableCashInfoContent=" + this.withdrawableCashInfoContent + ", isMcwGbEnabled=" + this.isMcwGbEnabled + ", isIsaEnabled=" + this.isIsaEnabled + ", brokerageAccounts=" + this.brokerageAccounts + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InternationalTransfersHubDataState(CountryCode.Supported locality, PagedList<StatefulHistoryEvent<HistoryEvent>> pagedList, PagedList<StatefulHistoryEvent<HistoryEvent>> pagedList2, List<PaymentInstrumentV2> list, List<? extends UIComponent<? extends GenericAction>> list2, Boolean bool, boolean z, List<Account> list3) {
        Intrinsics.checkNotNullParameter(locality, "locality");
        this.locality = locality;
        this.pendingHistoryItems = pagedList;
        this.completedHistoryItems = pagedList2;
        this.paymentInstruments = list;
        this.withdrawableCashInfoContent = list2;
        this.isMcwGbEnabled = bool;
        this.isIsaEnabled = z;
        this.brokerageAccounts = list3;
    }

    public /* synthetic */ InternationalTransfersHubDataState(CountryCode.Supported supported, PagedList pagedList, PagedList pagedList2, List list, List list2, Boolean bool, boolean z, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(supported, (i & 2) != 0 ? null : pagedList, (i & 4) != 0 ? null : pagedList2, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? false : z, (i & 128) != 0 ? null : list3);
    }

    public final CountryCode.Supported getLocality() {
        return this.locality;
    }

    public final PagedList<StatefulHistoryEvent<HistoryEvent>> getPendingHistoryItems() {
        return this.pendingHistoryItems;
    }

    public final PagedList<StatefulHistoryEvent<HistoryEvent>> getCompletedHistoryItems() {
        return this.completedHistoryItems;
    }

    public final List<PaymentInstrumentV2> getPaymentInstruments() {
        return this.paymentInstruments;
    }

    public final List<UIComponent<GenericAction>> getWithdrawableCashInfoContent() {
        return this.withdrawableCashInfoContent;
    }

    public final Boolean isMcwGbEnabled() {
        return this.isMcwGbEnabled;
    }

    public final boolean isIsaEnabled() {
        return this.isIsaEnabled;
    }

    public final List<Account> getBrokerageAccounts() {
        return this.brokerageAccounts;
    }

    public final ImmutableList<InternationalTransfersHubViewState.AccountRow> getLinkedAccountRows() {
        List<PaymentInstrumentV2> list = this.paymentInstruments;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((PaymentInstrumentV2) obj).getStatus() == PaymentInstrumentStatus.ACTIVE) {
                arrayList.add(obj);
            }
        }
        List listSortedWith = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.robinhood.android.transfers.i18n.InternationalTransfersHubDataState$special$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((PaymentInstrumentV2) t).getInstrumentId(), ((PaymentInstrumentV2) t2).getInstrumentId());
            }
        });
        if (listSortedWith == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listSortedWith.iterator();
        while (it.hasNext()) {
            InternationalTransfersHubViewState.AccountRow accountRow = InternationalTransfersHubDataState2.toAccountRow((PaymentInstrumentV2) it.next());
            if (accountRow != null) {
                arrayList2.add(accountRow);
            }
        }
        return extensions2.toImmutableList(arrayList2);
    }
}
