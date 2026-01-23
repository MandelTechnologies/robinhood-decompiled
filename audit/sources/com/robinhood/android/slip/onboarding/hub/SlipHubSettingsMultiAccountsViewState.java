package com.robinhood.android.slip.onboarding.hub;

import com.robinhood.android.slip.onboarding.hub.p256ui.SettingsToggleAlertViewState;
import com.robinhood.shared.account.contracts.switcher.AccountToggleData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SlipHubSettingsMultiAccountsState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/hub/SlipHubSettingsMultiAccountsViewState;", "", "title", "", "description", "toggleAlertViewState", "Lcom/robinhood/android/slip/onboarding/hub/ui/SettingsToggleAlertViewState;", "accountToggleData", "Lcom/robinhood/shared/account/contracts/switcher/AccountToggleData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/slip/onboarding/hub/ui/SettingsToggleAlertViewState;Lcom/robinhood/shared/account/contracts/switcher/AccountToggleData;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getToggleAlertViewState", "()Lcom/robinhood/android/slip/onboarding/hub/ui/SettingsToggleAlertViewState;", "getAccountToggleData", "()Lcom/robinhood/shared/account/contracts/switcher/AccountToggleData;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SlipHubSettingsMultiAccountsViewState {
    public static final int $stable = 8;
    private final AccountToggleData accountToggleData;
    private final String description;
    private final String title;
    private final SettingsToggleAlertViewState toggleAlertViewState;

    public static /* synthetic */ SlipHubSettingsMultiAccountsViewState copy$default(SlipHubSettingsMultiAccountsViewState slipHubSettingsMultiAccountsViewState, String str, String str2, SettingsToggleAlertViewState settingsToggleAlertViewState, AccountToggleData accountToggleData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = slipHubSettingsMultiAccountsViewState.title;
        }
        if ((i & 2) != 0) {
            str2 = slipHubSettingsMultiAccountsViewState.description;
        }
        if ((i & 4) != 0) {
            settingsToggleAlertViewState = slipHubSettingsMultiAccountsViewState.toggleAlertViewState;
        }
        if ((i & 8) != 0) {
            accountToggleData = slipHubSettingsMultiAccountsViewState.accountToggleData;
        }
        return slipHubSettingsMultiAccountsViewState.copy(str, str2, settingsToggleAlertViewState, accountToggleData);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final SettingsToggleAlertViewState getToggleAlertViewState() {
        return this.toggleAlertViewState;
    }

    /* renamed from: component4, reason: from getter */
    public final AccountToggleData getAccountToggleData() {
        return this.accountToggleData;
    }

    public final SlipHubSettingsMultiAccountsViewState copy(String title, String description, SettingsToggleAlertViewState toggleAlertViewState, AccountToggleData accountToggleData) {
        Intrinsics.checkNotNullParameter(accountToggleData, "accountToggleData");
        return new SlipHubSettingsMultiAccountsViewState(title, description, toggleAlertViewState, accountToggleData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlipHubSettingsMultiAccountsViewState)) {
            return false;
        }
        SlipHubSettingsMultiAccountsViewState slipHubSettingsMultiAccountsViewState = (SlipHubSettingsMultiAccountsViewState) other;
        return Intrinsics.areEqual(this.title, slipHubSettingsMultiAccountsViewState.title) && Intrinsics.areEqual(this.description, slipHubSettingsMultiAccountsViewState.description) && Intrinsics.areEqual(this.toggleAlertViewState, slipHubSettingsMultiAccountsViewState.toggleAlertViewState) && Intrinsics.areEqual(this.accountToggleData, slipHubSettingsMultiAccountsViewState.accountToggleData);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        SettingsToggleAlertViewState settingsToggleAlertViewState = this.toggleAlertViewState;
        return ((iHashCode2 + (settingsToggleAlertViewState != null ? settingsToggleAlertViewState.hashCode() : 0)) * 31) + this.accountToggleData.hashCode();
    }

    public String toString() {
        return "SlipHubSettingsMultiAccountsViewState(title=" + this.title + ", description=" + this.description + ", toggleAlertViewState=" + this.toggleAlertViewState + ", accountToggleData=" + this.accountToggleData + ")";
    }

    public SlipHubSettingsMultiAccountsViewState(String str, String str2, SettingsToggleAlertViewState settingsToggleAlertViewState, AccountToggleData accountToggleData) {
        Intrinsics.checkNotNullParameter(accountToggleData, "accountToggleData");
        this.title = str;
        this.description = str2;
        this.toggleAlertViewState = settingsToggleAlertViewState;
        this.accountToggleData = accountToggleData;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final SettingsToggleAlertViewState getToggleAlertViewState() {
        return this.toggleAlertViewState;
    }

    public final AccountToggleData getAccountToggleData() {
        return this.accountToggleData;
    }
}
