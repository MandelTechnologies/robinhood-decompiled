package com.robinhood.android.investFlow.nbbosingle;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.investFlow.submit.InvestFlowOrderArgs2;
import com.robinhood.investflow.models.api.ApiAssetAllocation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestFlowSingleNbboViewState.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003JI\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/investFlow/nbbosingle/InvestFlowSingleNbboViewState;", "Lcom/robinhood/android/investFlow/submit/InvestFlowOrderSubmitViewState;", "nbboShares", "", "nbboString1", "nbboString2", "nbboLastRefresh", "assetAllocations", "", "Lcom/robinhood/investflow/models/api/ApiAssetAllocation;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getNbboShares", "()Ljava/lang/String;", "getNbboString1", "getNbboString2", "getNbboLastRefresh", "getAssetAllocations", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InvestFlowSingleNbboViewState implements InvestFlowOrderArgs2 {
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestFlowSingleNbboViewState> CREATOR = new Creator();
    private final List<ApiAssetAllocation> assetAllocations;
    private final String nbboLastRefresh;
    private final String nbboShares;
    private final String nbboString1;
    private final String nbboString2;

    /* compiled from: InvestFlowSingleNbboViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<InvestFlowSingleNbboViewState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestFlowSingleNbboViewState createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(InvestFlowSingleNbboViewState.class.getClassLoader()));
            }
            return new InvestFlowSingleNbboViewState(string2, string3, string4, string5, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestFlowSingleNbboViewState[] newArray(int i) {
            return new InvestFlowSingleNbboViewState[i];
        }
    }

    public InvestFlowSingleNbboViewState() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ InvestFlowSingleNbboViewState copy$default(InvestFlowSingleNbboViewState investFlowSingleNbboViewState, String str, String str2, String str3, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = investFlowSingleNbboViewState.nbboShares;
        }
        if ((i & 2) != 0) {
            str2 = investFlowSingleNbboViewState.nbboString1;
        }
        if ((i & 4) != 0) {
            str3 = investFlowSingleNbboViewState.nbboString2;
        }
        if ((i & 8) != 0) {
            str4 = investFlowSingleNbboViewState.nbboLastRefresh;
        }
        if ((i & 16) != 0) {
            list = investFlowSingleNbboViewState.assetAllocations;
        }
        List list2 = list;
        String str5 = str3;
        return investFlowSingleNbboViewState.copy(str, str2, str5, str4, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getNbboShares() {
        return this.nbboShares;
    }

    /* renamed from: component2, reason: from getter */
    public final String getNbboString1() {
        return this.nbboString1;
    }

    /* renamed from: component3, reason: from getter */
    public final String getNbboString2() {
        return this.nbboString2;
    }

    /* renamed from: component4, reason: from getter */
    public final String getNbboLastRefresh() {
        return this.nbboLastRefresh;
    }

    public final List<ApiAssetAllocation> component5() {
        return this.assetAllocations;
    }

    public final InvestFlowSingleNbboViewState copy(String nbboShares, String nbboString1, String nbboString2, String nbboLastRefresh, List<ApiAssetAllocation> assetAllocations) {
        Intrinsics.checkNotNullParameter(assetAllocations, "assetAllocations");
        return new InvestFlowSingleNbboViewState(nbboShares, nbboString1, nbboString2, nbboLastRefresh, assetAllocations);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvestFlowSingleNbboViewState)) {
            return false;
        }
        InvestFlowSingleNbboViewState investFlowSingleNbboViewState = (InvestFlowSingleNbboViewState) other;
        return Intrinsics.areEqual(this.nbboShares, investFlowSingleNbboViewState.nbboShares) && Intrinsics.areEqual(this.nbboString1, investFlowSingleNbboViewState.nbboString1) && Intrinsics.areEqual(this.nbboString2, investFlowSingleNbboViewState.nbboString2) && Intrinsics.areEqual(this.nbboLastRefresh, investFlowSingleNbboViewState.nbboLastRefresh) && Intrinsics.areEqual(this.assetAllocations, investFlowSingleNbboViewState.assetAllocations);
    }

    public int hashCode() {
        String str = this.nbboShares;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.nbboString1;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nbboString2;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nbboLastRefresh;
        return ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.assetAllocations.hashCode();
    }

    public String toString() {
        return "InvestFlowSingleNbboViewState(nbboShares=" + this.nbboShares + ", nbboString1=" + this.nbboString1 + ", nbboString2=" + this.nbboString2 + ", nbboLastRefresh=" + this.nbboLastRefresh + ", assetAllocations=" + this.assetAllocations + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.nbboShares);
        dest.writeString(this.nbboString1);
        dest.writeString(this.nbboString2);
        dest.writeString(this.nbboLastRefresh);
        List<ApiAssetAllocation> list = this.assetAllocations;
        dest.writeInt(list.size());
        Iterator<ApiAssetAllocation> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
    }

    public InvestFlowSingleNbboViewState(String str, String str2, String str3, String str4, List<ApiAssetAllocation> assetAllocations) {
        Intrinsics.checkNotNullParameter(assetAllocations, "assetAllocations");
        this.nbboShares = str;
        this.nbboString1 = str2;
        this.nbboString2 = str3;
        this.nbboLastRefresh = str4;
        this.assetAllocations = assetAllocations;
    }

    public final String getNbboShares() {
        return this.nbboShares;
    }

    public final String getNbboString1() {
        return this.nbboString1;
    }

    public final String getNbboString2() {
        return this.nbboString2;
    }

    public final String getNbboLastRefresh() {
        return this.nbboLastRefresh;
    }

    public /* synthetic */ InvestFlowSingleNbboViewState(String str, String str2, String str3, String str4, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<ApiAssetAllocation> getAssetAllocations() {
        return this.assetAllocations;
    }
}
