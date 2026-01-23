package com.robinhood.android.beneficiaries.p067ui.individualflow.name;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BeneficiaryCreateNameViewState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/name/BeneficiaryCreateNameDataState;", "", "firstName", "", "lastName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFirstName", "()Ljava/lang/String;", "getLastName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BeneficiaryCreateNameDataState {
    public static final int $stable = 0;
    private final String firstName;
    private final String lastName;

    /* JADX WARN: Multi-variable type inference failed */
    public BeneficiaryCreateNameDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BeneficiaryCreateNameDataState copy$default(BeneficiaryCreateNameDataState beneficiaryCreateNameDataState, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = beneficiaryCreateNameDataState.firstName;
        }
        if ((i & 2) != 0) {
            str2 = beneficiaryCreateNameDataState.lastName;
        }
        return beneficiaryCreateNameDataState.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    public final BeneficiaryCreateNameDataState copy(String firstName, String lastName) {
        return new BeneficiaryCreateNameDataState(firstName, lastName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeneficiaryCreateNameDataState)) {
            return false;
        }
        BeneficiaryCreateNameDataState beneficiaryCreateNameDataState = (BeneficiaryCreateNameDataState) other;
        return Intrinsics.areEqual(this.firstName, beneficiaryCreateNameDataState.firstName) && Intrinsics.areEqual(this.lastName, beneficiaryCreateNameDataState.lastName);
    }

    public int hashCode() {
        String str = this.firstName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lastName;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "BeneficiaryCreateNameDataState(firstName=" + this.firstName + ", lastName=" + this.lastName + ")";
    }

    public BeneficiaryCreateNameDataState(String str, String str2) {
        this.firstName = str;
        this.lastName = str2;
    }

    public /* synthetic */ BeneficiaryCreateNameDataState(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }
}
