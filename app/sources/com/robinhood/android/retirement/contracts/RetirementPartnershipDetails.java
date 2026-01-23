package com.robinhood.android.retirement.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.models.retirement.api.onboarding.RetirementOnboardingIntro;
import com.robinhood.android.models.retirement.api.partnerships.ApiRetirementPartnershipDetailResponse;
import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementFragmentKeys.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0019R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/retirement/contracts/RetirementPartnershipDetails;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "source", "", "isFromRetirementOnboarding", "", "partnershipDetailsViewModel", "Lcom/robinhood/android/models/retirement/api/partnerships/ApiRetirementPartnershipDetailResponse$PartnershipDetailViewModel;", "nextOnboardingStep", "Lcom/robinhood/android/models/retirement/api/onboarding/RetirementOnboardingIntro;", "<init>", "(Ljava/lang/String;ZLcom/robinhood/android/models/retirement/api/partnerships/ApiRetirementPartnershipDetailResponse$PartnershipDetailViewModel;Lcom/robinhood/android/models/retirement/api/onboarding/RetirementOnboardingIntro;)V", "getSource", "()Ljava/lang/String;", "()Z", "getPartnershipDetailsViewModel", "()Lcom/robinhood/android/models/retirement/api/partnerships/ApiRetirementPartnershipDetailResponse$PartnershipDetailViewModel;", "getNextOnboardingStep", "()Lcom/robinhood/android/models/retirement/api/onboarding/RetirementOnboardingIntro;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class RetirementPartnershipDetails implements FragmentKey {
    public static final Parcelable.Creator<RetirementPartnershipDetails> CREATOR = new Creator();
    private final boolean isFromRetirementOnboarding;
    private final RetirementOnboardingIntro nextOnboardingStep;
    private final ApiRetirementPartnershipDetailResponse.PartnershipDetailViewModel partnershipDetailsViewModel;
    private final String source;

    /* compiled from: RetirementFragmentKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes5.dex */
    public static final class Creator implements Parcelable.Creator<RetirementPartnershipDetails> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RetirementPartnershipDetails createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RetirementPartnershipDetails(parcel.readString(), parcel.readInt() != 0, (ApiRetirementPartnershipDetailResponse.PartnershipDetailViewModel) parcel.readParcelable(RetirementPartnershipDetails.class.getClassLoader()), (RetirementOnboardingIntro) parcel.readParcelable(RetirementPartnershipDetails.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RetirementPartnershipDetails[] newArray(int i) {
            return new RetirementPartnershipDetails[i];
        }
    }

    public static /* synthetic */ RetirementPartnershipDetails copy$default(RetirementPartnershipDetails retirementPartnershipDetails, String str, boolean z, ApiRetirementPartnershipDetailResponse.PartnershipDetailViewModel partnershipDetailViewModel, RetirementOnboardingIntro retirementOnboardingIntro, int i, Object obj) {
        if ((i & 1) != 0) {
            str = retirementPartnershipDetails.source;
        }
        if ((i & 2) != 0) {
            z = retirementPartnershipDetails.isFromRetirementOnboarding;
        }
        if ((i & 4) != 0) {
            partnershipDetailViewModel = retirementPartnershipDetails.partnershipDetailsViewModel;
        }
        if ((i & 8) != 0) {
            retirementOnboardingIntro = retirementPartnershipDetails.nextOnboardingStep;
        }
        return retirementPartnershipDetails.copy(str, z, partnershipDetailViewModel, retirementOnboardingIntro);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsFromRetirementOnboarding() {
        return this.isFromRetirementOnboarding;
    }

    /* renamed from: component3, reason: from getter */
    public final ApiRetirementPartnershipDetailResponse.PartnershipDetailViewModel getPartnershipDetailsViewModel() {
        return this.partnershipDetailsViewModel;
    }

    /* renamed from: component4, reason: from getter */
    public final RetirementOnboardingIntro getNextOnboardingStep() {
        return this.nextOnboardingStep;
    }

    public final RetirementPartnershipDetails copy(String source, boolean isFromRetirementOnboarding, ApiRetirementPartnershipDetailResponse.PartnershipDetailViewModel partnershipDetailsViewModel, RetirementOnboardingIntro nextOnboardingStep) {
        return new RetirementPartnershipDetails(source, isFromRetirementOnboarding, partnershipDetailsViewModel, nextOnboardingStep);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RetirementPartnershipDetails)) {
            return false;
        }
        RetirementPartnershipDetails retirementPartnershipDetails = (RetirementPartnershipDetails) other;
        return Intrinsics.areEqual(this.source, retirementPartnershipDetails.source) && this.isFromRetirementOnboarding == retirementPartnershipDetails.isFromRetirementOnboarding && Intrinsics.areEqual(this.partnershipDetailsViewModel, retirementPartnershipDetails.partnershipDetailsViewModel) && Intrinsics.areEqual(this.nextOnboardingStep, retirementPartnershipDetails.nextOnboardingStep);
    }

    public int hashCode() {
        String str = this.source;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.isFromRetirementOnboarding)) * 31;
        ApiRetirementPartnershipDetailResponse.PartnershipDetailViewModel partnershipDetailViewModel = this.partnershipDetailsViewModel;
        int iHashCode2 = (iHashCode + (partnershipDetailViewModel == null ? 0 : partnershipDetailViewModel.hashCode())) * 31;
        RetirementOnboardingIntro retirementOnboardingIntro = this.nextOnboardingStep;
        return iHashCode2 + (retirementOnboardingIntro != null ? retirementOnboardingIntro.hashCode() : 0);
    }

    public String toString() {
        return "RetirementPartnershipDetails(source=" + this.source + ", isFromRetirementOnboarding=" + this.isFromRetirementOnboarding + ", partnershipDetailsViewModel=" + this.partnershipDetailsViewModel + ", nextOnboardingStep=" + this.nextOnboardingStep + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.source);
        dest.writeInt(this.isFromRetirementOnboarding ? 1 : 0);
        dest.writeParcelable(this.partnershipDetailsViewModel, flags);
        dest.writeParcelable(this.nextOnboardingStep, flags);
    }

    public RetirementPartnershipDetails(String str, boolean z, ApiRetirementPartnershipDetailResponse.PartnershipDetailViewModel partnershipDetailViewModel, RetirementOnboardingIntro retirementOnboardingIntro) {
        this.source = str;
        this.isFromRetirementOnboarding = z;
        this.partnershipDetailsViewModel = partnershipDetailViewModel;
        this.nextOnboardingStep = retirementOnboardingIntro;
    }

    public /* synthetic */ RetirementPartnershipDetails(String str, boolean z, ApiRetirementPartnershipDetailResponse.PartnershipDetailViewModel partnershipDetailViewModel, RetirementOnboardingIntro retirementOnboardingIntro, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : partnershipDetailViewModel, (i & 8) != 0 ? null : retirementOnboardingIntro);
    }

    public final String getSource() {
        return this.source;
    }

    public final boolean isFromRetirementOnboarding() {
        return this.isFromRetirementOnboarding;
    }

    public final ApiRetirementPartnershipDetailResponse.PartnershipDetailViewModel getPartnershipDetailsViewModel() {
        return this.partnershipDetailsViewModel;
    }

    public final RetirementOnboardingIntro getNextOnboardingStep() {
        return this.nextOnboardingStep;
    }
}
