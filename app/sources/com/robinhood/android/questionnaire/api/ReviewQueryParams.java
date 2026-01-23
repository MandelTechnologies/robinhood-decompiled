package com.robinhood.android.questionnaire.api;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReviewQueryParams.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ReviewQueryParams;", "Landroid/os/Parcelable;", "context", "", "reviewPageType", "Lcom/robinhood/android/questionnaire/api/ReviewPageType;", "applicationId", "Ljava/util/UUID;", "accountNumber", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/questionnaire/api/ReviewPageType;Ljava/util/UUID;Ljava/lang/String;)V", "getContext", "()Ljava/lang/String;", "getReviewPageType", "()Lcom/robinhood/android/questionnaire/api/ReviewPageType;", "getApplicationId", "()Ljava/util/UUID;", "getAccountNumber", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ReviewQueryParams implements Parcelable {
    public static final Parcelable.Creator<ReviewQueryParams> CREATOR = new Creator();
    private final String accountNumber;
    private final UUID applicationId;
    private final String context;
    private final ReviewPageType reviewPageType;

    /* compiled from: ReviewQueryParams.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ReviewQueryParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReviewQueryParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ReviewQueryParams(parcel.readString(), parcel.readInt() == 0 ? null : ReviewPageType.valueOf(parcel.readString()), (UUID) parcel.readSerializable(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReviewQueryParams[] newArray(int i) {
            return new ReviewQueryParams[i];
        }
    }

    public static /* synthetic */ ReviewQueryParams copy$default(ReviewQueryParams reviewQueryParams, String str, ReviewPageType reviewPageType, UUID uuid, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reviewQueryParams.context;
        }
        if ((i & 2) != 0) {
            reviewPageType = reviewQueryParams.reviewPageType;
        }
        if ((i & 4) != 0) {
            uuid = reviewQueryParams.applicationId;
        }
        if ((i & 8) != 0) {
            str2 = reviewQueryParams.accountNumber;
        }
        return reviewQueryParams.copy(str, reviewPageType, uuid, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    /* renamed from: component2, reason: from getter */
    public final ReviewPageType getReviewPageType() {
        return this.reviewPageType;
    }

    /* renamed from: component3, reason: from getter */
    public final UUID getApplicationId() {
        return this.applicationId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final ReviewQueryParams copy(String context, ReviewPageType reviewPageType, UUID applicationId, String accountNumber) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new ReviewQueryParams(context, reviewPageType, applicationId, accountNumber);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewQueryParams)) {
            return false;
        }
        ReviewQueryParams reviewQueryParams = (ReviewQueryParams) other;
        return Intrinsics.areEqual(this.context, reviewQueryParams.context) && this.reviewPageType == reviewQueryParams.reviewPageType && Intrinsics.areEqual(this.applicationId, reviewQueryParams.applicationId) && Intrinsics.areEqual(this.accountNumber, reviewQueryParams.accountNumber);
    }

    public int hashCode() {
        int iHashCode = this.context.hashCode() * 31;
        ReviewPageType reviewPageType = this.reviewPageType;
        int iHashCode2 = (iHashCode + (reviewPageType == null ? 0 : reviewPageType.hashCode())) * 31;
        UUID uuid = this.applicationId;
        int iHashCode3 = (iHashCode2 + (uuid == null ? 0 : uuid.hashCode())) * 31;
        String str = this.accountNumber;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "ReviewQueryParams(context=" + this.context + ", reviewPageType=" + this.reviewPageType + ", applicationId=" + this.applicationId + ", accountNumber=" + this.accountNumber + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.context);
        ReviewPageType reviewPageType = this.reviewPageType;
        if (reviewPageType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(reviewPageType.name());
        }
        dest.writeSerializable(this.applicationId);
        dest.writeString(this.accountNumber);
    }

    public ReviewQueryParams(String context, ReviewPageType reviewPageType, UUID uuid, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.reviewPageType = reviewPageType;
        this.applicationId = uuid;
        this.accountNumber = str;
    }

    public final String getContext() {
        return this.context;
    }

    public final ReviewPageType getReviewPageType() {
        return this.reviewPageType;
    }

    public final UUID getApplicationId() {
        return this.applicationId;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }
}
