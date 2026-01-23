package com.robinhood.android.advisory.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.advisory.p304db.insights.AdvisoryInsight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryInsightsKeys.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/advisory/contracts/AdvisoryInsightsHubKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "accountNumber", "", "insightType", "Lcom/robinhood/models/advisory/db/insights/AdvisoryInsight$AdvisoryInsightType;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/advisory/db/insights/AdvisoryInsight$AdvisoryInsightType;)V", "getAccountNumber", "()Ljava/lang/String;", "getInsightType", "()Lcom/robinhood/models/advisory/db/insights/AdvisoryInsight$AdvisoryInsightType;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AdvisoryInsightsHubKey implements FragmentKey {
    public static final Parcelable.Creator<AdvisoryInsightsHubKey> CREATOR = new Creator();
    private final String accountNumber;
    private final AdvisoryInsight.AdvisoryInsightType insightType;

    /* compiled from: AdvisoryInsightsKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvisoryInsightsHubKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvisoryInsightsHubKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AdvisoryInsightsHubKey(parcel.readString(), AdvisoryInsight.AdvisoryInsightType.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvisoryInsightsHubKey[] newArray(int i) {
            return new AdvisoryInsightsHubKey[i];
        }
    }

    public static /* synthetic */ AdvisoryInsightsHubKey copy$default(AdvisoryInsightsHubKey advisoryInsightsHubKey, String str, AdvisoryInsight.AdvisoryInsightType advisoryInsightType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = advisoryInsightsHubKey.accountNumber;
        }
        if ((i & 2) != 0) {
            advisoryInsightType = advisoryInsightsHubKey.insightType;
        }
        return advisoryInsightsHubKey.copy(str, advisoryInsightType);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final AdvisoryInsight.AdvisoryInsightType getInsightType() {
        return this.insightType;
    }

    public final AdvisoryInsightsHubKey copy(String accountNumber, AdvisoryInsight.AdvisoryInsightType insightType) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(insightType, "insightType");
        return new AdvisoryInsightsHubKey(accountNumber, insightType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvisoryInsightsHubKey)) {
            return false;
        }
        AdvisoryInsightsHubKey advisoryInsightsHubKey = (AdvisoryInsightsHubKey) other;
        return Intrinsics.areEqual(this.accountNumber, advisoryInsightsHubKey.accountNumber) && this.insightType == advisoryInsightsHubKey.insightType;
    }

    public int hashCode() {
        return (this.accountNumber.hashCode() * 31) + this.insightType.hashCode();
    }

    public String toString() {
        return "AdvisoryInsightsHubKey(accountNumber=" + this.accountNumber + ", insightType=" + this.insightType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountNumber);
        dest.writeString(this.insightType.name());
    }

    public AdvisoryInsightsHubKey(String accountNumber, AdvisoryInsight.AdvisoryInsightType insightType) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(insightType, "insightType");
        this.accountNumber = accountNumber;
        this.insightType = insightType;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public /* synthetic */ AdvisoryInsightsHubKey(String str, AdvisoryInsight.AdvisoryInsightType advisoryInsightType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? AdvisoryInsight.AdvisoryInsightType.UNSPECIFIED : advisoryInsightType);
    }

    public final AdvisoryInsight.AdvisoryInsightType getInsightType() {
        return this.insightType;
    }
}
