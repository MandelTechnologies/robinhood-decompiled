package com.robinhood.android.employment.lib;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.p355ui.identi.UiEmploymentInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChooseEmploymentResult.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/employment/lib/ChooseEmploymentResult;", "Landroid/os/Parcelable;", "employment", "Lcom/robinhood/models/ui/identi/UiEmploymentInfo;", "<init>", "(Lcom/robinhood/models/ui/identi/UiEmploymentInfo;)V", "getEmployment", "()Lcom/robinhood/models/ui/identi/UiEmploymentInfo;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "feature-lib-employment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ChooseEmploymentResult implements Parcelable {
    public static final String EXTRA_EMPLOYMENT_RESULT = "employmentResult";
    private final UiEmploymentInfo employment;
    public static final Parcelable.Creator<ChooseEmploymentResult> CREATOR = new Creator();

    /* compiled from: ChooseEmploymentResult.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ChooseEmploymentResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChooseEmploymentResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChooseEmploymentResult((UiEmploymentInfo) parcel.readParcelable(ChooseEmploymentResult.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChooseEmploymentResult[] newArray(int i) {
            return new ChooseEmploymentResult[i];
        }
    }

    public static /* synthetic */ ChooseEmploymentResult copy$default(ChooseEmploymentResult chooseEmploymentResult, UiEmploymentInfo uiEmploymentInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            uiEmploymentInfo = chooseEmploymentResult.employment;
        }
        return chooseEmploymentResult.copy(uiEmploymentInfo);
    }

    /* renamed from: component1, reason: from getter */
    public final UiEmploymentInfo getEmployment() {
        return this.employment;
    }

    public final ChooseEmploymentResult copy(UiEmploymentInfo employment) {
        Intrinsics.checkNotNullParameter(employment, "employment");
        return new ChooseEmploymentResult(employment);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ChooseEmploymentResult) && Intrinsics.areEqual(this.employment, ((ChooseEmploymentResult) other).employment);
    }

    public int hashCode() {
        return this.employment.hashCode();
    }

    public String toString() {
        return "ChooseEmploymentResult(employment=" + this.employment + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.employment, flags);
    }

    public ChooseEmploymentResult(UiEmploymentInfo employment) {
        Intrinsics.checkNotNullParameter(employment, "employment");
        this.employment = employment;
    }

    public final UiEmploymentInfo getEmployment() {
        return this.employment;
    }
}
