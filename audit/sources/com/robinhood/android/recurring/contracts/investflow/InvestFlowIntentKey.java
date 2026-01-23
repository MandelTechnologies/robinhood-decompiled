package com.robinhood.android.recurring.contracts.investflow;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.recurring.contracts.investflow.AllocationStrategy;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowStep;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestFlowIntentKey.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bw\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017B\u0081\u0001\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u001bJ\t\u0010.\u001a\u00020\u0004HÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\t\u00100\u001a\u00020\u0006HÆ\u0003J\t\u00101\u001a\u00020\u0006HÆ\u0003J\t\u00102\u001a\u00020\nHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u00104\u001a\u00020\u000eHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u00106\u001a\u00020\u0006HÆ\u0003J\t\u00107\u001a\u00020\u0013HÆ\u0003J\t\u00108\u001a\u00020\u0015HÆ\u0003J{\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015HÆ\u0001J\u0006\u0010:\u001a\u00020;J\u0013\u0010<\u001a\u00020\u00062\b\u0010=\u001a\u0004\u0018\u00010>HÖ\u0003J\t\u0010?\u001a\u00020;HÖ\u0001J\t\u0010@\u001a\u00020\fHÖ\u0001J\u0016\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020;R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u001fR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0011\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-¨\u0006F"}, m3636d2 = {"Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "initialStep", "Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowStep;", "recurringOnly", "", "isRecurringUpsell", "forceDefaultAllocation", "manifest", "Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowManifest;", "accountNumber", "", "minOrderAmount", "Ljava/math/BigDecimal;", "selectedFrequency", "Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;", "skipForceSuitability", "allocationStrategy", "Lcom/robinhood/android/recurring/contracts/investflow/AllocationStrategy;", "loggingParams", "Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowLoggingParams;", "<init>", "(Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowStep;ZZZLcom/robinhood/android/recurring/contracts/investflow/InvestFlowManifest;Ljava/lang/String;Ljava/math/BigDecimal;Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;ZLcom/robinhood/android/recurring/contracts/investflow/AllocationStrategy;Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowLoggingParams;)V", "instrumentIds", "", "Ljava/util/UUID;", "(Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowStep;ZZZLjava/util/List;Ljava/lang/String;Ljava/math/BigDecimal;Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;ZLcom/robinhood/android/recurring/contracts/investflow/AllocationStrategy;Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowLoggingParams;)V", "getInitialStep", "()Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowStep;", "getRecurringOnly", "()Z", "getForceDefaultAllocation", "getManifest", "()Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowManifest;", "getAccountNumber", "()Ljava/lang/String;", "getMinOrderAmount", "()Ljava/math/BigDecimal;", "getSelectedFrequency", "()Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;", "getSkipForceSuitability", "getAllocationStrategy", "()Lcom/robinhood/android/recurring/contracts/investflow/AllocationStrategy;", "getLoggingParams", "()Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowLoggingParams;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class InvestFlowIntentKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<InvestFlowIntentKey> CREATOR = new Creator();
    private final String accountNumber;
    private final AllocationStrategy allocationStrategy;
    private final boolean forceDefaultAllocation;
    private final InvestFlowStep initialStep;
    private final boolean isRecurringUpsell;
    private final InvestFlowLoggingParams loggingParams;
    private final InvestFlowManifest manifest;
    private final BigDecimal minOrderAmount;
    private final boolean recurringOnly;
    private final InvestFlowFrequency selectedFrequency;
    private final boolean skipForceSuitability;

    /* compiled from: InvestFlowIntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<InvestFlowIntentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestFlowIntentKey createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            InvestFlowStep investFlowStep = (InvestFlowStep) parcel.readParcelable(InvestFlowIntentKey.class.getClassLoader());
            boolean z3 = false;
            boolean z4 = true;
            boolean z5 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z4 = z;
            }
            InvestFlowManifest investFlowManifestCreateFromParcel = InvestFlowManifest.CREATOR.createFromParcel(parcel);
            boolean z6 = z2;
            String string2 = parcel.readString();
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            InvestFlowFrequency investFlowFrequency = (InvestFlowFrequency) parcel.readParcelable(InvestFlowIntentKey.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z = z6;
            }
            return new InvestFlowIntentKey(investFlowStep, z5, z3, z4, investFlowManifestCreateFromParcel, string2, bigDecimal, investFlowFrequency, z, (AllocationStrategy) parcel.readParcelable(InvestFlowIntentKey.class.getClassLoader()), InvestFlowLoggingParams.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestFlowIntentKey[] newArray(int i) {
            return new InvestFlowIntentKey[i];
        }
    }

    public static /* synthetic */ InvestFlowIntentKey copy$default(InvestFlowIntentKey investFlowIntentKey, InvestFlowStep investFlowStep, boolean z, boolean z2, boolean z3, InvestFlowManifest investFlowManifest, String str, BigDecimal bigDecimal, InvestFlowFrequency investFlowFrequency, boolean z4, AllocationStrategy allocationStrategy, InvestFlowLoggingParams investFlowLoggingParams, int i, Object obj) {
        if ((i & 1) != 0) {
            investFlowStep = investFlowIntentKey.initialStep;
        }
        if ((i & 2) != 0) {
            z = investFlowIntentKey.recurringOnly;
        }
        if ((i & 4) != 0) {
            z2 = investFlowIntentKey.isRecurringUpsell;
        }
        if ((i & 8) != 0) {
            z3 = investFlowIntentKey.forceDefaultAllocation;
        }
        if ((i & 16) != 0) {
            investFlowManifest = investFlowIntentKey.manifest;
        }
        if ((i & 32) != 0) {
            str = investFlowIntentKey.accountNumber;
        }
        if ((i & 64) != 0) {
            bigDecimal = investFlowIntentKey.minOrderAmount;
        }
        if ((i & 128) != 0) {
            investFlowFrequency = investFlowIntentKey.selectedFrequency;
        }
        if ((i & 256) != 0) {
            z4 = investFlowIntentKey.skipForceSuitability;
        }
        if ((i & 512) != 0) {
            allocationStrategy = investFlowIntentKey.allocationStrategy;
        }
        if ((i & 1024) != 0) {
            investFlowLoggingParams = investFlowIntentKey.loggingParams;
        }
        AllocationStrategy allocationStrategy2 = allocationStrategy;
        InvestFlowLoggingParams investFlowLoggingParams2 = investFlowLoggingParams;
        InvestFlowFrequency investFlowFrequency2 = investFlowFrequency;
        boolean z5 = z4;
        String str2 = str;
        BigDecimal bigDecimal2 = bigDecimal;
        InvestFlowManifest investFlowManifest2 = investFlowManifest;
        boolean z6 = z2;
        return investFlowIntentKey.copy(investFlowStep, z, z6, z3, investFlowManifest2, str2, bigDecimal2, investFlowFrequency2, z5, allocationStrategy2, investFlowLoggingParams2);
    }

    /* renamed from: component1, reason: from getter */
    public final InvestFlowStep getInitialStep() {
        return this.initialStep;
    }

    /* renamed from: component10, reason: from getter */
    public final AllocationStrategy getAllocationStrategy() {
        return this.allocationStrategy;
    }

    /* renamed from: component11, reason: from getter */
    public final InvestFlowLoggingParams getLoggingParams() {
        return this.loggingParams;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getRecurringOnly() {
        return this.recurringOnly;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsRecurringUpsell() {
        return this.isRecurringUpsell;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getForceDefaultAllocation() {
        return this.forceDefaultAllocation;
    }

    /* renamed from: component5, reason: from getter */
    public final InvestFlowManifest getManifest() {
        return this.manifest;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component7, reason: from getter */
    public final BigDecimal getMinOrderAmount() {
        return this.minOrderAmount;
    }

    /* renamed from: component8, reason: from getter */
    public final InvestFlowFrequency getSelectedFrequency() {
        return this.selectedFrequency;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getSkipForceSuitability() {
        return this.skipForceSuitability;
    }

    public final InvestFlowIntentKey copy(InvestFlowStep initialStep, boolean recurringOnly, boolean isRecurringUpsell, boolean forceDefaultAllocation, InvestFlowManifest manifest, String accountNumber, BigDecimal minOrderAmount, InvestFlowFrequency selectedFrequency, boolean skipForceSuitability, AllocationStrategy allocationStrategy, InvestFlowLoggingParams loggingParams) {
        Intrinsics.checkNotNullParameter(initialStep, "initialStep");
        Intrinsics.checkNotNullParameter(manifest, "manifest");
        Intrinsics.checkNotNullParameter(minOrderAmount, "minOrderAmount");
        Intrinsics.checkNotNullParameter(allocationStrategy, "allocationStrategy");
        Intrinsics.checkNotNullParameter(loggingParams, "loggingParams");
        return new InvestFlowIntentKey(initialStep, recurringOnly, isRecurringUpsell, forceDefaultAllocation, manifest, accountNumber, minOrderAmount, selectedFrequency, skipForceSuitability, allocationStrategy, loggingParams);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvestFlowIntentKey)) {
            return false;
        }
        InvestFlowIntentKey investFlowIntentKey = (InvestFlowIntentKey) other;
        return Intrinsics.areEqual(this.initialStep, investFlowIntentKey.initialStep) && this.recurringOnly == investFlowIntentKey.recurringOnly && this.isRecurringUpsell == investFlowIntentKey.isRecurringUpsell && this.forceDefaultAllocation == investFlowIntentKey.forceDefaultAllocation && Intrinsics.areEqual(this.manifest, investFlowIntentKey.manifest) && Intrinsics.areEqual(this.accountNumber, investFlowIntentKey.accountNumber) && Intrinsics.areEqual(this.minOrderAmount, investFlowIntentKey.minOrderAmount) && Intrinsics.areEqual(this.selectedFrequency, investFlowIntentKey.selectedFrequency) && this.skipForceSuitability == investFlowIntentKey.skipForceSuitability && Intrinsics.areEqual(this.allocationStrategy, investFlowIntentKey.allocationStrategy) && Intrinsics.areEqual(this.loggingParams, investFlowIntentKey.loggingParams);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.initialStep.hashCode() * 31) + Boolean.hashCode(this.recurringOnly)) * 31) + Boolean.hashCode(this.isRecurringUpsell)) * 31) + Boolean.hashCode(this.forceDefaultAllocation)) * 31) + this.manifest.hashCode()) * 31;
        String str = this.accountNumber;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.minOrderAmount.hashCode()) * 31;
        InvestFlowFrequency investFlowFrequency = this.selectedFrequency;
        return ((((((iHashCode2 + (investFlowFrequency != null ? investFlowFrequency.hashCode() : 0)) * 31) + Boolean.hashCode(this.skipForceSuitability)) * 31) + this.allocationStrategy.hashCode()) * 31) + this.loggingParams.hashCode();
    }

    public String toString() {
        return "InvestFlowIntentKey(initialStep=" + this.initialStep + ", recurringOnly=" + this.recurringOnly + ", isRecurringUpsell=" + this.isRecurringUpsell + ", forceDefaultAllocation=" + this.forceDefaultAllocation + ", manifest=" + this.manifest + ", accountNumber=" + this.accountNumber + ", minOrderAmount=" + this.minOrderAmount + ", selectedFrequency=" + this.selectedFrequency + ", skipForceSuitability=" + this.skipForceSuitability + ", allocationStrategy=" + this.allocationStrategy + ", loggingParams=" + this.loggingParams + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.initialStep, flags);
        dest.writeInt(this.recurringOnly ? 1 : 0);
        dest.writeInt(this.isRecurringUpsell ? 1 : 0);
        dest.writeInt(this.forceDefaultAllocation ? 1 : 0);
        this.manifest.writeToParcel(dest, flags);
        dest.writeString(this.accountNumber);
        dest.writeSerializable(this.minOrderAmount);
        dest.writeParcelable(this.selectedFrequency, flags);
        dest.writeInt(this.skipForceSuitability ? 1 : 0);
        dest.writeParcelable(this.allocationStrategy, flags);
        this.loggingParams.writeToParcel(dest, flags);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public InvestFlowIntentKey(InvestFlowStep initialStep, boolean z, boolean z2, boolean z3, InvestFlowManifest manifest, String str, BigDecimal minOrderAmount, InvestFlowFrequency investFlowFrequency, boolean z4, AllocationStrategy allocationStrategy, InvestFlowLoggingParams loggingParams) {
        Intrinsics.checkNotNullParameter(initialStep, "initialStep");
        Intrinsics.checkNotNullParameter(manifest, "manifest");
        Intrinsics.checkNotNullParameter(minOrderAmount, "minOrderAmount");
        Intrinsics.checkNotNullParameter(allocationStrategy, "allocationStrategy");
        Intrinsics.checkNotNullParameter(loggingParams, "loggingParams");
        this.initialStep = initialStep;
        this.recurringOnly = z;
        this.isRecurringUpsell = z2;
        this.forceDefaultAllocation = z3;
        this.manifest = manifest;
        this.accountNumber = str;
        this.minOrderAmount = minOrderAmount;
        this.selectedFrequency = investFlowFrequency;
        this.skipForceSuitability = z4;
        this.allocationStrategy = allocationStrategy;
        this.loggingParams = loggingParams;
    }

    public /* synthetic */ InvestFlowIntentKey(InvestFlowStep investFlowStep, boolean z, boolean z2, boolean z3, InvestFlowManifest investFlowManifest, String str, BigDecimal bigDecimal, InvestFlowFrequency investFlowFrequency, boolean z4, AllocationStrategy allocationStrategy, InvestFlowLoggingParams investFlowLoggingParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? InvestFlowStep.Discovery.INSTANCE : investFlowStep, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, investFlowManifest, (i & 32) != 0 ? null : str, (i & 64) != 0 ? BigDecimal.ONE : bigDecimal, (i & 128) != 0 ? null : investFlowFrequency, (i & 256) != 0 ? false : z4, (i & 512) != 0 ? AllocationStrategy.EqualSplit.INSTANCE : allocationStrategy, (i & 1024) != 0 ? new InvestFlowLoggingParams(null, null, 3, null) : investFlowLoggingParams);
    }

    public final InvestFlowStep getInitialStep() {
        return this.initialStep;
    }

    public final boolean getRecurringOnly() {
        return this.recurringOnly;
    }

    public final boolean isRecurringUpsell() {
        return this.isRecurringUpsell;
    }

    public final boolean getForceDefaultAllocation() {
        return this.forceDefaultAllocation;
    }

    public final InvestFlowManifest getManifest() {
        return this.manifest;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final BigDecimal getMinOrderAmount() {
        return this.minOrderAmount;
    }

    public final InvestFlowFrequency getSelectedFrequency() {
        return this.selectedFrequency;
    }

    public final boolean getSkipForceSuitability() {
        return this.skipForceSuitability;
    }

    public final AllocationStrategy getAllocationStrategy() {
        return this.allocationStrategy;
    }

    public final InvestFlowLoggingParams getLoggingParams() {
        return this.loggingParams;
    }

    public /* synthetic */ InvestFlowIntentKey(InvestFlowStep investFlowStep, boolean z, boolean z2, boolean z3, List list, String str, BigDecimal bigDecimal, InvestFlowFrequency investFlowFrequency, boolean z4, AllocationStrategy allocationStrategy, InvestFlowLoggingParams investFlowLoggingParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? InvestFlowStep.Discovery.INSTANCE : investFlowStep, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (List<UUID>) ((i & 16) != 0 ? CollectionsKt.emptyList() : list), (i & 32) != 0 ? null : str, (i & 64) != 0 ? BigDecimal.ONE : bigDecimal, (i & 128) != 0 ? null : investFlowFrequency, (i & 256) != 0 ? false : z4, (i & 512) != 0 ? AllocationStrategy.EqualSplit.INSTANCE : allocationStrategy, (i & 1024) != 0 ? new InvestFlowLoggingParams(null, null, 3, null) : investFlowLoggingParams);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InvestFlowIntentKey(InvestFlowStep initialStep, boolean z, boolean z2, boolean z3, List<UUID> instrumentIds, String str, BigDecimal minOrderAmount, InvestFlowFrequency investFlowFrequency, boolean z4, AllocationStrategy allocationStrategy, InvestFlowLoggingParams loggingParams) {
        this(initialStep, z, z2, z3, new InvestFlowManifest(instrumentIds), str, minOrderAmount, investFlowFrequency, z4, allocationStrategy, loggingParams);
        Intrinsics.checkNotNullParameter(initialStep, "initialStep");
        Intrinsics.checkNotNullParameter(instrumentIds, "instrumentIds");
        Intrinsics.checkNotNullParameter(minOrderAmount, "minOrderAmount");
        Intrinsics.checkNotNullParameter(allocationStrategy, "allocationStrategy");
        Intrinsics.checkNotNullParameter(loggingParams, "loggingParams");
    }
}
