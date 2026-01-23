package com.robinhood.android.investFlow.search;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.investFlow.core.InvestFlowBasketItem;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowLoggingParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestFlowSearchArgs.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/investFlow/search/InvestFlowSearchArgs;", "Landroid/os/Parcelable;", "selectedItems", "", "Lcom/robinhood/android/investFlow/core/InvestFlowBasketItem;", "accountNumber", "", "loggingParams", "Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowLoggingParams;", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowLoggingParams;)V", "getSelectedItems", "()Ljava/util/List;", "getAccountNumber", "()Ljava/lang/String;", "getLoggingParams", "()Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowLoggingParams;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InvestFlowSearchArgs implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestFlowSearchArgs> CREATOR = new Creator();
    private final String accountNumber;
    private final InvestFlowLoggingParams loggingParams;
    private final List<InvestFlowBasketItem> selectedItems;

    /* compiled from: InvestFlowSearchArgs.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<InvestFlowSearchArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestFlowSearchArgs createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(InvestFlowSearchArgs.class.getClassLoader()));
            }
            return new InvestFlowSearchArgs(arrayList, parcel.readString(), (InvestFlowLoggingParams) parcel.readParcelable(InvestFlowSearchArgs.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestFlowSearchArgs[] newArray(int i) {
            return new InvestFlowSearchArgs[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InvestFlowSearchArgs copy$default(InvestFlowSearchArgs investFlowSearchArgs, List list, String str, InvestFlowLoggingParams investFlowLoggingParams, int i, Object obj) {
        if ((i & 1) != 0) {
            list = investFlowSearchArgs.selectedItems;
        }
        if ((i & 2) != 0) {
            str = investFlowSearchArgs.accountNumber;
        }
        if ((i & 4) != 0) {
            investFlowLoggingParams = investFlowSearchArgs.loggingParams;
        }
        return investFlowSearchArgs.copy(list, str, investFlowLoggingParams);
    }

    public final List<InvestFlowBasketItem> component1() {
        return this.selectedItems;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final InvestFlowLoggingParams getLoggingParams() {
        return this.loggingParams;
    }

    public final InvestFlowSearchArgs copy(List<? extends InvestFlowBasketItem> selectedItems, String accountNumber, InvestFlowLoggingParams loggingParams) {
        Intrinsics.checkNotNullParameter(selectedItems, "selectedItems");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(loggingParams, "loggingParams");
        return new InvestFlowSearchArgs(selectedItems, accountNumber, loggingParams);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvestFlowSearchArgs)) {
            return false;
        }
        InvestFlowSearchArgs investFlowSearchArgs = (InvestFlowSearchArgs) other;
        return Intrinsics.areEqual(this.selectedItems, investFlowSearchArgs.selectedItems) && Intrinsics.areEqual(this.accountNumber, investFlowSearchArgs.accountNumber) && Intrinsics.areEqual(this.loggingParams, investFlowSearchArgs.loggingParams);
    }

    public int hashCode() {
        return (((this.selectedItems.hashCode() * 31) + this.accountNumber.hashCode()) * 31) + this.loggingParams.hashCode();
    }

    public String toString() {
        return "InvestFlowSearchArgs(selectedItems=" + this.selectedItems + ", accountNumber=" + this.accountNumber + ", loggingParams=" + this.loggingParams + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<InvestFlowBasketItem> list = this.selectedItems;
        dest.writeInt(list.size());
        Iterator<InvestFlowBasketItem> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
        dest.writeString(this.accountNumber);
        dest.writeParcelable(this.loggingParams, flags);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InvestFlowSearchArgs(List<? extends InvestFlowBasketItem> selectedItems, String accountNumber, InvestFlowLoggingParams loggingParams) {
        Intrinsics.checkNotNullParameter(selectedItems, "selectedItems");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(loggingParams, "loggingParams");
        this.selectedItems = selectedItems;
        this.accountNumber = accountNumber;
        this.loggingParams = loggingParams;
    }

    public /* synthetic */ InvestFlowSearchArgs(List list, String str, InvestFlowLoggingParams investFlowLoggingParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, str, investFlowLoggingParams);
    }

    public final List<InvestFlowBasketItem> getSelectedItems() {
        return this.selectedItems;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final InvestFlowLoggingParams getLoggingParams() {
        return this.loggingParams;
    }
}
