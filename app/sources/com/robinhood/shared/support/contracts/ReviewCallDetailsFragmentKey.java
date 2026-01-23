package com.robinhood.shared.support.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.p355ui.IssueDetail;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReviewCallDetailsFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J5\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001bHÖ\u0001J\t\u0010 \u001a\u00020\bHÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006&"}, m3636d2 = {"Lcom/robinhood/shared/support/contracts/ReviewCallDetailsFragmentKey;", "Landroid/os/Parcelable;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "inquiryId", "Ljava/util/UUID;", "issueDetail", "Lcom/robinhood/models/ui/IssueDetail$Phone;", "loggedOutPhoneNumber", "", "clearTask", "", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/ui/IssueDetail$Phone;Ljava/lang/String;Z)V", "getInquiryId", "()Ljava/util/UUID;", "getIssueDetail", "()Lcom/robinhood/models/ui/IssueDetail$Phone;", "getLoggedOutPhoneNumber", "()Ljava/lang/String;", "getClearTask", "()Z", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class ReviewCallDetailsFragmentKey implements Parcelable, FragmentKey {
    public static final Parcelable.Creator<ReviewCallDetailsFragmentKey> CREATOR = new Creator();
    private final boolean clearTask;
    private final UUID inquiryId;
    private final IssueDetail.Phone issueDetail;
    private final String loggedOutPhoneNumber;

    /* compiled from: ReviewCallDetailsFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<ReviewCallDetailsFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReviewCallDetailsFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ReviewCallDetailsFragmentKey((UUID) parcel.readSerializable(), (IssueDetail.Phone) parcel.readParcelable(ReviewCallDetailsFragmentKey.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReviewCallDetailsFragmentKey[] newArray(int i) {
            return new ReviewCallDetailsFragmentKey[i];
        }
    }

    public static /* synthetic */ ReviewCallDetailsFragmentKey copy$default(ReviewCallDetailsFragmentKey reviewCallDetailsFragmentKey, UUID uuid, IssueDetail.Phone phone, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = reviewCallDetailsFragmentKey.inquiryId;
        }
        if ((i & 2) != 0) {
            phone = reviewCallDetailsFragmentKey.issueDetail;
        }
        if ((i & 4) != 0) {
            str = reviewCallDetailsFragmentKey.loggedOutPhoneNumber;
        }
        if ((i & 8) != 0) {
            z = reviewCallDetailsFragmentKey.clearTask;
        }
        return reviewCallDetailsFragmentKey.copy(uuid, phone, str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getInquiryId() {
        return this.inquiryId;
    }

    /* renamed from: component2, reason: from getter */
    public final IssueDetail.Phone getIssueDetail() {
        return this.issueDetail;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLoggedOutPhoneNumber() {
        return this.loggedOutPhoneNumber;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getClearTask() {
        return this.clearTask;
    }

    public final ReviewCallDetailsFragmentKey copy(UUID inquiryId, IssueDetail.Phone issueDetail, String loggedOutPhoneNumber, boolean clearTask) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        return new ReviewCallDetailsFragmentKey(inquiryId, issueDetail, loggedOutPhoneNumber, clearTask);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewCallDetailsFragmentKey)) {
            return false;
        }
        ReviewCallDetailsFragmentKey reviewCallDetailsFragmentKey = (ReviewCallDetailsFragmentKey) other;
        return Intrinsics.areEqual(this.inquiryId, reviewCallDetailsFragmentKey.inquiryId) && Intrinsics.areEqual(this.issueDetail, reviewCallDetailsFragmentKey.issueDetail) && Intrinsics.areEqual(this.loggedOutPhoneNumber, reviewCallDetailsFragmentKey.loggedOutPhoneNumber) && this.clearTask == reviewCallDetailsFragmentKey.clearTask;
    }

    public int hashCode() {
        int iHashCode = this.inquiryId.hashCode() * 31;
        IssueDetail.Phone phone = this.issueDetail;
        int iHashCode2 = (iHashCode + (phone == null ? 0 : phone.hashCode())) * 31;
        String str = this.loggedOutPhoneNumber;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.clearTask);
    }

    public String toString() {
        return "ReviewCallDetailsFragmentKey(inquiryId=" + this.inquiryId + ", issueDetail=" + this.issueDetail + ", loggedOutPhoneNumber=" + this.loggedOutPhoneNumber + ", clearTask=" + this.clearTask + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.inquiryId);
        dest.writeParcelable(this.issueDetail, flags);
        dest.writeString(this.loggedOutPhoneNumber);
        dest.writeInt(this.clearTask ? 1 : 0);
    }

    public ReviewCallDetailsFragmentKey(UUID inquiryId, IssueDetail.Phone phone, String str, boolean z) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        this.inquiryId = inquiryId;
        this.issueDetail = phone;
        this.loggedOutPhoneNumber = str;
        this.clearTask = z;
    }

    public /* synthetic */ ReviewCallDetailsFragmentKey(UUID uuid, IssueDetail.Phone phone, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, phone, (i & 4) != 0 ? null : str, z);
    }

    public final UUID getInquiryId() {
        return this.inquiryId;
    }

    public final IssueDetail.Phone getIssueDetail() {
        return this.issueDetail;
    }

    public final String getLoggedOutPhoneNumber() {
        return this.loggedOutPhoneNumber;
    }

    public final boolean getClearTask() {
        return this.clearTask;
    }
}
