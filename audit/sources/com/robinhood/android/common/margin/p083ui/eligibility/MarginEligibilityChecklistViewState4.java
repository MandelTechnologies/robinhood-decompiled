package com.robinhood.android.common.margin.p083ui.eligibility;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginEligibilityChecklistViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/eligibility/MarginFlow;", "Landroid/os/Parcelable;", "<init>", "()V", "QuickOnboarding", "Default", "Skip2KCheck", "Lcom/robinhood/android/common/margin/ui/eligibility/MarginFlow$Default;", "Lcom/robinhood/android/common/margin/ui/eligibility/MarginFlow$QuickOnboarding;", "Lcom/robinhood/android/common/margin/ui/eligibility/MarginFlow$Skip2KCheck;", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.margin.ui.eligibility.MarginFlow, reason: use source file name */
/* loaded from: classes2.dex */
public abstract class MarginEligibilityChecklistViewState4 implements Parcelable {
    public static final int $stable = 0;

    public /* synthetic */ MarginEligibilityChecklistViewState4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private MarginEligibilityChecklistViewState4() {
    }

    /* compiled from: MarginEligibilityChecklistViewState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/eligibility/MarginFlow$QuickOnboarding;", "Lcom/robinhood/android/common/margin/ui/eligibility/MarginFlow;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.margin.ui.eligibility.MarginFlow$QuickOnboarding */
    public static final /* data */ class QuickOnboarding extends MarginEligibilityChecklistViewState4 {
        public static final int $stable = 0;
        public static final QuickOnboarding INSTANCE = new QuickOnboarding();
        public static final Parcelable.Creator<QuickOnboarding> CREATOR = new Creator();

        /* compiled from: MarginEligibilityChecklistViewState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.common.margin.ui.eligibility.MarginFlow$QuickOnboarding$Creator */
        public static final class Creator implements Parcelable.Creator<QuickOnboarding> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QuickOnboarding createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return QuickOnboarding.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QuickOnboarding[] newArray(int i) {
                return new QuickOnboarding[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof QuickOnboarding);
        }

        public int hashCode() {
            return -1346496480;
        }

        public String toString() {
            return "QuickOnboarding";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private QuickOnboarding() {
            super(null);
        }
    }

    /* compiled from: MarginEligibilityChecklistViewState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/eligibility/MarginFlow$Default;", "Lcom/robinhood/android/common/margin/ui/eligibility/MarginFlow;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.margin.ui.eligibility.MarginFlow$Default */
    public static final /* data */ class Default extends MarginEligibilityChecklistViewState4 {
        public static final int $stable = 0;
        public static final Default INSTANCE = new Default();
        public static final Parcelable.Creator<Default> CREATOR = new Creator();

        /* compiled from: MarginEligibilityChecklistViewState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.common.margin.ui.eligibility.MarginFlow$Default$Creator */
        public static final class Creator implements Parcelable.Creator<Default> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Default createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Default.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Default[] newArray(int i) {
                return new Default[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Default);
        }

        public int hashCode() {
            return -1633471879;
        }

        public String toString() {
            return "Default";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private Default() {
            super(null);
        }
    }

    /* compiled from: MarginEligibilityChecklistViewState.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/eligibility/MarginFlow$Skip2KCheck;", "Lcom/robinhood/android/common/margin/ui/eligibility/MarginFlow;", "minimumDeposit", "Lcom/robinhood/models/util/Money;", "recommendedDeposit", "<init>", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;)V", "getMinimumDeposit", "()Lcom/robinhood/models/util/Money;", "getRecommendedDeposit", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.margin.ui.eligibility.MarginFlow$Skip2KCheck, reason: from toString */
    public static final /* data */ class Skip2KCheck extends MarginEligibilityChecklistViewState4 {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Skip2KCheck> CREATOR = new Creator();
        private final Money minimumDeposit;
        private final Money recommendedDeposit;

        /* compiled from: MarginEligibilityChecklistViewState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.common.margin.ui.eligibility.MarginFlow$Skip2KCheck$Creator */
        public static final class Creator implements Parcelable.Creator<Skip2KCheck> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Skip2KCheck createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Skip2KCheck((Money) parcel.readParcelable(Skip2KCheck.class.getClassLoader()), (Money) parcel.readParcelable(Skip2KCheck.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Skip2KCheck[] newArray(int i) {
                return new Skip2KCheck[i];
            }
        }

        public static /* synthetic */ Skip2KCheck copy$default(Skip2KCheck skip2KCheck, Money money, Money money2, int i, Object obj) {
            if ((i & 1) != 0) {
                money = skip2KCheck.minimumDeposit;
            }
            if ((i & 2) != 0) {
                money2 = skip2KCheck.recommendedDeposit;
            }
            return skip2KCheck.copy(money, money2);
        }

        /* renamed from: component1, reason: from getter */
        public final Money getMinimumDeposit() {
            return this.minimumDeposit;
        }

        /* renamed from: component2, reason: from getter */
        public final Money getRecommendedDeposit() {
            return this.recommendedDeposit;
        }

        public final Skip2KCheck copy(Money minimumDeposit, Money recommendedDeposit) {
            return new Skip2KCheck(minimumDeposit, recommendedDeposit);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Skip2KCheck)) {
                return false;
            }
            Skip2KCheck skip2KCheck = (Skip2KCheck) other;
            return Intrinsics.areEqual(this.minimumDeposit, skip2KCheck.minimumDeposit) && Intrinsics.areEqual(this.recommendedDeposit, skip2KCheck.recommendedDeposit);
        }

        public int hashCode() {
            Money money = this.minimumDeposit;
            int iHashCode = (money == null ? 0 : money.hashCode()) * 31;
            Money money2 = this.recommendedDeposit;
            return iHashCode + (money2 != null ? money2.hashCode() : 0);
        }

        public String toString() {
            return "Skip2KCheck(minimumDeposit=" + this.minimumDeposit + ", recommendedDeposit=" + this.recommendedDeposit + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.minimumDeposit, flags);
            dest.writeParcelable(this.recommendedDeposit, flags);
        }

        public final Money getMinimumDeposit() {
            return this.minimumDeposit;
        }

        public final Money getRecommendedDeposit() {
            return this.recommendedDeposit;
        }

        public Skip2KCheck(Money money, Money money2) {
            super(null);
            this.minimumDeposit = money;
            this.recommendedDeposit = money2;
        }
    }
}
