package com.robinhood.android.investFlow.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestFlowPaymentMethod.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/investFlow/core/InvestFlowPaymentMethod;", "Landroid/os/Parcelable;", "sourceOfFunds", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;", "<init>", "(Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;)V", "getSourceOfFunds", "()Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;", "BuyingPower", "Ach", "Lcom/robinhood/android/investFlow/core/InvestFlowPaymentMethod$Ach;", "Lcom/robinhood/android/investFlow/core/InvestFlowPaymentMethod$BuyingPower;", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public abstract class InvestFlowPaymentMethod implements Parcelable {
    public static final int $stable = 0;
    private final ApiInvestmentSchedule.SourceOfFunds sourceOfFunds;

    public /* synthetic */ InvestFlowPaymentMethod(ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, DefaultConstructorMarker defaultConstructorMarker) {
        this(sourceOfFunds);
    }

    private InvestFlowPaymentMethod(ApiInvestmentSchedule.SourceOfFunds sourceOfFunds) {
        this.sourceOfFunds = sourceOfFunds;
    }

    public ApiInvestmentSchedule.SourceOfFunds getSourceOfFunds() {
        return this.sourceOfFunds;
    }

    /* compiled from: InvestFlowPaymentMethod.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/investFlow/core/InvestFlowPaymentMethod$BuyingPower;", "Lcom/robinhood/android/investFlow/core/InvestFlowPaymentMethod;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class BuyingPower extends InvestFlowPaymentMethod {
        public static final int $stable = 0;
        public static final BuyingPower INSTANCE = new BuyingPower();
        public static final Parcelable.Creator<BuyingPower> CREATOR = new Creator();

        /* compiled from: InvestFlowPaymentMethod.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<BuyingPower> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BuyingPower createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BuyingPower.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BuyingPower[] newArray(int i) {
                return new BuyingPower[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private BuyingPower() {
            super(ApiInvestmentSchedule.SourceOfFunds.BUYING_POWER, null);
        }
    }

    /* compiled from: InvestFlowPaymentMethod.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/investFlow/core/InvestFlowPaymentMethod$Ach;", "Lcom/robinhood/android/investFlow/core/InvestFlowPaymentMethod;", "achRelationship", "Lcom/robinhood/models/db/AchRelationship;", "<init>", "(Lcom/robinhood/models/db/AchRelationship;)V", "getAchRelationship", "()Lcom/robinhood/models/db/AchRelationship;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Ach extends InvestFlowPaymentMethod {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Ach> CREATOR = new Creator();
        private final AchRelationship achRelationship;

        /* compiled from: InvestFlowPaymentMethod.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Ach> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Ach createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Ach((AchRelationship) parcel.readParcelable(Ach.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Ach[] newArray(int i) {
                return new Ach[i];
            }
        }

        public static /* synthetic */ Ach copy$default(Ach ach, AchRelationship achRelationship, int i, Object obj) {
            if ((i & 1) != 0) {
                achRelationship = ach.achRelationship;
            }
            return ach.copy(achRelationship);
        }

        /* renamed from: component1, reason: from getter */
        public final AchRelationship getAchRelationship() {
            return this.achRelationship;
        }

        public final Ach copy(AchRelationship achRelationship) {
            Intrinsics.checkNotNullParameter(achRelationship, "achRelationship");
            return new Ach(achRelationship);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Ach) && Intrinsics.areEqual(this.achRelationship, ((Ach) other).achRelationship);
        }

        public int hashCode() {
            return this.achRelationship.hashCode();
        }

        public String toString() {
            return "Ach(achRelationship=" + this.achRelationship + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.achRelationship, flags);
        }

        public final AchRelationship getAchRelationship() {
            return this.achRelationship;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ach(AchRelationship achRelationship) {
            super(ApiInvestmentSchedule.SourceOfFunds.ACH_RELATIONSHIP, null);
            Intrinsics.checkNotNullParameter(achRelationship, "achRelationship");
            this.achRelationship = achRelationship;
        }
    }
}
