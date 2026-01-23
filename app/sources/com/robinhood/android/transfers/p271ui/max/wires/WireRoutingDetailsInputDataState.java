package com.robinhood.android.transfers.p271ui.max.wires;

import com.robinhood.models.p320db.bonfire.TransferAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: WireRoutingDetailsInputDataState.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000eHÆ\u0003Ja\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010%\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0016R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0016R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0016¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputDataState;", "", "transferAccount", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "accountNumber", "", "routingNumber", "isAgreementChecked", "", "isValidating", "isLoading", "mode", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputMode;", "confirmModeData", "Lcom/robinhood/android/transfers/ui/max/wires/ConfirmModeData;", "<init>", "(Lcom/robinhood/models/db/bonfire/TransferAccount;Ljava/lang/String;Ljava/lang/String;ZZZLcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputMode;Lcom/robinhood/android/transfers/ui/max/wires/ConfirmModeData;)V", "getTransferAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "getAccountNumber", "()Ljava/lang/String;", "getRoutingNumber", "()Z", "getMode", "()Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputMode;", "getConfirmModeData", "()Lcom/robinhood/android/transfers/ui/max/wires/ConfirmModeData;", "isContinueButtonEnabled", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class WireRoutingDetailsInputDataState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final ConfirmModeData confirmModeData;
    private final boolean isAgreementChecked;
    private final boolean isLoading;
    private final boolean isValidating;
    private final WireRoutingDetailsInputDataState3 mode;
    private final String routingNumber;
    private final TransferAccount transferAccount;

    public static /* synthetic */ WireRoutingDetailsInputDataState copy$default(WireRoutingDetailsInputDataState wireRoutingDetailsInputDataState, TransferAccount transferAccount, String str, String str2, boolean z, boolean z2, boolean z3, WireRoutingDetailsInputDataState3 wireRoutingDetailsInputDataState3, ConfirmModeData confirmModeData, int i, Object obj) {
        if ((i & 1) != 0) {
            transferAccount = wireRoutingDetailsInputDataState.transferAccount;
        }
        if ((i & 2) != 0) {
            str = wireRoutingDetailsInputDataState.accountNumber;
        }
        if ((i & 4) != 0) {
            str2 = wireRoutingDetailsInputDataState.routingNumber;
        }
        if ((i & 8) != 0) {
            z = wireRoutingDetailsInputDataState.isAgreementChecked;
        }
        if ((i & 16) != 0) {
            z2 = wireRoutingDetailsInputDataState.isValidating;
        }
        if ((i & 32) != 0) {
            z3 = wireRoutingDetailsInputDataState.isLoading;
        }
        if ((i & 64) != 0) {
            wireRoutingDetailsInputDataState3 = wireRoutingDetailsInputDataState.mode;
        }
        if ((i & 128) != 0) {
            confirmModeData = wireRoutingDetailsInputDataState.confirmModeData;
        }
        WireRoutingDetailsInputDataState3 wireRoutingDetailsInputDataState32 = wireRoutingDetailsInputDataState3;
        ConfirmModeData confirmModeData2 = confirmModeData;
        boolean z4 = z2;
        boolean z5 = z3;
        return wireRoutingDetailsInputDataState.copy(transferAccount, str, str2, z, z4, z5, wireRoutingDetailsInputDataState32, confirmModeData2);
    }

    /* renamed from: component1, reason: from getter */
    public final TransferAccount getTransferAccount() {
        return this.transferAccount;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRoutingNumber() {
        return this.routingNumber;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsAgreementChecked() {
        return this.isAgreementChecked;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsValidating() {
        return this.isValidating;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component7, reason: from getter */
    public final WireRoutingDetailsInputDataState3 getMode() {
        return this.mode;
    }

    /* renamed from: component8, reason: from getter */
    public final ConfirmModeData getConfirmModeData() {
        return this.confirmModeData;
    }

    public final WireRoutingDetailsInputDataState copy(TransferAccount transferAccount, String accountNumber, String routingNumber, boolean isAgreementChecked, boolean isValidating, boolean isLoading, WireRoutingDetailsInputDataState3 mode, ConfirmModeData confirmModeData) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        return new WireRoutingDetailsInputDataState(transferAccount, accountNumber, routingNumber, isAgreementChecked, isValidating, isLoading, mode, confirmModeData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WireRoutingDetailsInputDataState)) {
            return false;
        }
        WireRoutingDetailsInputDataState wireRoutingDetailsInputDataState = (WireRoutingDetailsInputDataState) other;
        return Intrinsics.areEqual(this.transferAccount, wireRoutingDetailsInputDataState.transferAccount) && Intrinsics.areEqual(this.accountNumber, wireRoutingDetailsInputDataState.accountNumber) && Intrinsics.areEqual(this.routingNumber, wireRoutingDetailsInputDataState.routingNumber) && this.isAgreementChecked == wireRoutingDetailsInputDataState.isAgreementChecked && this.isValidating == wireRoutingDetailsInputDataState.isValidating && this.isLoading == wireRoutingDetailsInputDataState.isLoading && this.mode == wireRoutingDetailsInputDataState.mode && Intrinsics.areEqual(this.confirmModeData, wireRoutingDetailsInputDataState.confirmModeData);
    }

    public int hashCode() {
        TransferAccount transferAccount = this.transferAccount;
        int iHashCode = (transferAccount == null ? 0 : transferAccount.hashCode()) * 31;
        String str = this.accountNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.routingNumber;
        int iHashCode3 = (((((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.isAgreementChecked)) * 31) + Boolean.hashCode(this.isValidating)) * 31) + Boolean.hashCode(this.isLoading)) * 31) + this.mode.hashCode()) * 31;
        ConfirmModeData confirmModeData = this.confirmModeData;
        return iHashCode3 + (confirmModeData != null ? confirmModeData.hashCode() : 0);
    }

    public String toString() {
        return "WireRoutingDetailsInputDataState(transferAccount=" + this.transferAccount + ", accountNumber=" + this.accountNumber + ", routingNumber=" + this.routingNumber + ", isAgreementChecked=" + this.isAgreementChecked + ", isValidating=" + this.isValidating + ", isLoading=" + this.isLoading + ", mode=" + this.mode + ", confirmModeData=" + this.confirmModeData + ")";
    }

    public WireRoutingDetailsInputDataState(TransferAccount transferAccount, String str, String str2, boolean z, boolean z2, boolean z3, WireRoutingDetailsInputDataState3 mode, ConfirmModeData confirmModeData) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.transferAccount = transferAccount;
        this.accountNumber = str;
        this.routingNumber = str2;
        this.isAgreementChecked = z;
        this.isValidating = z2;
        this.isLoading = z3;
        this.mode = mode;
        this.confirmModeData = confirmModeData;
    }

    public final TransferAccount getTransferAccount() {
        return this.transferAccount;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final String getRoutingNumber() {
        return this.routingNumber;
    }

    public final boolean isAgreementChecked() {
        return this.isAgreementChecked;
    }

    public final boolean isValidating() {
        return this.isValidating;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public /* synthetic */ WireRoutingDetailsInputDataState(TransferAccount transferAccount, String str, String str2, boolean z, boolean z2, boolean z3, WireRoutingDetailsInputDataState3 wireRoutingDetailsInputDataState3, ConfirmModeData confirmModeData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(transferAccount, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? true : z3, (i & 64) != 0 ? WireRoutingDetailsInputDataState3.ENTER_INFORMATION : wireRoutingDetailsInputDataState3, (i & 128) != 0 ? null : confirmModeData);
    }

    public final WireRoutingDetailsInputDataState3 getMode() {
        return this.mode;
    }

    public final ConfirmModeData getConfirmModeData() {
        return this.confirmModeData;
    }

    public final boolean isContinueButtonEnabled() {
        String str;
        String str2 = this.accountNumber;
        return (str2 == null || StringsKt.isBlank(str2) || (str = this.routingNumber) == null || StringsKt.isBlank(str)) ? false : true;
    }
}
