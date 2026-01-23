package com.robinhood.android.advisory.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.advisory.p304db.insights.AdvisoryInsight;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryInsightsKeys.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/advisory/contracts/InsightNavArg;", "Landroid/os/Parcelable;", "id", "", "pageType", "Lcom/robinhood/models/advisory/db/insights/AdvisoryInsight$PageType;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/advisory/db/insights/AdvisoryInsight$PageType;)V", "getId", "()Ljava/lang/String;", "getPageType", "()Lcom/robinhood/models/advisory/db/insights/AdvisoryInsight$PageType;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class InsightNavArg implements Parcelable {
    public static final Parcelable.Creator<InsightNavArg> CREATOR = new Creator();
    private final String id;
    private final AdvisoryInsight.PageType pageType;

    /* compiled from: AdvisoryInsightsKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<InsightNavArg> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InsightNavArg createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InsightNavArg(parcel.readString(), AdvisoryInsight.PageType.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InsightNavArg[] newArray(int i) {
            return new InsightNavArg[i];
        }
    }

    public static /* synthetic */ InsightNavArg copy$default(InsightNavArg insightNavArg, String str, AdvisoryInsight.PageType pageType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = insightNavArg.id;
        }
        if ((i & 2) != 0) {
            pageType = insightNavArg.pageType;
        }
        return insightNavArg.copy(str, pageType);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final AdvisoryInsight.PageType getPageType() {
        return this.pageType;
    }

    public final InsightNavArg copy(String id, AdvisoryInsight.PageType pageType) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(pageType, "pageType");
        return new InsightNavArg(id, pageType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InsightNavArg)) {
            return false;
        }
        InsightNavArg insightNavArg = (InsightNavArg) other;
        return Intrinsics.areEqual(this.id, insightNavArg.id) && this.pageType == insightNavArg.pageType;
    }

    public int hashCode() {
        return (this.id.hashCode() * 31) + this.pageType.hashCode();
    }

    public String toString() {
        return "InsightNavArg(id=" + this.id + ", pageType=" + this.pageType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.pageType.name());
    }

    public InsightNavArg(String id, AdvisoryInsight.PageType pageType) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(pageType, "pageType");
        this.id = id;
        this.pageType = pageType;
    }

    public final String getId() {
        return this.id;
    }

    public final AdvisoryInsight.PageType getPageType() {
        return this.pageType;
    }
}
