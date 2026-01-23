package com.robinhood.android.advisory.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryInsightsKeys.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/advisory/contracts/AdvisoryInsightDetailKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "accountNumber", "", "current", "Lcom/robinhood/android/advisory/contracts/InsightNavArg;", "navigationInsights", "", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/advisory/contracts/InsightNavArg;Ljava/util/List;)V", "getAccountNumber", "()Ljava/lang/String;", "getCurrent", "()Lcom/robinhood/android/advisory/contracts/InsightNavArg;", "getNavigationInsights", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AdvisoryInsightDetailKey implements FragmentKey {
    public static final Parcelable.Creator<AdvisoryInsightDetailKey> CREATOR = new Creator();
    private final String accountNumber;
    private final InsightNavArg current;
    private final List<InsightNavArg> navigationInsights;

    /* compiled from: AdvisoryInsightsKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvisoryInsightDetailKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvisoryInsightDetailKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            InsightNavArg insightNavArgCreateFromParcel = InsightNavArg.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(InsightNavArg.CREATOR.createFromParcel(parcel));
            }
            return new AdvisoryInsightDetailKey(string2, insightNavArgCreateFromParcel, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvisoryInsightDetailKey[] newArray(int i) {
            return new AdvisoryInsightDetailKey[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdvisoryInsightDetailKey copy$default(AdvisoryInsightDetailKey advisoryInsightDetailKey, String str, InsightNavArg insightNavArg, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = advisoryInsightDetailKey.accountNumber;
        }
        if ((i & 2) != 0) {
            insightNavArg = advisoryInsightDetailKey.current;
        }
        if ((i & 4) != 0) {
            list = advisoryInsightDetailKey.navigationInsights;
        }
        return advisoryInsightDetailKey.copy(str, insightNavArg, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final InsightNavArg getCurrent() {
        return this.current;
    }

    public final List<InsightNavArg> component3() {
        return this.navigationInsights;
    }

    public final AdvisoryInsightDetailKey copy(String accountNumber, InsightNavArg current, List<InsightNavArg> navigationInsights) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(navigationInsights, "navigationInsights");
        return new AdvisoryInsightDetailKey(accountNumber, current, navigationInsights);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvisoryInsightDetailKey)) {
            return false;
        }
        AdvisoryInsightDetailKey advisoryInsightDetailKey = (AdvisoryInsightDetailKey) other;
        return Intrinsics.areEqual(this.accountNumber, advisoryInsightDetailKey.accountNumber) && Intrinsics.areEqual(this.current, advisoryInsightDetailKey.current) && Intrinsics.areEqual(this.navigationInsights, advisoryInsightDetailKey.navigationInsights);
    }

    public int hashCode() {
        return (((this.accountNumber.hashCode() * 31) + this.current.hashCode()) * 31) + this.navigationInsights.hashCode();
    }

    public String toString() {
        return "AdvisoryInsightDetailKey(accountNumber=" + this.accountNumber + ", current=" + this.current + ", navigationInsights=" + this.navigationInsights + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountNumber);
        this.current.writeToParcel(dest, flags);
        List<InsightNavArg> list = this.navigationInsights;
        dest.writeInt(list.size());
        Iterator<InsightNavArg> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public AdvisoryInsightDetailKey(String accountNumber, InsightNavArg current, List<InsightNavArg> navigationInsights) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(navigationInsights, "navigationInsights");
        this.accountNumber = accountNumber;
        this.current = current;
        this.navigationInsights = navigationInsights;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final InsightNavArg getCurrent() {
        return this.current;
    }

    public /* synthetic */ AdvisoryInsightDetailKey(String str, InsightNavArg insightNavArg, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, insightNavArg, (i & 4) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<InsightNavArg> getNavigationInsights() {
        return this.navigationInsights;
    }
}
