package com.robinhood.android.recommendations.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecommendationsRecurringHook.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/recommendations/contracts/RecommendationsRecurringHook;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "source", "", "accountNumber", "accountType", "recommendationId", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;)V", "getSource", "()Ljava/lang/String;", "getAccountNumber", "getAccountType", "getRecommendationId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class RecommendationsRecurringHook implements FragmentKey {
    public static final Parcelable.Creator<RecommendationsRecurringHook> CREATOR = new Creator();
    private final String accountNumber;
    private final String accountType;
    private final UUID recommendationId;
    private final String source;

    /* compiled from: RecommendationsRecurringHook.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<RecommendationsRecurringHook> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecommendationsRecurringHook createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RecommendationsRecurringHook(parcel.readString(), parcel.readString(), parcel.readString(), (UUID) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecommendationsRecurringHook[] newArray(int i) {
            return new RecommendationsRecurringHook[i];
        }
    }

    public static /* synthetic */ RecommendationsRecurringHook copy$default(RecommendationsRecurringHook recommendationsRecurringHook, String str, String str2, String str3, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recommendationsRecurringHook.source;
        }
        if ((i & 2) != 0) {
            str2 = recommendationsRecurringHook.accountNumber;
        }
        if ((i & 4) != 0) {
            str3 = recommendationsRecurringHook.accountType;
        }
        if ((i & 8) != 0) {
            uuid = recommendationsRecurringHook.recommendationId;
        }
        return recommendationsRecurringHook.copy(str, str2, str3, uuid);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAccountType() {
        return this.accountType;
    }

    /* renamed from: component4, reason: from getter */
    public final UUID getRecommendationId() {
        return this.recommendationId;
    }

    public final RecommendationsRecurringHook copy(String source, String accountNumber, String accountType, UUID recommendationId) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(recommendationId, "recommendationId");
        return new RecommendationsRecurringHook(source, accountNumber, accountType, recommendationId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendationsRecurringHook)) {
            return false;
        }
        RecommendationsRecurringHook recommendationsRecurringHook = (RecommendationsRecurringHook) other;
        return Intrinsics.areEqual(this.source, recommendationsRecurringHook.source) && Intrinsics.areEqual(this.accountNumber, recommendationsRecurringHook.accountNumber) && Intrinsics.areEqual(this.accountType, recommendationsRecurringHook.accountType) && Intrinsics.areEqual(this.recommendationId, recommendationsRecurringHook.recommendationId);
    }

    public int hashCode() {
        return (((((this.source.hashCode() * 31) + this.accountNumber.hashCode()) * 31) + this.accountType.hashCode()) * 31) + this.recommendationId.hashCode();
    }

    public String toString() {
        return "RecommendationsRecurringHook(source=" + this.source + ", accountNumber=" + this.accountNumber + ", accountType=" + this.accountType + ", recommendationId=" + this.recommendationId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.source);
        dest.writeString(this.accountNumber);
        dest.writeString(this.accountType);
        dest.writeSerializable(this.recommendationId);
    }

    public RecommendationsRecurringHook(String source, String accountNumber, String accountType, UUID recommendationId) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(recommendationId, "recommendationId");
        this.source = source;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.recommendationId = recommendationId;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final String getAccountType() {
        return this.accountType;
    }

    public final UUID getRecommendationId() {
        return this.recommendationId;
    }
}
