package com.robinhood.android.transfers.p271ui.max.irataxwithholding;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EditIraDistributionTaxWithholdingResult.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/irataxwithholding/EditIraDistributionTaxWithholdingResult;", "Landroid/os/Parcelable;", "federalWithholdingPercent", "Ljava/math/BigDecimal;", "stateWithholdingPercent", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getFederalWithholdingPercent", "()Ljava/math/BigDecimal;", "getStateWithholdingPercent", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class EditIraDistributionTaxWithholdingResult implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<EditIraDistributionTaxWithholdingResult> CREATOR = new Creator();
    private final BigDecimal federalWithholdingPercent;
    private final BigDecimal stateWithholdingPercent;

    /* compiled from: EditIraDistributionTaxWithholdingResult.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<EditIraDistributionTaxWithholdingResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EditIraDistributionTaxWithholdingResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EditIraDistributionTaxWithholdingResult((BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EditIraDistributionTaxWithholdingResult[] newArray(int i) {
            return new EditIraDistributionTaxWithholdingResult[i];
        }
    }

    public static /* synthetic */ EditIraDistributionTaxWithholdingResult copy$default(EditIraDistributionTaxWithholdingResult editIraDistributionTaxWithholdingResult, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = editIraDistributionTaxWithholdingResult.federalWithholdingPercent;
        }
        if ((i & 2) != 0) {
            bigDecimal2 = editIraDistributionTaxWithholdingResult.stateWithholdingPercent;
        }
        return editIraDistributionTaxWithholdingResult.copy(bigDecimal, bigDecimal2);
    }

    /* renamed from: component1, reason: from getter */
    public final BigDecimal getFederalWithholdingPercent() {
        return this.federalWithholdingPercent;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getStateWithholdingPercent() {
        return this.stateWithholdingPercent;
    }

    public final EditIraDistributionTaxWithholdingResult copy(BigDecimal federalWithholdingPercent, BigDecimal stateWithholdingPercent) {
        Intrinsics.checkNotNullParameter(federalWithholdingPercent, "federalWithholdingPercent");
        Intrinsics.checkNotNullParameter(stateWithholdingPercent, "stateWithholdingPercent");
        return new EditIraDistributionTaxWithholdingResult(federalWithholdingPercent, stateWithholdingPercent);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EditIraDistributionTaxWithholdingResult)) {
            return false;
        }
        EditIraDistributionTaxWithholdingResult editIraDistributionTaxWithholdingResult = (EditIraDistributionTaxWithholdingResult) other;
        return Intrinsics.areEqual(this.federalWithholdingPercent, editIraDistributionTaxWithholdingResult.federalWithholdingPercent) && Intrinsics.areEqual(this.stateWithholdingPercent, editIraDistributionTaxWithholdingResult.stateWithholdingPercent);
    }

    public int hashCode() {
        return (this.federalWithholdingPercent.hashCode() * 31) + this.stateWithholdingPercent.hashCode();
    }

    public String toString() {
        return "EditIraDistributionTaxWithholdingResult(federalWithholdingPercent=" + this.federalWithholdingPercent + ", stateWithholdingPercent=" + this.stateWithholdingPercent + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.federalWithholdingPercent);
        dest.writeSerializable(this.stateWithholdingPercent);
    }

    public EditIraDistributionTaxWithholdingResult(BigDecimal federalWithholdingPercent, BigDecimal stateWithholdingPercent) {
        Intrinsics.checkNotNullParameter(federalWithholdingPercent, "federalWithholdingPercent");
        Intrinsics.checkNotNullParameter(stateWithholdingPercent, "stateWithholdingPercent");
        this.federalWithholdingPercent = federalWithholdingPercent;
        this.stateWithholdingPercent = stateWithholdingPercent;
    }

    public final BigDecimal getFederalWithholdingPercent() {
        return this.federalWithholdingPercent;
    }

    public final BigDecimal getStateWithholdingPercent() {
        return this.stateWithholdingPercent;
    }
}
