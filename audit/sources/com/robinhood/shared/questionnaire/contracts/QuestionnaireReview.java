package com.robinhood.shared.questionnaire.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.questionnaire.api.ReviewPageType;
import com.robinhood.models.investorprofile.questionnaire.QuestionnaireLoggingParams;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuestionnaireReview.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001dHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006)"}, m3636d2 = {"Lcom/robinhood/shared/questionnaire/contracts/QuestionnaireReview;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "context", "", "accountNumber", "reviewPageType", "Lcom/robinhood/android/questionnaire/api/ReviewPageType;", "loggingParams", "Lcom/robinhood/models/investorprofile/questionnaire/QuestionnaireLoggingParams;", "applicationId", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/questionnaire/api/ReviewPageType;Lcom/robinhood/models/investorprofile/questionnaire/QuestionnaireLoggingParams;Ljava/util/UUID;)V", "getContext", "()Ljava/lang/String;", "getAccountNumber", "getReviewPageType", "()Lcom/robinhood/android/questionnaire/api/ReviewPageType;", "getLoggingParams", "()Lcom/robinhood/models/investorprofile/questionnaire/QuestionnaireLoggingParams;", "getApplicationId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class QuestionnaireReview implements FragmentKey {
    public static final Parcelable.Creator<QuestionnaireReview> CREATOR = new Creator();
    private final String accountNumber;
    private final UUID applicationId;
    private final String context;
    private final QuestionnaireLoggingParams loggingParams;
    private final ReviewPageType reviewPageType;

    /* compiled from: QuestionnaireReview.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<QuestionnaireReview> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuestionnaireReview createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new QuestionnaireReview(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ReviewPageType.valueOf(parcel.readString()), (QuestionnaireLoggingParams) parcel.readParcelable(QuestionnaireReview.class.getClassLoader()), (UUID) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuestionnaireReview[] newArray(int i) {
            return new QuestionnaireReview[i];
        }
    }

    public static /* synthetic */ QuestionnaireReview copy$default(QuestionnaireReview questionnaireReview, String str, String str2, ReviewPageType reviewPageType, QuestionnaireLoggingParams questionnaireLoggingParams, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            str = questionnaireReview.context;
        }
        if ((i & 2) != 0) {
            str2 = questionnaireReview.accountNumber;
        }
        if ((i & 4) != 0) {
            reviewPageType = questionnaireReview.reviewPageType;
        }
        if ((i & 8) != 0) {
            questionnaireLoggingParams = questionnaireReview.loggingParams;
        }
        if ((i & 16) != 0) {
            uuid = questionnaireReview.applicationId;
        }
        UUID uuid2 = uuid;
        ReviewPageType reviewPageType2 = reviewPageType;
        return questionnaireReview.copy(str, str2, reviewPageType2, questionnaireLoggingParams, uuid2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final ReviewPageType getReviewPageType() {
        return this.reviewPageType;
    }

    /* renamed from: component4, reason: from getter */
    public final QuestionnaireLoggingParams getLoggingParams() {
        return this.loggingParams;
    }

    /* renamed from: component5, reason: from getter */
    public final UUID getApplicationId() {
        return this.applicationId;
    }

    public final QuestionnaireReview copy(String context, String accountNumber, ReviewPageType reviewPageType, QuestionnaireLoggingParams loggingParams, UUID applicationId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(loggingParams, "loggingParams");
        return new QuestionnaireReview(context, accountNumber, reviewPageType, loggingParams, applicationId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuestionnaireReview)) {
            return false;
        }
        QuestionnaireReview questionnaireReview = (QuestionnaireReview) other;
        return Intrinsics.areEqual(this.context, questionnaireReview.context) && Intrinsics.areEqual(this.accountNumber, questionnaireReview.accountNumber) && this.reviewPageType == questionnaireReview.reviewPageType && Intrinsics.areEqual(this.loggingParams, questionnaireReview.loggingParams) && Intrinsics.areEqual(this.applicationId, questionnaireReview.applicationId);
    }

    public int hashCode() {
        int iHashCode = this.context.hashCode() * 31;
        String str = this.accountNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ReviewPageType reviewPageType = this.reviewPageType;
        int iHashCode3 = (((iHashCode2 + (reviewPageType == null ? 0 : reviewPageType.hashCode())) * 31) + this.loggingParams.hashCode()) * 31;
        UUID uuid = this.applicationId;
        return iHashCode3 + (uuid != null ? uuid.hashCode() : 0);
    }

    public String toString() {
        return "QuestionnaireReview(context=" + this.context + ", accountNumber=" + this.accountNumber + ", reviewPageType=" + this.reviewPageType + ", loggingParams=" + this.loggingParams + ", applicationId=" + this.applicationId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.context);
        dest.writeString(this.accountNumber);
        ReviewPageType reviewPageType = this.reviewPageType;
        if (reviewPageType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(reviewPageType.name());
        }
        dest.writeParcelable(this.loggingParams, flags);
        dest.writeSerializable(this.applicationId);
    }

    public QuestionnaireReview(String context, String str, ReviewPageType reviewPageType, QuestionnaireLoggingParams loggingParams, UUID uuid) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(loggingParams, "loggingParams");
        this.context = context;
        this.accountNumber = str;
        this.reviewPageType = reviewPageType;
        this.loggingParams = loggingParams;
        this.applicationId = uuid;
    }

    public final String getContext() {
        return this.context;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final ReviewPageType getReviewPageType() {
        return this.reviewPageType;
    }

    public /* synthetic */ QuestionnaireReview(String str, String str2, ReviewPageType reviewPageType, QuestionnaireLoggingParams questionnaireLoggingParams, UUID uuid, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : reviewPageType, (i & 8) != 0 ? new QuestionnaireLoggingParams(null, null, 3, null) : questionnaireLoggingParams, (i & 16) != 0 ? null : uuid);
    }

    public final QuestionnaireLoggingParams getLoggingParams() {
        return this.loggingParams;
    }

    public final UUID getApplicationId() {
        return this.applicationId;
    }
}
