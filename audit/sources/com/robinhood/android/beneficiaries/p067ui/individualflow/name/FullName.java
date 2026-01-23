package com.robinhood.android.beneficiaries.p067ui.individualflow.name;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BeneficiaryCreateNameViewState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/name/FullName;", "", "firstName", "", "lastName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFirstName", "()Ljava/lang/String;", "getLastName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class FullName {
    public static final int $stable = 0;
    private final String firstName;
    private final String lastName;

    public static /* synthetic */ FullName copy$default(FullName fullName, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fullName.firstName;
        }
        if ((i & 2) != 0) {
            str2 = fullName.lastName;
        }
        return fullName.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    public final FullName copy(String firstName, String lastName) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        return new FullName(firstName, lastName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FullName)) {
            return false;
        }
        FullName fullName = (FullName) other;
        return Intrinsics.areEqual(this.firstName, fullName.firstName) && Intrinsics.areEqual(this.lastName, fullName.lastName);
    }

    public int hashCode() {
        return (this.firstName.hashCode() * 31) + this.lastName.hashCode();
    }

    public String toString() {
        return "FullName(firstName=" + this.firstName + ", lastName=" + this.lastName + ")";
    }

    public FullName(String firstName, String lastName) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }
}
