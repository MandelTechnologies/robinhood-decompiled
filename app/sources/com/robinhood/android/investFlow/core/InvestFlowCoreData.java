package com.robinhood.android.investFlow.core;

import com.robinhood.android.recurring.contracts.investflow.InvestFlowFrequency;
import com.robinhood.models.util.Money;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestFlowCoreData.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JI\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/investFlow/core/InvestFlowCoreData;", "", "userEnteredAmount", "Lcom/robinhood/models/util/Money;", "selectedFrequency", "Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;", "primaryPaymentMethod", "Lcom/robinhood/android/investFlow/core/InvestFlowPaymentMethod;", "backupPaymentMethod", "selectedItems", "", "Lcom/robinhood/android/investFlow/core/InvestFlowBasketItem;", "<init>", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;Lcom/robinhood/android/investFlow/core/InvestFlowPaymentMethod;Lcom/robinhood/android/investFlow/core/InvestFlowPaymentMethod;Ljava/util/List;)V", "getUserEnteredAmount", "()Lcom/robinhood/models/util/Money;", "getSelectedFrequency", "()Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;", "getPrimaryPaymentMethod", "()Lcom/robinhood/android/investFlow/core/InvestFlowPaymentMethod;", "getBackupPaymentMethod", "getSelectedItems", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InvestFlowCoreData {
    public static final int $stable = 8;
    private final InvestFlowPaymentMethod backupPaymentMethod;
    private final InvestFlowPaymentMethod primaryPaymentMethod;
    private final InvestFlowFrequency selectedFrequency;
    private final List<InvestFlowBasketItem> selectedItems;
    private final Money userEnteredAmount;

    public InvestFlowCoreData() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ InvestFlowCoreData copy$default(InvestFlowCoreData investFlowCoreData, Money money, InvestFlowFrequency investFlowFrequency, InvestFlowPaymentMethod investFlowPaymentMethod, InvestFlowPaymentMethod investFlowPaymentMethod2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            money = investFlowCoreData.userEnteredAmount;
        }
        if ((i & 2) != 0) {
            investFlowFrequency = investFlowCoreData.selectedFrequency;
        }
        if ((i & 4) != 0) {
            investFlowPaymentMethod = investFlowCoreData.primaryPaymentMethod;
        }
        if ((i & 8) != 0) {
            investFlowPaymentMethod2 = investFlowCoreData.backupPaymentMethod;
        }
        if ((i & 16) != 0) {
            list = investFlowCoreData.selectedItems;
        }
        List list2 = list;
        InvestFlowPaymentMethod investFlowPaymentMethod3 = investFlowPaymentMethod;
        return investFlowCoreData.copy(money, investFlowFrequency, investFlowPaymentMethod3, investFlowPaymentMethod2, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final Money getUserEnteredAmount() {
        return this.userEnteredAmount;
    }

    /* renamed from: component2, reason: from getter */
    public final InvestFlowFrequency getSelectedFrequency() {
        return this.selectedFrequency;
    }

    /* renamed from: component3, reason: from getter */
    public final InvestFlowPaymentMethod getPrimaryPaymentMethod() {
        return this.primaryPaymentMethod;
    }

    /* renamed from: component4, reason: from getter */
    public final InvestFlowPaymentMethod getBackupPaymentMethod() {
        return this.backupPaymentMethod;
    }

    public final List<InvestFlowBasketItem> component5() {
        return this.selectedItems;
    }

    public final InvestFlowCoreData copy(Money userEnteredAmount, InvestFlowFrequency selectedFrequency, InvestFlowPaymentMethod primaryPaymentMethod, InvestFlowPaymentMethod backupPaymentMethod, List<? extends InvestFlowBasketItem> selectedItems) {
        Intrinsics.checkNotNullParameter(selectedItems, "selectedItems");
        return new InvestFlowCoreData(userEnteredAmount, selectedFrequency, primaryPaymentMethod, backupPaymentMethod, selectedItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvestFlowCoreData)) {
            return false;
        }
        InvestFlowCoreData investFlowCoreData = (InvestFlowCoreData) other;
        return Intrinsics.areEqual(this.userEnteredAmount, investFlowCoreData.userEnteredAmount) && Intrinsics.areEqual(this.selectedFrequency, investFlowCoreData.selectedFrequency) && Intrinsics.areEqual(this.primaryPaymentMethod, investFlowCoreData.primaryPaymentMethod) && Intrinsics.areEqual(this.backupPaymentMethod, investFlowCoreData.backupPaymentMethod) && Intrinsics.areEqual(this.selectedItems, investFlowCoreData.selectedItems);
    }

    public int hashCode() {
        Money money = this.userEnteredAmount;
        int iHashCode = (money == null ? 0 : money.hashCode()) * 31;
        InvestFlowFrequency investFlowFrequency = this.selectedFrequency;
        int iHashCode2 = (iHashCode + (investFlowFrequency == null ? 0 : investFlowFrequency.hashCode())) * 31;
        InvestFlowPaymentMethod investFlowPaymentMethod = this.primaryPaymentMethod;
        int iHashCode3 = (iHashCode2 + (investFlowPaymentMethod == null ? 0 : investFlowPaymentMethod.hashCode())) * 31;
        InvestFlowPaymentMethod investFlowPaymentMethod2 = this.backupPaymentMethod;
        return ((iHashCode3 + (investFlowPaymentMethod2 != null ? investFlowPaymentMethod2.hashCode() : 0)) * 31) + this.selectedItems.hashCode();
    }

    public String toString() {
        return "InvestFlowCoreData(userEnteredAmount=" + this.userEnteredAmount + ", selectedFrequency=" + this.selectedFrequency + ", primaryPaymentMethod=" + this.primaryPaymentMethod + ", backupPaymentMethod=" + this.backupPaymentMethod + ", selectedItems=" + this.selectedItems + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InvestFlowCoreData(Money money, InvestFlowFrequency investFlowFrequency, InvestFlowPaymentMethod investFlowPaymentMethod, InvestFlowPaymentMethod investFlowPaymentMethod2, List<? extends InvestFlowBasketItem> selectedItems) {
        Intrinsics.checkNotNullParameter(selectedItems, "selectedItems");
        this.userEnteredAmount = money;
        this.selectedFrequency = investFlowFrequency;
        this.primaryPaymentMethod = investFlowPaymentMethod;
        this.backupPaymentMethod = investFlowPaymentMethod2;
        this.selectedItems = selectedItems;
    }

    public final Money getUserEnteredAmount() {
        return this.userEnteredAmount;
    }

    public final InvestFlowFrequency getSelectedFrequency() {
        return this.selectedFrequency;
    }

    public final InvestFlowPaymentMethod getPrimaryPaymentMethod() {
        return this.primaryPaymentMethod;
    }

    public final InvestFlowPaymentMethod getBackupPaymentMethod() {
        return this.backupPaymentMethod;
    }

    public /* synthetic */ InvestFlowCoreData(Money money, InvestFlowFrequency investFlowFrequency, InvestFlowPaymentMethod investFlowPaymentMethod, InvestFlowPaymentMethod investFlowPaymentMethod2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : money, (i & 2) != 0 ? null : investFlowFrequency, (i & 4) != 0 ? null : investFlowPaymentMethod, (i & 8) != 0 ? null : investFlowPaymentMethod2, (i & 16) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<InvestFlowBasketItem> getSelectedItems() {
        return this.selectedItems;
    }
}
