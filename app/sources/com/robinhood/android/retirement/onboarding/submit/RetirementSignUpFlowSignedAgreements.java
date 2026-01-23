package com.robinhood.android.retirement.onboarding.submit;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.models.retirement.api.ApiRetirementOnboardingAgreement;
import com.robinhood.android.retirement.onboarding.agreements.SlipCheckboxState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementSignUpFlowSignedAgreements.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSignedAgreements;", "Landroid/os/Parcelable;", "accountAgreement", "Lcom/robinhood/android/models/retirement/api/ApiRetirementOnboardingAgreement;", "slipCheckboxStates", "", "Lcom/robinhood/android/retirement/onboarding/agreements/SlipCheckboxState;", "slipLendingAgreement", "slipCustodianAgreement", "<init>", "(Lcom/robinhood/android/models/retirement/api/ApiRetirementOnboardingAgreement;Ljava/util/List;Lcom/robinhood/android/models/retirement/api/ApiRetirementOnboardingAgreement;Lcom/robinhood/android/models/retirement/api/ApiRetirementOnboardingAgreement;)V", "getAccountAgreement", "()Lcom/robinhood/android/models/retirement/api/ApiRetirementOnboardingAgreement;", "getSlipCheckboxStates", "()Ljava/util/List;", "getSlipLendingAgreement", "getSlipCustodianAgreement", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RetirementSignUpFlowSignedAgreements implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<RetirementSignUpFlowSignedAgreements> CREATOR = new Creator();
    private final ApiRetirementOnboardingAgreement accountAgreement;
    private final List<SlipCheckboxState> slipCheckboxStates;
    private final ApiRetirementOnboardingAgreement slipCustodianAgreement;
    private final ApiRetirementOnboardingAgreement slipLendingAgreement;

    /* compiled from: RetirementSignUpFlowSignedAgreements.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<RetirementSignUpFlowSignedAgreements> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RetirementSignUpFlowSignedAgreements createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ApiRetirementOnboardingAgreement apiRetirementOnboardingAgreement = (ApiRetirementOnboardingAgreement) parcel.readParcelable(RetirementSignUpFlowSignedAgreements.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(SlipCheckboxState.CREATOR.createFromParcel(parcel));
            }
            return new RetirementSignUpFlowSignedAgreements(apiRetirementOnboardingAgreement, arrayList, (ApiRetirementOnboardingAgreement) parcel.readParcelable(RetirementSignUpFlowSignedAgreements.class.getClassLoader()), (ApiRetirementOnboardingAgreement) parcel.readParcelable(RetirementSignUpFlowSignedAgreements.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RetirementSignUpFlowSignedAgreements[] newArray(int i) {
            return new RetirementSignUpFlowSignedAgreements[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RetirementSignUpFlowSignedAgreements copy$default(RetirementSignUpFlowSignedAgreements retirementSignUpFlowSignedAgreements, ApiRetirementOnboardingAgreement apiRetirementOnboardingAgreement, List list, ApiRetirementOnboardingAgreement apiRetirementOnboardingAgreement2, ApiRetirementOnboardingAgreement apiRetirementOnboardingAgreement3, int i, Object obj) {
        if ((i & 1) != 0) {
            apiRetirementOnboardingAgreement = retirementSignUpFlowSignedAgreements.accountAgreement;
        }
        if ((i & 2) != 0) {
            list = retirementSignUpFlowSignedAgreements.slipCheckboxStates;
        }
        if ((i & 4) != 0) {
            apiRetirementOnboardingAgreement2 = retirementSignUpFlowSignedAgreements.slipLendingAgreement;
        }
        if ((i & 8) != 0) {
            apiRetirementOnboardingAgreement3 = retirementSignUpFlowSignedAgreements.slipCustodianAgreement;
        }
        return retirementSignUpFlowSignedAgreements.copy(apiRetirementOnboardingAgreement, list, apiRetirementOnboardingAgreement2, apiRetirementOnboardingAgreement3);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiRetirementOnboardingAgreement getAccountAgreement() {
        return this.accountAgreement;
    }

    public final List<SlipCheckboxState> component2() {
        return this.slipCheckboxStates;
    }

    /* renamed from: component3, reason: from getter */
    public final ApiRetirementOnboardingAgreement getSlipLendingAgreement() {
        return this.slipLendingAgreement;
    }

    /* renamed from: component4, reason: from getter */
    public final ApiRetirementOnboardingAgreement getSlipCustodianAgreement() {
        return this.slipCustodianAgreement;
    }

    public final RetirementSignUpFlowSignedAgreements copy(ApiRetirementOnboardingAgreement accountAgreement, List<SlipCheckboxState> slipCheckboxStates, ApiRetirementOnboardingAgreement slipLendingAgreement, ApiRetirementOnboardingAgreement slipCustodianAgreement) {
        Intrinsics.checkNotNullParameter(accountAgreement, "accountAgreement");
        Intrinsics.checkNotNullParameter(slipCheckboxStates, "slipCheckboxStates");
        return new RetirementSignUpFlowSignedAgreements(accountAgreement, slipCheckboxStates, slipLendingAgreement, slipCustodianAgreement);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RetirementSignUpFlowSignedAgreements)) {
            return false;
        }
        RetirementSignUpFlowSignedAgreements retirementSignUpFlowSignedAgreements = (RetirementSignUpFlowSignedAgreements) other;
        return Intrinsics.areEqual(this.accountAgreement, retirementSignUpFlowSignedAgreements.accountAgreement) && Intrinsics.areEqual(this.slipCheckboxStates, retirementSignUpFlowSignedAgreements.slipCheckboxStates) && Intrinsics.areEqual(this.slipLendingAgreement, retirementSignUpFlowSignedAgreements.slipLendingAgreement) && Intrinsics.areEqual(this.slipCustodianAgreement, retirementSignUpFlowSignedAgreements.slipCustodianAgreement);
    }

    public int hashCode() {
        int iHashCode = ((this.accountAgreement.hashCode() * 31) + this.slipCheckboxStates.hashCode()) * 31;
        ApiRetirementOnboardingAgreement apiRetirementOnboardingAgreement = this.slipLendingAgreement;
        int iHashCode2 = (iHashCode + (apiRetirementOnboardingAgreement == null ? 0 : apiRetirementOnboardingAgreement.hashCode())) * 31;
        ApiRetirementOnboardingAgreement apiRetirementOnboardingAgreement2 = this.slipCustodianAgreement;
        return iHashCode2 + (apiRetirementOnboardingAgreement2 != null ? apiRetirementOnboardingAgreement2.hashCode() : 0);
    }

    public String toString() {
        return "RetirementSignUpFlowSignedAgreements(accountAgreement=" + this.accountAgreement + ", slipCheckboxStates=" + this.slipCheckboxStates + ", slipLendingAgreement=" + this.slipLendingAgreement + ", slipCustodianAgreement=" + this.slipCustodianAgreement + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.accountAgreement, flags);
        List<SlipCheckboxState> list = this.slipCheckboxStates;
        dest.writeInt(list.size());
        Iterator<SlipCheckboxState> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        dest.writeParcelable(this.slipLendingAgreement, flags);
        dest.writeParcelable(this.slipCustodianAgreement, flags);
    }

    public RetirementSignUpFlowSignedAgreements(ApiRetirementOnboardingAgreement accountAgreement, List<SlipCheckboxState> slipCheckboxStates, ApiRetirementOnboardingAgreement apiRetirementOnboardingAgreement, ApiRetirementOnboardingAgreement apiRetirementOnboardingAgreement2) {
        Intrinsics.checkNotNullParameter(accountAgreement, "accountAgreement");
        Intrinsics.checkNotNullParameter(slipCheckboxStates, "slipCheckboxStates");
        this.accountAgreement = accountAgreement;
        this.slipCheckboxStates = slipCheckboxStates;
        this.slipLendingAgreement = apiRetirementOnboardingAgreement;
        this.slipCustodianAgreement = apiRetirementOnboardingAgreement2;
    }

    public final ApiRetirementOnboardingAgreement getAccountAgreement() {
        return this.accountAgreement;
    }

    public final List<SlipCheckboxState> getSlipCheckboxStates() {
        return this.slipCheckboxStates;
    }

    public final ApiRetirementOnboardingAgreement getSlipLendingAgreement() {
        return this.slipLendingAgreement;
    }

    public final ApiRetirementOnboardingAgreement getSlipCustodianAgreement() {
        return this.slipCustodianAgreement;
    }
}
