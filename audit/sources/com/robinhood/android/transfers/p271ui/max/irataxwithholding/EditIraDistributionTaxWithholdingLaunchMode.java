package com.robinhood.android.transfers.p271ui.max.irataxwithholding;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.models.retirement.api.transfers.ApiIraDistributionTaxWithholding;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EditIraDistributionTaxWithholdingLaunchMode.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/irataxwithholding/EditIraDistributionTaxWithholdingLaunchMode;", "Landroid/os/Parcelable;", CreateTransferDuxo.SAVED_STATE_IRA_TAX_WITHHOLDING, "Lcom/robinhood/android/models/retirement/api/transfers/ApiIraDistributionTaxWithholding;", "getIraDistributionTaxWithholding", "()Lcom/robinhood/android/models/retirement/api/transfers/ApiIraDistributionTaxWithholding;", "Federal", "State", "Lcom/robinhood/android/transfers/ui/max/irataxwithholding/EditIraDistributionTaxWithholdingLaunchMode$Federal;", "Lcom/robinhood/android/transfers/ui/max/irataxwithholding/EditIraDistributionTaxWithholdingLaunchMode$State;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface EditIraDistributionTaxWithholdingLaunchMode extends Parcelable {
    ApiIraDistributionTaxWithholding getIraDistributionTaxWithholding();

    /* compiled from: EditIraDistributionTaxWithholdingLaunchMode.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/irataxwithholding/EditIraDistributionTaxWithholdingLaunchMode$Federal;", "Lcom/robinhood/android/transfers/ui/max/irataxwithholding/EditIraDistributionTaxWithholdingLaunchMode;", CreateTransferDuxo.SAVED_STATE_IRA_TAX_WITHHOLDING, "Lcom/robinhood/android/models/retirement/api/transfers/ApiIraDistributionTaxWithholding;", "<init>", "(Lcom/robinhood/android/models/retirement/api/transfers/ApiIraDistributionTaxWithholding;)V", "getIraDistributionTaxWithholding", "()Lcom/robinhood/android/models/retirement/api/transfers/ApiIraDistributionTaxWithholding;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Federal implements EditIraDistributionTaxWithholdingLaunchMode {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Federal> CREATOR = new Creator();
        private final ApiIraDistributionTaxWithholding iraDistributionTaxWithholding;

        /* compiled from: EditIraDistributionTaxWithholdingLaunchMode.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Federal> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Federal createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Federal((ApiIraDistributionTaxWithholding) parcel.readParcelable(Federal.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Federal[] newArray(int i) {
                return new Federal[i];
            }
        }

        public static /* synthetic */ Federal copy$default(Federal federal, ApiIraDistributionTaxWithholding apiIraDistributionTaxWithholding, int i, Object obj) {
            if ((i & 1) != 0) {
                apiIraDistributionTaxWithholding = federal.iraDistributionTaxWithholding;
            }
            return federal.copy(apiIraDistributionTaxWithholding);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiIraDistributionTaxWithholding getIraDistributionTaxWithholding() {
            return this.iraDistributionTaxWithholding;
        }

        public final Federal copy(ApiIraDistributionTaxWithholding iraDistributionTaxWithholding) {
            Intrinsics.checkNotNullParameter(iraDistributionTaxWithholding, "iraDistributionTaxWithholding");
            return new Federal(iraDistributionTaxWithholding);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Federal) && Intrinsics.areEqual(this.iraDistributionTaxWithholding, ((Federal) other).iraDistributionTaxWithholding);
        }

        public int hashCode() {
            return this.iraDistributionTaxWithholding.hashCode();
        }

        public String toString() {
            return "Federal(iraDistributionTaxWithholding=" + this.iraDistributionTaxWithholding + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.iraDistributionTaxWithholding, flags);
        }

        public Federal(ApiIraDistributionTaxWithholding iraDistributionTaxWithholding) {
            Intrinsics.checkNotNullParameter(iraDistributionTaxWithholding, "iraDistributionTaxWithholding");
            this.iraDistributionTaxWithholding = iraDistributionTaxWithholding;
        }

        @Override // com.robinhood.android.transfers.p271ui.max.irataxwithholding.EditIraDistributionTaxWithholdingLaunchMode
        public ApiIraDistributionTaxWithholding getIraDistributionTaxWithholding() {
            return this.iraDistributionTaxWithholding;
        }
    }

    /* compiled from: EditIraDistributionTaxWithholdingLaunchMode.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/irataxwithholding/EditIraDistributionTaxWithholdingLaunchMode$State;", "Lcom/robinhood/android/transfers/ui/max/irataxwithholding/EditIraDistributionTaxWithholdingLaunchMode;", CreateTransferDuxo.SAVED_STATE_IRA_TAX_WITHHOLDING, "Lcom/robinhood/android/models/retirement/api/transfers/ApiIraDistributionTaxWithholding;", "<init>", "(Lcom/robinhood/android/models/retirement/api/transfers/ApiIraDistributionTaxWithholding;)V", "getIraDistributionTaxWithholding", "()Lcom/robinhood/android/models/retirement/api/transfers/ApiIraDistributionTaxWithholding;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class State implements EditIraDistributionTaxWithholdingLaunchMode {
        public static final int $stable = 8;
        public static final Parcelable.Creator<State> CREATOR = new Creator();
        private final ApiIraDistributionTaxWithholding iraDistributionTaxWithholding;

        /* compiled from: EditIraDistributionTaxWithholdingLaunchMode.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<State> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new State((ApiIraDistributionTaxWithholding) parcel.readParcelable(State.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i) {
                return new State[i];
            }
        }

        public static /* synthetic */ State copy$default(State state, ApiIraDistributionTaxWithholding apiIraDistributionTaxWithholding, int i, Object obj) {
            if ((i & 1) != 0) {
                apiIraDistributionTaxWithholding = state.iraDistributionTaxWithholding;
            }
            return state.copy(apiIraDistributionTaxWithholding);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiIraDistributionTaxWithholding getIraDistributionTaxWithholding() {
            return this.iraDistributionTaxWithholding;
        }

        public final State copy(ApiIraDistributionTaxWithholding iraDistributionTaxWithholding) {
            Intrinsics.checkNotNullParameter(iraDistributionTaxWithholding, "iraDistributionTaxWithholding");
            return new State(iraDistributionTaxWithholding);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof State) && Intrinsics.areEqual(this.iraDistributionTaxWithholding, ((State) other).iraDistributionTaxWithholding);
        }

        public int hashCode() {
            return this.iraDistributionTaxWithholding.hashCode();
        }

        public String toString() {
            return "State(iraDistributionTaxWithholding=" + this.iraDistributionTaxWithholding + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.iraDistributionTaxWithholding, flags);
        }

        public State(ApiIraDistributionTaxWithholding iraDistributionTaxWithholding) {
            Intrinsics.checkNotNullParameter(iraDistributionTaxWithholding, "iraDistributionTaxWithholding");
            this.iraDistributionTaxWithholding = iraDistributionTaxWithholding;
        }

        @Override // com.robinhood.android.transfers.p271ui.max.irataxwithholding.EditIraDistributionTaxWithholdingLaunchMode
        public ApiIraDistributionTaxWithholding getIraDistributionTaxWithholding() {
            return this.iraDistributionTaxWithholding;
        }
    }
}
