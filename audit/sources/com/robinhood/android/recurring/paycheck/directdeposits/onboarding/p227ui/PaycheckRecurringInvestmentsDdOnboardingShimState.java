package com.robinhood.android.recurring.paycheck.directdeposits.onboarding.p227ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.recurring.models.RecurringInvestmentCategory;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaycheckRecurringInvestmentsDdOnboardingShimState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/PaycheckRecurringInvestmentsDdOnboardingShimState;", "", "<init>", "()V", "Loading", "Loaded", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/PaycheckRecurringInvestmentsDdOnboardingShimState$Loaded;", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/PaycheckRecurringInvestmentsDdOnboardingShimState$Loading;", "feature-recurring-paycheck-dd-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public abstract class PaycheckRecurringInvestmentsDdOnboardingShimState {
    public static final int $stable = 0;

    public /* synthetic */ PaycheckRecurringInvestmentsDdOnboardingShimState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PaycheckRecurringInvestmentsDdOnboardingShimState() {
    }

    /* compiled from: PaycheckRecurringInvestmentsDdOnboardingShimState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/PaycheckRecurringInvestmentsDdOnboardingShimState$Loading;", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/PaycheckRecurringInvestmentsDdOnboardingShimState;", "<init>", "()V", "feature-recurring-paycheck-dd-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading extends PaycheckRecurringInvestmentsDdOnboardingShimState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    /* compiled from: PaycheckRecurringInvestmentsDdOnboardingShimState.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BK\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eBU\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u0010J\t\u0010-\u001a\u00020\u0004HÆ\u0003J\t\u0010.\u001a\u00020\u0004HÆ\u0003J\t\u0010/\u001a\u00020\u0004HÆ\u0003J\t\u00100\u001a\u00020\u0004HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u00103\u001a\u00020\u0004HÆ\u0003J\t\u00104\u001a\u00020\u0004HÆ\u0003J]\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0004HÆ\u0001J\u0006\u00106\u001a\u000207J\u0013\u00108\u001a\u00020\u00042\b\u00109\u001a\u0004\u0018\u00010:HÖ\u0003J\t\u0010;\u001a\u000207HÖ\u0001J\t\u0010<\u001a\u00020\tHÖ\u0001J\u0016\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u000207R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0011\u0010\u001b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0012R\u0011\u0010\u001d\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0012R\u0011\u0010\u001f\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b \u0010\u0012R\u0011\u0010!\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0012R\u0013\u0010#\u001a\u0004\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0012R\u0016\u0010)\u001a\u0004\u0018\u00010$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010&R\u0014\u0010+\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0012¨\u0006B"}, m3636d2 = {"Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/PaycheckRecurringInvestmentsDdOnboardingShimState$Loaded;", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/PaycheckRecurringInvestmentsDdOnboardingShimState;", "Landroid/os/Parcelable;", "hasDirectDepositRelationships", "", "hasBrokerageAccount", "sweepEnabled", "sweepEligible", "rothIraAccountNumber", "", "traditionalIraAccountNumber", "retirementOnly", "canSkipCategorySelection", "<init>", "(ZZZZLjava/lang/String;Ljava/lang/String;ZZ)V", "Lcom/robinhood/utils/Optional;", "(ZZZZLcom/robinhood/utils/Optional;Lcom/robinhood/utils/Optional;ZZ)V", "getHasDirectDepositRelationships", "()Z", "getHasBrokerageAccount", "getSweepEnabled", "getSweepEligible", "getRothIraAccountNumber", "()Ljava/lang/String;", "getTraditionalIraAccountNumber", "getRetirementOnly", "getCanSkipCategorySelection", "brokerageCashOptionEnabled", "getBrokerageCashOptionEnabled", "investmentOptionEnabled", "getInvestmentOptionEnabled", "retirementCashOptionEnabled", "getRetirementCashOptionEnabled", "shouldShowBrokerageAccountRequiredDialog", "getShouldShowBrokerageAccountRequiredDialog", "retirementSkipSelectedCategory", "Lcom/robinhood/recurring/models/RecurringInvestmentCategory;", "getRetirementSkipSelectedCategory", "()Lcom/robinhood/recurring/models/RecurringInvestmentCategory;", "onlyOneRetirementAccount", "getOnlyOneRetirementAccount", "singleRetirementAccountAssetCategory", "getSingleRetirementAccountAssetCategory", "showOnlyRetirement", "getShowOnlyRetirement", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-recurring-paycheck-dd-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded extends PaycheckRecurringInvestmentsDdOnboardingShimState implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Loaded> CREATOR = new Creator();
        private final boolean canSkipCategorySelection;
        private final boolean hasBrokerageAccount;
        private final boolean hasDirectDepositRelationships;
        private final boolean retirementOnly;
        private final String rothIraAccountNumber;
        private final boolean sweepEligible;
        private final boolean sweepEnabled;
        private final String traditionalIraAccountNumber;

        /* compiled from: PaycheckRecurringInvestmentsDdOnboardingShimState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Loaded> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Loaded createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                boolean z5;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z6 = false;
                boolean z7 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z6 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z7 = z;
                }
                if (parcel.readInt() != 0) {
                    z3 = z2;
                } else {
                    z3 = z2;
                    z2 = z;
                }
                if (parcel.readInt() != 0) {
                    z4 = z3;
                } else {
                    z4 = z3;
                    z3 = z;
                }
                String string2 = parcel.readString();
                boolean z8 = z4;
                String string3 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z5 = z8;
                } else {
                    z5 = z8;
                    z8 = z;
                }
                if (parcel.readInt() == 0) {
                    z5 = z;
                }
                return new Loaded(z6, z7, z2, z3, string2, string3, z8, z5);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Loaded[] newArray(int i) {
                return new Loaded[i];
            }
        }

        public static /* synthetic */ Loaded copy$default(Loaded loaded, boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, boolean z5, boolean z6, int i, Object obj) {
            if ((i & 1) != 0) {
                z = loaded.hasDirectDepositRelationships;
            }
            if ((i & 2) != 0) {
                z2 = loaded.hasBrokerageAccount;
            }
            if ((i & 4) != 0) {
                z3 = loaded.sweepEnabled;
            }
            if ((i & 8) != 0) {
                z4 = loaded.sweepEligible;
            }
            if ((i & 16) != 0) {
                str = loaded.rothIraAccountNumber;
            }
            if ((i & 32) != 0) {
                str2 = loaded.traditionalIraAccountNumber;
            }
            if ((i & 64) != 0) {
                z5 = loaded.retirementOnly;
            }
            if ((i & 128) != 0) {
                z6 = loaded.canSkipCategorySelection;
            }
            boolean z7 = z5;
            boolean z8 = z6;
            String str3 = str;
            String str4 = str2;
            return loaded.copy(z, z2, z3, z4, str3, str4, z7, z8);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getHasDirectDepositRelationships() {
            return this.hasDirectDepositRelationships;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getHasBrokerageAccount() {
            return this.hasBrokerageAccount;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getSweepEnabled() {
            return this.sweepEnabled;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getSweepEligible() {
            return this.sweepEligible;
        }

        /* renamed from: component5, reason: from getter */
        public final String getRothIraAccountNumber() {
            return this.rothIraAccountNumber;
        }

        /* renamed from: component6, reason: from getter */
        public final String getTraditionalIraAccountNumber() {
            return this.traditionalIraAccountNumber;
        }

        public final boolean component7() {
            return this.retirementOnly;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getCanSkipCategorySelection() {
            return this.canSkipCategorySelection;
        }

        public final Loaded copy(boolean hasDirectDepositRelationships, boolean hasBrokerageAccount, boolean sweepEnabled, boolean sweepEligible, String rothIraAccountNumber, String traditionalIraAccountNumber, boolean retirementOnly, boolean canSkipCategorySelection) {
            return new Loaded(hasDirectDepositRelationships, hasBrokerageAccount, sweepEnabled, sweepEligible, rothIraAccountNumber, traditionalIraAccountNumber, retirementOnly, canSkipCategorySelection);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return this.hasDirectDepositRelationships == loaded.hasDirectDepositRelationships && this.hasBrokerageAccount == loaded.hasBrokerageAccount && this.sweepEnabled == loaded.sweepEnabled && this.sweepEligible == loaded.sweepEligible && Intrinsics.areEqual(this.rothIraAccountNumber, loaded.rothIraAccountNumber) && Intrinsics.areEqual(this.traditionalIraAccountNumber, loaded.traditionalIraAccountNumber) && this.retirementOnly == loaded.retirementOnly && this.canSkipCategorySelection == loaded.canSkipCategorySelection;
        }

        public final boolean getRetirementCashOptionEnabled() {
            return true;
        }

        public int hashCode() {
            int iHashCode = ((((((Boolean.hashCode(this.hasDirectDepositRelationships) * 31) + Boolean.hashCode(this.hasBrokerageAccount)) * 31) + Boolean.hashCode(this.sweepEnabled)) * 31) + Boolean.hashCode(this.sweepEligible)) * 31;
            String str = this.rothIraAccountNumber;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.traditionalIraAccountNumber;
            return ((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.retirementOnly)) * 31) + Boolean.hashCode(this.canSkipCategorySelection);
        }

        public String toString() {
            return "Loaded(hasDirectDepositRelationships=" + this.hasDirectDepositRelationships + ", hasBrokerageAccount=" + this.hasBrokerageAccount + ", sweepEnabled=" + this.sweepEnabled + ", sweepEligible=" + this.sweepEligible + ", rothIraAccountNumber=" + this.rothIraAccountNumber + ", traditionalIraAccountNumber=" + this.traditionalIraAccountNumber + ", retirementOnly=" + this.retirementOnly + ", canSkipCategorySelection=" + this.canSkipCategorySelection + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.hasDirectDepositRelationships ? 1 : 0);
            dest.writeInt(this.hasBrokerageAccount ? 1 : 0);
            dest.writeInt(this.sweepEnabled ? 1 : 0);
            dest.writeInt(this.sweepEligible ? 1 : 0);
            dest.writeString(this.rothIraAccountNumber);
            dest.writeString(this.traditionalIraAccountNumber);
            dest.writeInt(this.retirementOnly ? 1 : 0);
            dest.writeInt(this.canSkipCategorySelection ? 1 : 0);
        }

        public final boolean getHasDirectDepositRelationships() {
            return this.hasDirectDepositRelationships;
        }

        public final boolean getHasBrokerageAccount() {
            return this.hasBrokerageAccount;
        }

        public final boolean getSweepEnabled() {
            return this.sweepEnabled;
        }

        public final boolean getSweepEligible() {
            return this.sweepEligible;
        }

        public final String getRothIraAccountNumber() {
            return this.rothIraAccountNumber;
        }

        public final String getTraditionalIraAccountNumber() {
            return this.traditionalIraAccountNumber;
        }

        public final boolean getRetirementOnly() {
            return this.retirementOnly;
        }

        public final boolean getCanSkipCategorySelection() {
            return this.canSkipCategorySelection;
        }

        public Loaded(boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, boolean z5, boolean z6) {
            super(null);
            this.hasDirectDepositRelationships = z;
            this.hasBrokerageAccount = z2;
            this.sweepEnabled = z3;
            this.sweepEligible = z4;
            this.rothIraAccountNumber = str;
            this.traditionalIraAccountNumber = str2;
            this.retirementOnly = z5;
            this.canSkipCategorySelection = z6;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Loaded(boolean z, boolean z2, boolean z3, boolean z4, Optional<String> rothIraAccountNumber, Optional<String> traditionalIraAccountNumber, boolean z5, boolean z6) {
            this(z, z2, z3, z4, rothIraAccountNumber.getOrNull(), traditionalIraAccountNumber.getOrNull(), z5, z6);
            Intrinsics.checkNotNullParameter(rothIraAccountNumber, "rothIraAccountNumber");
            Intrinsics.checkNotNullParameter(traditionalIraAccountNumber, "traditionalIraAccountNumber");
        }

        public final boolean getBrokerageCashOptionEnabled() {
            return !getRetirementOnly() && this.hasBrokerageAccount;
        }

        public final boolean getInvestmentOptionEnabled() {
            return !getRetirementOnly() && this.hasBrokerageAccount;
        }

        public final boolean getShouldShowBrokerageAccountRequiredDialog() {
            return (getRetirementCashOptionEnabled() || this.hasBrokerageAccount) ? false : true;
        }

        public final RecurringInvestmentCategory getRetirementSkipSelectedCategory() {
            if (this.canSkipCategorySelection && getOnlyOneRetirementAccount()) {
                return getSingleRetirementAccountAssetCategory();
            }
            return null;
        }

        private final boolean getOnlyOneRetirementAccount() {
            return CollectionsKt.listOfNotNull((Object[]) new String[]{this.rothIraAccountNumber, this.traditionalIraAccountNumber}).size() == 1;
        }

        private final RecurringInvestmentCategory getSingleRetirementAccountAssetCategory() {
            if (!getOnlyOneRetirementAccount()) {
                return null;
            }
            String str = this.rothIraAccountNumber;
            if (str != null) {
                return new RecurringInvestmentCategory.RothIra(str);
            }
            String str2 = this.traditionalIraAccountNumber;
            if (str2 != null) {
                return new RecurringInvestmentCategory.TraditionalIra(str2);
            }
            return null;
        }

        /* renamed from: getShowOnlyRetirement, reason: from getter */
        private final boolean getRetirementOnly() {
            return this.retirementOnly;
        }
    }
}
