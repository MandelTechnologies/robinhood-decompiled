package com.robinhood.android.moneymovement.checkoutflow;

import com.robinhood.models.api.bonfire.ApiTransferAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.RemoteMicrogramApplication;

/* compiled from: PaymentPreferenceDataState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\rHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u00100\u001a\u00020\nHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u00102\u001a\u00020\nHÆ\u0003J\u008b\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0010\u001a\u00020\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0012\u001a\u00020\nHÆ\u0001J\u0013\u00104\u001a\u00020\u00032\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\rHÖ\u0001J\t\u00107\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0011\u0010\u0012\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001c¨\u00068"}, m3636d2 = {"Lcom/robinhood/android/moneymovement/checkoutflow/PaymentPreferenceDataState;", "", "loading", "", "accountSelectorMicrogramSource", "Lmicrogram/android/RemoteMicrogramApplication;", "isBackupYGExperiment", "currentlySelectedId", "", "currentlySelectedType", "Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "pageLoading", "priority", "", "selectedPrimaryId", "previousPrimaryId", "previousPrimaryType", "previousBackupId", "previousBackupType", "<init>", "(ZLmicrogram/android/RemoteMicrogramApplication;ZLjava/lang/String;Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;ZILjava/lang/String;Ljava/lang/String;Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;Ljava/lang/String;Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;)V", "getLoading", "()Z", "getAccountSelectorMicrogramSource", "()Lmicrogram/android/RemoteMicrogramApplication;", "getCurrentlySelectedId", "()Ljava/lang/String;", "getCurrentlySelectedType", "()Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "getPageLoading", "getPriority", "()I", "setPriority", "(I)V", "getSelectedPrimaryId", "getPreviousPrimaryId", "getPreviousPrimaryType", "getPreviousBackupId", "getPreviousBackupType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "toString", "lib-money-movements-checkout-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PaymentPreferenceDataState {
    public static final int $stable = 8;
    private final RemoteMicrogramApplication accountSelectorMicrogramSource;
    private final String currentlySelectedId;
    private final ApiTransferAccount.TransferAccountType currentlySelectedType;
    private final boolean isBackupYGExperiment;
    private final boolean loading;
    private final boolean pageLoading;
    private final String previousBackupId;
    private final ApiTransferAccount.TransferAccountType previousBackupType;
    private final String previousPrimaryId;
    private final ApiTransferAccount.TransferAccountType previousPrimaryType;
    private int priority;
    private final String selectedPrimaryId;

    public static /* synthetic */ PaymentPreferenceDataState copy$default(PaymentPreferenceDataState paymentPreferenceDataState, boolean z, RemoteMicrogramApplication remoteMicrogramApplication, boolean z2, String str, ApiTransferAccount.TransferAccountType transferAccountType, boolean z3, int i, String str2, String str3, ApiTransferAccount.TransferAccountType transferAccountType2, String str4, ApiTransferAccount.TransferAccountType transferAccountType3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = paymentPreferenceDataState.loading;
        }
        if ((i2 & 2) != 0) {
            remoteMicrogramApplication = paymentPreferenceDataState.accountSelectorMicrogramSource;
        }
        if ((i2 & 4) != 0) {
            z2 = paymentPreferenceDataState.isBackupYGExperiment;
        }
        if ((i2 & 8) != 0) {
            str = paymentPreferenceDataState.currentlySelectedId;
        }
        if ((i2 & 16) != 0) {
            transferAccountType = paymentPreferenceDataState.currentlySelectedType;
        }
        if ((i2 & 32) != 0) {
            z3 = paymentPreferenceDataState.pageLoading;
        }
        if ((i2 & 64) != 0) {
            i = paymentPreferenceDataState.priority;
        }
        if ((i2 & 128) != 0) {
            str2 = paymentPreferenceDataState.selectedPrimaryId;
        }
        if ((i2 & 256) != 0) {
            str3 = paymentPreferenceDataState.previousPrimaryId;
        }
        if ((i2 & 512) != 0) {
            transferAccountType2 = paymentPreferenceDataState.previousPrimaryType;
        }
        if ((i2 & 1024) != 0) {
            str4 = paymentPreferenceDataState.previousBackupId;
        }
        if ((i2 & 2048) != 0) {
            transferAccountType3 = paymentPreferenceDataState.previousBackupType;
        }
        String str5 = str4;
        ApiTransferAccount.TransferAccountType transferAccountType4 = transferAccountType3;
        String str6 = str3;
        ApiTransferAccount.TransferAccountType transferAccountType5 = transferAccountType2;
        int i3 = i;
        String str7 = str2;
        ApiTransferAccount.TransferAccountType transferAccountType6 = transferAccountType;
        boolean z4 = z3;
        return paymentPreferenceDataState.copy(z, remoteMicrogramApplication, z2, str, transferAccountType6, z4, i3, str7, str6, transferAccountType5, str5, transferAccountType4);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    /* renamed from: component10, reason: from getter */
    public final ApiTransferAccount.TransferAccountType getPreviousPrimaryType() {
        return this.previousPrimaryType;
    }

    /* renamed from: component11, reason: from getter */
    public final String getPreviousBackupId() {
        return this.previousBackupId;
    }

    /* renamed from: component12, reason: from getter */
    public final ApiTransferAccount.TransferAccountType getPreviousBackupType() {
        return this.previousBackupType;
    }

    /* renamed from: component2, reason: from getter */
    public final RemoteMicrogramApplication getAccountSelectorMicrogramSource() {
        return this.accountSelectorMicrogramSource;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsBackupYGExperiment() {
        return this.isBackupYGExperiment;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCurrentlySelectedId() {
        return this.currentlySelectedId;
    }

    /* renamed from: component5, reason: from getter */
    public final ApiTransferAccount.TransferAccountType getCurrentlySelectedType() {
        return this.currentlySelectedType;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getPageLoading() {
        return this.pageLoading;
    }

    /* renamed from: component7, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }

    /* renamed from: component8, reason: from getter */
    public final String getSelectedPrimaryId() {
        return this.selectedPrimaryId;
    }

    /* renamed from: component9, reason: from getter */
    public final String getPreviousPrimaryId() {
        return this.previousPrimaryId;
    }

    public final PaymentPreferenceDataState copy(boolean loading, RemoteMicrogramApplication accountSelectorMicrogramSource, boolean isBackupYGExperiment, String currentlySelectedId, ApiTransferAccount.TransferAccountType currentlySelectedType, boolean pageLoading, int priority, String selectedPrimaryId, String previousPrimaryId, ApiTransferAccount.TransferAccountType previousPrimaryType, String previousBackupId, ApiTransferAccount.TransferAccountType previousBackupType) {
        Intrinsics.checkNotNullParameter(currentlySelectedType, "currentlySelectedType");
        Intrinsics.checkNotNullParameter(previousPrimaryType, "previousPrimaryType");
        Intrinsics.checkNotNullParameter(previousBackupType, "previousBackupType");
        return new PaymentPreferenceDataState(loading, accountSelectorMicrogramSource, isBackupYGExperiment, currentlySelectedId, currentlySelectedType, pageLoading, priority, selectedPrimaryId, previousPrimaryId, previousPrimaryType, previousBackupId, previousBackupType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentPreferenceDataState)) {
            return false;
        }
        PaymentPreferenceDataState paymentPreferenceDataState = (PaymentPreferenceDataState) other;
        return this.loading == paymentPreferenceDataState.loading && Intrinsics.areEqual(this.accountSelectorMicrogramSource, paymentPreferenceDataState.accountSelectorMicrogramSource) && this.isBackupYGExperiment == paymentPreferenceDataState.isBackupYGExperiment && Intrinsics.areEqual(this.currentlySelectedId, paymentPreferenceDataState.currentlySelectedId) && this.currentlySelectedType == paymentPreferenceDataState.currentlySelectedType && this.pageLoading == paymentPreferenceDataState.pageLoading && this.priority == paymentPreferenceDataState.priority && Intrinsics.areEqual(this.selectedPrimaryId, paymentPreferenceDataState.selectedPrimaryId) && Intrinsics.areEqual(this.previousPrimaryId, paymentPreferenceDataState.previousPrimaryId) && this.previousPrimaryType == paymentPreferenceDataState.previousPrimaryType && Intrinsics.areEqual(this.previousBackupId, paymentPreferenceDataState.previousBackupId) && this.previousBackupType == paymentPreferenceDataState.previousBackupType;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.loading) * 31;
        RemoteMicrogramApplication remoteMicrogramApplication = this.accountSelectorMicrogramSource;
        int iHashCode2 = (((iHashCode + (remoteMicrogramApplication == null ? 0 : remoteMicrogramApplication.hashCode())) * 31) + Boolean.hashCode(this.isBackupYGExperiment)) * 31;
        String str = this.currentlySelectedId;
        int iHashCode3 = (((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.currentlySelectedType.hashCode()) * 31) + Boolean.hashCode(this.pageLoading)) * 31) + Integer.hashCode(this.priority)) * 31;
        String str2 = this.selectedPrimaryId;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.previousPrimaryId;
        int iHashCode5 = (((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.previousPrimaryType.hashCode()) * 31;
        String str4 = this.previousBackupId;
        return ((iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.previousBackupType.hashCode();
    }

    public String toString() {
        return "PaymentPreferenceDataState(loading=" + this.loading + ", accountSelectorMicrogramSource=" + this.accountSelectorMicrogramSource + ", isBackupYGExperiment=" + this.isBackupYGExperiment + ", currentlySelectedId=" + this.currentlySelectedId + ", currentlySelectedType=" + this.currentlySelectedType + ", pageLoading=" + this.pageLoading + ", priority=" + this.priority + ", selectedPrimaryId=" + this.selectedPrimaryId + ", previousPrimaryId=" + this.previousPrimaryId + ", previousPrimaryType=" + this.previousPrimaryType + ", previousBackupId=" + this.previousBackupId + ", previousBackupType=" + this.previousBackupType + ")";
    }

    public PaymentPreferenceDataState(boolean z, RemoteMicrogramApplication remoteMicrogramApplication, boolean z2, String str, ApiTransferAccount.TransferAccountType currentlySelectedType, boolean z3, int i, String str2, String str3, ApiTransferAccount.TransferAccountType previousPrimaryType, String str4, ApiTransferAccount.TransferAccountType previousBackupType) {
        Intrinsics.checkNotNullParameter(currentlySelectedType, "currentlySelectedType");
        Intrinsics.checkNotNullParameter(previousPrimaryType, "previousPrimaryType");
        Intrinsics.checkNotNullParameter(previousBackupType, "previousBackupType");
        this.loading = z;
        this.accountSelectorMicrogramSource = remoteMicrogramApplication;
        this.isBackupYGExperiment = z2;
        this.currentlySelectedId = str;
        this.currentlySelectedType = currentlySelectedType;
        this.pageLoading = z3;
        this.priority = i;
        this.selectedPrimaryId = str2;
        this.previousPrimaryId = str3;
        this.previousPrimaryType = previousPrimaryType;
        this.previousBackupId = str4;
        this.previousBackupType = previousBackupType;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final RemoteMicrogramApplication getAccountSelectorMicrogramSource() {
        return this.accountSelectorMicrogramSource;
    }

    public final boolean isBackupYGExperiment() {
        return this.isBackupYGExperiment;
    }

    public final String getCurrentlySelectedId() {
        return this.currentlySelectedId;
    }

    public /* synthetic */ PaymentPreferenceDataState(boolean z, RemoteMicrogramApplication remoteMicrogramApplication, boolean z2, String str, ApiTransferAccount.TransferAccountType transferAccountType, boolean z3, int i, String str2, String str3, ApiTransferAccount.TransferAccountType transferAccountType2, String str4, ApiTransferAccount.TransferAccountType transferAccountType3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, remoteMicrogramApplication, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? ApiTransferAccount.TransferAccountType.UNKNOWN : transferAccountType, (i2 & 32) != 0 ? false : z3, (i2 & 64) != 0 ? 1 : i, (i2 & 128) != 0 ? null : str2, (i2 & 256) != 0 ? null : str3, (i2 & 512) != 0 ? ApiTransferAccount.TransferAccountType.UNKNOWN : transferAccountType2, (i2 & 1024) != 0 ? null : str4, (i2 & 2048) != 0 ? ApiTransferAccount.TransferAccountType.UNKNOWN : transferAccountType3);
    }

    public final ApiTransferAccount.TransferAccountType getCurrentlySelectedType() {
        return this.currentlySelectedType;
    }

    public final boolean getPageLoading() {
        return this.pageLoading;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final void setPriority(int i) {
        this.priority = i;
    }

    public final String getSelectedPrimaryId() {
        return this.selectedPrimaryId;
    }

    public final String getPreviousPrimaryId() {
        return this.previousPrimaryId;
    }

    public final ApiTransferAccount.TransferAccountType getPreviousPrimaryType() {
        return this.previousPrimaryType;
    }

    public final String getPreviousBackupId() {
        return this.previousBackupId;
    }

    public final ApiTransferAccount.TransferAccountType getPreviousBackupType() {
        return this.previousBackupType;
    }
}
