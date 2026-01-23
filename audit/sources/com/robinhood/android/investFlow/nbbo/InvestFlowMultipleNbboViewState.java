package com.robinhood.android.investFlow.nbbo;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.account.strings.BrokerageAccountTypes2;
import com.robinhood.android.investFlow.C19349R;
import com.robinhood.android.investFlow.submit.InvestFlowOrderArgs2;
import com.robinhood.investflow.models.api.ApiAssetAllocation;
import com.robinhood.investflow.models.api.ApiInvestFlowNbboResponse;
import com.robinhood.investflow.models.api.ApiInvestFlowNbboRow;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.util.Money;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestFlowMultipleNbboViewState.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010'\u001a\u00020\u000e2\b\u0010(\u001a\u0004\u0018\u00010\t2\u0006\u0010)\u001a\u00020*J\u000e\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0005J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\t\u00103\u001a\u00020\u000eHÆ\u0003JO\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0006\u00105\u001a\u000206J\u0013\u00107\u001a\u00020\u00032\b\u00108\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010:\u001a\u000206HÖ\u0001J\t\u0010;\u001a\u00020\u000eHÖ\u0001J\u0016\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u000206R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0019R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b \u0010\u001bR\u0013\u0010!\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001bR\u0011\u0010#\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006A"}, m3636d2 = {"Lcom/robinhood/android/investFlow/nbbo/InvestFlowMultipleNbboViewState;", "Lcom/robinhood/android/investFlow/submit/InvestFlowOrderSubmitViewState;", "isLoading", "", "totalAmount", "Lcom/robinhood/models/util/Money;", "nbboResponse", "Lcom/robinhood/investflow/models/api/ApiInvestFlowNbboResponse;", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "assetAllocations", "", "Lcom/robinhood/investflow/models/api/ApiAssetAllocation;", "accountNumber", "", "<init>", "(ZLcom/robinhood/models/util/Money;Lcom/robinhood/investflow/models/api/ApiInvestFlowNbboResponse;Lcom/robinhood/models/api/BrokerageAccountType;Ljava/util/List;Ljava/lang/String;)V", "()Z", "getTotalAmount", "()Lcom/robinhood/models/util/Money;", "getNbboResponse", "()Lcom/robinhood/investflow/models/api/ApiInvestFlowNbboResponse;", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getAssetAllocations", "()Ljava/util/List;", "getAccountNumber", "()Ljava/lang/String;", "nbboRows", "Lcom/robinhood/investflow/models/api/ApiInvestFlowNbboRow;", "getNbboRows", "lastRefreshString", "getLastRefreshString", "nbboString", "getNbboString", "title", "Lcom/robinhood/utils/resource/StringResource;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "itemCountText", "accountType", "res", "Landroid/content/res/Resources;", "amountCharArray", "", "amount", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InvestFlowMultipleNbboViewState implements InvestFlowOrderArgs2 {
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestFlowMultipleNbboViewState> CREATOR = new Creator();
    private final String accountNumber;
    private final List<ApiAssetAllocation> assetAllocations;
    private final BrokerageAccountType brokerageAccountType;
    private final boolean isLoading;
    private final ApiInvestFlowNbboResponse nbboResponse;
    private final Money totalAmount;

    /* compiled from: InvestFlowMultipleNbboViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<InvestFlowMultipleNbboViewState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestFlowMultipleNbboViewState createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z = parcel.readInt() != 0;
            Money money = (Money) parcel.readParcelable(InvestFlowMultipleNbboViewState.class.getClassLoader());
            ApiInvestFlowNbboResponse apiInvestFlowNbboResponse = (ApiInvestFlowNbboResponse) parcel.readParcelable(InvestFlowMultipleNbboViewState.class.getClassLoader());
            BrokerageAccountType brokerageAccountTypeValueOf = parcel.readInt() == 0 ? null : BrokerageAccountType.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(InvestFlowMultipleNbboViewState.class.getClassLoader()));
            }
            return new InvestFlowMultipleNbboViewState(z, money, apiInvestFlowNbboResponse, brokerageAccountTypeValueOf, arrayList, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestFlowMultipleNbboViewState[] newArray(int i) {
            return new InvestFlowMultipleNbboViewState[i];
        }
    }

    public static /* synthetic */ InvestFlowMultipleNbboViewState copy$default(InvestFlowMultipleNbboViewState investFlowMultipleNbboViewState, boolean z, Money money, ApiInvestFlowNbboResponse apiInvestFlowNbboResponse, BrokerageAccountType brokerageAccountType, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = investFlowMultipleNbboViewState.isLoading;
        }
        if ((i & 2) != 0) {
            money = investFlowMultipleNbboViewState.totalAmount;
        }
        if ((i & 4) != 0) {
            apiInvestFlowNbboResponse = investFlowMultipleNbboViewState.nbboResponse;
        }
        if ((i & 8) != 0) {
            brokerageAccountType = investFlowMultipleNbboViewState.brokerageAccountType;
        }
        if ((i & 16) != 0) {
            list = investFlowMultipleNbboViewState.assetAllocations;
        }
        if ((i & 32) != 0) {
            str = investFlowMultipleNbboViewState.accountNumber;
        }
        List list2 = list;
        String str2 = str;
        return investFlowMultipleNbboViewState.copy(z, money, apiInvestFlowNbboResponse, brokerageAccountType, list2, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final Money getTotalAmount() {
        return this.totalAmount;
    }

    /* renamed from: component3, reason: from getter */
    public final ApiInvestFlowNbboResponse getNbboResponse() {
        return this.nbboResponse;
    }

    /* renamed from: component4, reason: from getter */
    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    public final List<ApiAssetAllocation> component5() {
        return this.assetAllocations;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final InvestFlowMultipleNbboViewState copy(boolean isLoading, Money totalAmount, ApiInvestFlowNbboResponse nbboResponse, BrokerageAccountType brokerageAccountType, List<ApiAssetAllocation> assetAllocations, String accountNumber) {
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        Intrinsics.checkNotNullParameter(assetAllocations, "assetAllocations");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return new InvestFlowMultipleNbboViewState(isLoading, totalAmount, nbboResponse, brokerageAccountType, assetAllocations, accountNumber);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvestFlowMultipleNbboViewState)) {
            return false;
        }
        InvestFlowMultipleNbboViewState investFlowMultipleNbboViewState = (InvestFlowMultipleNbboViewState) other;
        return this.isLoading == investFlowMultipleNbboViewState.isLoading && Intrinsics.areEqual(this.totalAmount, investFlowMultipleNbboViewState.totalAmount) && Intrinsics.areEqual(this.nbboResponse, investFlowMultipleNbboViewState.nbboResponse) && this.brokerageAccountType == investFlowMultipleNbboViewState.brokerageAccountType && Intrinsics.areEqual(this.assetAllocations, investFlowMultipleNbboViewState.assetAllocations) && Intrinsics.areEqual(this.accountNumber, investFlowMultipleNbboViewState.accountNumber);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isLoading) * 31) + this.totalAmount.hashCode()) * 31;
        ApiInvestFlowNbboResponse apiInvestFlowNbboResponse = this.nbboResponse;
        int iHashCode2 = (iHashCode + (apiInvestFlowNbboResponse == null ? 0 : apiInvestFlowNbboResponse.hashCode())) * 31;
        BrokerageAccountType brokerageAccountType = this.brokerageAccountType;
        return ((((iHashCode2 + (brokerageAccountType != null ? brokerageAccountType.hashCode() : 0)) * 31) + this.assetAllocations.hashCode()) * 31) + this.accountNumber.hashCode();
    }

    public String toString() {
        return "InvestFlowMultipleNbboViewState(isLoading=" + this.isLoading + ", totalAmount=" + this.totalAmount + ", nbboResponse=" + this.nbboResponse + ", brokerageAccountType=" + this.brokerageAccountType + ", assetAllocations=" + this.assetAllocations + ", accountNumber=" + this.accountNumber + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.isLoading ? 1 : 0);
        dest.writeParcelable(this.totalAmount, flags);
        dest.writeParcelable(this.nbboResponse, flags);
        BrokerageAccountType brokerageAccountType = this.brokerageAccountType;
        if (brokerageAccountType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(brokerageAccountType.name());
        }
        List<ApiAssetAllocation> list = this.assetAllocations;
        dest.writeInt(list.size());
        Iterator<ApiAssetAllocation> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
        dest.writeString(this.accountNumber);
    }

    public InvestFlowMultipleNbboViewState(boolean z, Money totalAmount, ApiInvestFlowNbboResponse apiInvestFlowNbboResponse, BrokerageAccountType brokerageAccountType, List<ApiAssetAllocation> assetAllocations, String accountNumber) {
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        Intrinsics.checkNotNullParameter(assetAllocations, "assetAllocations");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.isLoading = z;
        this.totalAmount = totalAmount;
        this.nbboResponse = apiInvestFlowNbboResponse;
        this.brokerageAccountType = brokerageAccountType;
        this.assetAllocations = assetAllocations;
        this.accountNumber = accountNumber;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final Money getTotalAmount() {
        return this.totalAmount;
    }

    public final ApiInvestFlowNbboResponse getNbboResponse() {
        return this.nbboResponse;
    }

    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    public /* synthetic */ InvestFlowMultipleNbboViewState(boolean z, Money money, ApiInvestFlowNbboResponse apiInvestFlowNbboResponse, BrokerageAccountType brokerageAccountType, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, money, (i & 4) != 0 ? null : apiInvestFlowNbboResponse, (i & 8) != 0 ? null : brokerageAccountType, (i & 16) != 0 ? CollectionsKt.emptyList() : list, str);
    }

    public final List<ApiAssetAllocation> getAssetAllocations() {
        return this.assetAllocations;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final List<ApiInvestFlowNbboRow> getNbboRows() {
        ApiInvestFlowNbboResponse apiInvestFlowNbboResponse = this.nbboResponse;
        if (apiInvestFlowNbboResponse != null) {
            return apiInvestFlowNbboResponse.getNbbo_rows();
        }
        return null;
    }

    public final String getLastRefreshString() {
        ApiInvestFlowNbboResponse apiInvestFlowNbboResponse = this.nbboResponse;
        if (apiInvestFlowNbboResponse != null) {
            return apiInvestFlowNbboResponse.getLast_refresh_string();
        }
        return null;
    }

    public final String getNbboString() {
        ApiInvestFlowNbboResponse apiInvestFlowNbboResponse = this.nbboResponse;
        if (apiInvestFlowNbboResponse != null) {
            return apiInvestFlowNbboResponse.getNbbo_string_1();
        }
        return null;
    }

    public final StringResource getTitle() {
        return StringResource.INSTANCE.invoke(C19349R.string.invest_flow_multiple_nbbo_total, Money.format$default(this.totalAmount, null, false, null, false, 0, null, false, null, false, false, 1023, null));
    }

    public final String itemCountText(BrokerageAccountType accountType, Resources res) throws Resources.NotFoundException {
        String displayName;
        String string2;
        Intrinsics.checkNotNullParameter(res, "res");
        if (accountType == null) {
            accountType = this.brokerageAccountType;
        }
        if (accountType != null && (displayName = BrokerageAccountTypes2.getDisplayName(accountType, res)) != null && (string2 = res.getString(C19349R.string.invest_flow_multiple_nbbo_items_and_account, String.valueOf(this.assetAllocations.size()), displayName)) != null) {
            return string2;
        }
        String string3 = res.getString(C19349R.string.invest_flow_multiple_nbbo_items, String.valueOf(this.assetAllocations.size()));
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }

    public final char[] amountCharArray(Money amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        char[] charArray = Money.format$default(amount, null, false, null, false, 0, null, false, null, false, false, 1023, null).toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        return charArray;
    }
}
