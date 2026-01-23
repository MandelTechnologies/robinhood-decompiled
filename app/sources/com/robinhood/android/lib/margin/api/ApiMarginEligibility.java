package com.robinhood.android.lib.margin.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.lib.margin.api.ApiMarginEligibility2;
import com.robinhood.models.util.Money;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ApiMarginEligibility.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001)B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001dHÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u0011R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\u00020\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0017\u0010\u0011¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/api/ApiMarginEligibility;", "Landroid/os/Parcelable;", "items", "", "Lcom/robinhood/android/lib/margin/api/ApiMarginEligibilityCheck;", "marginUpgradeBlocked", "Lcom/robinhood/android/lib/margin/api/ApiMarginEligibility$ApiMarginUpgradeBlocked;", "<init>", "(Ljava/util/List;Lcom/robinhood/android/lib/margin/api/ApiMarginEligibility$ApiMarginUpgradeBlocked;)V", "getItems", "()Ljava/util/List;", "getMarginUpgradeBlocked", "()Lcom/robinhood/android/lib/margin/api/ApiMarginEligibility$ApiMarginUpgradeBlocked;", "isEligible", "", "isEligible$annotations", "()V", "()Z", "accountBalance", "Lcom/robinhood/android/lib/margin/api/ApiMarginEligibilityCheck$AccountBalance;", "getAccountBalance$annotations", "getAccountBalance", "()Lcom/robinhood/android/lib/margin/api/ApiMarginEligibilityCheck$AccountBalance;", "isSkip2KEligible", "isSkip2KEligible$annotations", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ApiMarginUpgradeBlocked", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final /* data */ class ApiMarginEligibility implements Parcelable {
    public static final Parcelable.Creator<ApiMarginEligibility> CREATOR = new Creator();
    private final ApiMarginEligibility2.AccountBalance accountBalance;
    private final boolean isEligible;
    private final boolean isSkip2KEligible;
    private final List<ApiMarginEligibility2> items;
    private final ApiMarginUpgradeBlocked marginUpgradeBlocked;

    /* compiled from: ApiMarginEligibility.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ApiMarginEligibility> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiMarginEligibility createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(ApiMarginEligibility.class.getClassLoader()));
            }
            return new ApiMarginEligibility(arrayList, parcel.readInt() == 0 ? null : ApiMarginUpgradeBlocked.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiMarginEligibility[] newArray(int i) {
            return new ApiMarginEligibility[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiMarginEligibility copy$default(ApiMarginEligibility apiMarginEligibility, List list, ApiMarginUpgradeBlocked apiMarginUpgradeBlocked, int i, Object obj) {
        if ((i & 1) != 0) {
            list = apiMarginEligibility.items;
        }
        if ((i & 2) != 0) {
            apiMarginUpgradeBlocked = apiMarginEligibility.marginUpgradeBlocked;
        }
        return apiMarginEligibility.copy(list, apiMarginUpgradeBlocked);
    }

    public static /* synthetic */ void getAccountBalance$annotations() {
    }

    public static /* synthetic */ void isEligible$annotations() {
    }

    public static /* synthetic */ void isSkip2KEligible$annotations() {
    }

    public final List<ApiMarginEligibility2> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final ApiMarginUpgradeBlocked getMarginUpgradeBlocked() {
        return this.marginUpgradeBlocked;
    }

    public final ApiMarginEligibility copy(List<? extends ApiMarginEligibility2> items, @Json(name = "margin_upgrade_blocked") ApiMarginUpgradeBlocked marginUpgradeBlocked) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new ApiMarginEligibility(items, marginUpgradeBlocked);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiMarginEligibility)) {
            return false;
        }
        ApiMarginEligibility apiMarginEligibility = (ApiMarginEligibility) other;
        return Intrinsics.areEqual(this.items, apiMarginEligibility.items) && Intrinsics.areEqual(this.marginUpgradeBlocked, apiMarginEligibility.marginUpgradeBlocked);
    }

    public int hashCode() {
        int iHashCode = this.items.hashCode() * 31;
        ApiMarginUpgradeBlocked apiMarginUpgradeBlocked = this.marginUpgradeBlocked;
        return iHashCode + (apiMarginUpgradeBlocked == null ? 0 : apiMarginUpgradeBlocked.hashCode());
    }

    public String toString() {
        return "ApiMarginEligibility(items=" + this.items + ", marginUpgradeBlocked=" + this.marginUpgradeBlocked + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<ApiMarginEligibility2> list = this.items;
        dest.writeInt(list.size());
        Iterator<ApiMarginEligibility2> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
        ApiMarginUpgradeBlocked apiMarginUpgradeBlocked = this.marginUpgradeBlocked;
        if (apiMarginUpgradeBlocked == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            apiMarginUpgradeBlocked.writeToParcel(dest, flags);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List<? extends com.robinhood.android.lib.margin.api.ApiMarginEligibilityCheck>, java.util.List<com.robinhood.android.lib.margin.api.ApiMarginEligibilityCheck>] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
    public ApiMarginEligibility(List<? extends ApiMarginEligibility2> items, @Json(name = "margin_upgrade_blocked") ApiMarginUpgradeBlocked apiMarginUpgradeBlocked) {
        boolean z;
        ApiMarginEligibility2.AccountBalance next;
        Money minimumDeposit;
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.marginUpgradeBlocked = apiMarginUpgradeBlocked;
        boolean z2 = false;
        if (apiMarginUpgradeBlocked != null) {
            z = false;
            break;
        }
        Iterable iterable = (Iterable) items;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (!((ApiMarginEligibility2) it.next()).getPassed()) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        this.isEligible = z;
        Iterator it2 = this.items.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = 0;
                break;
            } else {
                next = it2.next();
                if (((ApiMarginEligibility2) next) instanceof ApiMarginEligibility2.AccountBalance) {
                    break;
                }
            }
        }
        ApiMarginEligibility2.AccountBalance accountBalance = next instanceof ApiMarginEligibility2.AccountBalance ? next : null;
        this.accountBalance = accountBalance;
        if (this.marginUpgradeBlocked == null && !this.isEligible && accountBalance != null && (minimumDeposit = accountBalance.getMinimumDeposit()) != null && minimumDeposit.isPositive()) {
            z2 = true;
        }
        this.isSkip2KEligible = z2;
    }

    public final List<ApiMarginEligibility2> getItems() {
        return this.items;
    }

    public final ApiMarginUpgradeBlocked getMarginUpgradeBlocked() {
        return this.marginUpgradeBlocked;
    }

    /* renamed from: isEligible, reason: from getter */
    public final boolean getIsEligible() {
        return this.isEligible;
    }

    public final ApiMarginEligibility2.AccountBalance getAccountBalance() {
        return this.accountBalance;
    }

    /* renamed from: isSkip2KEligible, reason: from getter */
    public final boolean getIsSkip2KEligible() {
        return this.isSkip2KEligible;
    }

    /* compiled from: ApiMarginEligibility.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/lib/margin/api/ApiMarginEligibility$ApiMarginUpgradeBlocked;", "Landroid/os/Parcelable;", "title", "", "reason", "deeplink", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getReason", "getDeeplink", "getType", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ApiMarginUpgradeBlocked implements Parcelable {
        public static final Parcelable.Creator<ApiMarginUpgradeBlocked> CREATOR = new Creator();
        private final String deeplink;
        private final String reason;
        private final String title;
        private final String type;

        /* compiled from: ApiMarginEligibility.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ApiMarginUpgradeBlocked> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiMarginUpgradeBlocked createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ApiMarginUpgradeBlocked(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiMarginUpgradeBlocked[] newArray(int i) {
                return new ApiMarginUpgradeBlocked[i];
            }
        }

        public static /* synthetic */ ApiMarginUpgradeBlocked copy$default(ApiMarginUpgradeBlocked apiMarginUpgradeBlocked, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = apiMarginUpgradeBlocked.title;
            }
            if ((i & 2) != 0) {
                str2 = apiMarginUpgradeBlocked.reason;
            }
            if ((i & 4) != 0) {
                str3 = apiMarginUpgradeBlocked.deeplink;
            }
            if ((i & 8) != 0) {
                str4 = apiMarginUpgradeBlocked.type;
            }
            return apiMarginUpgradeBlocked.copy(str, str2, str3, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* renamed from: component4, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final ApiMarginUpgradeBlocked copy(String title, String reason, String deeplink, @Json(name = "eligibility_item_type") String type2) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intrinsics.checkNotNullParameter(type2, "type");
            return new ApiMarginUpgradeBlocked(title, reason, deeplink, type2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ApiMarginUpgradeBlocked)) {
                return false;
            }
            ApiMarginUpgradeBlocked apiMarginUpgradeBlocked = (ApiMarginUpgradeBlocked) other;
            return Intrinsics.areEqual(this.title, apiMarginUpgradeBlocked.title) && Intrinsics.areEqual(this.reason, apiMarginUpgradeBlocked.reason) && Intrinsics.areEqual(this.deeplink, apiMarginUpgradeBlocked.deeplink) && Intrinsics.areEqual(this.type, apiMarginUpgradeBlocked.type);
        }

        public int hashCode() {
            return (((((this.title.hashCode() * 31) + this.reason.hashCode()) * 31) + this.deeplink.hashCode()) * 31) + this.type.hashCode();
        }

        public String toString() {
            return "ApiMarginUpgradeBlocked(title=" + this.title + ", reason=" + this.reason + ", deeplink=" + this.deeplink + ", type=" + this.type + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.title);
            dest.writeString(this.reason);
            dest.writeString(this.deeplink);
            dest.writeString(this.type);
        }

        public ApiMarginUpgradeBlocked(String title, String reason, String deeplink, @Json(name = "eligibility_item_type") String type2) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intrinsics.checkNotNullParameter(type2, "type");
            this.title = title;
            this.reason = reason;
            this.deeplink = deeplink;
            this.type = type2;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getReason() {
            return this.reason;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final String getType() {
            return this.type;
        }
    }
}
