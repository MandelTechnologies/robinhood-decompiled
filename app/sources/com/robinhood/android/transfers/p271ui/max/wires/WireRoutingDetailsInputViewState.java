package com.robinhood.android.transfers.p271ui.max.wires;

import com.robinhood.android.transfers.p271ui.max.wires.models.ConfirmModeDisplayInfo;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.RemoteMicrogramApplication;

/* compiled from: WireRoutingDetailsInputViewState.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003J\t\u0010,\u001a\u00020\nHÆ\u0003J\t\u0010-\u001a\u00020\nHÆ\u0003J\t\u0010.\u001a\u00020\nHÆ\u0003J\t\u0010/\u001a\u00020\nHÆ\u0003J\t\u00100\u001a\u00020\u0010HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0091\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÆ\u0001J\u0013\u00104\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001eR\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001eR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputViewState;", "", "headerText", "Lcom/robinhood/utils/resource/StringResource;", "subHeadingText", "bankName", "", "accountNumber", "routingNumber", "isAgreementChecked", "", "isContinueButtonEnabled", "isContinueButtonLoading", "isLoading", "hideInputModeDisclosure", "mode", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputMode;", "confirmModeDisplayInfo", "Lcom/robinhood/android/transfers/ui/max/wires/models/ConfirmModeDisplayInfo;", "scamPreventionPageSource", "Lmicrogram/android/RemoteMicrogramApplication;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZLcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputMode;Lcom/robinhood/android/transfers/ui/max/wires/models/ConfirmModeDisplayInfo;Lmicrogram/android/RemoteMicrogramApplication;)V", "getHeaderText", "()Lcom/robinhood/utils/resource/StringResource;", "getSubHeadingText", "getBankName", "()Ljava/lang/String;", "getAccountNumber", "getRoutingNumber", "()Z", "getHideInputModeDisclosure", "getMode", "()Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputMode;", "getConfirmModeDisplayInfo", "()Lcom/robinhood/android/transfers/ui/max/wires/models/ConfirmModeDisplayInfo;", "getScamPreventionPageSource", "()Lmicrogram/android/RemoteMicrogramApplication;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "hashCode", "", "toString", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class WireRoutingDetailsInputViewState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final String bankName;
    private final ConfirmModeDisplayInfo confirmModeDisplayInfo;
    private final StringResource headerText;
    private final boolean hideInputModeDisclosure;
    private final boolean isAgreementChecked;
    private final boolean isContinueButtonEnabled;
    private final boolean isContinueButtonLoading;
    private final boolean isLoading;
    private final WireRoutingDetailsInputDataState3 mode;
    private final String routingNumber;
    private final RemoteMicrogramApplication scamPreventionPageSource;
    private final StringResource subHeadingText;

    public static /* synthetic */ WireRoutingDetailsInputViewState copy$default(WireRoutingDetailsInputViewState wireRoutingDetailsInputViewState, StringResource stringResource, StringResource stringResource2, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, WireRoutingDetailsInputDataState3 wireRoutingDetailsInputDataState3, ConfirmModeDisplayInfo confirmModeDisplayInfo, RemoteMicrogramApplication remoteMicrogramApplication, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = wireRoutingDetailsInputViewState.headerText;
        }
        return wireRoutingDetailsInputViewState.copy(stringResource, (i & 2) != 0 ? wireRoutingDetailsInputViewState.subHeadingText : stringResource2, (i & 4) != 0 ? wireRoutingDetailsInputViewState.bankName : str, (i & 8) != 0 ? wireRoutingDetailsInputViewState.accountNumber : str2, (i & 16) != 0 ? wireRoutingDetailsInputViewState.routingNumber : str3, (i & 32) != 0 ? wireRoutingDetailsInputViewState.isAgreementChecked : z, (i & 64) != 0 ? wireRoutingDetailsInputViewState.isContinueButtonEnabled : z2, (i & 128) != 0 ? wireRoutingDetailsInputViewState.isContinueButtonLoading : z3, (i & 256) != 0 ? wireRoutingDetailsInputViewState.isLoading : z4, (i & 512) != 0 ? wireRoutingDetailsInputViewState.hideInputModeDisclosure : z5, (i & 1024) != 0 ? wireRoutingDetailsInputViewState.mode : wireRoutingDetailsInputDataState3, (i & 2048) != 0 ? wireRoutingDetailsInputViewState.confirmModeDisplayInfo : confirmModeDisplayInfo, (i & 4096) != 0 ? wireRoutingDetailsInputViewState.scamPreventionPageSource : remoteMicrogramApplication);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getHeaderText() {
        return this.headerText;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getHideInputModeDisclosure() {
        return this.hideInputModeDisclosure;
    }

    /* renamed from: component11, reason: from getter */
    public final WireRoutingDetailsInputDataState3 getMode() {
        return this.mode;
    }

    /* renamed from: component12, reason: from getter */
    public final ConfirmModeDisplayInfo getConfirmModeDisplayInfo() {
        return this.confirmModeDisplayInfo;
    }

    /* renamed from: component13, reason: from getter */
    public final RemoteMicrogramApplication getScamPreventionPageSource() {
        return this.scamPreventionPageSource;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getSubHeadingText() {
        return this.subHeadingText;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBankName() {
        return this.bankName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component5, reason: from getter */
    public final String getRoutingNumber() {
        return this.routingNumber;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsAgreementChecked() {
        return this.isAgreementChecked;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsContinueButtonEnabled() {
        return this.isContinueButtonEnabled;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsContinueButtonLoading() {
        return this.isContinueButtonLoading;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final WireRoutingDetailsInputViewState copy(StringResource headerText, StringResource subHeadingText, String bankName, String accountNumber, String routingNumber, boolean isAgreementChecked, boolean isContinueButtonEnabled, boolean isContinueButtonLoading, boolean isLoading, boolean hideInputModeDisclosure, WireRoutingDetailsInputDataState3 mode, ConfirmModeDisplayInfo confirmModeDisplayInfo, RemoteMicrogramApplication scamPreventionPageSource) {
        Intrinsics.checkNotNullParameter(headerText, "headerText");
        Intrinsics.checkNotNullParameter(subHeadingText, "subHeadingText");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(routingNumber, "routingNumber");
        Intrinsics.checkNotNullParameter(mode, "mode");
        return new WireRoutingDetailsInputViewState(headerText, subHeadingText, bankName, accountNumber, routingNumber, isAgreementChecked, isContinueButtonEnabled, isContinueButtonLoading, isLoading, hideInputModeDisclosure, mode, confirmModeDisplayInfo, scamPreventionPageSource);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WireRoutingDetailsInputViewState)) {
            return false;
        }
        WireRoutingDetailsInputViewState wireRoutingDetailsInputViewState = (WireRoutingDetailsInputViewState) other;
        return Intrinsics.areEqual(this.headerText, wireRoutingDetailsInputViewState.headerText) && Intrinsics.areEqual(this.subHeadingText, wireRoutingDetailsInputViewState.subHeadingText) && Intrinsics.areEqual(this.bankName, wireRoutingDetailsInputViewState.bankName) && Intrinsics.areEqual(this.accountNumber, wireRoutingDetailsInputViewState.accountNumber) && Intrinsics.areEqual(this.routingNumber, wireRoutingDetailsInputViewState.routingNumber) && this.isAgreementChecked == wireRoutingDetailsInputViewState.isAgreementChecked && this.isContinueButtonEnabled == wireRoutingDetailsInputViewState.isContinueButtonEnabled && this.isContinueButtonLoading == wireRoutingDetailsInputViewState.isContinueButtonLoading && this.isLoading == wireRoutingDetailsInputViewState.isLoading && this.hideInputModeDisclosure == wireRoutingDetailsInputViewState.hideInputModeDisclosure && this.mode == wireRoutingDetailsInputViewState.mode && Intrinsics.areEqual(this.confirmModeDisplayInfo, wireRoutingDetailsInputViewState.confirmModeDisplayInfo) && Intrinsics.areEqual(this.scamPreventionPageSource, wireRoutingDetailsInputViewState.scamPreventionPageSource);
    }

    public int hashCode() {
        int iHashCode = ((this.headerText.hashCode() * 31) + this.subHeadingText.hashCode()) * 31;
        String str = this.bankName;
        int iHashCode2 = (((((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.accountNumber.hashCode()) * 31) + this.routingNumber.hashCode()) * 31) + Boolean.hashCode(this.isAgreementChecked)) * 31) + Boolean.hashCode(this.isContinueButtonEnabled)) * 31) + Boolean.hashCode(this.isContinueButtonLoading)) * 31) + Boolean.hashCode(this.isLoading)) * 31) + Boolean.hashCode(this.hideInputModeDisclosure)) * 31) + this.mode.hashCode()) * 31;
        ConfirmModeDisplayInfo confirmModeDisplayInfo = this.confirmModeDisplayInfo;
        int iHashCode3 = (iHashCode2 + (confirmModeDisplayInfo == null ? 0 : confirmModeDisplayInfo.hashCode())) * 31;
        RemoteMicrogramApplication remoteMicrogramApplication = this.scamPreventionPageSource;
        return iHashCode3 + (remoteMicrogramApplication != null ? remoteMicrogramApplication.hashCode() : 0);
    }

    public String toString() {
        return "WireRoutingDetailsInputViewState(headerText=" + this.headerText + ", subHeadingText=" + this.subHeadingText + ", bankName=" + this.bankName + ", accountNumber=" + this.accountNumber + ", routingNumber=" + this.routingNumber + ", isAgreementChecked=" + this.isAgreementChecked + ", isContinueButtonEnabled=" + this.isContinueButtonEnabled + ", isContinueButtonLoading=" + this.isContinueButtonLoading + ", isLoading=" + this.isLoading + ", hideInputModeDisclosure=" + this.hideInputModeDisclosure + ", mode=" + this.mode + ", confirmModeDisplayInfo=" + this.confirmModeDisplayInfo + ", scamPreventionPageSource=" + this.scamPreventionPageSource + ")";
    }

    public WireRoutingDetailsInputViewState(StringResource headerText, StringResource subHeadingText, String str, String accountNumber, String routingNumber, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, WireRoutingDetailsInputDataState3 mode, ConfirmModeDisplayInfo confirmModeDisplayInfo, RemoteMicrogramApplication remoteMicrogramApplication) {
        Intrinsics.checkNotNullParameter(headerText, "headerText");
        Intrinsics.checkNotNullParameter(subHeadingText, "subHeadingText");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(routingNumber, "routingNumber");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.headerText = headerText;
        this.subHeadingText = subHeadingText;
        this.bankName = str;
        this.accountNumber = accountNumber;
        this.routingNumber = routingNumber;
        this.isAgreementChecked = z;
        this.isContinueButtonEnabled = z2;
        this.isContinueButtonLoading = z3;
        this.isLoading = z4;
        this.hideInputModeDisclosure = z5;
        this.mode = mode;
        this.confirmModeDisplayInfo = confirmModeDisplayInfo;
        this.scamPreventionPageSource = remoteMicrogramApplication;
    }

    public /* synthetic */ WireRoutingDetailsInputViewState(StringResource stringResource, StringResource stringResource2, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, WireRoutingDetailsInputDataState3 wireRoutingDetailsInputDataState3, ConfirmModeDisplayInfo confirmModeDisplayInfo, RemoteMicrogramApplication remoteMicrogramApplication, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(stringResource, stringResource2, str, str2, str3, z, z2, z3, z4, z5, wireRoutingDetailsInputDataState3, (i & 2048) != 0 ? null : confirmModeDisplayInfo, (i & 4096) != 0 ? null : remoteMicrogramApplication);
    }

    public final StringResource getHeaderText() {
        return this.headerText;
    }

    public final StringResource getSubHeadingText() {
        return this.subHeadingText;
    }

    public final String getBankName() {
        return this.bankName;
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

    public final boolean isContinueButtonEnabled() {
        return this.isContinueButtonEnabled;
    }

    public final boolean isContinueButtonLoading() {
        return this.isContinueButtonLoading;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean getHideInputModeDisclosure() {
        return this.hideInputModeDisclosure;
    }

    public final WireRoutingDetailsInputDataState3 getMode() {
        return this.mode;
    }

    public final ConfirmModeDisplayInfo getConfirmModeDisplayInfo() {
        return this.confirmModeDisplayInfo;
    }

    public final RemoteMicrogramApplication getScamPreventionPageSource() {
        return this.scamPreventionPageSource;
    }
}
